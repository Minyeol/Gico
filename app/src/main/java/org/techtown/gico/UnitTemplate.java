package org.techtown.gico;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UnitTemplate extends LinearLayout {
    ImageView imageView;
    TextView textView;
    public UnitTemplate(Context context){
        super(context);
        init(context);
    }
    public UnitTemplate(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.template_unit, this, true);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
    }
    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }
    public void setUnit(String unit){
        textView.setText(unit);
    }
}
