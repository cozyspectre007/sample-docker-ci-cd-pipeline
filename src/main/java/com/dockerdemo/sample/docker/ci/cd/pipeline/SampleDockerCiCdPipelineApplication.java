package com.dockerdemo.sample.docker.ci.cd.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SampleDockerCiCdPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDockerCiCdPipelineApplication.class, args);
	}


}
