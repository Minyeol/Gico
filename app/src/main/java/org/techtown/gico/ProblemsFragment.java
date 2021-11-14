package org.techtown.gico;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.gico.problems.FragmentProblemsUnit1;
import org.techtown.gico.problems.FragmentProblemsUnit10;
import org.techtown.gico.problems.FragmentProblemsUnit11;
import org.techtown.gico.problems.FragmentProblemsUnit12;
import org.techtown.gico.problems.FragmentProblemsUnit2;
import org.techtown.gico.problems.FragmentProblemsUnit3;
import org.techtown.gico.problems.FragmentProblemsUnit4;
import org.techtown.gico.problems.FragmentProblemsUnit5;
import org.techtown.gico.problems.FragmentProblemsUnit6;
import org.techtown.gico.problems.FragmentProblemsUnit7;
import org.techtown.gico.problems.FragmentProblemsUnit8;
import org.techtown.gico.problems.FragmentProblemsUnit9;
import org.techtown.gico.study.FragmentStudyUnit1;
import org.techtown.gico.study.FragmentStudyUnit3;
import org.techtown.gico.study.FragmentStudyUnit4;
import org.techtown.gico.study.FragmentStudyUnit6;

public class ProblemsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problems, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        UnitAdapter adapter = new UnitAdapter();

        adapter.addItem(new Unit("1. 기본 입출력", R.drawable.input_output_icon));
        adapter.addItem(new Unit("2. 조건문", R.drawable.condition_icon));
        adapter.addItem(new Unit("3. 반복문", R.drawable.loop_icon));
        adapter.addItem(new Unit("4. 리눅스", R.drawable.linux_icon));
        adapter.addItem(new Unit("5. 함수",R.drawable.function_icon));
        adapter.addItem(new Unit("6. 재귀함수", R.drawable.recur_icon));
        adapter.addItem(new Unit("7. 포인터", R.drawable.pointer_icon));
        adapter.addItem(new Unit("8. 배열", R.drawable.array_icon));
        adapter.addItem(new Unit("9. 구조체", R.drawable.struct_icon));
        adapter.addItem(new Unit("10. 파일입출력", R.drawable.fileio_icon));
        adapter.addItem(new Unit("11. 정렬", R.drawable.sort_icon));
        adapter.addItem(new Unit("12. 랜덤", R.drawable.random_icon));
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnUnitItemClickListener() {
            @Override
            public void onItemClick(UnitAdapter.ViewHolder holder, View view, int position) {
                Unit item = adapter.getItem(position);
                if (position == 0) {
                    // 1단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit1 fragmentProblemsUnit1 = new FragmentProblemsUnit1();
                    transaction.replace(R.id.container, fragmentProblemsUnit1);
                    transaction.commit();
                }
                if (position == 1) {
                    // 2단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit2 fragmentProblemsUnit2 = new FragmentProblemsUnit2();
                    transaction.replace(R.id.container, fragmentProblemsUnit2);
                    transaction.commit();
                }

                if (position == 2) {
                    // 3단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit3 fragmentProblemsUnit3 = new FragmentProblemsUnit3();
                    transaction.replace(R.id.container, fragmentProblemsUnit3);
                    transaction.commit();
                }
                if (position == 3) {
                    // 4단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit4 fragmentProblemsUnit4 = new FragmentProblemsUnit4();
                    transaction.replace(R.id.container, fragmentProblemsUnit4);
                    transaction.commit();
                }
                if (position == 4) {
                    // 5단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit5 fragmentProblemsUnit5 = new FragmentProblemsUnit5();
                    transaction.replace(R.id.container, fragmentProblemsUnit5);
                    transaction.commit();
                }
                if (position == 5) {
                    // 6단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit6 fragmentProblemsUnit6 = new FragmentProblemsUnit6();
                    transaction.replace(R.id.container, fragmentProblemsUnit6);
                    transaction.commit();
                }
                if (position == 6) {
                    // 7단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit7 fragmentProblemsUnit7 = new FragmentProblemsUnit7();
                    transaction.replace(R.id.container, fragmentProblemsUnit7);
                    transaction.commit();
                }
                if (position == 7) {
                    // 8단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit8 fragmentProblemsUnit8 = new FragmentProblemsUnit8();
                    transaction.replace(R.id.container, fragmentProblemsUnit8);
                    transaction.commit();
                }
                if (position == 8) {
                    // 9단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit9 fragmentProblemsUnit9 = new FragmentProblemsUnit9();
                    transaction.replace(R.id.container, fragmentProblemsUnit9);
                    transaction.commit();
                }
                if (position == 9) {
                    // 10단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit10 fragmentProblemsUnit10 = new FragmentProblemsUnit10();
                    transaction.replace(R.id.container, fragmentProblemsUnit10);
                    transaction.commit();
                }
                if (position == 10) {
                    // 10단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit11 fragmentProblemsUnit11 = new FragmentProblemsUnit11();
                    transaction.replace(R.id.container, fragmentProblemsUnit11);
                    transaction.commit();
                }
                if (position == 11) {
                    // 12단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit12 fragmentProblemsUnit12 = new FragmentProblemsUnit12();
                    transaction.replace(R.id.container, fragmentProblemsUnit12);
                    transaction.commit();
                }
                else {

                }
                // Toast.makeText(getActivity().getApplicationContext(), "아이템 선택됨: " + item.getUnit(), Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }
}
