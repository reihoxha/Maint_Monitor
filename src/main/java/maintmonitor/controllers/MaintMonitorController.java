package maintmonitor.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.io.IOException;
import java.net.URI;

@Path("/api/maintenanceMode")
public class MaintMonitorController {
    static String sourcestring = "-"; //VARIABLE DEFINED FOR THE MONITOR TO TURN GREEN
    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMaintMonitorStringFromSourceString(){ //IF URL IS ACCESSED WITHOUT PARAMETER,
                                                             // - IS BROADCAST TO FRONTEND
        Response.ResponseBuilder rb = Response.ok(sourcestring);
        return rb.header("Access-Control-Allow-Origin", "*")
                .build();
    }
    @GET
    @Path("/{newStatus}")
    @Produces(MediaType.TEXT_PLAIN)
    public String setStatusGet(@PathParam("newStatus") String newStatus){
        //IF PARAMETER IS ENTERED, IT IS BROADCAST
        // TO FRONTEND AND THE MONITOR TURNS RED
        sourcestring = newStatus;
        return sourcestring;
    }
    @GET
    @Path("/Reset")
    @Produces(MediaType.TEXT_PLAIN) //RESETS PARAMETER TO - , RESULTING TO GREEN MONITOR
    public String resetStatus(){
        sourcestring = "-";
        return sourcestring;
    }

}

