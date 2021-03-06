package org.techtown.gico.study.unit6;

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
import org.techtown.gico.study.unit4.FragmentContent4_2;
import org.techtown.gico.study.unit4.FragmentContent4_4;

public class FragmentContent6_3 extends Fragment {
    ImageButton backButton4_3, homeButton4_3, forwardButton4_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content6_3, container, false);
        TextView textView = rootView.findViewById(R.id.textView631);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView632);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        backButton4_3 = rootView.findViewById(R.id.backButton4_3);
        homeButton4_3 = rootView.findViewById(R.id.homeButton4_3);
        forwardButton4_3 = rootView.findViewById(R.id.forwardButton4_3);

        backButton4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent2)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent6_2 fragmentContent6_2 = new FragmentContent6_2();
                transaction.replace(R.id.container, fragmentContent6_2);
                transaction.commit();
            }
        });

        homeButton4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환(FragmentContent4)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent6_4 fragmentContent6_4 = new FragmentContent6_4();
                transaction.replace(R.id.container, fragmentContent6_4);
                transaction.commit();
            }
        });

        return rootView;
    }
}