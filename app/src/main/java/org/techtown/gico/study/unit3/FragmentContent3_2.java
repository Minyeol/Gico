package org.techtown.gico.study.unit3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.study.unit6.FragmentContent6_1;
import org.techtown.gico.study.unit6.FragmentContent6_3;

public class FragmentContent3_2 extends Fragment {
    ImageButton backButton3_2, homeButton3_2, forwardButton3_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content3_2, container, false);

        backButton3_2 = rootView.findViewById(R.id.backButton3_2);
        homeButton3_2 = rootView.findViewById(R.id.homeButton3_2);
        forwardButton3_2 = rootView.findViewById(R.id.forwardButton3_2);

        backButton3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent1)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent3_1 fragmentContent3_1 = new FragmentContent3_1();
                transaction.replace(R.id.container, fragmentContent3_1);
                transaction.commit();
            }
        });

        homeButton3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent3)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent3_3 fragmentContent3_3 = new FragmentContent3_3();
                transaction.replace(R.id.container, fragmentContent3_3);
                transaction.commit();
            }
        });

        return rootView;
    }
}