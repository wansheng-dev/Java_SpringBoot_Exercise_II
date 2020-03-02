package com.ch3.as2routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {

	@RequestMapping("/{text}")
	public String dojo(@PathVariable("text") String text) {
		System.out.println(text);
		String dojo = "dojo";
		if (text == dojo) {
			return "The " + text + " is awesome!";
		}
		if (text == "burbank-dojo") {
			return "Burbank Dojo is located in Southern California.";			
		}
		return "SJ dojo is the headquarters.";
	}
	
}
