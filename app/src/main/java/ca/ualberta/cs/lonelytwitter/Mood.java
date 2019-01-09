package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    protected Date d;

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }
}
