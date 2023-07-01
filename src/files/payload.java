package files;

public class payload {
	
	public static String AddPlace() {
		
		return "{\n"
				+ "    \"location\" : {\n"
				+ "        \"lat\": -38.383494,\n"
				+ "        \"lng\": 33.427362\n"
				+ "    },\n"
				+ "    \"accuracy\": 50,\n"
				+ "    \"name\" : \"Frontline house\",\n"
				+ "    \"phone_number\" : \"(+91)9838933937\",\n"
				+ "    \"address\": \"29, side layout, cohen 09\",\n"
				+ "    \"types\": [\n"
				+ "        \"shoe park\",\n"
				+ "        \"shop\"\n"
				+ "    ],\n"
				+ "    \"website\":\"http://google.com\",\n"
				+ "    \"language\": \"French_IN\"\n"
				+ "}";
	}
	
	public static String UpdatePlace() {
		
		return "{\n"
				+ "    \"place_id\" : \"b67f33f45c4281915c96ce15976519b8\",\n"
				+ "    \"address\" : \"70 Summmer wolk, USA\",\n"
				+ "    \"key\" : \"qaclick123\"\n"
				+ "}";
	}
	
	public static String UpdatePlace(String placeID, String address) {
		
		return "{\n"
				+ "    \"place_id\" : \""+placeID+"\",\n"
				+ "    \"address\" : \""+address+"\",\n"
				+ "    \"key\" : \"qaclick123\"\n"
				+ "}";
	}
	
	public static String CoursePrice( ) {
		return "{\n"
				+ "  \"dashboard\": {\n"
				+ "    \"purchaseAmount\": 1162,\n"
				+ "    \"website\": \"rahulshettyacademy.com\"\n"
				+ "  },\n"
				+ "  \"courses\": [\n"
				+ "    {\n"
				+ "      \"title\": \"Selenium Python\",\n"
				+ "      \"price\": 50,\n"
				+ "      \"copies\": 6\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"title\": \"Cypress\",\n"
				+ "      \"price\": 40,\n"
				+ "      \"copies\": 4\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"title\": \"RPA\",\n"
				+ "      \"price\": 45,\n"
				+ "      \"copies\": 10\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"title\": \"Appium\",\n"
				+ "      \"price\": 36,\n"
				+ "      \"copies\": 7\n"
				+ "    }\n"
				+ "  ]\n"
				+ "}s";
	}
	
	public static String addBook(String isbn, String aisle) {
		String book = "{\n"
				+ "    \"name\":\"Learn Selenium Automation with Java\",\n"
				+ "    \"isbn\": \""+isbn+"\",\n"
				+ "    \"aisle\": \""+aisle+"\",\n"
				+ "    \"author\": \"John Foe\"\n"
				+ "}";
		return book;
	} 
}
