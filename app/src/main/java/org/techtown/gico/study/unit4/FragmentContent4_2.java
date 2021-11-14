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

public class FragmentContent4_2 extends Fragment {
    ImageButton backButton4_2, homeButton4_2, forwardButton4_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content4_2, container, false);

        backButton4_2 = rootView.findViewById(R.id.backButton4_2);
        homeButton4_2 = rootView.findViewById(R.id.homeButton4_2);
        forwardButton4_2 = rootView.findViewById(R.id.forwardButton4_2);

        backButton4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent1)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent4_1 fragmentContent4_1 = new FragmentContent4_1();
                transaction.replace(R.id.container, fragmentContent4_1);
                transaction.commit();
            }
        });

        homeButton4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent3)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent4_3 fragmentContent4_3 = new FragmentContent4_3();
                transaction.replace(R.id.container, fragmentContent4_3);
                transaction.commit();
            }
        });

        return rootView;
    }
}