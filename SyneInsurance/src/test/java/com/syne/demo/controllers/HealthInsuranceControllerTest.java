package com.syne.demo.controllers;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import junit.framework.*;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class HealthInsuranceControllerTest {

	@LocalServerPort
	int serverPort = 4040;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testfindAll() throws URISyntaxException {
		
		RestTemplate restTemplate = new RestTemplate();
		
		final String baseUrl = "http://localhost: " + serverPort + "/healthInsurance/viewPlans";
		
		URI uri = new URI(baseUrl);
		
		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertEquals(true, result.getBody().contains("ICICI"));
		
		
		//fail("Not yet implemented");
	}

}
