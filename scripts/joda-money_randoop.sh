#!/usr/bin/env bash

PROJECT_PATH="../testobjects/joda-money"
TARGET="$PROJECT_PATH/target"

mvn clean package -f "$PROJECT_PATH/pom.xml" -DskipTests

./randoop_base.sh "./joda-money_classes-to-test.txt" "$TARGET/classes" "$TARGET/joda-money-1.0.8-SNAPSHOT.jar"