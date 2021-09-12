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

public class FragmentContent4_1 extends Fragment {

    ImageButton homeButton4_1, forwardButton4_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content4_1, container, false);

        homeButton4_1 = rootView.findViewById(R.id.homeButton6_1);
        forwardButton4_1 = rootView.findViewById(R.id.forwardButton6_1);

        homeButton4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton4_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 1-2단원 페이지로 전환(content1)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent4_2 fragmentContent4_2 = new FragmentContent4_2();
                transaction.replace(R.id.container, fragmentContent4_2);
                transaction.commit();
            }
        });

        return rootView;
    }
}