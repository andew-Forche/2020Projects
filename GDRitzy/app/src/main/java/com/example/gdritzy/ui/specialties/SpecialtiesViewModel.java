package com.example.gdritzy.ui.specialties;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SpecialtiesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SpecialtiesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the specialties fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}