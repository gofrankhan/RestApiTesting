import org.testng.Assert;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
	public static void main(String args[]) {
		JsonPath js1 = new JsonPath(payload.CoursePrice());
		
		//Print the number of courses return by API
		int count = js1.getInt("courses.size()");
		System.out.println(count);
		
		//Print purchase amount 
		int totalAmount = js1.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//Print the title of the first course
		String firstCourse = js1.getString("courses[0].title");
		System.out.println(firstCourse);
		
		//Print all courses with the respective prices
		for(int i = 0; i < count ; i++) {
			String courseName = js1.get("courses["+i+"].title");
			String coursePrice= js1.get("courses["+i+"].price").toString();
			System.out.println(courseName+" : "+ coursePrice);
		}
		
		//Print number of copies sold by RPA
		for(int i = 0; i < count ; i++) {
			String courseName = js1.get("courses["+i+"].title");
			String courseCopies = "";
			if(courseName.equals("RPA")) {
				courseCopies = js1.get("courses["+i+"].copies").toString();
				System.out.println(courseName+" : "+ courseCopies);
				break;
			}
		}
		
		//Verify all course price is equal to total purchase amount
		int sum = 0;
		for(int i = 0; i < count; i++) {
			int course_price = js1.get("courses["+i+"].price");
			int course_copies = js1.get("courses["+i+"].copies");
			sum = sum + course_price * course_copies;
		}
		Assert.assertEquals(sum, totalAmount);
	}
}
