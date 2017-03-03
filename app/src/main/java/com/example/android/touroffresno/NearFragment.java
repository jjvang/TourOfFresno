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
public class NearFragment extends Fragment {


    public NearFragment() {
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
// It is orginally inputted as the following:
// Since our input variable are not words, we can reference them back to the variable words
// Note this is being done since a string variable cannot take two inputs of words

        words.add(new Word(R.string.lost, R.string.lost_note, R.string.lost_address));
        words.add(new Word(R.string.Millerton, R.string.Millerton_note, R.string.Millerton_address));
        words.add(new Word(R.string.sky, R.string.sky_note, R.string.sky_address));
        words.add(new Word(R.string.Shaver, R.string.Shaver_note, R.string.Shaver_address));
        words.add(new Word(R.string.Yosemite, R.string.Yosemite_note, R.string.Yosemite_address));
        words.add(new Word(R.string.Sequoia, R.string.Sequoia_note, R.string.Sequoia_address));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_near);

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

    ;

}
