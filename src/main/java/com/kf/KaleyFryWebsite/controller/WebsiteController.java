package com.kf.KaleyFryWebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WebsiteController {
	
	@GetMapping("/")
    public String main() {
        return "main";
    }
	
	@GetMapping("About")
    public String aboutme() {
        return "aboutme";
    }
	
	@GetMapping("Resume")
    public String resume() {
        return "resume";
    }
	
	@GetMapping("Projects")
    public String projects() {
        return "projectlibrary";
    }
	
	@GetMapping("GoogleMaps")
    public String googlemaps() {
        return "googleMapsApp";
    }
	
	@GetMapping("WeatherApp")
    public String weatherapp() {
        return "weatherApp";
    }
	
	@GetMapping("Contact")
    public String contact() {
        return "contact";
    }
	
	@PostMapping("weatherApp")
	public String weatherApp() {
		return "weatherApp";
	}
	
	@PostMapping("GoogleMaps")
	public String googleMaps() {
		return "googleMapsApp";
	}

}
