package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Create an array list for family and add the default and the miwok translation
        //Use the made class type known as word to take in two string inputs
        ArrayList<word> familyWords = new ArrayList<>();
        familyWords.add(new word("father","әpә",R.drawable.family_father));
        familyWords.add(new word("mother","әṭa",R.drawable.family_mother));
        familyWords.add(new word("son","angsi",R.drawable.family_son));
        familyWords.add(new word("daughter","tune",R.drawable.family_daughter));
        familyWords.add(new word("older brother","taachi",R.drawable.family_older_brother));
        familyWords.add(new word("younger brother","chalitti",R.drawable.family_younger_brother));
        familyWords.add(new word("older sister","teṭe",R.drawable.family_older_sister));
        familyWords.add(new word("younger sister","kolliti",R.drawable.family_younger_sister));
        familyWords.add(new word("grandmother","ama",R.drawable.family_grandmother));
        familyWords.add(new word("grandfather","paapa",R.drawable.family_grandfather));
        //Use custom word adapter to handle the family words array list
        //This will take in the context, and the array list as parameters
        WordAdapter family = new WordAdapter(this,familyWords);
        //Create the list view for the familyview
        //Set the familyview to the correct xml via id
        ListView familyView = (ListView)findViewById(R.id.list);
        //Set the family view with setadapter and the newly constructed word adapter
        familyView.setAdapter(family);

    }
}
