package stores;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StoresDetails {

	@Test(priority = 1)
	public void getDetails() {

		given().baseUri("http://localhost:3030").when().get("/stores").then().assertThat().statusCode(200);

	}

	@Test(priority = 2)
	public void postDetails() {

		Map<String, Object> services1 = new HashMap<String, Object>();
		services1 = Collections.emptyMap();

		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("name", "TestNeo");
		hm.put("type", "ttype");
		hm.put("address", "address1");
		hm.put("address2", "address2");
		hm.put("city", "Pune");
		hm.put("state", "Maha");
		hm.put("zip", "411023");
		hm.put("lat", 2);
		hm.put("lng", 3);
		hm.put("hours", "5");
		hm.put("services", services1);
		System.out.println(hm);

		Response resp =

				given().baseUri("http://localhost:3030").contentType(ContentType.JSON).body(hm).when().post("/stores")
						.then().assertThat().statusCode(201).body("name", equalTo("TestNeo")).log().body().extract()
						.response();

		String SId = resp.jsonPath().getString("id");
		System.out.println(SId);
		Assert.assertNotNull(SId);

		/* Verify the get product details call using the above generated Store ID */

		String responseId = given().baseUri("http://localhost:3030").when().get("/stores/" + SId).then().assertThat()
				.statusCode(200).contentType(ContentType.JSON).body("name", equalTo("TestNeo")).extract().path("id")
				.toString();
		Assert.assertEquals(SId, responseId);
	}

	@Test(priority = 3)
	public void patchDetailsProduct() {

		Map<String, Object> services1 = new HashMap<String, Object>();
		services1 = Collections.emptyMap();

		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("name", "TestNeo");
		hm.put("type", "ttype");
		hm.put("address", "address1");
		hm.put("address2", "address2");
		hm.put("city", "Pune");
		hm.put("state", "Maha");
		hm.put("zip", "411023");
		hm.put("lat", 2);
		hm.put("lng", 3);
		hm.put("hours", "5");
		hm.put("services", services1);
		System.out.println(hm);

		Response resp =

				given().baseUri("http://localhost:3030").contentType(ContentType.JSON).body(hm).when()
						.patch("/stores/8922").then().assertThat().statusCode(200).body("name", equalTo("TestNeo"))
						.log().body().extract().response();

		String SId = resp.jsonPath().getString("id");
		System.out.println(SId);
		Assert.assertNotNull(SId);

	}

	@Test(priority = 4)
	public void deleteDetailsProduct() {

		given().baseUri("http://localhost:3030").when().delete("/stores/8927").then().assertThat().statusCode(200).log()
				.body();

	}

}
