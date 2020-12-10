package com.example.gdritzy.ui.checkout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CheckoutScreenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CheckoutScreenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is checkout fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}