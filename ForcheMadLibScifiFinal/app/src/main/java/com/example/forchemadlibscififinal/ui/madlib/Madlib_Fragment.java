package com.example.forchemadlibscififinal.ui.madlib;

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
import androidx.lifecycle.ViewModelProvider;

import com.example.forchemadlibscififinal.R;
import com.example.forchemadlibscififinal.ui.scifi.HomeViewModel;

public class Madlib_Fragment extends Fragment {

    //instantiates all of the objects including the parts of speech and button
    private TextView adjective1;        //instantiating the object it actls like a global variable
    private TextView noun;         //Creating a field variable or a global variable
    private TextView adjective2;
    private TextView adjective3;
    private TextView noun2;
    private TextView adjective4;
    private TextView noun3;
    private TextView verb;
    private TextView number;
    private TextView verb2;
    private TextView verb3;
    private TextView adverb;
    private Button button;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //utilizing the home view model for aestetics
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        //creating a root for the activity and xml to utilize
        View root = inflater.inflate(R.layout.fragment_madlib, container, false);

        //creating all of the textviews and button inside of the java file using findViewById
        adjective1 = (TextView) root.findViewById(R.id.adj);
        noun = (TextView) root.findViewById(R.id.noun);
        adjective2 = (TextView) root.findViewById(R.id.adj2);
        adjective3 = (TextView) root.findViewById(R.id.adj3);
        noun2 = (TextView) root.findViewById(R.id.noun2);
        adjective4 = (TextView) root.findViewById(R.id.adj4);
        noun3 = (TextView) root.findViewById(R.id.noun3);
        verb = (TextView) root.findViewById(R.id.verb);
        number = (TextView) root.findViewById(R.id.number);
        verb2 = (TextView) root.findViewById(R.id.verb2);
        verb3 = (TextView) root.findViewById(R.id.verb3);
        adverb = (TextView) root.findViewById(R.id.adverb);
        button = (Button) root.findViewById(R.id.button);

        //creating our onclick listener so that the program will always try and detect to see if a submission has been made
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating all of the java variables for the strings inside of the text boxes
                String adj = adjective1.getText().toString();
                String n = noun.getText().toString();
                String adj2 = adjective2.getText().toString();
                String adj3 = adjective3.getText().toString();
                String n2 = noun2.getText().toString();
                String adj4 = adjective4.getText().toString();
                String n3 = noun3.getText().toString();
                String ve = verb.getText().toString();
                String nu = number.getText().toString();
                String ve2 = verb2.getText().toString();
                String ve3 = verb3.getText().toString();
                String adv = adverb.getText().toString();

                //This is the output for the madlib story
                String madLibText = ("Rick looked at the "+adj+" "+n+" in a state of absolute "+adj2+".\n\"Ah geez rick is that a "+adj3+" "+n2+", or am I just "+adj4+
                        ".\"\n\"No Morty *burps* it's a "+n3+", and it's known for "+ve+"ing for "+nu+
                        " years or until it has your *burps* soul Morrrrty.\n\"Ah geeeeez Rick, we need to "+ve2+"!\"\n\"No morty we don't need to *burp* "+ve2+" you idiot; we need to "+ve3+" "+adv+"!\n");

                //creating the output text
                TextView output = (TextView) root.findViewById(R.id.directions);
                //sets the output text to the new story
                output.setText(madLibText);     //append function is same as print ln
            }
        });

        return root;
    }
}