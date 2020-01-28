package services;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import utils.Service;

public class ServicesDetails {
	
	@BeforeTest
	public void getData() {
		
		int resp=given().baseUri("http://localhost:3030/services")
				.when().get().then().assertThat().statusCode(200).extract().path("data.id[0]");
	
		System.out.println(resp);
	}
	
	 @Test(priority=1)
	 public void postData() {
		 
		 Service serName = new Service("test Ben");
		 
		 given().baseUri("http://localhost:3030/").contentType("application/json").body(serName)
		 .when().post("services").then().assertThat().contentType(ContentType.JSON).body("name", equalTo("test Ben"));
	 
	 }
     
	 @Test(priority=2)
	 public void patchData() {
		 
		 Service serName = new Service("test Ben1");
		 
		 given().baseUri("http://localhost:3030/services/").contentType("application/json").body(serName)
		 .when().patch("1").then().assertThat().contentType(ContentType.JSON).body("name", equalTo("test Ben1"));
	 }
}
