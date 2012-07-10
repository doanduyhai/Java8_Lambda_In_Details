package fr.doan.lambda.sam.references;

import java.util.List;

public interface ConstructorReferenceSAMWithParameterizedArg<T, U>
{
	T magic(List<U> arg);
}
