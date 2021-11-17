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
import org.techtown.gico.study.unit7.FragmentContent7_1;
import org.techtown.gico.study.unit7.FragmentContent7_2;
import org.techtown.gico.study.unit7.FragmentContent7_3;

public class FragmentStudyUnit7 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit7, container, false);

        RecyclerView smallRecyclerView7 = rootView.findViewById(R.id.smallRecyclerView7);
        UnitTemplate unitTemplate;
        unitTemplate = rootView.findViewById(R.id.unitTemplate7);
        unitTemplate.setUnit("7. 포인터");
        unitTemplate.setImage(R.drawable.pointer_icon);
        ImageButton homeButton7;
        homeButton7 = rootView.findViewById(R.id.homeButton7);
        homeButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });
        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        smallRecyclerView7.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("7-1.", "포인터란?"));
        adapter.addItem(new SmallUnit("7-2.", "포인터를 이용한 swap"));
        adapter.addItem(new SmallUnit("7-3.", "메모리 할당"));

        smallRecyclerView7.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 1-1단원 페이지로 전환(content1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent7_1 fragmentContent7_1 = new FragmentContent7_1();
                    transaction.replace(R.id.container, fragmentContent7_1);
                    transaction.commit();
                }
                else if (position == 1) {
                    // 1-2단원 페이지로 전환(content2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent7_2 fragmentContent7_2 = new FragmentContent7_2();
                    transaction.replace(R.id.container, fragmentContent7_2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 1-3단원 페이지로 전환(content3)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent7_3 fragmentContent7_3 = new FragmentContent7_3();
                    transaction.replace(R.id.container, fragmentContent7_3);
                    transaction.commit();
                }
            }
        });

        return rootView;
    }
}