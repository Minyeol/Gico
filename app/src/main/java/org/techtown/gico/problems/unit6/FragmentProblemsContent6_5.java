package org.techtown.gico.problems.unit6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Dimension;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.ProblemsFragment;
import org.techtown.gico.R;
import org.techtown.gico.TextSizeSetting;

public class FragmentProblemsContent6_5 extends Fragment {
    ImageButton homeButtonProblem6_5, backButtonProblem6_5, forwardButtonProblem6_5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content6_5_problems, container, false);
        TextView textView = rootView.findViewById(R.id.textViewP651);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        backButtonProblem6_5 = rootView.findViewById(R.id.backButtonProblem6_5);
        homeButtonProblem6_5 = rootView.findViewById(R.id.homeButtonProblem6_5);
        forwardButtonProblem6_5 = rootView.findViewById(R.id.forwardButtonProblem6_5);

        backButtonProblem6_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent5)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentProblemsContent6_4 fragmentProblemsContent6_4 = new FragmentProblemsContent6_4();
                transaction.replace(R.id.container, fragmentProblemsContent6_4);
                transaction.commit();
            }
        });

        homeButtonProblem6_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                ProblemsFragment problemsFragment = new ProblemsFragment();
                transaction.replace(R.id.container, problemsFragment);
                transaction.commit();
            }
        });

        forwardButtonProblem6_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent5)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentProblemsContent6_6 fragmentProblemsContent6_6 = new FragmentProblemsContent6_6();
                transaction.replace(R.id.container, fragmentProblemsContent6_6);
                transaction.commit();
            }
        });

        return rootView;
    }
}