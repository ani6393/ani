package com.example123.Ankush.RestController;

import java.security.PublicKey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController 
{
	@GetMapping("/Home")
	
		public String Aniket() 
		{
			return"This is my first Page";
		}
	}



