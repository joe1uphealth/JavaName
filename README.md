java -version

```
openjdk version "21.0.2" 2024-01-16
OpenJDK Runtime Environment Homebrew (build 21.0.2)
OpenJDK 64-Bit Server VM Homebrew (build 21.0.2, mixed mode, sharing)
```

to install java:
brew install java

follow the step at the bottom of that readme

to build: 

`./gradlew build`

to run:
`java -jar build/libs/demo-0.0.1-SNAPSHOT.jar`

`curl --location 'localhost:8080/getJoes'`

```curl --location 'localhost:8080/capitalize' \
--header 'Content-Type: application/json' \
--data '{
    "firstName": "Joe",
    "lastName": "McCaffrey"
}'```
