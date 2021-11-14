package org.techtown.gico.study.unit1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.study.unit2.FragmentContent2_1;
import org.techtown.gico.study.unit2.FragmentContent2_3;

public class FragmentContent1_2 extends Fragment {
    ImageButton backButton1_2, homeButton1_2, forwardButton1_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content1_2, container, false);

        backButton1_2 = rootView.findViewById(R.id.backButton1_2);
        homeButton1_2 = rootView.findViewById(R.id.homeButton1_2);
        forwardButton1_2 = rootView.findViewById(R.id.forwardButton1_2);

        backButton1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent1_1 fragmentContent1_1 = new FragmentContent1_1();
                transaction.replace(R.id.container, fragmentContent1_1);
                transaction.commit();
            }
        });

        homeButton1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent1_3 fragmentContent1_3 = new FragmentContent1_3();
                transaction.replace(R.id.container, fragmentContent1_3);
                transaction.commit();
            }
        });

        return rootView;
    }
}