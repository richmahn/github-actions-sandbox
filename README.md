# GitHub Actions Sandbox

![](https://github.com/CyberScout/github-actions-sandbox/workflows/CI%20Build/badge.svg)

Wow, sweet. :confetti_ball: :tada:

## CI/CD Process

### On any push to any branch...

1. Run 'gradle build' :white_check_mark:
2. Attach the artifact to the workflow :white_check_mark:
3. Upload the artifact to Bintray :question:

### On a push to a tag of the form 'vX.Y.Z'...

1. Download the artifact :white_check_mark:
2. Create a GitHub release :white_check_mark:
3. Attach the library (.jar file) to the release :white_check_mark:
