package testCasesApi;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.oauth2;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class DeliveryDateAvailability {

    String key = "3cd53de3ae97444da7f0a8807272ca65";
    String url = "https://rf-api-dev-apim.azure-api.net/QA/v1/api";


    @Test
    void getConnectedToRFAPI() {
        //specify base URI
        RestAssured.baseURI="https://rf-api-dev-apim.azure-api.net/QA/v1/api";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //response object
        Response res = httpRequest.request(Method.GET, "/DeliveryDateAvailability/IAF");

        String responseBody = response.getBody().asString();
        System.out.println("Response body is: " + responseBody);

    }

    @Test
    void getDeliveryDateAvailablity(){
        String newUrl = url + "/DeliveryDateAvailability/IAF";
        given().auth().oauth2(key).when().get(newUrl).then().log().body();
    }


}
