package com.example.hoc_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btnF1,btnF2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LinkViews();
        addEvents();
    }

    private void LinkViews() {
        btnF1=findViewById(R.id.btnF1);
        btnF2=findViewById(R.id.btnF2);
    }

    private void addEvents() {
        btnF1.setOnClickListener(myClick);
        btnF2.setOnClickListener(myClick);
    }

    View.OnClickListener myClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            Fragment fragment=null;
            switch (view.getId()) {
                case R.id.btnF1:
                    fragment=new Fragment1();
                    break;
                case R.id.btnF2:
                    fragment=new Fragment2();
                    //gửi dl cho mn 2
                    Bundle bundle=new Bundle();
                    bundle.putString("ProductName","Heineken");
                    fragment.setArguments(bundle);
                    break;
            }
            if (fragment!=null){
                fragmentTransaction.replace(R.id.LayoutContainer,fragment);
                fragmentTransaction.commit();
            }
        }
    };
}