package com.TechMahindra.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.TechMahindra.app.service.HomeService;

@RestController
public class HomeController 
{
	@Autowired
	private HomeService hs;

}
