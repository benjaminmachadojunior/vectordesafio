package com.produtos.apirest.Controller;

import static org.junit.Assert.*;

import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class TransacoesControllerTest {

	@Test
	 public void extratodetransacoesdeconta(){
	    String uriBase = "http://localhost:8080/vector/extratodetransacoesdeconta/1";      
	          given()
	          .relaxedHTTPSValidation()
	          .when()
	                 .get(uriBase)
	          .then()
	                 .statusCode(200)
	                 .contentType(ContentType.JSON);

	 }
	
	@Test
	public void extratoporperiodo(){
	String uriBase = "http://localhost:8080/vector/extratoporperiodo";         
	      given()
	      .relaxedHTTPSValidation()
	      .param("idConta", "1")
	      .param("inicio", "2019/10/15 00:00")
	      .param("fim", "2019/10/15 23:59")
	      .when()
	             .get(uriBase)
	      .then()
	             .statusCode(200)
	             .contentType(ContentType.JSON);
			}
		
	

}
