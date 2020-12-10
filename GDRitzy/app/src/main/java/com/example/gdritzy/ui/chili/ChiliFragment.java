package com.example.gdritzy.ui.chili;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.gdritzy.R;
import com.example.gdritzy.ui.PriceAndListTotal;
import com.example.gdritzy.ui.home.WelcomeScreenViewModel;
import com.example.gdritzy.ui.salads.SaladsViewModel;
import com.example.gdritzy.ui.sandwiches.SandwichViewModel;

import static com.example.gdritzy.MainActivity.priceFile;

public class ChiliFragment extends Fragment {

    private ChiliViewModel chiliViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        chiliViewModel =
                ViewModelProviders.of(this).get(ChiliViewModel.class);

        View root = inflater.inflate(R.layout.fragment_chili, container, false);



        Button button1 = (Button) root.findViewById(R.id.btn1);
        NumberPicker chiliType = (NumberPicker) root.findViewById(R.id.chiliNumberPicker);

        chiliType.setMaxValue(3);
        chiliType.setMinValue(0);
        chiliType.setDisplayedValues(new String[]{"3","4","5","7"});

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Chili-"+chiliType.getValue()+" way - 4.99\n");
                priceFile.addToPrice(4.99);
            }
        });

        return root;
    }
}
