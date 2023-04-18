package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        DVD aGoofyMovie = new DVD("Goofy Movie", "Video Disc", "Familiy Movie", 4.7);
        CD discoDisc = new CD("Stayin Alive", "Music CD", "Disco", 700);
        // TODO: Call each CD and DVD method to verify that they work as expected.

        aGoofyMovie.spinDisc();
        discoDisc.spinDisc();

    }
}
