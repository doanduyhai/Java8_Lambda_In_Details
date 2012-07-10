package fr.doan.lambda.defender_inheritance;

import fr.doan.lambda.interfaces.defender.Defender1;
import fr.doan.lambda.interfaces.defender.Defender2;

public class ResolvedDefenderConflictsAtClass implements Defender1, Defender2
{

	public String changeInput(String input)
	{
		return Defender1.super.changeInput(input);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ResolvedDefenderConflictsAtClass obj = new ResolvedDefenderConflictsAtClass();

		System.out.println("\n ResolvedDefenderConflictsAtClass : _" + obj.changeInput(" TesT  ") + "_");
		System.out.println("");

	}

}
