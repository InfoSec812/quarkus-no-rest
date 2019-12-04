package com.redhat.demo.quarkus;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Main {

  @PostConstruct
  public void start() {
    System.out.println("Made it here");
  }
}