MY CHANGES
# GitHub Actions Sandbox

![Continuous Integration](https://github.com/CyberScout/github-actions-sandbox/workflows/CI%20Build/badge.svg)
![Continuous Delivery](https://github.com/CyberScout/github-actions-sandbox/workflows/CD%20Publish%20Release/badge.svg)

Wow, sweet. :confetti_ball: :tada:

## CI/CD Process

### On push to any branch (unless it's a tag)...

1. :white_check_mark: Run 'gradle build'

### On a push to a tag of the form 'vX.Y.Z'...

1. Perform a publish:
    1. :white_check_mark: Build and check
    2. :white_check_mark: Create Bintray release
    3. :white_check_mark: Upload the artifact to Bintray
    4. :white_check_mark: Upload the artifacts to GitHub Packages
2. :white_check_mark: Create a GitHub release
3. :no_entry_sign: ~~Attach the library (.jar file) to the release~~ Not needed,
   since the artifacts are in both GitHub Packages and JCenter
