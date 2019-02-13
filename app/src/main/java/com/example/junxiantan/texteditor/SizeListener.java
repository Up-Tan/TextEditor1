package com.example.junxiantan.texteditor;

import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

public class SizeListener implements View.OnClickListener {
    private TextView tv;
    public  SizeListener(TextView tv){

        this.tv = tv;
    }
    public  void  onClick(View v){
        float f=tv.getTextSize();
        switch (v.getId()){
            case R.id.bigger:
                f=f+2;
                break;
            case R.id.smaller:
                f=f-2;
                break;
            default:
                break;
        }
        if(f>=72){
            f=72;
        }
        if(f<=8){
            f=8;
        }
        tv.setTextSize(TypedValue.COMPLEX_UNIT_PX,f);
    }
}
