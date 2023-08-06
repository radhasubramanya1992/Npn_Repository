package npn_API_Rest_Assured.get;
//static import of rest assured
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class GoRest_GET 
{
	@Test
public void testGoRestGet() throws IOException
{
	baseURI = "https://gorest.co.in";
	basePath = "public/v2/users";
	
	File getResponseSchema = new File(System.getProperty("user.dir")+
			File.separator+"src"+
			File.separator+"test"+
			File.separator+"resources"+
			File.separator+"GetResponseSchema.json");
	//Given block
	given()
	.header("Authorization", "Bearer b061de78711ef212d967301f3c2047c311ba331a1532c43a56050ee85fe6720d")
	.log()
	.all()
	
	//When block - Get Request
	.when()
	.get()
	
	//Then block - validation
	.then()
	.log()
	.all()
	.assertThat()
	.statusCode(200)
	.and()
	.body(JsonSchemaValidator.matchesJsonSchema(getResponseSchema));
}
}
