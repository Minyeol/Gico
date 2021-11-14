package org.techtown.gico.study;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.techtown.gico.OnSmallUnitItemClickListener;
import org.techtown.gico.R;
import org.techtown.gico.SmallUnit;
import org.techtown.gico.SmallUnitAdapter;
import org.techtown.gico.UnitTemplate;
import org.techtown.gico.study.unit1.FragmentContent1_1;
import org.techtown.gico.study.unit1.FragmentContent1_2;
import org.techtown.gico.study.unit1.FragmentContent1_3;

public class FragmentStudyUnit1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit1, container, false);

        UnitTemplate unitTemplate;
        RecyclerView smallRecyclerView1 = rootView.findViewById(R.id.smallRecyclerView1);
        unitTemplate = rootView.findViewById(R.id.unitTemplate1);
        unitTemplate.setUnit("1. 기본 입출력");
        unitTemplate.setImage(R.drawable.condition_icon);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        smallRecyclerView1.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("1-1.", "표준 입출력"));
        adapter.addItem(new SmallUnit("1-2.", "기본 자료형"));
        adapter.addItem(new SmallUnit("1-3.", "기본 입출력"));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 1-1단원 페이지로 전환(content1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent1_1 fragmentContent1_1 = new FragmentContent1_1();
                    transaction.replace(R.id.container, fragmentContent1_1);
                    transaction.commit();
                }
                else if (position == 1) {
                    // 1-2단원 페이지로 전환(content2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent1_2 fragmentContent1_2 = new FragmentContent1_2();
                    transaction.replace(R.id.container, fragmentContent1_2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 1-3단원 페이지로 전환(content3)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent1_3 fragmentContent1_3 = new FragmentContent1_3();
                    transaction.replace(R.id.container, fragmentContent1_3);
                    transaction.commit();
                }
            }
        });

        return rootView;
    }
}