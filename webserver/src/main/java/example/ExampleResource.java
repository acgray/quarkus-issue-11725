package example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {

  @GET
  public String hello() {
    return "hello";
  }

}
