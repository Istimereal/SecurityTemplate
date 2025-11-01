package app.routes;

//import app.controllers.TController;
//import app.controllers.T2Controller;
import io.javalin.apibuilder.EndpointGroup;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Routes {

  //  private final TRoutes TRoutes;
  //  private final T2Routes T2Routes;

/*    public Routes(TRoutes  TRoutes, T2Routes T2Routes) {
        this.TRoutes = TRoutes;
        this.T2Routes = T2Routes;
    }  */

    public EndpointGroup getEndpoints() {

        return () -> {
        //    path("/Ts", TRoutes.getTRoutes());
         //   path("/T2s", T2Routes.getT2Routes());
        };
    }
}
