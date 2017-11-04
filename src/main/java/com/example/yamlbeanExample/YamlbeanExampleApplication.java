package com.example.yamlbeanExample;

import com.nik.yamlspringbeans.ImportYamlResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportYamlResource("spring-beans.yaml")
public class YamlbeanExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(YamlbeanExampleApplication.class, args);
	}
}
