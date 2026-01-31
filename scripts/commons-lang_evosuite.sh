#!/usr/bin/env bash

CLASSPATH="../testobjects/commons-lang/target/classes"

mvn clean package -f ../testobjects/commons-lang/pom.xml -DskipTests -Drat.skip=true -Dmaven.javadoc.skip=true

./evosuite_base.sh "org.apache.commons.lang3.CharUtils" "$CLASSPATH"

./evosuite_base.sh "org.apache.commons.lang3.Range" "$CLASSPATH"

./evosuite_base.sh "org.apache.commons.lang3.RegExUtils" "$CLASSPATH"

