package com.pallefire.fragmentassignment2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {
    TextView textView;
    //main activity will call this nethod
    public void catchData(String uname)
    {
        //Apply that data to text view
        textView.setText("welcome to:"+uname);
    }



    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_welcome,null);
        textView = (TextView) v.findViewById(R.id.textview3);


        // Inflate the layout for this fragment
        return v;
    }

}
