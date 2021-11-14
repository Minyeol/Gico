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

public class FragmentContent8_1 extends Fragment {
    ImageButton homeButton8_1, forwardButton8_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content8_1, container, false);
        TextView textView = rootView.findViewById(R.id.textView811);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView812);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView813);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView814);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView815);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView816);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        homeButton8_1 = rootView.findViewById(R.id.homeButton8_1);
        forwardButton8_1 = rootView.findViewById(R.id.forwardButton8_1);

        homeButton8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton8_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 다음 소단원
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent8_2 fragmentContent8_2 = new FragmentContent8_2();
                transaction.replace(R.id.container, fragmentContent8_2);
                transaction.commit();
            }
        });

        return rootView;
    }
}