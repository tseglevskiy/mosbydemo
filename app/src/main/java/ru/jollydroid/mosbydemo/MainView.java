package ru.jollydroid.mosbydemo;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by tse on 27/07/16.
 */
public interface MainView extends MvpView {
    void showHello(String msg);
}
