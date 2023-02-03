package test;

import main.BalancedWordsCounter;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BalancedWordsCounterTest {

	@Test
	public void test() {
		//input = “aabbabcccba” result = 28 
		int testInput = BalancedWordsCounter.count("aabbabcccba");
		int testResult = 28;
		Assert.assertEquals(testInput,testResult);
		
		//input = "" result = 0
		testInput = BalancedWordsCounter.count("");
		testResult = 0;
		Assert.assertEquals(testInput,testResult);
		
	}
	
	@Test(expected = RuntimeException.class)  
	public void exceptionTest() {
		//input = “abababa1” result = RuntimeException
		int testInput = BalancedWordsCounter.count("abababa1");
		
		//input = null result = RuntimeException
		testInput = BalancedWordsCounter.count("null");
	}

}
