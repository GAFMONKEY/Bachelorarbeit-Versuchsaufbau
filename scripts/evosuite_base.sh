#!/usr/bin/env bash

EVOSUITE_JAR="./tools/evosuite-1.2.0.jar"

BASE_DIR="../evosuite"

SEED="55"

TARGET_CLASS="$1"
PROJECT_CLASSPATH="$2"

java -jar "${EVOSUITE_JAR}" \
  -class "${TARGET_CLASS}" \
  -projectCP "${PROJECT_CLASSPATH}" \
  -seed="${SEED}" \
  -base_dir="${BASE_DIR}" \
  -Dreport_dir="$BASE_DIR/reports" \
  -Duse_separate_classloader="false" \
  -junit "4"
