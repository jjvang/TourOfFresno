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
public class FunFragment extends Fragment {


    public FunFragment() {
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

        words.add(new Word(R.string.woodward, R.string.woodward_note, R.string.woodward_address));
        words.add(new Word(R.string.fashion, R.string.fashion_note, R.string.fashion_address));
        words.add(new Word(R.string.Sierra, R.string.Sierra_note, R.string.Sierra_address));
        words.add(new Word(R.string.River, R.string.River_note, R.string.River_address));
        words.add(new Word(R.string.Maya, R.string.Maya_note, R.string.Maya_address));
        words.add(new Word(R.string.fresno_state, R.string.fresno_state_note, R.string.fresno_state_address));
        words.add(new Word(R.string.Blackbeards, R.string.Blackbeards_note, R.string.Blackbeards_address));
        words.add(new Word(R.string.boomers, R.string.boomers_note, R.string.boomers_address));
        words.add(new Word(R.string.dave, R.string.dave_note, R.string.dave_address));
        words.add(new Word(R.string.Save, R.string.Save_note, R.string.Save_address));
        words.add(new Word(R.string.Saroyan, R.string.Saroyan_note, R.string.Saroyan_address));
        words.add(new Word(R.string.Tower, R.string.Tower_note, R.string.Tower_address));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_fun);

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
