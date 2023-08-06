package npn_API_Rest_Assured.post;

import org.testng.Assert;
import org.testng.annotations.Test;

//static import of rest assured
import static io.restassured.RestAssured.*;

import java.util.List;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstExample 
{
@Test
public void testOne()
{
	//type the ResAssured class and when compile error comes, import it and add .* and static to it.
	//bcz all members of RestAssured are static so
	//RestAssured
	
	baseURI = "https://reqres.in/";
	basePath = "/api/users";
	RequestSpecification request = given().accept(ContentType.JSON).param("page",2);
	
	Response response = request.get();
	
	System.out.println("The response is:: \n"+response.asPrettyString());
	
	response.then().assertThat().statusCode(200);
}
}
