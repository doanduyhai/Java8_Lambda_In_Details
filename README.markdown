Java 8 lambda In Details Demo
================

Presentation
------------------

 This is a demo project for new Java 8 Lambda features.
 
 This demo is a support for the Lambda In Details serie of articles on my blog : http://doanduyhai.wordpress.com
 
 !!! DISCLAIMER: all the test code in this project was written related to the JDK 8 demo version as of July 10th 2012. Since the JDK is still in beta, some assertions may not hold in future
 
 
 JDK 8 Installation
------------

- Download demo of [JDK 8](http://jdk8.java.net/lambda/)
- Install it somewhere on your disk

 Usage
------------

- Go into run/ and edit setJAVA_HOME.bat (or setJAVA_HOME.sh) and set it to the folder where you install the JDK 8
- Execute each of the script file depending on the scenario your want to test

 Below is the demo scenarios and their corresponding executable:
 
 [Closure and Mutability](http://doanduyhai.wordpress.com/2012/07/11/java-8-lambda-in-details-part-i-closure-and-mutability/): VariableCaptureInClosure & NonFinalVariableCaptureInClosure
 
 [Scoping of "this" and "effectively final" variable semantic](http://doanduyhai.wordpress.com/2012/07/12/java-8-lambda-in-details-part-ii-scoping-of-this-and-effectively-final-variable-semantic/): ScopingOfThis & LocalEffectivelyFinalVariable
 
 [Method and constructor referencing](http://doanduyhai.wordpress.com/2012/07/14/java-8-lambda-in-details-part-iii-method-and-constructor-referencing/): MethodReference & ConstructorReference
 
 [Multiple inheritance resolution for defender methods](http://doanduyhai.wordpress.com/2012/07/15/java-8-lambda-in-details-part-iv-multiple-inheritance-resolution-for-defender-methods/): SameSuperDefenderMethod, MostSpecificDefender, ConflictingDefenders, PriorityToHierarchy, RemovedDefender, ResolvedDefenderConflictsAtInterface & ResolvedDefenderConflictsAtClass
 