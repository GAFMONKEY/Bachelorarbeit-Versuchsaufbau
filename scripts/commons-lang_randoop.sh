#!/usr/bin/env bash

PROJECT_PATH="../testobjects/commons-lang"
TARGET="$PROJECT_PATH/target"

mvn clean package -f "$PROJECT_PATH/pom.xml" -DskipTests -Drat.skip=true -Dmaven.javadoc.skip=true

./randoop_base.sh "./commons-lang_classes-to-test.txt" "$TARGET/classes" "$TARGET/commons-lang3-3.20.1-SNAPSHOT.jar"