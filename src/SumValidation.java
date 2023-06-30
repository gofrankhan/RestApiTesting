import org.testng.Assert;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.path.json.JsonPath;

public class SumValidation {
	
	@Test
	public void sumOfCourses() {
		JsonPath js1 = new JsonPath(payload.CoursePrice());
		int count = js1.getInt("courses.size()");
		int totalAmount = js1.getInt("dashboard.purchaseAmount");
		int sum = 0;
		for(int i = 0; i < count; i++) {
			int course_price = js1.get("courses["+i+"].price");
			int course_copies = js1.get("courses["+i+"].copies");
			sum = sum + course_price * course_copies;
		}
		Assert.assertEquals(sum, totalAmount);
	}
	
}
