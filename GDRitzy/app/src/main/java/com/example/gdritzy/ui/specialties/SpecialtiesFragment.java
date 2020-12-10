package com.example.gdritzy.ui.specialties;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.gdritzy.R;
import com.example.gdritzy.ui.home.WelcomeScreenViewModel;

import android.os.Bundle;
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
import com.example.gdritzy.ui.home.WelcomeScreenViewModel;
import com.example.gdritzy.ui.salads.SaladsViewModel;
import com.example.gdritzy.ui.sandwiches.SandwichViewModel;

import static com.example.gdritzy.MainActivity.priceFile;

public class SpecialtiesFragment extends Fragment {

    private SpecialtiesViewModel specialtiesViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        specialtiesViewModel =
                ViewModelProviders.of(this).get(SpecialtiesViewModel.class);

        View root = inflater.inflate(R.layout.fragment_specialties, container, false);

        Button button1 = (Button) root.findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("World Famous PB&J - 9.99\n");
                priceFile.addToPrice(9.99);
            }
        });

        Button button2 = (Button) root.findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                priceFile.addToList("Shoe String Fries - 2.99\n");
                priceFile.addToPrice(2.99);
            }
        });

        Button button3 = (Button) root.findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Steamed Vegtables - 2.99\n");
                priceFile.addToPrice(2.99);
            }
        });
        return root;
    }
}