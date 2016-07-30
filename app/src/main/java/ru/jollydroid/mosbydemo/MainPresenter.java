package ru.jollydroid.mosbydemo;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by tse on 27/07/16.
 */
public interface MainPresenter<V extends MvpView> extends MvpPresenter<V> {
    void click();

    void updateView();
}
