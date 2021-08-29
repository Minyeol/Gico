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
import org.techtown.gico.study.unit1.FragmentContent1;
import org.techtown.gico.study.unit1.FragmentContent3;

public class FragmentContent4_2 extends Fragment {
    ImageButton backButton2, homeButton2, forwardButton2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content4_2, container, false);

        backButton2 = rootView.findViewById(R.id.backButton2);
        homeButton2 = rootView.findViewById(R.id.homeButton2);
        forwardButton2 = rootView.findViewById(R.id.forwardButton2);

        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent1)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent1 fragmentContent1 = new FragmentContent1();
                transaction.replace(R.id.container, fragmentContent1);
                transaction.commit();
            }
        });

        homeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent3)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent3 fragmentContent3 = new FragmentContent3();
                transaction.replace(R.id.container, fragmentContent3);
                transaction.commit();
            }
        });

        return rootView;
    }
}