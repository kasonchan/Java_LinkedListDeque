DequeDemo:
	javac -Xlint DequeDemo.java

clean:
	rm -f Deque\*.class
	rm -f *.class

run:
	java DequeDemo