#!/usr/bin/env bash

set -euo pipefail

project="${PROJECT_NAME:-vnworkday}"

get_container_id() {
    echo "🐳 Getting Protoc container ID..."
    CONTAINER_ID=$(docker ps --filter "label=com.vnworkday.docker.name=protoc" -q)
    if [ -z "$CONTAINER_ID" ]; then
        echo "⚠️ Protoc container not found. Please run the Protoc container first."
        exit 1
    fi
    echo "🐳 Protoc container ID: $CONTAINER_ID"
    export CONTAINER_ID
}

error_report() {
    echo "❌ Error on line $(caller)" >&2
}

trap error_report ERR
