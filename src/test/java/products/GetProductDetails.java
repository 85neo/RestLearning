package products;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetProductDetails {

	@BeforeClass
	public void setUp() {

		RestAssured.baseURI = "http://localhost:3030";
		RestAssured.basePath = "/products";

	}

	@Test(priority = 1)
	public void getProductLists() {

		when()
			.get()
		.then()
			.assertThat()
			.contentType("application/json; charset=utf-8")
			.statusCode(200)
			.body("total", equalTo(51963))
			.log()
			.body();

	}

}
