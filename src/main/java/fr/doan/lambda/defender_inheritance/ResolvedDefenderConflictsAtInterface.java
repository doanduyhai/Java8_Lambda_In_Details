package fr.doan.lambda.defender_inheritance;

import fr.doan.lambda.interfaces.defender.ResolvedDefenderConflictInterface;

public class ResolvedDefenderConflictsAtInterface implements ResolvedDefenderConflictInterface
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ResolvedDefenderConflictsAtInterface obj = new ResolvedDefenderConflictsAtInterface();

		System.out.println("\n ResolvedDefenderConflictsAtInterface : _" + obj.changeInput(" TesT  ") + "_");
		System.out.println("");

	}

}
