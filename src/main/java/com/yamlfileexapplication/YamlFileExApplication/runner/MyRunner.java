package com.yamlfileexapplication.YamlFileExApplication.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.yamlfileexapplication.YamlFileExApplication.entity.Product;

@Component
public class MyRunner implements ApplicationRunner {
	@Autowired
	private Product prod;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(Arrays.asList(prod));
	}
}
