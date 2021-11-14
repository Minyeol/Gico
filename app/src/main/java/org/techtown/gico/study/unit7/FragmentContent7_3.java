package org.techtown.gico.study.unit7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.study.unit1.FragmentContent1_2;

public class FragmentContent7_3 extends Fragment {
    ImageButton backButton7_3, homeButton7_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content7_3, container, false);

        backButton7_3 = rootView.findViewById(R.id.backButton7_3);
        homeButton7_3 = rootView.findViewById(R.id.homeButton7_3);

        backButton7_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent7_2 fragmentContent7_2 = new FragmentContent7_2();
                transaction.replace(R.id.container, fragmentContent7_2);
                transaction.commit();
            }
        });

        homeButton7_3.setOnClickListener(new View.OnClickListener() {
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