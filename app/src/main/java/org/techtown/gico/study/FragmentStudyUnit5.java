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
import org.techtown.gico.study.unit5.FragmentContent5_1;
import org.techtown.gico.study.unit5.FragmentContent5_2;
import org.techtown.gico.study.unit5.FragmentContent5_3;
import org.techtown.gico.study.unit5.FragmentContent5_4;
import org.techtown.gico.study.unit6.FragmentContent6_1;
import org.techtown.gico.study.unit6.FragmentContent6_2;
import org.techtown.gico.study.unit6.FragmentContent6_3;
import org.techtown.gico.study.unit6.FragmentContent6_4;

public class FragmentStudyUnit5 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageButton homeButton4;
        UnitTemplate unitTemplate;
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit6, container, false);
        unitTemplate = rootView.findViewById(R.id.unitTemplate6);
        unitTemplate.setImage(R.drawable.function_icon);
        unitTemplate.setUnit("5. 함수");
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

        adapter.addItem(new SmallUnit("5-1.", "함수의 기초"));
        adapter.addItem(new SmallUnit("5-2.", "함수에서 return 사용하기"));
        adapter.addItem(new SmallUnit("5-3.", "지역 변수와 전역 변수 이해하기"));
        adapter.addItem(new SmallUnit("5-4.", "기억 영역 지시자 이해하기"));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 6-1단원 페이지로 전환(content4_1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent5_1 fragmentContent5_1 = new FragmentContent5_1();
                    transaction.replace(R.id.container, fragmentContent5_1);
                    transaction.commit();
                }
                else if (position == 1) {
                    // 6-2단원 페이지로 전환(content4_2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent5_2 fragmentContent5_2 = new FragmentContent5_2();
                    transaction.replace(R.id.container, fragmentContent5_2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 6-3단원 페이지로 전환(content4_3)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent5_3 fragmentContent5_3 = new FragmentContent5_3();
                    transaction.replace(R.id.container, fragmentContent5_3);
                    transaction.commit();
                }
                else if (position == 3) {
                    // 6-4단원 페이지로 전환(content4_4)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent5_4 fragmentContent5_4 = new FragmentContent5_4();
                    transaction.replace(R.id.container, fragmentContent5_4);
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