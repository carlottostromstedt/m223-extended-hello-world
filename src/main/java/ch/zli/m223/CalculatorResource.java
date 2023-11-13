package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
public class CalculatorResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/add/{number1}/{number2}")
    public String add(int number1, int number2) {
        int result = number1 + number2;
        return String.valueOf(result);
    }
}
