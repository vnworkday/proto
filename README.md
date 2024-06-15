# VN Proto

This project contains the proto files for the VN Workday project. It currently supports the following languages:

- Java
- Go

## Project structure

```
.
├── proto                                       # Proto files directory
│   └── <service_name>
│       └── <domain_name>
│           └── <version>
│               └── <domain>.proto
│               └── <domain>_service.proto
├── go                                          # Go generated code directory
│   ├── <service_name>                         
│   │   └── <domain_name>
│   │       └── <version>
│   │           └── <domain>.pb.go
│   │           └── <domain>_service.pb.go
│   │           └── ...
├── src                                        # Java generated code directory
│   └── main/java/com/github/vnworkday/proto
│       └── <service_name>
│           └── <domain_name>
│               └── <version>
│                   └── <domain>.java
│                   └── ...
├── scripts                                    # Utility scripts
├── README.md                                  # Project README. You are here.
├── FAQs.md                                    # FAQs and Troubleshooting
├── package.json
├── pom.xml                                    # Maven configuration file
└── ...
```

## Prerequisites installation

- [x] Install [Node.js (v.20.13.1+)](https://nodejs.org/en/download/)

## Prepare the project

1. Run `npm run install` to install the dependencies
2. Run `npm run prepare` to set up the project

## Generating Java code

```bash
# Generate Java code from the proto file
npm run gen:java

# Compile & package the Java code for local use
mvn clean install
```
Looking at the `src` directory, you should see the generated Java code.

If you encounter an error while running `npm run gen:java`, please refer to the [FAQs and Troubleshooting](./FAQs.md#ive-failed-to-generate-java-code-from-the-proto-file-what-should-i-do) documentation.

## Generating Go code

```bash
# Generate Go code from the proto file
npm run gen:go
```

Looking at the `go` directory, you should see the generated Go code.