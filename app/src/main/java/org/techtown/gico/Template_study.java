package org.techtown.gico;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.gico.study.FragmentStudyUnit1;

public class Template_study extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.template_study, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        UnitAdapter adapter = new UnitAdapter();

        adapter.addItem(new Unit("1. 기본 입출력"));
        adapter.addItem(new Unit("2. 조건문"));
        adapter.addItem(new Unit("3. 반복문"));
        adapter.addItem(new Unit("4. 리눅스"));
        adapter.addItem(new Unit("5. 함수"));
        adapter.addItem(new Unit("6. 재귀함수"));
        adapter.addItem(new Unit("7. 포인터"));
        adapter.addItem(new Unit("8. 배열"));
        adapter.addItem(new Unit("9. 구조체"));
        adapter.addItem(new Unit("10. 파일입출력"));
        adapter.addItem(new Unit("11. 정렬"));
        adapter.addItem(new Unit("12. 랜덤"));

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
                else {

                }
                // Toast.makeText(getActivity().getApplicationContext(), "아이템 선택됨: " + item.getUnit(), Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }
}
