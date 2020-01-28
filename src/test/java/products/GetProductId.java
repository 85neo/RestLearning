package products;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetProductId {

	
	@BeforeClass
	public void setUp() {
		
		RestAssured.baseURI="http://localhost:3030";
		RestAssured.basePath="/products/9999698";

	}
	
	@Test(priority=1)
	public void getProductLists() {
		
		when()
			.get()
		.then()
		    .assertThat()
		    .contentType("application/json; charset=utf-8")
		    .statusCode(200)
			.body("id", equalTo(9999698))
		    .body("name", equalTo("string2"));
		    		

		
	}
}
