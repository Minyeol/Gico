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
import org.techtown.gico.study.unit2.FragmentContent2_1;
import org.techtown.gico.study.unit2.FragmentContent2_2;
import org.techtown.gico.study.unit2.FragmentContent2_3;
import org.techtown.gico.study.unit2.FragmentContent2_4;
import org.techtown.gico.study.unit8.FragmentContent8_1;
import org.techtown.gico.study.unit8.FragmentContent8_2;
import org.techtown.gico.study.unit8.FragmentContent8_3;
import org.techtown.gico.study.unit8.FragmentContent8_4;

public class FragmentStudyUnit8 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit8, container, false);
        UnitTemplate unitTemplate;
        RecyclerView smallRecyclerView8 = rootView.findViewById(R.id.smallRecyclerView8);
        unitTemplate = rootView.findViewById(R.id.unitTemplate8);
        unitTemplate.setUnit("8. 배열");
        unitTemplate.setImage(R.drawable.condition_icon);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        smallRecyclerView8.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("8-1.", "1차원 배열"));
        adapter.addItem(new SmallUnit("8-2.", "배열을 포인터에 넣기"));
        adapter.addItem(new SmallUnit("8-3.", "2차원 배열 사용하기"));
        adapter.addItem(new SmallUnit("8-4.", "2차원 배열을 포인터에 넣기"));

        smallRecyclerView8.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 8-1단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent8_1 fragmentContent8_1 = new FragmentContent8_1();
                    transaction.replace(R.id.container, fragmentContent8_1);
                    transaction.commit();
                } else if (position == 1) {
                    // 8-2단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent8_2 fragmentContent8_2 = new FragmentContent8_2();
                    transaction.replace(R.id.container, fragmentContent8_2);
                    transaction.commit();
                } else if (position == 2) {
                    // 8-3단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent8_3 fragmentContent8_3 = new FragmentContent8_3();
                    transaction.replace(R.id.container, fragmentContent8_3);
                    transaction.commit();
                } else if (position == 3) {
                    // 8-4단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent8_4 fragmentContent8_4 = new FragmentContent8_4();
                    transaction.replace(R.id.container, fragmentContent8_4);
                    transaction.commit();
                }
            }
        });

        return rootView;
    }
}