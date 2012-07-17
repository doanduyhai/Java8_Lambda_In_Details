package fr.doan.lambda.sam.instance;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public interface SAMWithDefender
{
	String staticvar = "static var in SAM";
	
	void test();
	
	void whoAmI() default 
	{
		System.out.println("I am "+this);
	}
}
