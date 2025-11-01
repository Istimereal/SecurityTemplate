package app.routes;

import app.security.SecurityController;
import com.fasterxml.jackson.databind.ObjectMapper;
import app.utils.Utils;
import io.javalin.apibuilder.EndpointGroup;
import io.javalin.security.RouteRole;

import static io.javalin.apibuilder.ApiBuilder.*;

public class SecurityRoutes {
    private static ObjectMapper jsonMapper = new Utils().getObjectMapper();
    private final SecurityController securityController;

    public SecurityRoutes(SecurityController securityController) {
        this.securityController = securityController;
    }

    public EndpointGroup getSecurityRoutes() {
        return () -> {
            path("/auth", () -> {
                post("/login", securityController.login());
                post("/register", securityController.register(),Role.ANYONE);
            });
        };
    }

    public enum Role implements RouteRole { ANYONE, USER, ADMIN }
}