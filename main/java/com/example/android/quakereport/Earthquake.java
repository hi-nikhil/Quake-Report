package com.example.android.quakereport;

public class Earthquake {

    //magnitude of the earthquake
     private  double mMagnitude;

     //location of the earthquake
    private  String mLocation;

    //date of the earthquake
    private String mDate;

    //time of earthquake
    private long mTimeInMilliseconds;

    private String mUrl;

    //Earthquake object which takes three inputs
    //magnitude,location,timeInMilliSeconds

    public Earthquake(double magnitude,String location,long timeInMilliseconds,String url){
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds=timeInMilliseconds;
        mUrl=url;
    }

    //methods to return magnitude of the earthquake

    public double getMagnitude(){ return mMagnitude;}

    //methods to return location of the earthquake

    public String getLocation(){ return mLocation;}

    //methods to return date of the earthquake

    public long getTimeInMilliseconds(){ return mTimeInMilliseconds;}

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}
