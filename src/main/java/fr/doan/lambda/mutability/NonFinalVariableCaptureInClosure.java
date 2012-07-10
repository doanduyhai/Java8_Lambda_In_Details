package fr.doan.lambda.mutability;

import java.util.ArrayList;
import java.util.List;

import fr.doan.lambda.sam.mutability.VariableCaptureInClosureSAM;

public class NonFinalVariableCaptureInClosure
{
	public MutableObject mutable = new MutableObject();

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
		NonFinalVariableCaptureInClosure variableCapture = new NonFinalVariableCaptureInClosure();
		VariableCaptureInClosureSAM lambda = variableCapture.createClosure();

		MutableObject mutableFromClosureBeforeRefChange = lambda.retrieveMutable();
		System.out.println("\nmutableFromClosureBeforeRefChange reference : " + mutableFromClosureBeforeRefChange.toString());
		System.out.println("mutableFromClosureBeforeRefChange content = " + mutableFromClosureBeforeRefChange.getContent());

		MutableObject newMutable = new MutableObject();
		newMutable.setContent("new_content");
		variableCapture.mutable = newMutable;

		MutableObject mutableFromClosureAfterRefChange = lambda.retrieveMutable();

		System.out.println("\nmutableFromClosureAfterRefChange reference : " + mutableFromClosureAfterRefChange.toString());
		System.out.println("mutableFromClosureAfterRefChange content = " + mutableFromClosureAfterRefChange.getContent());
		System.out.println("");
	}
}
