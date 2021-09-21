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
import org.techtown.gico.study.unit6.FragmentContent6_2;
import org.techtown.gico.study.unit6.FragmentContent6_4;

public class FragmentContent3_3 extends Fragment {
    ImageButton backButton3_3, homeButton3_3, forwardButton3_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content3_3, container, false);

        backButton3_3 = rootView.findViewById(R.id.backButton3_3);
        homeButton3_3 = rootView.findViewById(R.id.homeButton3_3);
        forwardButton3_3 = rootView.findViewById(R.id.forwardButton3_3);

        backButton3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent2)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent3_2 fragmentContent3_2 = new FragmentContent3_2();
                transaction.replace(R.id.container, fragmentContent3_2);
                transaction.commit();
            }
        });

        homeButton3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent4)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent3_4 fragmentContent3_4 = new FragmentContent3_4();
                transaction.replace(R.id.container, fragmentContent3_4);
                transaction.commit();
            }
        });

        return rootView;
    }
}