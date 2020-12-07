package com.example.forchemadlibscififinal.ui.scifi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.forchemadlibscififinal.R;

import java.util.Random;

public class Scifi_Fragment extends Fragment {

    //these are all of the objects we need for the program
    private TextView mFirstName;        //instantiating the object it actls like a global variable
    private TextView mLastName;         //Creating a field variable or a global variable
    private TextView mCity;
    private TextView mSchool;
    private TextView mBrother;
    private TextView mSister;
    private Button button;
    private View v;

    //loads up the script and xml when the activity begins
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //creating a root for the current activity and xml so we can find views
        View root = inflater.inflate(R.layout.fragment_scifi, container, false);

        //setting up all of the variable text views and button we will need
        mFirstName = (TextView) root.findViewById(R.id.txtFirstName);
        mLastName = (TextView) root.findViewById(R.id.txtLastName);
        mCity = (TextView) root.findViewById(R.id.txtCity);
        mSchool = (TextView) root.findViewById(R.id.txtSchool);
        mBrother = (TextView) root.findViewById(R.id.txtBrother);
        mSister = (TextView) root.findViewById(R.id.txtSister);
        button = (Button) root.findViewById(R.id.button);

        //an on click listener that will activate the script whenever the button is clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //importing javas random module
                Random rand = new Random();

                //establishing java variables to the text that we pull from our text views
                String first = mFirstName.getText().toString();    //getText just gets the info out of the TextView and toString() insures it is pulled as a string
                String last = mLastName.getText().toString();
                String city = mCity.getText().toString();
                String school = mSchool.getText().toString();
                String brother = mBrother.getText().toString();
                String sister = mSister.getText().toString();

                //This long string is combining all of the strings with certain characters to form the scifi name
                //the substrings are helping us select portions of each individual string randomly so that we can combine them in the end
                String sciFiName = first.substring(0, ((int) (rand.nextDouble() * first.length()))) +
                        last.substring(((int) (rand.nextDouble() * last.length()))) + " " +

                        city.substring(0, ((int) (rand.nextDouble() * city.length()))) +
                        school.substring(((int) (rand.nextDouble() * school.length()))) +

                        "\nfrom \n" +
                        brother.substring(0, ((int) (rand.nextDouble() * brother.length()))) +
                        sister.substring(((int) (rand.nextDouble() * sister.length())));

                TextView sciFiNameOutput = (TextView) root.findViewById(R.id.txtOutput);    //this is creating the text output for us to display the name
                sciFiNameOutput.setText(sciFiName);     //sets the text to the new scifi name
            }
        });
        return root;
    }
}