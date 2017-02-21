package com.example.andrew.neighborlabour;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by andrew on 2/21/17.
 */

@ParseClassName("Review")
public class Review extends ParseObject{
    private int rating;
    private String descr;
    private ParseUser reviewer;
    private Listing listing;

}
