#!/usr/bin/env bash

set -euo pipefail

# Find all workflow files in the .github/workflows directory and subdirectories that are added, copied, or modified in the staging area.
workflows=$(git diff --cached --name-only --diff-filter=ACM | grep -E "^\.github/workflows/.*\.yml$")

if [[ -z $workflows ]]; then
    echo "✅ No changes in the workflows. Exiting..."
    exit 0
fi

for workflow in $workflows; do
    if $(npm exec action-validator $workflow); then
        echo "✅ $workflow is good to go!"
    else
        echo "❌ $workflow is invalid. Please fix the errors and try again."
        exit 1
    fi
done

echo "👍 All workflows are good to go!"