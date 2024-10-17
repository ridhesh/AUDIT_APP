package com.mfpe.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfpe.model.AuditBenchmark;


@RestController
@RequestMapping("/benchmark")
@CrossOrigin(origins = "*")

public class AuditBenchmarkController {

	@GetMapping("/audit-benchmark")
	public List<AuditBenchmark> getAuditBenchmark(@RequestHeader("Authorization") String jwt) {
		List<AuditBenchmark> auditBenchmarks = new ArrayList<>();

		
		return auditBenchmarks;
	}

	@GetMapping("/health-check")
	public String healthCheck() {
		return "Audit Benchmark Microservice is Active";
	}

}
