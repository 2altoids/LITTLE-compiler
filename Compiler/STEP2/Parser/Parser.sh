#!/bin/bash
java org.antlr.v4.Tool MicroGrammar.g4
mkdir classes
javac -d classes/ MicroGrammar*.java
javac -d classes/ Main.java
javac -d classes/ CustomToken.java
javac -d classes/ MicroParser.java