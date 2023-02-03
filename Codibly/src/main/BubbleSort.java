package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
	
	public static List<Comparable> sort(List<Comparable> input)
	{
		if(input == null)
			throw new RuntimeException("Input cannot be null");
		
		if(input.isEmpty())
			return input;
		
		input.removeAll(Collections.singleton(null));
		
		int size = input.size();
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(input.get(j).compareTo(input.get(j+1)) > 0 )
				{
					Comparable temp = input.get(j);
					input.set(j,input.get(j+1));
					input.set(j+1, temp);
				}
			}
		}
		return input;
	}

	public static void main(String[] args) {

	}

}
