package files;

import io.restassured.path.json.JsonPath;

public class ReUseableMethods {
	
		public JsonPath rawToJson(String response) {
			JsonPath js1 = new JsonPath(response);
			return js1;
		}
}
