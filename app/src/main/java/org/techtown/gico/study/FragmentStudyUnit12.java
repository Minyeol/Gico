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
import org.techtown.gico.UnitTemplate;
import org.techtown.gico.study.unit12.FragmentContent12_1;
import org.techtown.gico.study.unit12.FragmentContent12_2;
import org.techtown.gico.study.unit12.FragmentContent12_3;
import org.techtown.gico.study.unit12.FragmentContent12_4;
import org.techtown.gico.study.unit3.FragmentContent3_1;
import org.techtown.gico.study.unit3.FragmentContent3_2;
import org.techtown.gico.study.unit3.FragmentContent3_3;
import org.techtown.gico.study.unit3.FragmentContent3_4;
import org.techtown.gico.study.unit3.FragmentContent3_5;
import org.techtown.gico.study.unit3.FragmentContent3_6;
import org.techtown.gico.study.unit3.FragmentContent3_7;

public class FragmentStudyUnit12 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageButton homeButton4;
        UnitTemplate unitTemplate;
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit3, container, false);
        unitTemplate = rootView.findViewById(R.id.unitTemplate3);
        unitTemplate.setImage(R.drawable.loop_icon);
        unitTemplate.setUnit("12. 랜덤");
        homeButton4 = rootView.findViewById(R.id.homeButton3);
        homeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });
        RecyclerView smallRecyclerView1 = rootView.findViewById(R.id.smallRecyclerView3);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        smallRecyclerView1.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("12-1.", "랜덤함수란?"));
        adapter.addItem(new SmallUnit("12-2.", "rand와 srand 함수"));
        adapter.addItem(new SmallUnit("12-3.", "time 함수"));
        adapter.addItem(new SmallUnit("12-4.", "랜덤함수의 활용"));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 12-1단원 페이지로 전환(content12_1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent12_1 fragmentContent12_1 = new FragmentContent12_1();
                    transaction.replace(R.id.container, fragmentContent12_1);
                    transaction.commit();
                }
                else if (position == 1) {
                    // 12-2단원 페이지로 전환(content12_2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent12_2 fragmentContent12_2 = new FragmentContent12_2();
                    transaction.replace(R.id.container, fragmentContent12_2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 12-3단원 페이지로 전환(content12_3)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent12_3 fragmentContent12_3 = new FragmentContent12_3();
                    transaction.replace(R.id.container, fragmentContent12_3);
                    transaction.commit();
                }
                else if (position == 3) {
                    // 12-4단원 페이지로 전환(content12_4)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent12_4 fragmentContent12_4 = new FragmentContent12_4();
                    transaction.replace(R.id.container, fragmentContent12_4);
                    transaction.commit();
                }
            }
        });

        return rootView;
    }
}