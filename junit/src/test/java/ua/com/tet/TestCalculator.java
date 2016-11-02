package ua.com.tet;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ua.com.lesson.Calculator;

public class TestCalculator {
	private static Calculator calculator;
	
	@BeforeClass
	public static void init(){
		calculator= new Calculator();
	}
	
	@AfterClass
	public static void destroy(){
		calculator = null;
	}
	
	@Test 
	public void testAdd(){
		
		int expected  = calculator.add(5, 5);
		int real = 10;
		
//		Assert.assertEquals(expected, real);
		if (expected !=real){
			Assert.fail("hahah");
		}
		
	}

	@Test
	public void  testSubstruct(){
		Assert.assertEquals(calculator.substruc(5, 2),3.0,0.01);
	}
	
	@Test
	public void  testMultiply(){
		Assert.assertEquals(calculator.multiply(7, 2),14);
	}
	@Test
	public void  testdevide(){
		Assert.assertEquals(calculator.devide(10, 4),2.5,0.01);
	}
	
	@Before 
	public void befor(){
		System.out.println("before");
	}
	
	
	
}
