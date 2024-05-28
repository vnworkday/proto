# gRPC Coding Convention

## References

- [Uber Protobuf Style Guide](https://github.com/uber/prototool/blob/dev/style/README.md)

## Rules

- **Proto3**: Always use Proto3 without any exceptions.
- **Breaking changes**: Avoid breaking changes in the API. Prefer relying on deprecated fields and messages
  instead. In case that breaking changes are required, or just want to clean up a package, make a new version, copy
  your definitions as necessary, and migrate your callers to use the new version. The following are considered breaking
  changes:
    - Deleting or renaming a package.
    - Deleting or renaming an enum, enum value, message, message field, service, or service method.
    - Changing the type of message field.
    - Changing the tag of message field.
    - Changing the label of a message field, i.e. optional, repeated, required.
    - Moving a message field currently in a `oneof` out of the `oneof`.
    - Moving a message field currently not in a `oneof` into the `oneof`.
    - Changing the function signature of a method.
    - Changing the stream value of a method request or response.
- **File types**: Every `.proto` file should go into one of 2 types of files: **service files** or **message files**.
    - **Service files**: Contains exactly one service definition and its corresponding request and response messages. It
      should be named in the format `<domain_name>_service.proto`. E.g. `user_service.proto`.
    - **Message files**: Files that contain everything else. They should be named in the format `<domain_name>.proto`.
      E.g. `user.proto`. It is generally a good idea to have less than 15 messages per file.
- **[Well-Know types](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf)**: Use well-known
  types whenever possible. They are more stable and have better support across languages.
- **Reserved keyword**: Do NOT use the `reserved` keyword. Instead, rely on the `deprecated` option.
- **Enums**: Use enums for fields that have a fixed set of values. This makes the API more self-documenting and easier
  to use.
    - All enum values MUST have the name of the enum as a prefix.
      E.g. `STATUS_UNKNOWN`, `STATUS_ACTIVE`, `STATUS_INACTIVE`.
    - All enum values MUST have a 0 `UNSPECIFIED` value.
    - The invalid value carries no semantic meaning, and if a value can be purposefully unset, there should be
      a `UNSET` value as the 1 value.
    - Nested enums are NOT allowed.
- **Messages**:
    - Use `lower_snake_case`. E.g. `user_id`, `created_at`.
    - Fields of type `google.protobuf.Timestamp` and `google.protobuf.Duration` should be named `time`
      and `duration` or end in `_time` and `_duration` respectively.
    - Nested messages are allowed, but should be avoided if possible.
- **Services**:
    - Always be suffixed with `Service`. E.g. `UserService`.
    - Each service should be in its owned file named after the service. E.g. `user_service.proto` for `UserService`.
    - Streaming RPCs are allowed, but should be avoided if possible (see
      [why?](https://github.com/uber/prototool/blob/dev/style/README.md#streaming-rpcs)).
- **Comments**: Use comments to explain the purpose of the message, field, or enum. Comments should be written in
  complete sentences.
    - At least one complete sentence explaining the purpose of the message, enum, and service are required, except
      for request and response messages in service files.
        - For messages: including assumptions and requirements (e.g., "This message is used to represent a user in the
          system. It is assumed that all users have an email address.").
        - For field: not required but recommended. Including assumptions, requirements, and what happens if the field
          is not set. Does it have a default value or throw an error?
        - For service: explain of what the service is intended to do/not do. Including advantages or use cases as well
          as related services (mark with `@see` annotation).
        - For RPCs: explain what the RPC is intended to do/not do. Including:
            - Advantages or use cases (e.g."Useful when you want to send large volumes and don't care about latency.").
            - Side effects (e.g."If a feature with this ID already exists, this method will overwrite it.").
            - Performance considerations (e.g."Sending your data in chunks of X size is more efficient.").
            - Pre-requisites (e.g. "You must complete registration using the X method before calling this one.").
            - Post-requisites (e.g. "Clean up the registered resource after use to free up resources.").
    - Use `//` and not `/* */`.
    - Never be inline, always be above the element.
    - Aim for a 120 character maximum length.