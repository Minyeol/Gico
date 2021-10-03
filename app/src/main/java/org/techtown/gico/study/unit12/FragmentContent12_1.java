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

public class FragmentContent12_1 extends Fragment {

    ImageButton homeButton12_1, forwardButton12_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content12_1, container, false);

        homeButton12_1 = rootView.findViewById(R.id.homeButton12_1);
        forwardButton12_1 = rootView.findViewById(R.id.forwardButton12_1);

        homeButton12_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton12_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 12-2단원 페이지로 전환(content12_2)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent12_2 fragmentContent12_2 = new FragmentContent12_2();
                transaction.replace(R.id.container, fragmentContent12_2);
                transaction.commit();
            }
        });

        return rootView;
    }
}