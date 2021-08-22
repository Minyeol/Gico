package org.techtown.gico.study.unit1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import org.techtown.gico.R;
import org.techtown.gico.SmallUnitAdapter;
import org.techtown.gico.Template_study;

public class FragmentContent1 extends Fragment {

    ImageButton homeButton1, forwardButton1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_content1, container, false);

        homeButton1 = rootView.findViewById(R.id.homeButton1);
        forwardButton1 = rootView.findViewById(R.id.forwardButton1);

        homeButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Template_study template_study = new Template_study();
                transaction.replace(R.id.container, template_study);
                transaction.commit();
            }
        });

        forwardButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 1-2단원 페이지로 전환(content1)
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                FragmentContent2 fragmentContent2 = new FragmentContent2();
                transaction.replace(R.id.container, fragmentContent2);
                transaction.commit();
            }
        });

        return rootView;
    }
}