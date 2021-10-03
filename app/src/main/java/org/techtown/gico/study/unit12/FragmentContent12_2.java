package org.techtown.gico.study.unit12;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.study.unit3.FragmentContent3_1;
import org.techtown.gico.study.unit3.FragmentContent3_3;

public class FragmentContent12_2 extends Fragment {
    ImageButton backButton12_2, homeButton12_2, forwardButton12_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content12_2, container, false);

        backButton12_2 = rootView.findViewById(R.id.backButton12_2);
        homeButton12_2 = rootView.findViewById(R.id.homeButton12_2);
        forwardButton12_2 = rootView.findViewById(R.id.forwardButton12_2);

        backButton12_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent12_1)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent12_1 fragmentContent12_1 = new FragmentContent12_1();
                transaction.replace(R.id.container, fragmentContent12_1);
                transaction.commit();
            }
        });

        homeButton12_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton12_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent12_3)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent12_3 fragmentContent12_3 = new FragmentContent12_3();
                transaction.replace(R.id.container, fragmentContent12_3);
                transaction.commit();
            }
        });

        return rootView;
    }
}