package org.techtown.gico.study;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.gico.OnSmallUnitItemClickListener;
import org.techtown.gico.R;
import org.techtown.gico.SmallUnit;
import org.techtown.gico.SmallUnitAdapter;
import org.techtown.gico.study.unit9.FragmentContent9_1;
import org.techtown.gico.study.unit9.FragmentContent9_2;

public class FragmentStudyUnit9 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit9, container, false);

        RecyclerView smallRecyclerView1 = rootView.findViewById(R.id.smallRecyclerView9);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        smallRecyclerView1.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("9-1.", "구조체란?"));
        adapter.addItem(new SmallUnit("9-2.", "구조체의 활용"));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 9-1단원 페이지로 전환(content1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent9_1 fragmentContent9_1 = new FragmentContent9_1();
                    transaction.replace(R.id.container, fragmentContent9_1);
                    transaction.commit();
                }

                else if (position == 1) {
                    // 9-2단원 페이지로 전환(content2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent9_2 fragmentContent9_2 = new FragmentContent9_2();
                    transaction.replace(R.id.container, fragmentContent9_2);
                    transaction.commit();
                }
            }
        });

        return rootView;
    }
}