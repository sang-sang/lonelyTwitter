package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends Mood {
    Sad(Date d){
        this.d = d;
    }

    public void printMood(){
        System.out.println("I am sad");
    }
}
