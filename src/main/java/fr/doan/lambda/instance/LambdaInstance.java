package fr.doan.lambda.instance;

import fr.doan.lambda.sam.instance.SAMWithDefender;

public class LambdaInstance
{

	public static SAMWithDefender createLambda()
	{
		return () -> {System.out.println("");};
	}

	public static SAMWithDefender createStatefullLambda(String input)
	{
		String toto = "toto";
		return () -> {System.out.println("input = "+toto);};
	}

	public static void main(String[] args)
	{
		SAMWithDefender samInstance1 = LambdaInstance.createLambda();
		SAMWithDefender samInstance2 = LambdaInstance.createStatefullLambda("statefull");

		System.out.println("\n");
		samInstance1.whoAmI();
		samInstance2.whoAmI();
		System.out.println("");
	}
}
