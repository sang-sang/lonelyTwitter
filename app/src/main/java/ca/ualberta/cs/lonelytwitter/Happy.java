package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends Mood {
    Happy(Date d){
        this.d = d;
    }

    public void printMood(){
        System.out.println("I am happy");
    }

}
