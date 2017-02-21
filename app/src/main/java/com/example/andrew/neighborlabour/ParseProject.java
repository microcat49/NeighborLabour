package com.example.andrew.neighborlabour;

/**
 * Created by andrew on 2/17/17.
 */

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseProject extends Application{
    public void onCreate(){
        super.onCreate();

        ParseObject.registerSubclass(Listing.class);
        ParseObject.registerSubclass(Review.class);
        Parse.enableLocalDatastore(this);



        Parse.initialize(new Parse.Configuration.Builder(this).applicationId("nl").
        server("http://159.203.73.182:1337/parse").build());



    }
}
