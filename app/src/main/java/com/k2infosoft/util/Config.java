package com.k2infosoft.util;

import android.graphics.Bitmap;

/**
 * Created by admin 54 on 5/6/2017.
 */

public class Config {

    public static String[] firstName;
    public static String[] lastName;
    public static String[] email;
    public static String[] address;
    public static String[] profilepic;
    public static String[] bio;
    public static Bitmap[] bitmaps;

    public static final String GET_URL = "http://coolacharya.com/";
    public static final String TAG_FIRSTNAME = "firstName";
    public static final String TAG_LASTNAME = "lastName";
    public static final String TAG_EMAIL = "email";
    public static final String TAG_ADDRESS = "address";
    public static final String TAG_PROFILEPIC = "profilepic";
    public static final String TAG_BIO = "bio";
    public static final String TAG_JSON_ARRAY = "result";

    public Config(int i) {
        firstName = new String[i];
        lastName = new String[i];
        email = new String[i];
        address = new String[i];
        profilepic = new String[i];
        bio = new String[i];
        bitmaps = new Bitmap[i];
    }

}
