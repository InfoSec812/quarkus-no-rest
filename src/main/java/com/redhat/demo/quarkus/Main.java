package com.redhat.demo.quarkus;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  @PostConstruct
  public void start() {
    LOG.error("Made it here");
    System.out.println("Made it here");
  }
}