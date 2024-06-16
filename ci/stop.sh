#!/usr/bin/env bash

script_dir=$(dirname "$0")
source "${script_dir}/.protorc.sh"

stop_container() {
    echo "🐳 Stopping Protoc container..."
    docker compose --file ./ci/docker-compose.yaml --project-name "${project}" down
    echo "🐳 Protoc container stopped successfully."
}

stop_container
