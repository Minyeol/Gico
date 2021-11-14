package org.techtown.gico.study.unit8;

import android.os.Bundle;

import androidx.annotation.Dimension;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import org.techtown.gico.R;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.TextSizeSetting;
import org.techtown.gico.study.unit2.FragmentContent2_2;

public class FragmentContent8_4 extends Fragment {

    ImageButton backButton8_4, homeButton8_4, forwardButton8_4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content8_4, container, false);
        TextView textView = rootView.findViewById(R.id.textView841);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView842);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView843);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView844);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        backButton8_4 = rootView.findViewById(R.id.backButton8_4);
        homeButton8_4 = rootView.findViewById(R.id.homeButton8_4);

        backButton8_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent8_3 fragmentContent8_3 = new FragmentContent8_3();
                transaction.replace(R.id.container, fragmentContent8_3);
                transaction.commit();
            }
        });

        homeButton8_4.setOnClickListener(new View.OnClickListener() {
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