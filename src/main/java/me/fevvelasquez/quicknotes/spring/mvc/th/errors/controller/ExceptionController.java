package me.fevvelasquez.quicknotes.spring.mvc.th.errors.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Quick Notes.
 * 
 * Map exception type, handler and view.
 * 
 * @version 0.0.2-QUICKNOTES Error Handling: Custom Exception
 *          error, @ControllerAdvice, @ExceptionHandler.
 * @author fevvelasquez
 *
 */
@ControllerAdvice
public class ExceptionController {

	/**
	 * 
	 * Try:<br>
	 * - get ArithmeticException: "localhost:8080/arithmetic-exception"<br>
	 * 
	 */
	@ExceptionHandler({ArithmeticException.class})
	public String handler(ArithmeticException e, Model model) {
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("error", "Arithmetic Error.");
		model.addAttribute("message", e.getMessage());
		model.addAttribute("timestamp", new Date());
		return "error/error";
	}

}
