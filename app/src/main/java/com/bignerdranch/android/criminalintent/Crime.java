package com.bignerdranch.android.criminalintent;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


/**
 * Created by lenovo on 2015/9/17.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private String mDate;
    private Date mDate2;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        DateFormat df = new SimpleDateFormat("EEEE, MMM dd, yyyy");
        mDate = df.format(new Date());
        mDate2 = new Date();

    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public Date getDate2() {
        return mDate2;
    }

    public void setDate2(Date date2) {
        mDate2 = date2;
    }


    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
