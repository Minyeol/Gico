package org.techtown.gico.study.unit5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;

public class FragmentContent5_2 extends Fragment {
    ImageButton backButton6_2, homeButton6_2, forwardButton6_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content5_2, container, false);

        backButton6_2 = rootView.findViewById(R.id.backButton4_3);
        homeButton6_2 = rootView.findViewById(R.id.homeButton4_3);
        forwardButton6_2 = rootView.findViewById(R.id.forwardButton4_3);

        backButton6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent1)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent5_1 fragmentContent6_1 = new FragmentContent5_1();
                transaction.replace(R.id.container, fragmentContent6_1);
                transaction.commit();
            }
        });

        homeButton6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent3)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent5_3 fragmentContent6_3 = new FragmentContent5_3();
                transaction.replace(R.id.container, fragmentContent6_3);
                transaction.commit();
            }
        });

        return rootView;
    }
}