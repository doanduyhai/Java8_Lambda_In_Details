@echo off
call setJAVA_HOME.bat
set JAVA_BIN=%JAVA_HOME%/bin
cls

%JAVA_BIN%/javac -d ../target -sourcepath ../src/main/java ../src/main/java/fr/doan/lambda/references/ConstructorReference.java && %JAVA_BIN%/java -cp ../target fr.doan.lambda.references.ConstructorReference

@echo on