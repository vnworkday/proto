#!/bin/zsh

# Traverse through all generated Java files in the src/main/java directory and replace `@javax` with `@jakarta`.
# This is necessary because Jakarta EE 9 has replaced the `javax` package with `jakarta`.
for file in src/main/java/**/*.java; do
    # Replace `@javax` with `@jakarta`
    sed -i '' 's/@javax/@jakarta/g' $file
done