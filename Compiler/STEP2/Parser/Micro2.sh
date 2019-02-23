#! /bin/bash
SCRIPTDIR=`cd "$(dirname "$0")" && pwd`
java org.antlr.v4.Tool "$SCRIPTDIR/MicroGrammar.g4"
javac MicroGrammar*.java
javac Main.java
javac CustomToken.java
args=("$@")
java Main $@