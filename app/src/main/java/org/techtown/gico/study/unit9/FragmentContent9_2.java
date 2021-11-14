package org.techtown.gico.study.unit9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.study.unit7.FragmentContent7_2;

public class FragmentContent9_2 extends Fragment {
    ImageButton backButton9_2, homeButton9_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content9_2, container, false);

        backButton9_2 = rootView.findViewById(R.id.backButton9_2);
        homeButton9_2 = rootView.findViewById(R.id.homeButton9_2);

        backButton9_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent9_1 fragmentContent9_1 = new FragmentContent9_1();
                transaction.replace(R.id.container, fragmentContent9_1);
                transaction.commit();
            }
        });

        homeButton9_2.setOnClickListener(new View.OnClickListener() {
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