package org.techtown.gico;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.gico.problems.unit12.FragmentProblemsContent12_1;
import org.w3c.dom.Text;

public class SettingsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_settings, container, false);

        RecyclerView smallRecyclerView1 = rootView.findViewById(R.id.smallRecyclerView12);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        smallRecyclerView1.setLayoutManager(layoutManager);
        SmallUnitAdapter adapter = new SmallUnitAdapter();

        adapter.addItem(new SmallUnit("", "텍스트 크기 조절"));

        smallRecyclerView1.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSmallUnitItemClickListener() {
            @Override
            public void onItemClick(SmallUnitAdapter.ViewHolder holder, View view, int position) {
                SmallUnit item = adapter.getItem(position);
                if (position == 0) {
                    //텍스트 크기 조절 페이지로 전환
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    TextSizeSetting textSizeSetting = new TextSizeSetting();
                    transaction.replace(R.id.container, textSizeSetting);
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
