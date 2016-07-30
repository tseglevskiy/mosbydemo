package ru.jollydroid.mosbydemo;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

/**
 * Created by tse on 27/07/16.
 */
public class MainPresenterImpl extends MvpBasePresenter<MainView> implements MainPresenter<MainView> {
    int counter = 0;
    @Override
    public void click() {
        counter++;

        showHello();
    }

    @Override
    public void updateView() {
        showHello();
    }

    @Override
    public void attachView(MainView view) {
        super.attachView(view);
    }

    private void showHello() {
        if (isViewAttached()) {
            getView().showHello("hello " + counter);
        }
    }
}
