package com.roshandemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProducerRestController {

	@Autowired
	private Producer producer;

	@GetMapping("/push/{id}")
	public ResponseEntity<String> getProductById(@PathVariable String id) {
		producer.send(id); 
		return ResponseEntity.ok("Product deleted successfully");

	}

}
