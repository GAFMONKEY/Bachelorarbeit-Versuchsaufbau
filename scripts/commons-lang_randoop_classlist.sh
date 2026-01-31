#!/usr/bin/env bash

PROJECT_PATH="../testobjects/commons-lang"
TARGET="$PROJECT_PATH/target"

mvn clean package -f "$PROJECT_PATH/pom.xml" -DskipTests -Drat.skip=true

./randoop_temp.sh "./commons-lang_classes-to-test.txt" "$TARGET/classes"