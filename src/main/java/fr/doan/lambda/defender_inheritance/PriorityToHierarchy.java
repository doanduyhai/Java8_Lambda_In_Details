package fr.doan.lambda.defender_inheritance;

import fr.doan.lambda.interfaces.defender.Defender1;

public class PriorityToHierarchy extends AbstractClass implements Defender1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		PriorityToHierarchy obj = new PriorityToHierarchy();

		System.out.println("\n PriorityToHierarchy : _" + obj.changeInput(" test  ") + "_");
		System.out.println("");

	}

}
