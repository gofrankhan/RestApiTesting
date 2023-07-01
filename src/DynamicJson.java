import org.testng.annotations.Test;

import files.ReUseableMethods;
import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DynamicJson {
	
	@Test
	public void AddBook() {
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().header("Content-Type", "application/json")
		.body(payload.addBook("aisle", "isbn"))
		.when().log().all()
		.post("/Library/Addbook.php")
		.then().assertThat().statusCode(200)
		.extract().response().asString();
		
		JsonPath js1 = ReUseableMethods.rawToJson(response);
		String id = js1.get("ID");
		System.out.println("ID : " + id);
	}
}
