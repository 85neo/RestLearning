package products;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class PatchProductId {
	
	
	
	@Test
	public void updateProductID() {
		

	     String jsonData="{\r\n" + 
	     		"  \"name\": \"string2New\",\r\n" + 
	     		"  \"type\": \"string2\",\r\n" + 
	     		"  \"price\": 12,\r\n" + 
	     		"  \"shipping\": 2,\r\n" + 
	     		"  \"upc\": \"string2\",\r\n" + 
	     		"  \"description\": \"string2\",\r\n" + 
	     		"  \"manufacturer\": \"string2\",\r\n" + 
	     		"  \"model\": \"string2\",\r\n" + 
	     		"  \"url\": \"string2\",\r\n" + 
	     		"  \"image\": \"string2\"\r\n" + 
	     		"}";
		given()
			.baseUri("http://localhost:3030/")
			.contentType("application/json")
			.body(jsonData)
		.when()
			.patch("products/9999698")
		.then()
		 	.assertThat()
		 	.statusCode(200)
		 	.body("price",equalTo(12))
		 	.body("name",equalTo("string2New"));
		
	}

}
