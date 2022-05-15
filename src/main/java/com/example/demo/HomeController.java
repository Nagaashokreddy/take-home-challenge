package com.example.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {


	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);



	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE )
	public   String handleJson() {
		LOGGER.debug("The request send Accept header with value application/json");
		return "{ \"message\": \"Hello World\"}";
	}

	@RequestMapping(produces = MediaType.ALL_VALUE, consumes = MediaType.ALL_VALUE)
	public String handleHTML() {
		LOGGER.debug("The request does not send an Accept header");
		return "<p>Hello,world</p>";
	}
	
}
