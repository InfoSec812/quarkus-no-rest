# Quarkus Problem Example

Problem: Cannot bootstrap Quarkus application without REST endpoints

There is a single `@ApplicationScoped` class with a `@PostConstruct` annotated
method. The expectation I have is that the application would run that method
on startup. It apparently does not.
