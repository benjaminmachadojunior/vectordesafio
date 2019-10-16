package com.produtos.apirest.Controller;

import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;

import org.junit.Test;

import io.restassured.http.ContentType;

public class ContasControllerTest {

    @org.junit.Test
 public void saldo(){
    String uriBase = "http://localhost:8080/vector/saldo";      
    given()
    .relaxedHTTPSValidation()
    .param("idConta", "1")
    .when()
           .get(uriBase)
    .then()
           .statusCode(200)
           .contentType(ContentType.JSON);
		}
    
	
}

