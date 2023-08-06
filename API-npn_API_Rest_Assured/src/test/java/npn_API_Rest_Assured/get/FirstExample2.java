package npn_API_Rest_Assured.get;

import org.testng.Assert;
import org.testng.annotations.Test;

//static import of rest assured
import static io.restassured.RestAssured.*;

import java.util.List;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstExample2 
{
@Test
public void testOne()
{
	//type the ResAssured class and when compile error comes, import it and add .* and static to it.
	//bcz all members of RestAssured are static so
	//RestAssured
	
	
	//Same Example1 code without print statements , replaced with logs
	baseURI = "https://reqres.in/";
	basePath = "/api/users";
	RequestSpecification request = given().accept(ContentType.JSON).param("page",2).log().all();
	
	Response response = request.get();
	
	response.then().assertThat().statusCode(200).log().body();
	
	JsonPath json = response.jsonPath();
	JsonPath jsonBody = response.getBody().jsonPath();
	
	int pageValue = jsonBody.getInt("page");
	System.out.println("The page value is::  "+pageValue);
	Assert.assertEquals(pageValue, 2);
	
	List<JsonPath> data = json.getList("data");
	System.out.println("The data is::  "+data);
}
}
