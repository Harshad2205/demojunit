package com.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJunit2ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	private Calculator c = new Calculator();
		
		@Test
		void testSum()
		{
			int exRes = 12;
			int acRes= c.doSum(4,4,4);
			assertThat(acRes).isEqualTo(exRes);
		}
		
		@Test
		void testProduct() {
			int exRes = 9;
			int acRes = c.doProduct(3, 3);
			assertThat(acRes).isEqualTo(exRes);
		}
		
		@Test
		void testcmp() {
			Boolean acRes = c.campTonum(3, 3);
			assertThat(acRes).isTrue();
		}
}
