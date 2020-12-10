package com.example.gdritzy.ui.chili;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChiliViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChiliViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is chili fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}