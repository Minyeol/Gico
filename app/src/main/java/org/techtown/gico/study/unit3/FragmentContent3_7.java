package org.techtown.gico.study.unit3;

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
import org.techtown.gico.study.unit6.FragmentContent6_3;

public class FragmentContent3_7 extends Fragment {
    ImageButton homeButton3_7, backButton3_7;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content3_7, container, false);
        TextView textView = rootView.findViewById(R.id.textView371);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        backButton3_7 = rootView.findViewById(R.id.backButton3_7);
        homeButton3_7 = rootView.findViewById(R.id.homeButton3_7);

        backButton3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환(FragmentContent5)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent3_6 fragmentContent3_6 = new FragmentContent3_6();
                transaction.replace(R.id.container, fragmentContent3_6);
                transaction.commit();
            }
        });

        homeButton3_7.setOnClickListener(new View.OnClickListener() {
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