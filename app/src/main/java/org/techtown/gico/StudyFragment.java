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

import org.techtown.gico.study.FragmentStudyUnit1;
import org.techtown.gico.study.FragmentStudyUnit10;
import org.techtown.gico.study.FragmentStudyUnit11;
import org.techtown.gico.study.FragmentStudyUnit12;
import org.techtown.gico.study.FragmentStudyUnit2;
import org.techtown.gico.study.FragmentStudyUnit3;
import org.techtown.gico.study.FragmentStudyUnit4;
import org.techtown.gico.study.FragmentStudyUnit5;
import org.techtown.gico.study.FragmentStudyUnit6;
import org.techtown.gico.study.FragmentStudyUnit8;

public class StudyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        UnitAdapter adapter = new UnitAdapter();

        adapter.addItem(new Unit("1. 기본 입출력", R.drawable.input_output_icon));
        adapter.addItem(new Unit("2. 조건문", R.drawable.condition_icon));
        adapter.addItem(new Unit("3. 반복문", R.drawable.loop_icon));
        adapter.addItem(new Unit("4. 리눅스", R.drawable.linux_icon));
        adapter.addItem(new Unit("5. 함수", R.drawable.function_icon));
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
                    FragmentStudyUnit1 fragmentStudyUnit1 = new FragmentStudyUnit1();
                    transaction.replace(R.id.container, fragmentStudyUnit1);
                    transaction.commit();
                }
                if (position == 1) {
                    // 2단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentStudyUnit2 fragmentStudyUnit2 = new FragmentStudyUnit2();
                    transaction.replace(R.id.container, fragmentStudyUnit2);
                    transaction.commit();
                }
                if (position == 2) {
                    // 3단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentStudyUnit3 fragmentStudyUnit3 = new FragmentStudyUnit3();
                    transaction.replace(R.id.container, fragmentStudyUnit3);
                    transaction.commit();
                }
                if (position == 3) {
                    // 4단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentStudyUnit4 fragmentStudyUnit4 = new FragmentStudyUnit4();
                    transaction.replace(R.id.container, fragmentStudyUnit4);
                    transaction.commit();
                }
                if (position == 4) {
                    // 5단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentStudyUnit5 fragmentStudyUnit5 = new FragmentStudyUnit5();
                    transaction.replace(R.id.container, fragmentStudyUnit5);
                    transaction.commit();
                }
                if (position == 5) {
                    // 6단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentStudyUnit6 fragmentStudyUnit6 = new FragmentStudyUnit6();
                    transaction.replace(R.id.container, fragmentStudyUnit6);
                    transaction.commit();
                }
                if (position == 7) {
                    // 8단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentStudyUnit8 fragmentStudyUnit8 = new FragmentStudyUnit8();
                    transaction.replace(R.id.container, fragmentStudyUnit8);
                    transaction.commit();
                }
                if (position == 9) {
                    // 10단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentStudyUnit10 fragmentStudyUnit10 = new FragmentStudyUnit10();
                    transaction.replace(R.id.container, fragmentStudyUnit10);
                    transaction.commit();
                }
                if (position == 10) {
                    // 11단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentStudyUnit11 fragmentStudyUnit11 = new FragmentStudyUnit11();
                    transaction.replace(R.id.container, fragmentStudyUnit11);
                    transaction.commit();
                }
                if (position == 11) {
                    // 12단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentStudyUnit12 fragmentStudyUnit12 = new FragmentStudyUnit12();
                    transaction.replace(R.id.container, fragmentStudyUnit12);
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
