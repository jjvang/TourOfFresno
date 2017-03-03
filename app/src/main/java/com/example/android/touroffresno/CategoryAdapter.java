package com.example.android.touroffresno;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Justin on 11/15/2016.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else  if (position == 2){
            return new FoodFragment();
        } else {
            return new FoodFragment();
        }

//        if (position == 0) {
//            return new FoodFragment();
//        } else if (position == 1) {
//            return new FunFragment();
//        } else  if (position == 2){
//            return new EventsFragment();
//        } else {
//            return new NearFragment();
//        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    // This overriding of getPageTitle allows you to input the text for the tabs

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_food);
        } else if (position == 1) {
            return mContext.getString(R.string.category_fun);
        } else  if (position == 2){
            return mContext.getString(R.string.category_events);
        } else {
            return mContext.getString(R.string.category_near);
        }
    }
}
