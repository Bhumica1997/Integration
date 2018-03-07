package com.example.qwinix.integration;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ambulance extends Fragment {
    public Button button1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        final View rootView=inflater.inflate(R.layout.ambulance,container,false);
        button1 = (Button) rootView.findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(getActivity(), GridMap.class);

                startActivity(toy);

            }
        });
        return rootView;
    }


}


