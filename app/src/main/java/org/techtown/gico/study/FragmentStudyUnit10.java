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
import org.techtown.gico.study.unit10.FragmentContent10_1;
import org.techtown.gico.study.unit10.FragmentContent10_2;
import org.techtown.gico.study.unit10.FragmentContent10_3;
import org.techtown.gico.study.unit10.FragmentContent10_4;
import org.techtown.gico.study.unit8.FragmentContent8_1;
import org.techtown.gico.study.unit8.FragmentContent8_2;
import org.techtown.gico.study.unit8.FragmentContent8_3;
import org.techtown.gico.study.unit8.FragmentContent8_4;

public class FragmentStudyUnit10 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageButton homeButton10;
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit10, container, false);
        UnitTemplate unitTemplate;
        RecyclerView smallRecyclerView10 = rootView.findViewById(R.id.smallRecyclerView10);
        unitTemplate = rootView.findViewById(R.id.unitTemplate10);
        unitTemplate.setUnit("10. 파일입출력");
        unitTemplate.setImage(R.drawable.condition_icon);
        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);

        homeButton10 = rootView.findViewById(R.id.homeButton10);
        homeButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                StudyFragment studyFragment = new StudyFragment();
                transaction.replace(R.id.container, studyFragment);
                transaction.commit();
            }
        });
        smallRecyclerView10.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("10-1.", "서식을 지정하여 파일에 문자열 쓰기"));
        adapter.addItem(new SmallUnit("10-2.", "입력 서식을 지정해서 파일의 문자열을 읽기"));
        adapter.addItem(new SmallUnit("10-3.", "서식없이 파일에 문자열 쓰기"));
        adapter.addItem(new SmallUnit("10-4.", "서식없이 파일에서 문자열 읽기"));

        smallRecyclerView10.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 10-1단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent10_1 fragmentContent10_1 = new FragmentContent10_1();
                    transaction.replace(R.id.container, fragmentContent10_1);
                    transaction.commit();
                } else if (position == 1) {
                    // 10-2단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent10_2 fragmentContent10_2 = new FragmentContent10_2();
                    transaction.replace(R.id.container, fragmentContent10_2);
                    transaction.commit();
                } else if (position == 2) {
                    // 10-3단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent10_3 fragmentContent10_3 = new FragmentContent10_3();
                    transaction.replace(R.id.container, fragmentContent10_3);
                    transaction.commit();
                } else if (position == 3) {
                    // 10-4단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent10_4 fragmentContent10_4 = new FragmentContent10_4();
                    transaction.replace(R.id.container, fragmentContent10_4);
                    transaction.commit();
                }
            }
        });
        return rootView;
    }
}