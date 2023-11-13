package ch.zli.m223;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;


public class CalculatorResourceTest {
    @Test
    public void testGreetingEndpoint() {
        Random rn = new Random();
        int range = 100 - 1 + 1;
        int number1 = rn.nextInt(range) + 1;
        int number2 = rn.nextInt(range) + 1;
        int result = number1 + number2;
        given()
          .pathParam("number1", number1)
          .pathParam("number2", number2)
          .when().get("/calculator/add/{number1}/{number2}")
          .then()
            .statusCode(200)
            .body(is(String.valueOf(result)));
    }

}
