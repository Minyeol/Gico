package org.techtown.gico.study;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import org.techtown.gico.OnSmallUnitItemClickListener;
import org.techtown.gico.R;
import org.techtown.gico.SmallUnit;
import org.techtown.gico.SmallUnitAdapter;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.UnitTemplate;
import org.techtown.gico.study.unit2.FragmentContent2_1;
import org.techtown.gico.study.unit2.FragmentContent2_2;
import org.techtown.gico.study.unit2.FragmentContent2_3;
import org.techtown.gico.study.unit2.FragmentContent2_4;

public class FragmentStudyUnit2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageButton homeButton2;
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit2, container, false);
        UnitTemplate unitTemplate;
        RecyclerView smallRecyclerView2 = rootView.findViewById(R.id.smallRecyclerView2);
        unitTemplate = rootView.findViewById(R.id.unitTemplate2);
        unitTemplate.setUnit("2. 조건문");
        unitTemplate.setImage(R.drawable.condition_icon);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        homeButton2 = rootView.findViewById(R.id.homeButton2);
        homeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });

        smallRecyclerView2.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("2-1.", "if 조건문"));
        adapter.addItem(new SmallUnit("2-2.", "else 문"));
        adapter.addItem(new SmallUnit("2-3.", "else if 문"));
        adapter.addItem(new SmallUnit("2-4.", "switch case 문"));

        smallRecyclerView2.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 2-1단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent2_1 fragmentContent2_1 = new FragmentContent2_1();
                    transaction.replace(R.id.container, fragmentContent2_1);
                    transaction.commit();
                }
                else if (position == 1) {
                    // 2-2단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent2_2 fragmentContent2_2 = new FragmentContent2_2();
                    transaction.replace(R.id.container, fragmentContent2_2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 2-3단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent2_3 fragmentContent2_3 = new FragmentContent2_3();
                    transaction.replace(R.id.container, fragmentContent2_3);
                    transaction.commit();
                }
                else if (position == 3) {
                    // 2-4단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent2_4 fragmentContent2_4 = new FragmentContent2_4();
                    transaction.replace(R.id.container, fragmentContent2_4);
                    transaction.commit();
                }
            }
        });

        return rootView;
    }
}