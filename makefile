JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
        $(JC) $(JFLAGS) $*.java

CLASSES = \
        src\
	prime_number.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
        $(RM) *.class
