package fr.doan.lambda.interfaces.defender;

public interface ResolvedDefenderConflictInterface extends Defender1, Defender2
{
	String changeInput(String input) default 
	{
		return Defender2.super.changeInput(input);
	}
}
