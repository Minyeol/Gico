package org.techtown.gico.study.unit2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;

public class FragmentContent2_5 extends Fragment {
    ImageButton backButton2_5, homeButton2_5, forwardButton2_5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content2_5, container, false);

        backButton2_5 = rootView.findViewById(R.id.backButton2_5);
        homeButton2_5 = rootView.findViewById(R.id.homeButton2_5);
        forwardButton2_5 = rootView.findViewById(R.id.forwardButton2_5);

        backButton2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent2_4 fragmentContent2_4 = new FragmentContent2_4();
                transaction.replace(R.id.container, fragmentContent2_4);
                transaction.commit();
            }
        });

        homeButton2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        return rootView;
    }
}