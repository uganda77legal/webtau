# Base URL

Robust tests don't specify the full URL of an application under test.
Instead you only pass a relative URL to functions like `open`.

:include-groovy: examples/Basic.groovy

Define base URL portion either inside a `webtau.cfg` file

:include-file: examples/webtau.cfg {lang: "groovy"}

or pass as a command line argument `--url=http://...`

# Timeouts

Default timeout in milliseconds for `waitTo` and `waitToNot`

`````columns
left:
```
waitTimeout = 25000
```
right:
```
--waitTimeout=25000
```
`````

# Window Size

Browser window size can be set using `windowWidth` and `windowHeight`

:include-file: examples/windowSize.cfg {lang: "groovy"}

# Documentation Artifacts

By default all generated documentation artifacts (e.g. screenshots) are created in the current directory.
To override

:include-file: examples/docArtifacts.cfg {lang: "groovy"}