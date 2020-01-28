package step2Methods;

import org.testng.annotations.Test;
import utils.Product;
import static io.restassured.RestAssured.*;

public class CreateProduct {

	Product productData = new Product("CName1", "CType1", "CUPC1", "Cdescription1", "Cmanufacturer", "Cmodel",
			"https://www.google.com","https://www.google1.com", 10,3);
	
	@Test
	public void productCreation() {
		
	int resp=	given()
			.baseUri("http://localhost:3030/")
			.contentType("Application/JSON")
			.body(productData)
		.when()
			.post("products")
		.then()
			.assertThat()
			.statusCode(201)
			.extract().path("id");
		
		 
		System.out.println(resp);
	}
}
