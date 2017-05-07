
CLASSPATH = 'src:lib/commons-lang-2.4.jar:lib/commons-compress-1.0.jar:lib/commons-cli-1.2.jar:lib/commons-collections-3.2.1.jar:lib/commons-logging-api-1.0.4.jar:lib/jai_codec.jar:lib/jai_core.jar:lib/jsoup-1.7.1.jar:lib/junrar-0.7.jar:lib/velocity-1.7.jar'

JAVAC = docker run --rm -v ${PWD}:/usr/src/myapp -w /usr/src/myapp openjdk:8-jdk-alpine javac
JAR = docker run --rm -v ${PWD}:/usr/src/myapp -w /usr/src/myapp openjdk:8-jdk-alpine jar

all: javac
jar: AozoraEpub3.jar

javac: FORCE
	mkdir -p class
	${JAVAC} -classpath ${CLASSPATH} src/AozoraEpub3.java src/AozoraEpub3Applet.java -d class

javac-check: FORCE
	mkdir -p class
	${JAVAC} -classpath ${CLASSPATH} -Xlint:unchecked src/AozoraEpub3.java src/AozoraEpub3Applet.java -d class

AozoraEpub3.jar: javac
	${JAR} cfm $@ src/META-INF/MANIFEST.MF -C class . -C src images

clean: FORCE
	rm -rf class

FORCE:
