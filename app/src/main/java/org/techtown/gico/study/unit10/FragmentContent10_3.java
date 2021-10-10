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
import org.techtown.gico.study.unit8.FragmentContent8_2;
import org.techtown.gico.study.unit8.FragmentContent8_4;

public class FragmentContent10_3 extends Fragment {

    ImageButton backButton10_3, homeButton10_3, forwardButton10_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content10_3, container, false);

        backButton10_3 = rootView.findViewById(R.id.backButton10_3);
        homeButton10_3 = rootView.findViewById(R.id.homeButton10_3);
        forwardButton10_3 = rootView.findViewById(R.id.forwardButton10_3);

        backButton10_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent10_2 fragmentContent10_2 = new FragmentContent10_2();
                transaction.replace(R.id.container, fragmentContent10_2);
                transaction.commit();
            }
        });

        homeButton10_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton10_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent10_4 fragmentContent10_4 = new FragmentContent10_4();
                transaction.replace(R.id.container, fragmentContent10_4);
                transaction.commit();
            }
        });

        return rootView;
    }
}