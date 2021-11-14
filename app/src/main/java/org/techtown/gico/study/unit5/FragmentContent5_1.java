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

public class FragmentContent5_1 extends Fragment {

    ImageButton homeButton5_1, forwardButton5_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content5_1, container, false);
        TextView textView = rootView.findViewById(R.id.textView511);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView512);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView513);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        homeButton5_1 = rootView.findViewById(R.id.homeButton5_1);
        forwardButton5_1 = rootView.findViewById(R.id.forwardButton5_1);

        homeButton5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton5_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 1-2단원 페이지로 전환(content1)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent5_2 fragmentContent5_2 = new FragmentContent5_2();
                transaction.replace(R.id.container, fragmentContent5_2);
                transaction.commit();
            }
        });

        return rootView;
    }
}