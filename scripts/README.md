# Scripts

## 1. `release-go.sh`

The script automates the process of releasing the Go module with the following steps:

1. Checks if the git repository is dirty. If it is, it exits.
2. Gets the latest tag from the package.json file.
3. Increments the version using `npm version patch`.
4. Generates Go code using `npm run gen:go`.
5. Stages the files and commits them.
6. Pushes the changes to the remote repository and creates a new tag.

To run the script, you can use the following command:

```shell
sh scripts/release-go.sh
```

## 2. `fix-java.sh`

This script tries to traverse all the Java files in the project and replaces the use of `javax` annotations (that is
already legacy) with `jakarta` ones.