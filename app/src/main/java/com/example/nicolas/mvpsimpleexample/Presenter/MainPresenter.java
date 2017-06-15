package com.example.nicolas.mvpsimpleexample.Presenter;

import com.example.nicolas.mvpsimpleexample.Model.User;

/**
 * Created by Nicolas on 13/06/2017.
 */

public class MainPresenter {

    private User user;
    private View view;


    public MainPresenter(View view) {
        this.view = view;
        user  = new User();
    }

    // Updates every time the user is typing
    public void updateFullName(String fullName) {
        user.setFullName(fullName);
        view.updateUserInfoTextView(user.toString());
    }

    // Updates every time the user is typing
    public void updateEmail(String email) {
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());
    }

    // This interface is implemented by the main activity wich in this case is the view.
    public interface View {
        void updateUserInfoTextView(String info);
    }
}
