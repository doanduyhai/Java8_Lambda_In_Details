#!/bin/sh
source ./setJAVA_HOME.sh
JAVA_BIN=$JAVA_HOME/bin

$JAVA_BIN/javac -d ../target -sourcepath ../src/main/java ../src/main/java/fr/doan/lambda/defender_inheritance/ConflictingDefenders.java && $JAVA_BIN/java -cp ../target fr.doan.lambda.defender_inheritance.ConflictingDefenders