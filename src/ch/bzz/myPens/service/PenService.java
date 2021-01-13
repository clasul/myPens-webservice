package ch.bzz.myPens.service;


import ch.bzz.myPens.model.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.*;

/**
 * Pens
 *
 * @author Clarissa Sullivan
 * @version 1.0
 * @since 07.03.20
 * 
 */

@Path("pen")
public class PenService extends Application {

    @Path("list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPens () {
        Map<String, Pen> penMap = new Collection().getPenMap();
        Response response = Response
                .status(200)
                .entity(penMap)
                .build();
        return response;
    }

    @Path("read")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response readPen (
            @QueryParam("penId") String penId) {
        Map<String, Pen> penMap = new Collection().getPenMap();
        Pen pen = null;
        int status;

        if (penMap.containsKey(penId)) {
            pen = penMap.get(penId);
            status = 200;
        } else if (!penMap.containsKey(penId)) {
            status = 400;
        } else {
            status = 404;
        }

        Response response = Response
                .status(status)
                .entity(pen)
                .build();
        return response;
    }

}
