package ch08;

import ch08.InterfaceBundle.Runnable;
import ch08.InterfaceBundle.Walkable;

public class Human implements Walkable, Runnable {
    public void walk() {
        System.out.println("Human is walking");
    }
    public void run() {
        System.out.println("Human is running");
    }
}
