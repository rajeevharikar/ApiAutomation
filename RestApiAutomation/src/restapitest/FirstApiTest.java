package restapitest;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class FirstApiTest {
	
	RequestSpecification requestSpec;
	
	@BeforeClass
	public void setup(){
		
//		String basePath = System.getProperty("server.base");
//		if(basePath==null){
//            basePath = "/rest-garage-sample/";
//        }
//		RestAssured.basePath=basePath;
//		
//		 String baseHost = System.getProperty("server.host");
//	        if(baseHost==null){
//	            baseHost = "https://qa205-svc.medlife.com";
//	        }
//	        RestAssured.baseURI=baseHost;
		RequestSpecBuilder builder= new RequestSpecBuilder();
		builder.addHeader("X-Code", "21cca0d0758659717f6bb3b6579dbf0d");
		builder.addHeader("Content-Type", "application/json");
		 requestSpec = builder.build();
		
	}
	
	
}