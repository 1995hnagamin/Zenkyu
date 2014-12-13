package com.example.hnagamin.zenkyu;

/**
 * Created by andrias on 14/12/13.
 */
public class LectureUnit {
    DOW day;
    int period;
    String name;

    public LectureUnit(DOW d, int p, String n) {
        day = d;
        period = p;
        name = n;
    }

    public DOW getDay() {
        return day;
    }

    public int getPeriod() {
        return period;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getDay().toString() + " " + Integer.toString(getPeriod()) + ": " + getName();
    }
}