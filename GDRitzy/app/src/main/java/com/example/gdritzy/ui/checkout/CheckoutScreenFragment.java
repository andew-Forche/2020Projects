package com.example.gdritzy.ui.checkout;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.gdritzy.R;
import com.example.gdritzy.ui.PriceAndListTotal;
import com.example.gdritzy.ui.checkout.CheckoutScreenViewModel;

import static com.example.gdritzy.MainActivity.priceFile;

public class CheckoutScreenFragment extends Fragment {

    private CheckoutScreenViewModel checkoutScreenViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        checkoutScreenViewModel =
                ViewModelProviders.of(this).get(CheckoutScreenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_checkout, container, false);
        TextView listlbl = (TextView) root.findViewById(R.id.listtxt);
        listlbl.setText(priceFile.getListItems());
        Log.d("array list", priceFile.getListItems());
        TextView pricetext = (TextView) root.findViewById(R.id.pricelbl);
        pricetext.setText(Double.toString(priceFile.getTotalPrice()));


        return root;
    }




}