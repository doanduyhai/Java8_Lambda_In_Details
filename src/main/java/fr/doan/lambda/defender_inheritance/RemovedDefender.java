package fr.doan.lambda.defender_inheritance;

import fr.doan.lambda.interfaces.defender.RemovedDefenderInterface;

public class RemovedDefender implements RemovedDefenderInterface
{

	public String changeInput(String input)
	{
		return "overriden 'removed_default'" + input;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		RemovedDefender obj = new RemovedDefender();
		System.out.println("\n RemovedDefender : _" + obj.changeInput(" test ") + "_");
		System.out.println("");

	}

}
