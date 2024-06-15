#!/usr/bin/env bash

set -euo pipefail

search_dir="src/main/java"

# Traverse through all generated Java files in the src/main/java directory and replace `@javax` with `@jakarta`.
# This is necessary because Jakarta EE 9 has replaced the `javax` package with `jakarta`.
function fix_java() {
  local dir="$1"
  for entry in "$dir"/*
  do
    if [[ -d "$entry" ]]; then
      dir="$entry"
      fix_java "$dir"
    else
      if [[ $entry == *.java ]]; then
        gsed -i 's|javax|jakarta|g' "$entry"
      fi
    fi
  done
}

fix_java "$search_dir"

echo "🎉 Java files generated successfully."