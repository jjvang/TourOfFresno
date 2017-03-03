package com.example.android.touroffresno;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Justin on 11/15/2016.
 */
// This view is needed because it needs to override the ArrayAdapter method so it can take in inputs that
// not a TextView but a list or array of custom ojbects
// Since this method will work along with the ArrayAdapter, it will "Extend" it which is implemented in the class
public class WordAdapter extends ArrayAdapter<Word> {

    // Resource ID for background color for this list of words
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        // Pass a zero for the resource Id because we are inflating the view ourselves with the getView Method
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        // This method call is used to recycle the view when ever it is not being used
        // The list item view is commonly null, so the statement is used to help prevent any erros
        View listItemView = convertView;
        // Used to inflate the listItem if there was nothing there
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView topTextView = (TextView) listItemView.findViewById(R.id.top_text);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        topTextView.setText(currentWord.getTopWord());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView bottomTextView = (TextView) listItemView.findViewById(R.id.bottom_text);

        // Makes it so that the list is set correctly depending on the Array of custom objects Word
        bottomTextView.setText(currentWord.getBottomWord());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        // Sets address to the list view
        addressTextView.setText(currentWord.getAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            // Sets the ImageView to the image resource specified in the current Word
            imageView.setImageResource(currentWord.getImageResourceId());

            // Make sure the view is visible because it stores old values
            imageView.setVisibility(View.VISIBLE);
        } else {
            // If the list does not have an image, the image will be destroyed and not apparent
            imageView.setVisibility(View.GONE);
        }

        // set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container view
        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
