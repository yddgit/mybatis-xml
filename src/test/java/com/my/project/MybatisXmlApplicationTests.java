package com.my.project;

import static org.junit.Assert.*;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MybatisXmlApplication.class)
@WebAppConfiguration
public class MybatisXmlApplicationTests {

	@Test
	public void contextLoads() {
	}

	@ClassRule
	public static OutputCapture out = new OutputCapture();

	@Test
	public void test() {
		String output = out.toString();
		assertTrue("Wrong output: " + output, output.contains("1,San Francisco,CA,US"));
		assertTrue("Wrong output: " + output, output.contains("1,Conrad Treasury Place,William & George Streets,4001"));
	}

}
