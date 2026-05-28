# java-maven-ci-demo

Lightweight Spring Boot Maven project for **CI/CD operational analysis** and **predictive build-failure demonstrations**.

## Design goals
- Minimal application logic
- Realistic Maven dependency and cache activity
- Stable, repeatable GitHub Actions builds
- Suitable for future **self-hosted GitHub Actions runners**

## Stack
- Java 17
- Maven
- Spring Boot 3

## Build
```bash
mvn clean install
```

## Run
```bash
mvn spring-boot:run
```

Then open `http://localhost:8080/`.

## CI workflow
The workflow at `.github/workflows/maven-ci.yml` includes:
- checkout
- Java 17 setup
- Maven cache restore
- `mvn clean install`

It uses `runs-on: self-hosted` so it is ready for a future self-hosted runner.
