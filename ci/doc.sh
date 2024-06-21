#!/usr/bin/env bash

script_dir=$(dirname "$0")
source "${script_dir}/.protorc.sh"

gen_descriptor() {
    echo "📚 Generating Proto API descriptor..."
    proto_files=$(find ./proto -type f -name "*.proto")
    docker exec "${CONTAINER_ID}" protoc \
        --descriptor_set_out="${project}.pb" \
        --include_source_info \
        --proto_path=./proto \
        $(printf " %s" "$proto_files")
}

gen_doc() {
    echo "📚 Generating Proto API documentation..."
    docker exec "${CONTAINER_ID}" sabledocs
}

get_container_id
gen_descriptor
gen_doc

echo "📚 Proto API documentation generated successfully."
