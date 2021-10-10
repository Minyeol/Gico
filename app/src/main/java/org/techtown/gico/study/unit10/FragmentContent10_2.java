package org.techtown.gico.study.unit10;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.study.unit8.FragmentContent8_1;
import org.techtown.gico.study.unit8.FragmentContent8_3;

public class FragmentContent10_2 extends Fragment {

    ImageButton backButton10_2, homeButton10_2, forwardButton10_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content10_2, container, false);

        backButton10_2 = rootView.findViewById(R.id.backButton10_2);
        homeButton10_2 = rootView.findViewById(R.id.homeButton10_2);
        forwardButton10_2 = rootView.findViewById(R.id.forwardButton10_2);

        backButton10_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent10_1 fragmentContent10_1 = new FragmentContent10_1();
                transaction.replace(R.id.container, fragmentContent10_1);
                transaction.commit();
            }
        });

        homeButton10_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton10_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent10_3 fragmentContent10_3 = new FragmentContent10_3();
                transaction.replace(R.id.container, fragmentContent10_3);
                transaction.commit();
            }
        });

        return rootView;
    }
}