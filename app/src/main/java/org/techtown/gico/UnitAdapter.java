package org.techtown.gico;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UnitAdapter extends RecyclerView.Adapter<UnitAdapter.ViewHolder> implements OnUnitItemClickListener{
    ArrayList<Unit> items = new ArrayList<Unit>();
    OnUnitItemClickListener listener;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(View itemView, final OnUnitItemClickListener listener) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    int position = getAdapterPosition();

                    if(listener != null){
                        listener.onItemClick(ViewHolder.this, view, position);
                    }
                }
            });
        }

        public void setItem(Unit item){
            textView.setText(item.getUnit());
        }


    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.template_unit, viewGroup, false);

        return new ViewHolder(itemView, this);
    }
    public void setOnItemClickListener(OnUnitItemClickListener listener){
        this.listener = listener;
    }
    @Override
    public void onItemClick(ViewHolder holder, View view, int position){
        if (listener != null){
            listener.onItemClick(holder, view, position);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Unit item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Unit item) {
        items.add(item);
    }

    public void setItems(ArrayList<Unit> items){
        this.items = items;
    }

    public Unit getItem(int position){
        return items.get(position);
    }

    public void setItem(int position, Unit item){
        items.set(position, item);
    }
}
