# VN Proto

This project contains the proto files for the VN Workday project. It currently supports the following languages:

- Java
- Go

## Project structure

```
.
|── ci                                          # Quick start scripts
│   ├── start.sh                                # Script to start the local development environment
│   ├── stop.sh                                 # Script to stop the local development environment
│   ├── doc.sh                                  # Script to generate API documentation
│   ├── docker-compose.yaml                     
├── docs                                        # Documentation directory
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
- [x] Install [Docker Desktop](https://www.docker.com/products/docker-desktop/)
- [x] (For Javers only) Install [Java (v.22) via SDKMAN](https://sdkman.io/) (Temurin variant is recommended)
- [x] (For Javers only) Install [Maven (v.3.8.4+ via SDKMAN)](https://sdkman.io/)
- [x] (For Gophers only) Install [Go (v.1.22.3+)](https://golang.org/doc/install)
- [x] (For Windows users) Install [WSL2](https://docs.microsoft.com/en-us/windows/wsl/install)

## Prepare the project

1. Run `npm run install` to install the dependencies
2. Run `npm run setup` to set up the project for local development
3. Verify that the Docker containers are running by executing the following command:

    ```bash
    docker ps | grep protoc
    ```

    The output should be similar to the following:

    ```plaintext
    CONTAINER ID   IMAGE                 COMMAND       CREATED         STATUS                   PORTS        NAMES
    1b3b4b3b4b3b   markvincze/sabledocs  /bin/sh       2 minutes ago   Up 2 minutes (healthy)                protoc
    ```
4. Make sure you can connect to the Protoc container by executing the following command:

    ```bash
    docker exec protoc protoc --version
    ```

    The output should be similar to the following:

    ```plaintext
    libprotoc 24.0.0
    ```

## Generating Java code

```bash
# Generate Java code from the proto file
npm run gen:java
```
Looking at the `src` directory, you should see the generated Java code.

If you encounter an error while running `npm run gen:java`, please refer to the [FAQs and Troubleshooting](./FAQs.md#ive-failed-to-generate-java-code-from-the-proto-file-what-should-i-do) documentation.

To make your generated Java code available to other projects, you can install it to your local Maven repository by running the following command:

```bash
mvn clean install
```

## Generating Go code

```bash
# Generate Go code from the proto file
npm run gen:go
```

Looking at the `go` directory, you should see the generated Go code.

## Generating API documentation

The Protobuf API documentation is generated using the [`sabledocs`](https://github.com/markvincze/sabledocs?tab=readme-ov-file) plugin. To re-generate the documentation, run the following command:

```bash
npm run gen:doc
```

The generated documentation will be available in the `docs` directory. You can view the documentation by opening the `index.html` file in your browser.