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

public class FragmentContent6_1 extends Fragment {

    ImageButton homeButton6_1, forwardButton6_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content6_1, container, false);
        TextView textView = rootView.findViewById(R.id.textView611);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        textView = rootView.findViewById(R.id.textView612);
        textView.setTextSize(Dimension.SP, TextSizeSetting.TEXT_SIZE);
        homeButton6_1 = rootView.findViewById(R.id.homeButton6_1);
        forwardButton6_1 = rootView.findViewById(R.id.forwardButton6_1);

        homeButton6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        forwardButton6_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 1-2단원 페이지로 전환(content1)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent6_2 fragmentContent6_2 = new FragmentContent6_2();
                transaction.replace(R.id.container, fragmentContent6_2);
                transaction.commit();
            }
        });

        return rootView;
    }
}