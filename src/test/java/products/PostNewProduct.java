package products;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;



public class PostNewProduct {


	@Test(priority=1)
	public void getProductLists() {
		
		
	     String jsonData="{\r\n" + 
	     		"  \"name\": \"string2\",\r\n" + 
	     		"  \"type\": \"string2\",\r\n" + 
	     		"  \"price\": 2,\r\n" + 
	     		"  \"shipping\": 2,\r\n" + 
	     		"  \"upc\": \"string2\",\r\n" + 
	     		"  \"description\": \"string2\",\r\n" + 
	     		"  \"manufacturer\": \"string2\",\r\n" + 
	     		"  \"model\": \"string2\",\r\n" + 
	     		"  \"url\": \"string2\",\r\n" + 
	     		"  \"image\": \"string2\"\r\n" + 
	     		"}";
		

		
		int ids=given()
		    .baseUri("http://localhost:3030")
			.contentType("application/json")
			.body(jsonData)
		.when()
			.post("/products")
		.then()
		    .assertThat()
		    .contentType("application/json; charset=utf-8")
		    .statusCode(201).log().body().extract().path("id");
		System.out.println(ids);
		
		
		   
		
		
		  
		
	}
	
}
