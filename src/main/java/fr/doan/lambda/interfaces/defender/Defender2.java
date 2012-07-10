package fr.doan.lambda.interfaces.defender;

public interface Defender2 extends SuperDefender
{
	String changeInput(String input) default
	{
		return input.toLowerCase();
	}
}
