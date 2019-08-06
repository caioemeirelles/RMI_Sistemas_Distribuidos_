package com.company;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Greeting extends Remote {
    public String greet(String name) throws RemoteException;
}
