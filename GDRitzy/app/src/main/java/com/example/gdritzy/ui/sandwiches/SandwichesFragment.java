package com.example.gdritzy.ui.sandwiches;

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

import static com.example.gdritzy.MainActivity.priceFile;

public class SandwichesFragment extends Fragment {

    private SandwichViewModel sandwichViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sandwichViewModel =
                ViewModelProviders.of(this).get(SandwichViewModel.class);

        View root = inflater.inflate(R.layout.fragment_sandwiches, container, false);

        Button button1 = (Button) root.findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Cheese Burger - 4.99\n");
                priceFile.addToPrice(4.99);
            }
        });

        Button button2 = (Button) root.findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Double Ritz - 5.99\n");
                priceFile.addToPrice(5.99);
            }
        });

        Button button3 = (Button) root.findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Fish Sandwich - 4.99\n");
                priceFile.addToPrice(4.99);
            }
        });

        Button button4 = (Button) root.findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Chicken Sandwich - 5.99\n");
                priceFile.addToPrice(5.99);
            }
        });

        Button button5 = (Button) root.findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priceFile.addToList("Peanut Butter and Jelly - 4.99\n");
                priceFile.addToPrice(4.99);
            }
        });

        return root;
    }




}