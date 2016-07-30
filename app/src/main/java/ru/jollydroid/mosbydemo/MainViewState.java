package ru.jollydroid.mosbydemo;

import android.util.Log;

import com.hannesdorfmann.mosby.mvp.viewstate.ViewState;

/**
 * Created by tse on 27/07/16.
 */
public class MainViewState implements ViewState<MainView> {
    @Override
    public void apply(MainView view, boolean retained) {
        Log.d("happy", "MainViewState apply " + retained);
    }
}
