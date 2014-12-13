package com.example.hnagamin.zenkyu;

import java.util.Date;

/**
 * Created by andrias on 14/12/13.
 */
public class Lecture {
    Date date;
    LectureUnit lectureUnit;
    Presence presence;

    public Lecture (Date d, LectureUnit lu, Presence p) {
        date = d;
        lectureUnit = lu;
        presence = p;
    }

}