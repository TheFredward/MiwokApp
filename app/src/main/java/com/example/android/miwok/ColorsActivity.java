package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array list to hold the default and miwok translations
        ArrayList<word> colorWords = new ArrayList<>();
        colorWords.add(new word("red","weṭeṭṭi",R.drawable.color_red));
        colorWords.add(new word("green","chokokki",R.drawable.color_green));
        colorWords.add(new word("brown","takaakki",R.drawable.color_brown));
        colorWords.add(new word("gray","ṭopoppi",R.drawable.color_gray));
        colorWords.add(new word("black","kululli",R.drawable.color_black));
        colorWords.add(new word("white","kelelli",R.drawable.color_white));
        colorWords.add(new word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        colorWords.add(new word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));
        //Use our defined word adapter to take in the array list
        WordAdapter colorAdapter = new WordAdapter(this, colorWords);
        //placeholder for the list xml
        ListView setColor = (ListView) findViewById(R.id.list);
        setColor.setAdapter(colorAdapter);
    }
}
