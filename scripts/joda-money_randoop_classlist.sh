#!/usr/bin/env bash

PROJECT_PATH="../testobjects/joda-money"
TARGET="$PROJECT_PATH/target"

mvn clean package -f "$PROJECT_PATH/pom.xml" -DskipTests

./randoop_temp.sh "./joda-money_classes-to-test.txt" "$TARGET/classes"