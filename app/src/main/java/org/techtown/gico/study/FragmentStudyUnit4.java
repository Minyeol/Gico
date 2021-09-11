package org.techtown.gico.study;

import android.media.Image;
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
import org.techtown.gico.study.unit1.FragmentContent1;
import org.techtown.gico.study.unit1.FragmentContent2;
import org.techtown.gico.study.unit1.FragmentContent3;
import org.techtown.gico.study.unit4.FragmentContent4_1;
import org.techtown.gico.study.unit4.FragmentContent4_2;
import org.techtown.gico.study.unit4.FragmentContent4_3;
import org.techtown.gico.study.unit4.FragmentContent4_4;
import org.techtown.gico.study.unit4.FragmentContent4_5;
import org.techtown.gico.study.unit4.FragmentContent4_6;

public class FragmentStudyUnit4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageButton homeButton4;

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit4, container, false);

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

        adapter.addItem(new SmallUnit("4-1.", "리눅스란?"));
        adapter.addItem(new SmallUnit("4-2.", "디렉토리 이동 관련 명령어"));
        adapter.addItem(new SmallUnit("4-3.", "디렉토리 생성 및 삭제 관련 명령어"));
        adapter.addItem(new SmallUnit("4-4.", "파일 관련 명령어"));
        adapter.addItem(new SmallUnit("4-5.", "참고사항"));
        adapter.addItem(new SmallUnit("4-6", "명령어 정리"));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 4-1단원 페이지로 전환(content4_1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent4_1 fragmentContent4_1 = new FragmentContent4_1();
                    transaction.replace(R.id.container, fragmentContent4_1);
                    transaction.commit();
                }
                else if (position == 1) {
                    // 4-2단원 페이지로 전환(content4_2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent4_2 fragmentContent4_2 = new FragmentContent4_2();
                    transaction.replace(R.id.container, fragmentContent4_2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 4-3단원 페이지로 전환(content4_3)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent4_3 fragmentContent4_3 = new FragmentContent4_3();
                    transaction.replace(R.id.container, fragmentContent4_3);
                    transaction.commit();
                }
                else if (position == 3) {
                    // 4-4단원 페이지로 전환(content4_4)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent4_4 fragmentContent4_4 = new FragmentContent4_4();
                    transaction.replace(R.id.container, fragmentContent4_4);
                    transaction.commit();
                }
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
            }
        });

        return rootView;
    }
}