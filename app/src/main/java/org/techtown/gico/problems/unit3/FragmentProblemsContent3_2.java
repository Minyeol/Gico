package org.techtown.gico.problems.unit3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.ProblemsFragment;
import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.study.unit3.FragmentContent3_6;

public class FragmentProblemsContent3_2 extends Fragment {
    ImageButton homeButton3_7, backButton3_7;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content3_2_problems, container, false);

        backButton3_7 = rootView.findViewById(R.id.backButton3_7);
        homeButton3_7 = rootView.findViewById(R.id.homeButton3_7);

        backButton3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent5)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentProblemsContent3_1 fragmentProblemsContent3_1 = new FragmentProblemsContent3_1();
                transaction.replace(R.id.container, fragmentProblemsContent3_1);
                transaction.commit();
            }
        });

        homeButton3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                ProblemsFragment problemsFragment = new ProblemsFragment();
                transaction.replace(R.id.container, problemsFragment);
                transaction.commit();
            }
        });

        return rootView;
    }
}