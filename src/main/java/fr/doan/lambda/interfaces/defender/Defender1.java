package fr.doan.lambda.interfaces.defender;

public interface Defender1 extends SuperDefender
{
	String changeInput(String input) default
	{
		return input.toUpperCase();
	}
}
