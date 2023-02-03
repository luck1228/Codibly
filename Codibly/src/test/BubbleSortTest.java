package test;

import main.BubbleSort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test() {
		// input = [1,4,5,6,8,3,8] result = [1,3,4,5,6,8,8] 
		List<Comparable> testListInput = Arrays.asList(new Comparable[]{1,4,5,6,7,3,8});
		List<Comparable> testListResult = Arrays.asList(new Comparable[]{1,3,4,5,6,7,8});
		BubbleSort.sort(testListInput);
		Assert.assertEquals(testListInput,testListResult);
		
		// input = [-9.3,0.2,4,0.1,5,9] result = [-9.3,0.1,0.2,4,5,9] 
		testListInput = Arrays.asList(new Comparable[]{-9.3,0.2,4.0,0.1,5.0,9.0});
		testListResult = Arrays.asList(new Comparable[]{-9.3,0.1,0.2,4.0,5.0,9.0});
		BubbleSort.sort(testListInput);
		Assert.assertEquals(testListInput,testListResult);
		
		// input = [] result = [] 
		List<Comparable> testEmptyListInput = Collections.<Comparable>emptyList();
		List<Comparable> testEmptyListResult = Collections.<Comparable>emptyList();
		BubbleSort.sort(testEmptyListInput);
		Assert.assertEquals(testEmptyListInput,testEmptyListResult);
		
		// input = [null,5.0001] result = [5.0001] 
		testListInput = new ArrayList() {{
			add(null);
			add(5.0001);
		}};
		testListResult = Arrays.asList(new Comparable[]{5.0001});
		BubbleSort.sort(testListInput);
		Assert.assertEquals(testListInput,testListResult);
		
		
	}
	
	//input = null result = RuntimeException 
	@Test(expected = RuntimeException.class)  
	public void exceptionTest() {
		List<Comparable> testListInput = null;
		BubbleSort.sort(testListInput);
	}
}