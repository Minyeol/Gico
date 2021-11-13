package org.techtown.gico.problems;

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
import org.techtown.gico.ProblemsFragment;
import org.techtown.gico.R;
import org.techtown.gico.SmallUnit;
import org.techtown.gico.SmallUnitAdapter;
import org.techtown.gico.UnitTemplate;
import org.techtown.gico.problems.unit3.FragmentProblemsContent3_1;
import org.techtown.gico.problems.unit3.FragmentProblemsContent3_2;
import org.techtown.gico.problems.unit4.FragmentProblemsContent4_1;
import org.techtown.gico.study.unit3.FragmentContent3_3;
import org.techtown.gico.study.unit3.FragmentContent3_4;
import org.techtown.gico.study.unit3.FragmentContent3_5;
import org.techtown.gico.study.unit3.FragmentContent3_6;
import org.techtown.gico.study.unit3.FragmentContent3_7;

public class FragmentProblemsUnit4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageButton homeButton4;
        UnitTemplate unitTemplate;
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problems_unit4, container, false);
        unitTemplate = rootView.findViewById(R.id.unitTemplate_problems4);
        unitTemplate.setImage(R.drawable.linux_icon);
        unitTemplate.setUnit("4. 리눅스");
        homeButton4 = rootView.findViewById(R.id.homeButton4);
        homeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                ProblemsFragment problemsFragment = new ProblemsFragment();
                transaction.replace(R.id.container, problemsFragment);
                transaction.commit();
            }
        });
        RecyclerView smallRecyclerView1 = rootView.findViewById(R.id.smallRecyclerView4);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        smallRecyclerView1.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("4-1.", "다이아몬드 출력하기(리눅스)"));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);

                if (position == 0) {
                    // 4-1단원 페이지로 전환(content4_1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsContent4_1 fragmentProblemsContent4_1 = new FragmentProblemsContent4_1();
                    transaction.replace(R.id.container, fragmentProblemsContent4_1);
                    transaction.commit();
                }
                /*
                else if (position == 1) {
                    // 3-2단원 페이지로 전환(content4_2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsContent3_2 fragmentProblemsContent3_2 = new FragmentProblemsContent3_2();
                    transaction.replace(R.id.container, fragmentProblemsContent3_2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 3-3단원 페이지로 전환(content4_3)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent3_3 fragmentContent3_3 = new FragmentContent3_3();
                    transaction.replace(R.id.container, fragmentContent3_3);
                    transaction.commit();
                }
                else if (position == 3) {
                    // 3-4단원 페이지로 전환(content4_4)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent3_4 fragmentContent3_4 = new FragmentContent3_4();
                    transaction.replace(R.id.container, fragmentContent3_4);
                    transaction.commit();
                }
                else if (position == 4) {
                    // 3-5단원 페이지로 전환(content4_5)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent3_5 fragmentContent3_5 = new FragmentContent3_5();
                    transaction.replace(R.id.container, fragmentContent3_5);
                    transaction.commit();
                }
                else if (position == 5) {
                    // 3-6단원 페이지로 전환(content4_6)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent3_6 fragmentContent3_6 = new FragmentContent3_6();
                    transaction.replace(R.id.container, fragmentContent3_6);
                    transaction.commit();
                }
                else if (position == 6) {
                    // 3-7단원 페이지로 전환(content4_6)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent3_7 fragmentContent3_7 = new FragmentContent3_7();
                    transaction.replace(R.id.container, fragmentContent3_7);
                    transaction.commit();
                }
*/
            }
        });

        return rootView;
    }
}