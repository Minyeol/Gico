package org.techtown.gico;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class SettingsFragment extends Fragment {
    public static int TEXT_SIZE = 14;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_settings, container, false);
        Button button = rootView.findViewById(R.id.button_setting);
        TextView textView = rootView.findViewById(R.id.textView_setting);
        textView.setTextSize(Dimension.SP, TEXT_SIZE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TEXT_SIZE += 2;
                if(TEXT_SIZE>20)
                    TEXT_SIZE = 14;
                textView.setTextSize(Dimension.SP, TEXT_SIZE);
            }
        });

        return rootView;
    }
}
