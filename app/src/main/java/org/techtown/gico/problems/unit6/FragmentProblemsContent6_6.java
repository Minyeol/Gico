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

public class FragmentProblemsContent6_6 extends Fragment {
    ImageButton homeButtonProblem6_6, backButtonProblem6_6, forwardButtonProblem6_6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content6_6_problems, container, false);
        TextView textView = rootView.findViewById(R.id.textViewP661);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);

        backButtonProblem6_6 = rootView.findViewById(R.id.backButtonProblem6_6);
        homeButtonProblem6_6 = rootView.findViewById(R.id.homeButtonProblem6_6);
        forwardButtonProblem6_6 = rootView.findViewById(R.id.forwardButtonProblem6_6);

        backButtonProblem6_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent5)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentProblemsContent6_5 fragmentProblemsContent6_5 = new FragmentProblemsContent6_5();
                transaction.replace(R.id.container, fragmentProblemsContent6_5);
                transaction.commit();
            }
        });

        homeButtonProblem6_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                ProblemsFragment problemsFragment = new ProblemsFragment();
                transaction.replace(R.id.container, problemsFragment);
                transaction.commit();
            }
        });
        /*

        forwardButton3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent5)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentProblemsContent6_3 fragmentProblemsContent6_3 = new FragmentProblemsContent6_3();
                transaction.replace(R.id.container, fragmentProblemsContent6_3);
                transaction.commit();
            }
        });

         */

        return rootView;
    }
}