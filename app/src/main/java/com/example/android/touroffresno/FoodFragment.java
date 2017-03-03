package com.example.android.touroffresno;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflates the view which would be created within the main activity
        // Does not overRide like an activity class, needs to inflate
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        // The words are being inputted from the custom word class
        // It is originally inputted as the following:
        // Since our input variable are not words, we can reference them back to the variable words
        // Note this is being done since a string variable cannot take two inputs of words

        words.add(new Word(R.string.dog, R.string.dog_note, R.string.dog_address, R.drawable.doghouse));
        words.add(new Word(R.string.don, R.string.don_note, R.string.don_address, R.drawable.donpepe));
        words.add(new Word(R.string.thai, R.string.thai_note, R.string.thai_address, R.drawable.thaicountry));
        words.add(new Word(R.string.pho, R.string.pho_note, R.string.pho_address, R.drawable.pho));
        words.add(new Word(R.string.bakery, R.string.bakery_note, R.string.bakery_address, R.drawable.porkbun));
        words.add(new Word(R.string.premo, R.string.premo_note, R.string.premo_address, R.drawable.pizza));
        words.add(new Word(R.string.queen, R.string.queen_note, R.string.queen_address, R.drawable.viet));
        words.add(new Word(R.string.teriyaki, R.string.teriyaki_note, R.string.teriyaki_address, R.drawable.teriyaki));
        words.add(new Word(R.string.club, R.string.club_note, R.string.club_address, R.drawable.papaya));
        words.add(new Word(R.string.tako, R.string.tako_note, R.string.tako_address, R.drawable.tako));
        words.add(new Word(R.string.rock, R.string.rock_note, R.string.rock_address, R.drawable.rock));
        words.add(new Word(R.string.shila, R.string.shila_note, R.string.shila_address, R.drawable.shila));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_food);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);


        return rootView;
    }

}
