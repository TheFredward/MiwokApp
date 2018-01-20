package com.example.android.miwok;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fvent on 17-Jan-18.
 */

public class WordAdapter extends ArrayAdapter<word> {
    public WordAdapter(Context context, ArrayList<word> words) {
        super(context, 0, words);
    }

    /**
     * @param position    numerical position in the array list
     * @param convertView This parameter will be used to convert to the necessary view
     * @param parent      will look at the parent view
     * @return
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //Find the word based on the current position in array
        word currentWord = getItem(position);
        //Place in the text view for miwok translation
        TextView miwokTV = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTV.setText(currentWord.getMiwokTranslation());
        //put in the Text view for default translation
        TextView defaultTV = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Use getDefaultTranslation from wrd.java to get the correct word
        defaultTV.setText(currentWord.getDefaultTranslation());

        //Set to the proper ImageVIew from list_item.xml
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.pictureImageVIew);
        if (currentWord.hasImage()) {
            //Set the currentimage from the array list into the ImageView
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getImageForTranslation());

        } else {
            imageView.setVisibility(View.GONE);
        }
        //This sets the background color for all of them to green, but need to edit it.
        LinearLayout colorTest = (LinearLayout) listItemView.findViewById(R.id.nestedLinearLayout);
        colorTest.setBackgroundColor(Color.parseColor("#379237"));

        //Return the listView with the entire list made.
        return listItemView;
    }
}
