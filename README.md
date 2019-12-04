# Quarkus Bootstrapping Non-web services

Problem: I wanted to write a Quarkus application without any REST endpoints, so I wanted an `@ApplicationScoped`
class to be eagerly instantiated and kick-off the work of my application (Messaging based).

I tried to use `@Startup` and `@PostConstruct`, but that did not work because the `@ApplicationScoped` class
is not eagerly instantiated.

After discussions with someone from the Quarkus dev team, this solution worked for me:

```java
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class Main {

  public void start(@Observes StartupEvent ev) {
    // Start your application implementation code
  }
}
```