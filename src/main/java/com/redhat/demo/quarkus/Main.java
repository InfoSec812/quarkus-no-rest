package com.redhat.demo.quarkus;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  public void start(@Observes StartupEvent ev) {
    LOG.error("Made it here");
    System.out.println("Made it here");
  }
}