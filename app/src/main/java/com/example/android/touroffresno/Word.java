package com.example.android.touroffresno;

/**
 * Created by Justin on 11/15/2016.
 */
public class Word {
    // Top Phrase or Words for the list item
    private int mTopWord;
    // Bottom Phrase or Words for the list item
    private int mBottomWord;
    // String Address for list item
    private int mAddress;
    // This variable is used to store the image file, storing a ImageView would cost too much processing
    // Power and would not work as well so that is why a resource ID would work better
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    // Constant value used to determine if there is an image or not, if the image still has -1, then
    // There was no image value inputted
    // This is used for list items without images so the image can be destroyed
    private static final int NO_IMAGE_PROVIDED = -1;
    // this integer is for the audio resource id so it can be called out on the onclick method

    public Word(int topWord, int bottomWord, int address) {
        mTopWord = topWord;
        mBottomWord = bottomWord;
        mAddress = address;
    }

    public Word(int topWord, int bottomWord, int address, int imageResourceId) {
        // No need to rewrite the previous 3 inputs, can simply write the below statement
        this(topWord, bottomWord, address);
        mImageResourceId = imageResourceId;
    }

    public int getTopWord() {
        return mTopWord;
    }

    public int getBottomWord() {
        return mBottomWord;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Returns whether or not there is an image for this word
    public boolean hasImage() {
        // This logic is to determine if the resource ID has an image or not
        // It determines if it does not equal to -1 which would be the case if there was an image
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
