#!/bin/zsh

# fast fail in case of errors
set -e

# Read release type (minor,patch,match) from arguments, if not provided, default to patch
release_type=${1:-patch}

# Get current branch
current_branch=$(git rev-parse --abbrev-ref HEAD)
echo "🌿 Current branch: $current_branch"
if [[ $current_branch != "main" ]]; then
  echo "⚠️ You must be on the main branch to release."
  exit 1
fi

# Check if git is dirty or not. If dirty, then exit.
if [[ -n $(git status -s) ]]; then
  echo "⚠️ Git is dirty. Please commit your changes before releasing."
  exit 1
fi

echo "=============================="

# Get the latest tag
latest_git_tag=$(git describe --tags --abbrev=0)
pkg_version="v$(node -p "require('./package.json').version")"
if [[ $latest_git_tag != $pkg_version ]]; then
  echo "⚠️ Latest tag is not the same as the package version. Please check the package version."
  exit 1
fi

# Generate code using `npm run gen:go`
echo -e "\n🚀 Generating Go code..."
npm run gen:go

# Increment the version
new_tag="$(npm version $release_type --no-commit-hooks --no-git-tag-version)"
echo "🔖 Latest tag: $latest_git_tag"
echo "🏷️ New tag: $new_tag"

# Stage files and commit
echo "📦 Staging files and committing..."
git add .
git commit -m "chore: prepare to release Go proto module: $new_tag"
git push origin main

# Push the changes to the remote repository and create a new tag
echo -e "\n🚛 Pushing changes to the remote repository...\n"
git tag -a $new_tag -m "Release $new_tag"
git push origin $new_tag

# Done
echo -e "\n🎉 Done! Released $new_tag"
