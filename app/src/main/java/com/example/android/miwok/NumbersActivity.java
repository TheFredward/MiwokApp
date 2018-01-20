package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array list to hold numbers 1-10

        ArrayList<word> words = new ArrayList<>();
        words.add(new word("one","lutti",R.drawable.number_one ));
        words.add(new word("two","otiiko",R.drawable.number_two));
        words.add(new word("three","tolookosu",R.drawable.number_three));
        words.add(new word("four","oyyisa",R.drawable.number_four));
        words.add(new word("five","massokka",R.drawable.number_five));
        words.add(new word("six","temmokka",R.drawable.number_six));
        words.add(new word("seven","kenekaku",R.drawable.number_seven));
        words.add(new word("eight","kawinta",R.drawable.number_eight));
        words.add(new word("nine","wo'e", R.drawable.number_nine));
        words.add(new word("ten","na'aacha",R.drawable.number_ten));

        /**
         * created an array adapter that takes in words arraylist
         * looked for the activity numbers.xml via id
         * set the items adapter array adapter to the numbers.xml
         */
        WordAdapter adapter= new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
