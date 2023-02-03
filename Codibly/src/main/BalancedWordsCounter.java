package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.BubbleSort;

public class BalancedWordsCounter {

	public static int count(String input)
	{
		if(input==null)
			throw new RuntimeException("Text cannot be null");
		int size = input.length();
		if(! isItOnlyLetters(input,size))
			throw new RuntimeException("Text can only contain letters");
		
		int count = 0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size+1;j++)
			{
				String subInput = input.substring(i, j);
				if(	(isItBalanced(subInput))	)
					count++;
			}
		}
		return count;
	}
	
	private static boolean isItOnlyLetters(String input,int size)
	{
		boolean answer = true;
		for(int i=0;i<size;i++)
		{
			char c = input.charAt(i);
			if ( !(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z'))
			{
				answer =  false;
				i = size;
			}	
		}
		return answer;
	}
	
	private static boolean isItBalanced(String subInput)
	{
		boolean answer = true;
		if(subInput.length()==1)
			return answer;
		List<Comparable> subStringList = new ArrayList<Comparable>(Arrays.asList(subInput.split("")));
		subStringList = BubbleSort.sort(subStringList);
		int size = subStringList.size();
		int max = 0;
		int amount = 1;
		Comparable temp = subStringList.get(0);
		for(int i=1;i<size;i++)
		{
			if(subStringList.get(i).compareTo(temp)==0)
				amount++;
			else
			{
				if(max==0)
					max = amount;
				if(amount != max)
				{
					i = size-1;
					answer = false;
				}
				temp = subStringList.get(i);
				amount = 1;
			}
				
		}
		if(amount != max && max!=0)
			answer = false;
		return answer;
	}
		
	public static void main(String[] args) {

	}

}
