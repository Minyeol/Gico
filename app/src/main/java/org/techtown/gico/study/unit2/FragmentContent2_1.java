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
import org.techtown.gico.study.unit6.FragmentContent6_2;

public class FragmentContent2_1 extends Fragment {
    ImageButton homeButton2_1, forwardButton2_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content2_1, container, false);

        homeButton2_1 = rootView.findViewById(R.id.homeButton2_1);
        forwardButton2_1 = rootView.findViewById(R.id.forwardButton2_1);

        homeButton2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton2_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 다음 소단원
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent2_2 fragmentContent2_2 = new FragmentContent2_2();
                transaction.replace(R.id.container, fragmentContent2_2);
                transaction.commit();
            }
        });

        return rootView;
    }
}