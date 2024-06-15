# FAQs and Troubleshooting

## I've failed to generate Java code from the proto file. What should I do?

1. Make sure that you have already run `npm install` before running `npm run gen:java`.
2. (MacOS only) If your terminal complains about `sed` throws `bad flag in substitute command: 'o'`, you should install `gsed` using `brew install gsed` and run `npm run gen:java` again.

    ```bash
    # Install gsed
    brew install gsed

    # Add alias to zshrc to use gsed instead of sed
    echo "alias sed=gsed" >> ~/.zshrc

    # Reload zshrc to apply the changes
    source ~/.zshrc

    # Run the generation command again
    npm run gen:java
    ```