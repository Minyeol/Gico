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
import org.techtown.gico.study.unit1.FragmentContent1;
import org.techtown.gico.study.unit1.FragmentContent2;
import org.techtown.gico.study.unit1.FragmentContent3;

public class FragmentStudyUnit2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit1, container, false);

        RecyclerView smallRecyclerView1 = rootView.findViewById(R.id.smallRecyclerView1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        smallRecyclerView1.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("2-1.", "if 문"));
        adapter.addItem(new SmallUnit("2-2.", ""));
        adapter.addItem(new SmallUnit("2-3.", ""));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 1-1단원 페이지로 전환(content1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent1 fragmentContent1 = new FragmentContent1();
                    transaction.replace(R.id.container, fragmentContent1);
                    transaction.commit();
                }
                else if (position == 1) {
                    // 1-2단원 페이지로 전환(content2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent2 fragmentContent2 = new FragmentContent2();
                    transaction.replace(R.id.container, fragmentContent2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 1-3단원 페이지로 전환(content3)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent3 fragmentContent3 = new FragmentContent3();
                    transaction.replace(R.id.container, fragmentContent3);
                    transaction.commit();
                }
            }
        });

        return rootView;
    }
}