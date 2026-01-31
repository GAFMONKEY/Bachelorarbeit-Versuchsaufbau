#!/usr/bin/env bash

RANDOOP_JAR="./tools/randoop-all-4.3.4.jar"

BASE_DIR="../randoop"

SEED="55"

TARGET_CLASSES="$1"
PROJECT_CLASSPATH="$2"
TEST_JAR="$3"

java -javaagent:"./tools/covered-class-4.3.4.jar" \
  -classpath "$RANDOOP_JAR:$PROJECT_CLASSPATH" \
  randoop.main.Main gentests \
  --junit-output-dir="randoop-tests" \
  --randomseed="$SEED"\
  --require-covered-classes="$TARGET_CLASSES" \
  --testjar="$TEST_JAR" \
  --junit-output-dir="$BASE_DIR" \
  --time-limit=600 \
  --usethreads=true \
  --call-timeout-millis=30000