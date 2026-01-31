#!/usr/bin/env bash

CLASSPATH="../testobjects/joda-money/target/classes"

JAVA_HOME="$(/usr/libexec/java_home -v 1.8)" PATH="$JAVA_HOME/bin:$PATH" mvn clean package -DskipTests \
 -f ../testobjects/joda-money/pom.xml

JAVA_HOME="$(/usr/libexec/java_home -v 1.8)" PATH="$JAVA_HOME/bin:$PATH" ./evosuite_base.sh "org.joda.money.CurrencyUnit" "$CLASSPATH"

JAVA_HOME="$(/usr/libexec/java_home -v 1.8)" PATH="$JAVA_HOME/bin:$PATH" ./evosuite_base.sh "org.joda.money.Money" "$CLASSPATH"

# Execute tests with