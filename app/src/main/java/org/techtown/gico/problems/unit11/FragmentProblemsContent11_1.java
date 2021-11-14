package org.techtown.gico.problems.unit11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.ProblemsFragment;
import org.techtown.gico.R;
import org.techtown.gico.problems.unit6.FragmentProblemsContent6_2;

public class FragmentProblemsContent11_1 extends Fragment {

    ImageButton homeButton3_1, forwardButton3_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content6_1_problems, container, false);

        homeButton3_1 = rootView.findViewById(R.id.homeButton3_1);
        forwardButton3_1 = rootView.findViewById(R.id.forwardButton3_1);

        homeButton3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                ProblemsFragment problemsFragment = new ProblemsFragment();
                transaction.replace(R.id.container, problemsFragment);
                transaction.commit();
            }
        });

        forwardButton3_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 3-2단원 페이지로 전환(content1)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentProblemsContent6_2 fragmentProblemsContent6_2 = new FragmentProblemsContent6_2();
                transaction.replace(R.id.container, fragmentProblemsContent6_2);
                transaction.commit();
            }
        });

        return rootView;
    }
}