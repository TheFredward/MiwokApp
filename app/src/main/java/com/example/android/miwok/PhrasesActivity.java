package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Create an array adapter for the phrases
        //In default and miwok translations
        //Use word as the input type that was defined in word.java
        ArrayList<word> phrases = new ArrayList<>();
        phrases.add(new word("Where are you going?","minto wuksus"));
        phrases.add(new word("What is your name?","tinnә oyaase'nә"));
        phrases.add(new word("My name is...","oyaaset..."));
        phrases.add(new word("How are you feeling?","michәksәs?"));
        phrases.add(new word("I'm feeling good.","kuchi achit"));
        phrases.add(new word("Are you coming?","әәnәs'aa?"));
        phrases.add(new word("Yes, I'm coming.","hәә’ әәnәm"));
        phrases.add(new word("I'm coming.","әәnәm"));
        phrases.add(new word("Let's go.","yoowutis"));
        phrases.add(new word("Come here.","әnni'nem"));
      /*
      * Use custom made adapter (WordAdapter) to take in the array list
      * Param are this and array list name
      * */
      WordAdapter phrasesList = new WordAdapter(this,phrases);
      /*
       *
       *  find the xml via id
       *  Save to a new variable.
       */
        ListView phrasesListView = (ListView)findViewById(R.id.list);
        //Set the phraseslist adapter to the newly made phrase view
        phrasesListView.setAdapter(phrasesList);

    }
}
