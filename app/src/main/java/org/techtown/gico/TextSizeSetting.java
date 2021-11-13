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

public class TextSizeSetting extends Fragment {
    public static int TEXT_SIZE = 14;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_control_size_text_settings, container, false);
        Button button = rootView.findViewById(R.id.button_settings);
        TextView textView = rootView.findViewById(R.id.textView_settings);
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
        ImageButton homeButton = rootView.findViewById(R.id.homeButton_settings);
        homeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 홈 화면으로 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                SettingsFragment settingsFragment = new SettingsFragment();
                transaction.replace(R.id.container, settingsFragment);
                transaction.commit();
            }
        });
        return rootView;
    }
}
