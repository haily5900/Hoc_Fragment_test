package com.example.hoc_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_2, container, false);
        TextView txtContent=view.findViewById(R.id.txtName);
        Bundle bundle=getArguments();
        txtContent.setText(bundle.getString("ProductName"));
        return view;
    }
}