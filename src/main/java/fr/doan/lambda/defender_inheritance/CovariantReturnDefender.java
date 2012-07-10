package fr.doan.lambda.defender_inheritance;

import fr.doan.lambda.interfaces.defender.ConvariantReturn;

public class CovariantReturnDefender implements ConvariantReturn
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		CovariantReturnDefender obj = new CovariantReturnDefender();
		String[] inputs = new String[]
		{
				"test1",
				"test2"
		};
		System.out.println("\n CovariantReturnDefender : _" + obj.toList(inputs) + "_");
		System.out.println("");
	}

}
