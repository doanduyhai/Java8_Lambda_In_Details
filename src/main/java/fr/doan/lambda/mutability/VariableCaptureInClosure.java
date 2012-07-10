package fr.doan.lambda.mutability;

import java.util.ArrayList;
import java.util.List;

import fr.doan.lambda.sam.mutability.VariableCaptureInClosureSAM;

public class VariableCaptureInClosure
{
	final public MutableObject mutable = new MutableObject();

	public VariableCaptureInClosureSAM createClosure()
	{
		VariableCaptureInClosureSAM lambda = ()->
		{	
			return this.mutable;
		};

		return lambda;
	}

	public void addToMutableContent(String toAdd)
	{
		this.mutable.setContent(this.mutable.getContent() + " " + toAdd);
	}

	public void printMutableContent(String stage)
	{
		System.out.println("\nCurrent VariableCaptureInClosure.mutable reference : " + this.mutable.toString());
		System.out.println("At stage " + stage + ", current VariableCaptureInClosure.mutable content = " + this.mutable.getContent());

	}

	public static void main(String[] args)
	{
		VariableCaptureInClosure variableCapture = new VariableCaptureInClosure();
		VariableCaptureInClosureSAM lambda = variableCapture.createClosure();

		MutableObject mutableFromClosure = lambda.retrieveMutable();
		System.out.println("\nmutableFromClosureBeforeMutation reference : " + mutableFromClosure.toString());
		System.out.println("mutableFromClosureBeforeMutation content = " + mutableFromClosure.getContent());

		variableCapture.printMutableContent("BEFORE MUTATION");
		variableCapture.addToMutableContent("mutable");
		variableCapture.printMutableContent("AFTER MUTATION");

		System.out.println("\nmutableFromClosureAfterMutation reference : " + mutableFromClosure.toString());
		System.out.println("mutableFromClosureAfterMutation content = " + mutableFromClosure.getContent());
		System.out.println("");
	}
}
