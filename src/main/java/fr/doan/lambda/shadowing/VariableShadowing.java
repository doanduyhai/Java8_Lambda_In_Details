package fr.doan.lambda.shadowing;

import fr.doan.lambda.sam.shadowing.VariableShadowingSAM;

public class VariableShadowing
{
	// private String text = "default";

	public VariableShadowingSAM retrieveVariableShadowingSAM()
	{
		String text = "default";
		VariableShadowingSAM sam = () ->
		{
			String text ="sam";
			return text;
		};
		return sam;
	}

	public static void main(String... args)
	{
		VariableShadowing variableShadowing = new VariableShadowing();
		String text = variableShadowing.retrieveVariableShadowingSAM().process();
		System.out.println("\n\n\ttext = " + text);

	}
}
