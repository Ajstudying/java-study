package ch08;

import ch08.InterfaceBundle.Playable;

public class Dog implements Playable {
    public void play() {
        System.out.println("The dog is playing with the ball");
    }
}
