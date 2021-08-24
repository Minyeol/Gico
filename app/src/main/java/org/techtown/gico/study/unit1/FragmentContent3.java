package org.techtown.gico.study.unit1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import org.techtown.gico.R;
import org.techtown.gico.Template_study;

public class FragmentContent3 extends Fragment {
    ImageButton backButton3, homeButton3, forwardButton3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content3, container, false);

        backButton3 = rootView.findViewById(R.id.backButton3);
        homeButton3 = rootView.findViewById(R.id.homeButton3);
        forwardButton3 = rootView.findViewById(R.id.forwardButton3);

        backButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent2)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent2 fragmentContent2 = new FragmentContent2();
                transaction.replace(R.id.container, fragmentContent2);
                transaction.commit();
            }
        });

        homeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Template_study template_study = new Template_study();
                transaction.replace(R.id.container, template_study);
                transaction.commit();
            }
        });

        forwardButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return rootView;
    }
}