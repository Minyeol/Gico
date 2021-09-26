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

import org.techtown.gico.problems.FragmentProblemsUnit3;
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
                if (position == 2) {
                    // 3단원 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentProblemsUnit3 fragmentProblemsUnit3 = new FragmentProblemsUnit3();
                    transaction.replace(R.id.container, fragmentProblemsUnit3);
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
