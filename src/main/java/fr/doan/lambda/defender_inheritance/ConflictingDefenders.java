package fr.doan.lambda.defender_inheritance;

import fr.doan.lambda.interfaces.defender.Defender1;
import fr.doan.lambda.interfaces.defender.Defender2;

public class ConflictingDefenders implements Defender1, Defender2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ConflictingDefenders obj = new ConflictingDefenders();

		System.out.println("\n ConflictingDefenders : _" + obj.changeInput(" test  ") + "_");
		System.out.println("");

	}

}
