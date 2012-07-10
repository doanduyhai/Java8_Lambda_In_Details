package fr.doan.lambda.interfaces.defender;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public interface SuperDefender
{
	String changeInput(String input) default
	{
		return input.trim();
	}
	
	List<String> toList(String[] inputs) default
	{
		return new ArrayList<String>(Arrays.asList(inputs));
	}
}
