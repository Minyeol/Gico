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

public class FragmentContent9_1 extends Fragment {
    ImageButton homeButton9_1, forwardButton9_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content9_1, container, false);

        homeButton9_1 = rootView.findViewById(R.id.homeButton9_1);
        forwardButton9_1 = rootView.findViewById(R.id.forwardButton9_1);

        homeButton9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton9_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 다음 소단원
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent9_2 fragmentContent9_2 = new FragmentContent9_2();
                transaction.replace(R.id.container, fragmentContent9_2);
                transaction.commit();
            }
        });

        return rootView;
    }
}