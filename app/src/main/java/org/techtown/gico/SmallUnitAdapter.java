package org.techtown.gico;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SmallUnitAdapter extends RecyclerView.Adapter<SmallUnitAdapter.ViewHolder>
        implements OnSmallUnitItemClickListener {
    // SmallUnit 객체를 담는 ArrayList 자료형의 items 변수 만듦
    ArrayList<SmallUnit> items = new ArrayList<SmallUnit>();
    OnSmallUnitItemClickListener listener;

    @NonNull
    @Override
    // 뷰홀더 객체가 만들어질 때 자동 호출
    // template_small_unit.xml 을 이용해 뷰 객체를 만들고 이를 새로운 뷰홀더 객체에 담아 반환
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        // 인플레이션을 통해 뷰 객체 만듦
        View itemView = inflater.inflate(R.layout.template_small_unit, viewGroup, false);
        // 뷰홀더 객체를 생성하며 뷰 객체(itemView)를 전달하고, 뷰홀더 객체 반환
        return new ViewHolder(itemView, (OnSmallUnitItemClickListener) this);
    }

    @Override
    // 뷰홀더 객체가 재사용될 때 자동으로 호출
    // (메모리 절약을 위해 사용자가 스크롤하여 보이지 않게 된 뷰 객체를 새로 보이는 쪽에 재사용)
    public void onBindViewHolder(@NonNull SmallUnitAdapter.ViewHolder holder, int position) {
        SmallUnit item = items.get(position);
        holder.setItem(item);
    }


    @Override
    // recyclerView에서 어댑터가 관리하는 아이템의 개수를 반환
    public int getItemCount() {
        return items.size();
    }

    // arrayList에 객체 추가
    public void addItem(SmallUnit item) {
        items.add(item);
    }

    // arrayList 전체를 설정
    public void setItems(ArrayList<SmallUnit> items) {
        this.items = items;
    }

    // arrayList에서 position 위치에 있는 객체를 반환
    public SmallUnit getItem(int position) {
        return items.get(position);
    }

    // 특정 위치의 객체 설정
    public void setItem(int position, SmallUnit item) {
        items.set(position, item);
    }

    // 어댑터 클래스 밖에서 listener 객체를 변수에 할당
    // onItemClick 함수가 호출되었을 때 다시 외부에서 설정된 함수가 호출되도록 만들 수 있다.
    public void setOnItemClickListener(OnSmallUnitItemClickListener listener) {
        this.listener = listener;
    }

    // 뷰홀더 클래스 안에서 뷰가 클릭되었을 때 호출
    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if (listener != null) {
            listener.onItemClick(holder, view, position);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        TextView textView2;



        public ViewHolder(View itemView, OnSmallUnitItemClickListener onSmallUnitItemClickListener) {
            super(itemView);

            textView = itemView.findViewById(R.id.smallUnitNumber);
            textView2 = itemView.findViewById(R.id.smallUnitName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();

                    if (listener != null) {
                        listener.onItemClick(ViewHolder.this, view, position);
                    }
                }
            });
        }

        public void setItem(SmallUnit item) {
            textView.setText(item.getSmallUnitNumber());
            textView2.setText(item.getSmallUnitName());
        }
    }
}
