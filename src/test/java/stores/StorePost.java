package stores;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.Store;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StorePost {

	
	@Test
	public void postData() {
		Map<String, Object> services2 = new HashMap<String, Object>();
		services2.clear();
		
		 Store newStore= new Store("Name2", "type2", "address1", "address2", "city2", "state2", "zip2","5", 4, 3,(HashMap<String, Object>) services2);
		 System.out.println(newStore.getDet());
		 Response resp =

					given().baseUri("http://localhost:3030").contentType(ContentType.JSON).body(newStore).when().post("/stores")
							.then().assertThat().statusCode(201).body("name", equalTo("Name2")).log().body().extract()
							.response();

			String SId = resp.jsonPath().getString("id");
			System.out.println(SId);
			Assert.assertNotNull(SId);

			/* Verify the get product details call using the above generated Store ID */
/*
			String responseId = given().baseUri("http://localhost:3030").when().get("/stores/" + SId).then().assertThat()
					.statusCode(200).contentType(ContentType.JSON).body("name", equalTo("Name2")).extract().path("id")
					.toString();
			Assert.assertEquals(SId, responseId);*/
		}
	}
	

