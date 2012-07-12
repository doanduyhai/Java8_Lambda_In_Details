package fr.doan.lambda.this_scoping;

import fr.doan.lambda.mutability.MutableObject;
import fr.doan.lambda.sam.mutability.VariableCaptureInClosureSAM;

public class ScopingOfThis
{
	final public MutableObject mutable = new MutableObject();

	public VariableCaptureInClosureSAM createClosure()
	{		
		VariableCaptureInClosureSAM lambda = ()->
		{	
			MutableObject mutable = new MutableObject();
			mutable.setContent("from_closure");
			
			return this.mutable;
		};

		return lambda;
	}

	public VariableCaptureInClosureSAM createAnonymous()
	{
		VariableCaptureInClosureSAM anonymousClass = new VariableCaptureInClosureSAM()
		{
			MutableObject mutable = new MutableObject();

			@Override
			public MutableObject retrieveMutable()
			{
				this.mutable.setContent("from_anonymous");
				return this.mutable;
			}

		};

		return anonymousClass;

	}

	public static void main(String[] args)
	{
		ScopingOfThis scopingOfThis = new ScopingOfThis();
		VariableCaptureInClosureSAM sam = scopingOfThis.createClosure();

		MutableObject mutableFromClosure = sam.retrieveMutable();
		System.out.println("\nmutableFromClosure content = " + mutableFromClosure.getContent());

		MutableObject mutableFromAnonymous = scopingOfThis.createAnonymous().retrieveMutable();
		System.out.println("mutableFromAnonymous content = " + mutableFromAnonymous.getContent());
		System.out.println("");
	}
}
