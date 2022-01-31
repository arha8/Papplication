package org.example.order.rest;


import org.example.order.business.OrderService;
import org.example.order.view.OrderRequest;
import org.example.order.view.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/order")
public class OrderRestController {

    @Autowired
    private OrderService orderService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<OrderResponse> getOrderInfo(OrderRequest request) {
        return orderService.getInfo(request);
    }

    @GET
    //@Path("/hello")
    public String checkAdmin() {
        return "Rest Service is working";
    }
}
