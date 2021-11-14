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
import org.techtown.gico.study.unit2.FragmentContent2_1;
import org.techtown.gico.study.unit2.FragmentContent2_3;

public class FragmentContent7_2 extends Fragment {
    ImageButton backButton7_2, homeButton7_2, forwardButton7_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content7_2, container, false);

        backButton7_2 = rootView.findViewById(R.id.backButton7_2);
        homeButton7_2 = rootView.findViewById(R.id.homeButton7_2);
        forwardButton7_2 = rootView.findViewById(R.id.forwardButton7_2);

        backButton7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent7_1 fragmentContent7_1 = new FragmentContent7_1();
                transaction.replace(R.id.container, fragmentContent7_1);
                transaction.commit();
            }
        });

        homeButton7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent7_3 fragmentContent7_3 = new FragmentContent7_3();
                transaction.replace(R.id.container, fragmentContent7_3);
                transaction.commit();
            }
        });

        return rootView;
    }
}