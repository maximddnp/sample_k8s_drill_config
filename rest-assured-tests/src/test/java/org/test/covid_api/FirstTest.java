package org.test.covid_api;


import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.containsString;

public class FirstTest {
    @Test
    void testSample() {
        String minikubeTestAppService = "http://192.168.99.100:30503/";
        given()
                .log()
                .all()
                .when()
                .get(minikubeTestAppService)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(SC_OK).and()
                .assertThat()
        .body(containsString("Hello"));
    }
}
