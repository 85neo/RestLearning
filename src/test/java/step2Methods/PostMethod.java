package step2Methods;
import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import utils.PostData;

import static  org.hamcrest.Matchers.*;

import java.util.HashMap;

public class PostMethod {
	
	HashMap<String, String> map = new HashMap<String, String>();
 
	
	@BeforeClass
	public void setUp() {
		
	    RestAssured.baseURI ="https://reqres.in";
	    RestAssured.basePath="/api/users";
	    map.put("name", PostData.pName());
	    map.put("job", PostData.pJob());
	}
	
	
	
	@Test
	public void postStep2Method() {
		
		
		given()
			.contentType(ContentType.JSON)
			.body(map)
		.when()
			.post()
		.then()
			.assertThat()
			.statusCode(201)
			.body("name", equalTo(map.get("name")))
			.body("job", equalTo(map.get("job")));
		 
		    
	}
	
}
