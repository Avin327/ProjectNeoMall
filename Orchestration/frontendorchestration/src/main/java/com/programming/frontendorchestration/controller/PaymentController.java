package com.programming.frontendorchestration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programming.frontendorchestration.model.Payment;
import com.programming.frontendorchestration.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@PostMapping
	public ResponseEntity<?> payUsingDebit(@RequestHeader("Authorization") String sToken,
			@RequestBody Payment payment) {
		if (sToken != null && sToken.startsWith("Bearer ")) {
            String token = sToken.substring(7);

            return paymentService.payUsingDebit(token,payment);
        } else {
            return ResponseEntity.status(401).body("Invalid Authorization header");
        }
		
	}
}
