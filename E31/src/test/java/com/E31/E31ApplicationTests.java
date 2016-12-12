package com.E31;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class E31ApplicationTests {


		@Test
	public void contextLoads() {
			E31Application t = new E31Application();
			String h=E31Application.metodoE31();
			assertEquals(E31Application.metodoE31(), h);
			}

}
