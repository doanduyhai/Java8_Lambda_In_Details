package fr.doan.lambda.interfaces.defender;

import java.util.ArrayList;
import java.util.Arrays;

public interface ConvariantReturn extends SuperDefender
{
	ArrayList<String> toList(String[] inputs) default
	{
		return new ArrayList<String>(Arrays.asList(inputs));
	}
}
