package me.fevvelasquez.quicknotes.spring.mvc.th.errors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Quick Notes.
 * 
 * Create:<br>
 * "resources/templates/404.html"<br>
 * "resources/templates/500.html"<br>
 * 
 * Try:<br>
 * - get ERROR 404: "localhost:8080/x"<br>
 * - get ERROR 500: "localhost:8080"<br>
 * 
 * 
 * @version 0.0.1-QUICKNOTES Error Handling: Custom 404 and 500 error.
 * @author fevvelasquez
 *
 */
@Controller
public class QuickNotesController {
	/**
	 * 
	 * Get ERROR 500:<br>
	 * There was an unexpected error (type=Internal Server Error, status=500)
	 * 
	 */
	@GetMapping("/")
	public String getError500() {
		return "resource-not-mapped";
	}

	/**
	 * 
	 * Get Arithmetic Exception<br>
	 * 
	 */
	@GetMapping("/arithmetic-exception")
	public String getArithmeticException() {
		@SuppressWarnings("unused")
		int i = 3 / 0;
		return "resource-not-mapped";
	}
}