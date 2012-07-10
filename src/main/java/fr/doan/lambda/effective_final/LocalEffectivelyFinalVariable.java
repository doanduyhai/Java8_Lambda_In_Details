package fr.doan.lambda.effective_final;

import java.util.ArrayList;
import java.util.List;

import fr.doan.lambda.sam.shadowing.VariableShadowingSAM;

public class LocalEffectivelyFinalVariable
{
	// private String text = "default";

	public VariableShadowingSAM retrieveVariableShadowingSAM()
	{
		List<String> textList = new ArrayList<String>();
		textList.add("default");
		VariableShadowingSAM sam = () ->
		{
			return textList.get(0);
		};
//		textList = new ArrayList<String>();
//		textList.add("changed_default");
		
		textList.clear();
		textList.add("changed_default");
		return sam;
	}

	public static void main(String... args)
	{
		LocalEffectivelyFinalVariable variableShadowing = new LocalEffectivelyFinalVariable();
		String text = variableShadowing.retrieveVariableShadowingSAM().process();
		System.out.println("\n\n\ttext = " + text);
		System.out.println("");

	}
}
