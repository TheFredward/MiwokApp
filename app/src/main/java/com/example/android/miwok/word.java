package com.example.android.miwok;

import android.widget.TextView;

/**
 * Created by fvent on 17-Jan-18.
 */

public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    //create a static int that will be used to determine if you have an image
    private static final int NO_IMAGE_PROVIDED = -1;
    //
    private int mImageForTranslation=NO_IMAGE_PROVIDED;
    private TextView mCheckLayoutType;
    //Constructor that takes in two string values from array list
    public word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation= miwokTranslation;
    }

    /**
     *
     * @param defaultTranslation Gets the default translation from array list
     * @param miwokTranslation Gets the mowik translation from array
     * @param ImageTranslation Gets the int of the resource id for drawable item
     */

    public word(String defaultTranslation, String miwokTranslation, int ImageTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mImageForTranslation = ImageTranslation;
    }
    //Get the default translation of arrayList
    public String getDefaultTranslation(){return mDefaultTranslation;}
    //Get the miwok translation from arraylist
    public String getMiwokTranslation(){return mMiwokTranslation;}
    public int getImageForTranslation(){return mImageForTranslation;}
    public boolean hasImage(){
        return mImageForTranslation != NO_IMAGE_PROVIDED;
    }


}