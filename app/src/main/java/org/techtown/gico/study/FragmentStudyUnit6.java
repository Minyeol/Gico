package org.techtown.gico.study;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.gico.OnSmallUnitItemClickListener;
import org.techtown.gico.R;
import org.techtown.gico.SmallUnit;
import org.techtown.gico.SmallUnitAdapter;
import org.techtown.gico.StudyFragment;
import org.techtown.gico.study.unit4.FragmentContent4_1;
import org.techtown.gico.study.unit4.FragmentContent4_2;
import org.techtown.gico.study.unit4.FragmentContent4_3;
import org.techtown.gico.study.unit4.FragmentContent4_4;
import org.techtown.gico.study.unit4.FragmentContent4_5;
import org.techtown.gico.study.unit4.FragmentContent4_6;
import org.techtown.gico.study.unit6.FragmentContent6_1;
import org.techtown.gico.study.unit6.FragmentContent6_2;
import org.techtown.gico.study.unit6.FragmentContent6_3;
import org.techtown.gico.study.unit6.FragmentContent6_4;

public class FragmentStudyUnit6 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageButton homeButton4;

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit6, container, false);

        homeButton4 = rootView.findViewById(R.id.homeButton4);
        homeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });
        RecyclerView smallRecyclerView1 = rootView.findViewById(R.id.smallRecyclerView4);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        smallRecyclerView1.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("6-1.", "재귀함수의 기초"));
        adapter.addItem(new SmallUnit("6-2.", "피보나치 수열"));
        adapter.addItem(new SmallUnit("6-3.", "재귀함수 vs 반복문"));
        adapter.addItem(new SmallUnit("6-4.", "각 자릿수의 합 재귀함수로 구하기"));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 6-1단원 페이지로 전환(content4_1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent6_1 fragmentContent6_1 = new FragmentContent6_1();
                    transaction.replace(R.id.container, fragmentContent6_1);
                    transaction.commit();
                }
                else if (position == 1) {
                    // 6-2단원 페이지로 전환(content4_2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent6_2 fragmentContent6_2 = new FragmentContent6_2();
                    transaction.replace(R.id.container, fragmentContent6_2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 6-3단원 페이지로 전환(content4_3)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent6_3 fragmentContent6_3 = new FragmentContent6_3();
                    transaction.replace(R.id.container, fragmentContent6_3);
                    transaction.commit();
                }
                else if (position == 3) {
                    // 6-4단원 페이지로 전환(content4_4)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent6_4 fragmentContent6_4 = new FragmentContent6_4();
                    transaction.replace(R.id.container, fragmentContent6_4);
                    transaction.commit();
                } /*
                else if (position == 4) {
                    // 4-5단원 페이지로 전환(content4_5)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent4_5 fragmentContent4_5 = new FragmentContent4_5();
                    transaction.replace(R.id.container, fragmentContent4_5);
                    transaction.commit();
                }
                else if (position == 5) {
                    // 4-6단원 페이지로 전환(content4_6)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent4_6 fragmentContent4_6 = new FragmentContent4_6();
                    transaction.replace(R.id.container, fragmentContent4_6);
                    transaction.commit();
                }

                 */
            }
        });

        return rootView;
    }
}