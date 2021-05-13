package maintmonitor.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("api/MaintMonitor/")
public class MaintMonitorController {
    @GET
    @Path("/{sourceString}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMaintMonitorStringFromSourceString(@PathParam("sourceString")String sourceString){
        return sourceString;

    }
}
