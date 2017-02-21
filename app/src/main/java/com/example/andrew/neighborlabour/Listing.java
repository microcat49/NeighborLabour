package com.example.andrew.neighborlabour;

import com.parse.ParseObject;
import com.parse.ParseClassName;
import com.parse.ParseUser;

import java.util.Date;

/**
 * Created by andrew on 2/21/17.
 */

@ParseClassName("Listing")
public class Listing extends ParseObject {
    private String title;
    private String descr;
    private String address;
    private Date date;
    private int duration;
    private ParseUser[] applicants;
    private double compensation;
    private ParseUser worker;

    public Listing(){

    }

    public void AddTitle(){

    }




}
