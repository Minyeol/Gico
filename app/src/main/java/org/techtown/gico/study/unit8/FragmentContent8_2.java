package org.techtown.gico.study.unit8;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.study.unit2.FragmentContent2_1;
import org.techtown.gico.study.unit2.FragmentContent2_3;

public class FragmentContent8_2 extends Fragment {

    ImageButton backButton8_2, homeButton8_2, forwardButton8_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content8_2, container, false);

        backButton8_2 = rootView.findViewById(R.id.backButton8_2);
        homeButton8_2 = rootView.findViewById(R.id.homeButton8_2);
        forwardButton8_2 = rootView.findViewById(R.id.forwardButton8_2);

        backButton8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent8_1 fragmentContent8_1 = new FragmentContent8_1();
                transaction.replace(R.id.container, fragmentContent8_1);
                transaction.commit();
            }
        });

        homeButton8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent8_3 fragmentContent8_3 = new FragmentContent8_3();
                transaction.replace(R.id.container, fragmentContent8_3);
                transaction.commit();
            }
        });

        return rootView;
    }
}