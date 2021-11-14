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

public class FragmentContent8_3 extends Fragment {

    ImageButton backButton8_3, homeButton8_3, forwardButton8_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content8_3, container, false);
        TextView textView = rootView.findViewById(R.id.textView831);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView832);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView833);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView834);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView835);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView836);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView837);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        backButton8_3 = rootView.findViewById(R.id.backButton8_3);
        homeButton8_3 = rootView.findViewById(R.id.homeButton8_3);
        forwardButton8_3 = rootView.findViewById(R.id.forwardButton8_3);

        backButton8_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이전 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent8_2 fragmentContent8_2 = new FragmentContent8_2();
                transaction.replace(R.id.container, fragmentContent8_2);
                transaction.commit();
            }
        });

        homeButton8_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton8_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent8_4 fragmentContent8_4 = new FragmentContent8_4();
                transaction.replace(R.id.container, fragmentContent8_4);
                transaction.commit();
            }
        });

        return rootView;
    }
}