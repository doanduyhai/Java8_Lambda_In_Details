package fr.doan.lambda.defender_inheritance;

import fr.doan.lambda.interfaces.defender.EmptyInterface1;
import fr.doan.lambda.interfaces.defender.EmptyInterface2;

public class SameSuperDefenderMethod implements EmptyInterface1, EmptyInterface2
{

	/**
	 * @param args
	 */
	public static void main(String... args)
	{
		SameSuperDefenderMethod obj = new SameSuperDefenderMethod();
		System.out.println("\n SameSuperDefenderMethod : _" + obj.changeInput(" test  ") + "_");
		System.out.println("");
	}

}
