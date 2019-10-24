# GitHub Actions Sandbox

![](https://github.com/CyberScout/github-actions-sandbox/workflows/CI%20Build/badge.svg)

Wow, sweet. :confetti_ball: :tada:

## CI/CD Process

### On any push to any branch...

1. Run 'gradle build'
2. Attach the artifact to the workflow
3. Upload the artifact to Bintray

### On a push to a tag of the form 'vX.Y.Z'...

1. Download the artifact
2. Create a GitHub release
3. Attach the library (.jar file) to the release
