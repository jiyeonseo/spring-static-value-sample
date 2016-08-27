package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("real")
public class StaticValueApplicationTests {

    @Autowired
    HelloComponent helloComponent;

    @Test
	public void contextLoads() {
		System.out.println(helloComponent.getHello());
        System.out.println(helloComponent.getStaticHello());
	}

}
