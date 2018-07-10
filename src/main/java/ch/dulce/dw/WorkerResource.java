package ch.dulce.dw;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class WorkerResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response doTask(String payload) {
        System.out.println("payload: " + payload);
        return Response.ok().build();
    }
}
