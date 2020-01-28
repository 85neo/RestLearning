package products;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class DeleteProductId {
	
	@Test
	public void deleteProduct() {

		given()
			.baseUri("http://localhost:3030/")
		.when()
			.delete("products/9999698")
		.then()
			.assertThat()
			.statusCode(200)
			.log().body();

	}

}
