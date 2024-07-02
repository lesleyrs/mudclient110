all:
	javac *.java && java mudclient

decomp:
	jar xf mudclient110.jar && jad -r -sjava -nonlb '**/*.class'
