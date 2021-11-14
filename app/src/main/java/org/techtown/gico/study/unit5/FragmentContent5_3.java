package org.techtown.gico.study.unit5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Dimension;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.TextSizeSetting;

public class FragmentContent5_3 extends Fragment {
    ImageButton backButton5_3, homeButton5_3, forwardButton5_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content5_3, container, false);
        TextView textView = rootView.findViewById(R.id.textView531);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView532);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        backButton5_3 = rootView.findViewById(R.id.backButton5_3);
        homeButton5_3 = rootView.findViewById(R.id.homeButton5_3);
        forwardButton5_3 = rootView.findViewById(R.id.forwardButton5_3);

        backButton5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent2)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent5_2 fragmentContent5_2 = new FragmentContent5_2();
                transaction.replace(R.id.container, fragmentContent5_2);
                transaction.commit();
            }
        });

        homeButton5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent4)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent5_4 fragmentContent5_4 = new FragmentContent5_4();
                transaction.replace(R.id.container, fragmentContent5_4);
                transaction.commit();
            }
        });

        return rootView;
    }
}