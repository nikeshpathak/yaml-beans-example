package com.example.yamlbeanExample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YamlbeanExampleApplicationTests {

	@Autowired
	Customer customer;

	@Test
	public void testBeanInitialization() {

		Assert.assertNotNull(customer);
		Assert.assertNotNull(customer.getFirstName());
		Assert.assertNotNull(customer.getLastName());
		Assert.assertNotNull(customer.getPhone());
		Assert.assertNotNull(customer.getAddress());
		Assert.assertNotNull(customer.getAddress().getAddress1());
		Assert.assertNotNull(customer.getAddress().getAddress2());
		Assert.assertNotNull(customer.getAddress().getCountry());
		Assert.assertNotNull(customer.getAddress().getCountry().getCountryName());

	}

}
