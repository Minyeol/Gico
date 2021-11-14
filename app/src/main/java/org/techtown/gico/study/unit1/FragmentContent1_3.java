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
import org.techtown.gico.study.unit2.FragmentContent2_3;

public class FragmentContent1_3 extends Fragment {
    ImageButton backButton1_3, homeButton1_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content1_3, container, false);

        backButton1_3 = rootView.findViewById(R.id.backButton1_3);
        homeButton1_3 = rootView.findViewById(R.id.homeButton1_3);

        backButton1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent1_2 fragmentContent1_2 = new FragmentContent1_2();
                transaction.replace(R.id.container, fragmentContent1_2);
                transaction.commit();
            }
        });

        homeButton1_3.setOnClickListener(new View.OnClickListener() {
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