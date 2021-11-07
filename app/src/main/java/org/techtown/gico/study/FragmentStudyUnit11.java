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
import org.techtown.gico.study.unit11.FragmentContent11_1;
import org.techtown.gico.study.unit11.FragmentContent11_2;
import org.techtown.gico.study.unit11.FragmentContent11_3;
import org.techtown.gico.study.unit11.FragmentContent11_4;
import org.techtown.gico.study.unit11.FragmentContent11_5;
import org.techtown.gico.study.unit4.FragmentContent4_5;
import org.techtown.gico.study.unit4.FragmentContent4_6;
import org.techtown.gico.study.unit6.FragmentContent6_1;
import org.techtown.gico.study.unit6.FragmentContent6_2;
import org.techtown.gico.study.unit6.FragmentContent6_3;
import org.techtown.gico.study.unit6.FragmentContent6_4;

public class FragmentStudyUnit11 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageButton homeButton4;
        UnitTemplate unitTemplate;
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_unit11, container, false);
        unitTemplate = rootView.findViewById(R.id.unitTemplate6);
        unitTemplate.setImage(R.drawable.sort_icon);
        unitTemplate.setUnit("11. 정렬");
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

        adapter.addItem(new SmallUnit("11-1.", "버블 정렬"));
        adapter.addItem(new SmallUnit("11-2.", "시간복잡도와 Big-O 표기법"));
        adapter.addItem(new SmallUnit("11-3.", "선택 정렬"));
        adapter.addItem(new SmallUnit("11-4.", "삽입 정렬"));
        adapter.addItem(new SmallUnit("11-5.", "병합 정렬"));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    // 11-1단원 페이지로 전환(content4_1)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent11_1 fragmentContent11_1 = new FragmentContent11_1();
                    transaction.replace(R.id.container, fragmentContent11_1);
                    transaction.commit();
                }
                else if (position == 1) {
                    // 11-2단원 페이지로 전환(content4_2)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent11_2 fragmentContent11_2 = new FragmentContent11_2();
                    transaction.replace(R.id.container, fragmentContent11_2);
                    transaction.commit();
                }
                else if (position == 2) {
                    // 11-3단원 페이지로 전환(content4_3)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent11_3 fragmentContent11_3 = new FragmentContent11_3();
                    transaction.replace(R.id.container, fragmentContent11_3);
                    transaction.commit();
                }
                else if (position == 3) {
                    // 11-4단원 페이지로 전환(content4_4)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent11_4 fragmentContent11_4 = new FragmentContent11_4();
                    transaction.replace(R.id.container, fragmentContent11_4);
                    transaction.commit();
                }
                else if (position == 4) {
                    // 11-5단원 페이지로 전환(content4_5)
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentContent11_5 fragmentContent11_5 = new FragmentContent11_5();
                    transaction.replace(R.id.container, fragmentContent11_5);
                    transaction.commit();
                }
                /*
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