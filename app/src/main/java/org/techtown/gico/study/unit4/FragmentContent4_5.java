package org.techtown.gico.study.unit4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;

public class FragmentContent4_5 extends Fragment {
    ImageButton homeButton4_5, backButton4_5, forwardButton4_5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content4_5, container, false);

        backButton4_5 = rootView.findViewById(R.id.backButton4_5);
        homeButton4_5 = rootView.findViewById(R.id.homeButton4_5);
        forwardButton4_5 = rootView.findViewById(R.id.forwardButton4_5);
        backButton4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent4)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent4_4 fragmentContent4_4 = new FragmentContent4_4();
                transaction.replace(R.id.container, fragmentContent4_4);
                transaction.commit();
            }
        });

        homeButton4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent6)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent4_6 fragmentContent4_6 = new FragmentContent4_6();
                transaction.replace(R.id.container, fragmentContent4_6);
                transaction.commit();
            }
        });
        return rootView;
    }
}