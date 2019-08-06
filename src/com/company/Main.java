package com.company;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main(String[] args) throws Exception {
        if ( args.length == 0 ) {
            System.err.println("usage: java Main port#");
            System.exit(1);
        }

        int index = 0;
        int port = Integer.parseInt(args[index++]);
        String name = "Greeting";
        Greeting greeting = new GreetingObject();
        Greeting stub = (Greeting)UnicastRemoteObject.exportObject(greeting, 0);
        Registry registry = LocateRegistry.getRegistry(port);
        registry.rebind(name, stub);
        System.out.println("Greeting bound to \"" + name + "\"");
    }
}
