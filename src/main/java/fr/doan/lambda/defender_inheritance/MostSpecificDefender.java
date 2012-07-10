package fr.doan.lambda.defender_inheritance;

import fr.doan.lambda.interfaces.defender.Defender1;
import fr.doan.lambda.interfaces.defender.EmptyInterface1;

public class MostSpecificDefender implements EmptyInterface1, Defender1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		MostSpecificDefender obj = new MostSpecificDefender();

		System.out.println("\n MostSpecificDefender : _" + obj.changeInput(" test  ") + "_");
		System.out.println("");
	}

}
