package com.pallefire.fragmentassignment2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    //declare all the variables
    EditText et1,et2;
    Button b;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_login,container,false);
        et1 = (EditText) v.findViewById(R.id.edittext1);
        et2 = (EditText) v.findViewById(R.id.edittext2);
        b = (Button) v.findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //read data from edit text
                String uname =et1.getText().toString();


                //pass data to parent activity--Main Activity
                MainActivity m = (MainActivity) getActivity();

                //getActivity is a predefined method which returns parent or Parent Activity of a fragment
                m.passDatas(uname);
            }
        });

        // Inflate the layout for this fragment
        return v;
    }


}
