package restapitest;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SymptomGetRequest extends FirstApiTest{

	
	
//	@Test
//	public void givenUrl_whenValidatesResponseWithInstanceSettings_thenCorrect() {
//	    
//	    get("/events?id=390").then().assertThat()
//	      .body(matchesJsonSchemaInClasspath("event_0.json")
//	        .using(jsonSchemaFactory));
//	}

	
	
@Test	
public void getMethod() {
		
	   Map<String, String> m= new HashMap<String, String>();
	   m.put("grant_type", "password");
	   m.put("client_id", "9858629465522579");
	   m.put("client_secret", "75a6ecae01b8c68472a196fe507a4e9768fc52b5d4c9cc6c");
	   m.put("username", "9342300269");
	   m.put("password", "Quality@123");
	   
		
	   Response res = RestAssured.given().spec(requestSpec).body(m).when()
			    .post("https://qa205-svc.medlife.com/ml-rest-services/api/v1/login");
			    String resBody = res.asString();
			  JsonPath js = res.jsonPath();
			 String str = js.get("access_token");
			    System.out.println(str);
	   
	   // this gives the classpath where the JSON schema needs to be stored
	   System.out.println(this.getClass().getResource("/").getPath());  

			    
//	    Response res = RestAssured.given().spec(requestSpec).when()
//	    .get("https://qa205-svc.medlife.com/ml-rest-services/api/v1/internal/symptoms/abd");
//	    String resBody = res.asString();
//	    res.then().assertThat().body(matchesJsonSchemaInClasspath("product.json"));
//	            
//	    System.out.println(resBody);   
	}
}

