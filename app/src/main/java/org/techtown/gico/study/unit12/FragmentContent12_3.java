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
import org.techtown.gico.study.unit3.FragmentContent3_2;
import org.techtown.gico.study.unit3.FragmentContent3_4;

public class FragmentContent12_3 extends Fragment {
    ImageButton backButton12_3, homeButton12_3, forwardButton12_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content12_3, container, false);

        backButton12_3 = rootView.findViewById(R.id.backButton12_3);
        homeButton12_3 = rootView.findViewById(R.id.homeButton12_3);
        forwardButton12_3 = rootView.findViewById(R.id.forwardButton12_3);

        backButton12_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent12_2)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent12_2 fragmentContent12_2 = new FragmentContent12_2();
                transaction.replace(R.id.container, fragmentContent12_2);
                transaction.commit();
            }
        });

        homeButton12_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton12_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent12_4)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent12_4 fragmentContent12_4 = new FragmentContent12_4();
                transaction.replace(R.id.container, fragmentContent12_4);
                transaction.commit();
            }
        });

        return rootView;
    }
}