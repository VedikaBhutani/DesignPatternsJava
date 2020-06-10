package FactoryPattern.SubClass;

import FactoryPattern.SuperClass.Computer;

public class Server extends Computer {

  public Server(String ram, String hdd, String cpu) {
    super(ram, hdd, cpu);
  }
  public void handleRequest() {
    System.out.println("This computer is to handle requests");
  }
}

