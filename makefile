
all: interpreter test1 test2 test3 test4 test5 test6

interpreter:
	java -cp ./antlr-3.5.2-complete-no-st3.jar org.antlr.Tool myCompiler.g

test1: test1.c
	javac -cp ./antlr-3.5.2-complete-no-st3.jar:. *.java 
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test1.c > test1.ll

test2: test2.c
	javac -cp ./antlr-3.5.2-complete-no-st3.jar:. *.java 
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test2.c > test2.ll

test3: test3.c
	javac -cp ./antlr-3.5.2-complete-no-st3.jar:. *.java 
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test3.c > test3.ll

test4: test4.c
	javac -cp ./antlr-3.5.2-complete-no-st3.jar:. *.java 
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test4.c > test4.ll

test5: test5.c
	javac -cp ./antlr-3.5.2-complete-no-st3.jar:. *.java 
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test5.c > test5.ll

test6: test6.c
	javac -cp ./antlr-3.5.2-complete-no-st3.jar:. *.java 
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test6.c > test6.ll

clean:
	rm -f *.out* *.tokens *.class myCompilerLexer.java myCompilerParser.java
