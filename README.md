RUN.  SAVE YOURSELF.

Things that are here:

`./gradlew bootRun` to run the server, then go to localhost:8080

To edit your "webapp" and have it automatically get deployed,

From `webapp` do `node_modules/.bin/webpack --watch`

Then `./gradlew watchBundle -t`

Then any changes you make that result in the bundle being rebuilt should appear on page refresh