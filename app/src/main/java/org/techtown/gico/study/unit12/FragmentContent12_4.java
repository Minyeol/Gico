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
import org.techtown.gico.study.unit3.FragmentContent3_6;

public class FragmentContent12_4 extends Fragment {
    ImageButton homeButton12_4, backButton12_4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content12_4, container, false);

        backButton12_4 = rootView.findViewById(R.id.backButton12_4);
        homeButton12_4 = rootView.findViewById(R.id.homeButton12_4);

        backButton12_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent12_3)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent12_3 fragmentContent12_3 = new FragmentContent12_3();
                transaction.replace(R.id.container, fragmentContent12_3);
                transaction.commit();
            }
        });

        homeButton12_4.setOnClickListener(new View.OnClickListener() {
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