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
import org.techtown.gico.problems.unit6.FragmentProblemsContent6_1;
import org.techtown.gico.problems.unit6.FragmentProblemsContent6_2;
import org.techtown.gico.problems.unit6.FragmentProblemsContent6_3;
import org.techtown.gico.problems.unit6.FragmentProblemsContent6_4;
import org.techtown.gico.problems.unit6.FragmentProblemsContent6_5;
import org.techtown.gico.problems.unit6.FragmentProblemsContent6_6;
import org.techtown.gico.study.unit3.FragmentContent3_3;
import org.techtown.gico.study.unit3.FragmentContent3_4;
import org.techtown.gico.study.unit3.FragmentContent3_5;
import org.techtown.gico.study.unit3.FragmentContent3_6;

public class FragmentProblemsUnit6 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageButton homeButton4;
        UnitTemplate unitTemplate;
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problems_unit6, container, false);
        unitTemplate = rootView.findViewById(R.id.unitTemplate_problems3);
        unitTemplate.setImage(R.drawable.recur_icon);
        unitTemplate.setUnit("6. 재귀함수");
        homeButton4 = rootView.findViewById(R.id.homeButton3);
        homeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                ProblemsFragment problemsFragment = new ProblemsFragment();
                transaction.replace(R.id.container, problemsFragment);
                transaction.commit();
            }
        });
        RecyclerView smallRecyclerView1 = rootView.findViewById(R.id.smallRecyclerView3);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        smallRecyclerView1.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("6-1.", "N-승빈수열"));
        adapter.addItem(new SmallUnit("6-2.", "경로 찾기 1"));
        adapter.addItem(new SmallUnit("6-3.", "철환 다항식"));
        adapter.addItem(new SmallUnit("6-4.", "태보"));
        adapter.addItem(new SmallUnit("6-5.", "이진 탐색으로 2의 제곱근 구하기"));
        adapter.addItem(new SmallUnit("6-6.", "이진수 게임"));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 3-1단원 페이지로 전환(content4_1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsContent6_1 fragmentProblemsContent6_1 = new FragmentProblemsContent6_1();
                    transaction.replace(R.id.container, fragmentProblemsContent6_1);
                    transaction.commit();
                }
                else if (position == 1) {
                    // 3-2단원 페이지로 전환(content4_2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsContent6_2 fragmentProblemsContent6_2 = new FragmentProblemsContent6_2();
                    transaction.replace(R.id.container, fragmentProblemsContent6_2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 3-3단원 페이지로 전환(content4_3)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsContent6_3 fragmentProblemsContent6_3 = new FragmentProblemsContent6_3();
                    transaction.replace(R.id.container, fragmentProblemsContent6_3);
                    transaction.commit();
                }
                else if (position == 3) {
                    // 3-4단원 페이지로 전환(content4_4)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsContent6_4 fragmentProblemsContent6_4 = new FragmentProblemsContent6_4();
                    transaction.replace(R.id.container, fragmentProblemsContent6_4);
                    transaction.commit();
                }
                else if (position == 4) {
                    // 3-5단원 페이지로 전환(content4_5)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsContent6_5 fragmentProblemsContent6_5 = new FragmentProblemsContent6_5();
                    transaction.replace(R.id.container, fragmentProblemsContent6_5);
                    transaction.commit();
                }
                else if (position == 5) {
                    // 3-6단원 페이지로 전환(content4_6)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsContent6_6 fragmentProblemsContent6_6 = new FragmentProblemsContent6_6();
                    transaction.replace(R.id.container, fragmentProblemsContent6_6);
                    transaction.commit();
                }
                /*
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