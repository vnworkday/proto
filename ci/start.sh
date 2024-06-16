#!/usr/bin/env bash

script_dir=$(dirname "$0")
source "${script_dir}/.protorc.sh"

build_container() {
    echo "🐳 Building Protoc container..."
    docker compose --file ./ci/docker-compose.yaml --project-name "${project}" build
    echo "🐳 Protoc container built successfully."
}

start_container() {
    echo "🐳 Starting Protoc container..."
    docker compose --file ./ci/docker-compose.yaml --project-name "${project}" up --detach --quiet-pull
    echo "🐳 Protoc container started successfully."
}

build_container
start_container
