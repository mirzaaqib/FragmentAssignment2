package com.pallefire.fragmentassignment2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //this method will called by login fragment
    public void passDatas(String uname){
        Toast.makeText(MainActivity.this, "Got It..."+uname, Toast.LENGTH_SHORT).show();
        //pass this data to welcome fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        //to avaid the crashes write the below code
        WelcomeFragment welcomeFragment=
                (WelcomeFragment) fragmentManager.findFragmentById(R.id.fragment2);
        if(welcomeFragment!=null){

            //second fragment is available,now send data to welcome fragment
            welcomeFragment.catchData(uname);
        }
        //will write code later
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
