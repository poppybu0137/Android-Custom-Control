package com.example.poppybu.workself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class myPercent extends AppCompatActivity {

    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        final LinearLayout linearLayout_3 = (LinearLayout)inflater.inflate(R.layout.mythree,null);
        final View per_1 = linearLayout_3.findViewById(R.id.OnePercent);
        final View per_2 = linearLayout_3.findViewById(R.id.TwoPercent);
        final View per_3 = linearLayout_3.findViewById(R.id.ThreePercent);
        final View per_4 = linearLayout_3.findViewById(R.id.FourPercent);
        final View per_5 = linearLayout_3.findViewById(R.id.FivePercent);
        final View per_6 = linearLayout_3.findViewById(R.id.SixPercent);
        final View per_7 = linearLayout_3.findViewById(R.id.SevenPercent);
        final View per_8 = linearLayout_3.findViewById(R.id.EightPercent);
        linearLayout_3.removeView(per_1);
        linearLayout_3.removeView(per_2);
        linearLayout_3.removeView(per_4);
        linearLayout_3.removeView(per_5);
        linearLayout_3.removeView(per_6);
        linearLayout_3.removeView(per_7);
        linearLayout_3.removeView(per_8);
        setContentView(linearLayout_3);

        seekBar = (SeekBar) findViewById(R.id.mSeek);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                Log.d("SeekBar", "获取当前值" + progress);

                switch (progress){
                    case 0:
                    {
                        linearLayout_3.removeView(per_2);
                        linearLayout_3.removeView(per_1);
                        linearLayout_3.removeView(per_4);
                        linearLayout_3.removeView(per_5);
                        linearLayout_3.removeView(per_6);
                        linearLayout_3.removeView(per_7);
                        linearLayout_3.removeView(per_8);
                        linearLayout_3.removeView(per_3);
                        break;
                    }
                    case 1:
                    {
                        linearLayout_3.removeView(per_3);
                        linearLayout_3.removeView(per_2);
                        linearLayout_3.removeView(per_4);
                        linearLayout_3.removeView(per_5);
                        linearLayout_3.removeView(per_6);
                        linearLayout_3.removeView(per_7);
                        linearLayout_3.removeView(per_8);
                        linearLayout_3.addView(per_1);
                        break;
                    }
                    case 2:
                    {
                        linearLayout_3.removeView(per_3);
                        linearLayout_3.removeView(per_1);
                        linearLayout_3.removeView(per_4);
                        linearLayout_3.removeView(per_5);
                        linearLayout_3.removeView(per_6);
                        linearLayout_3.removeView(per_7);
                        linearLayout_3.removeView(per_8);
                        linearLayout_3.addView(per_2);
                        break;
                    }
                    case 3:
                    {
                        linearLayout_3.removeView(per_2);
                        linearLayout_3.removeView(per_1);
                        linearLayout_3.removeView(per_4);
                        linearLayout_3.removeView(per_5);
                        linearLayout_3.removeView(per_6);
                        linearLayout_3.removeView(per_7);
                        linearLayout_3.removeView(per_8);
                        linearLayout_3.addView(per_3);
                        break;
                    }
                    case 4:
                    {
                        linearLayout_3.removeView(per_2);
                        linearLayout_3.removeView(per_1);
                        linearLayout_3.removeView(per_3);
                        linearLayout_3.removeView(per_5);
                        linearLayout_3.removeView(per_6);
                        linearLayout_3.removeView(per_7);
                        linearLayout_3.removeView(per_8);
                        linearLayout_3.addView(per_4);
                        break;
                    }
                    case 5:
                    {
                        linearLayout_3.removeView(per_2);
                        linearLayout_3.removeView(per_1);
                        linearLayout_3.removeView(per_4);
                        linearLayout_3.removeView(per_3);
                        linearLayout_3.removeView(per_6);
                        linearLayout_3.removeView(per_7);
                        linearLayout_3.removeView(per_8);
                        linearLayout_3.addView(per_5);
                        break;
                    }
                    case 6:
                    {
                        linearLayout_3.removeView(per_2);
                        linearLayout_3.removeView(per_1);
                        linearLayout_3.removeView(per_4);
                        linearLayout_3.removeView(per_5);
                        linearLayout_3.removeView(per_3);
                        linearLayout_3.removeView(per_7);
                        linearLayout_3.removeView(per_8);
                        linearLayout_3.addView(per_6);
                        break;
                    }
                    case 7:
                    {
                        linearLayout_3.removeView(per_2);
                        linearLayout_3.removeView(per_1);
                        linearLayout_3.removeView(per_4);
                        linearLayout_3.removeView(per_5);
                        linearLayout_3.removeView(per_6);
                        linearLayout_3.removeView(per_3);
                        linearLayout_3.removeView(per_8);
                        linearLayout_3.addView(per_7);
                        break;
                    }
                    case 8:
                    {
                        linearLayout_3.removeView(per_2);
                        linearLayout_3.removeView(per_1);
                        linearLayout_3.removeView(per_4);
                        linearLayout_3.removeView(per_5);
                        linearLayout_3.removeView(per_6);
                        linearLayout_3.removeView(per_7);
                        linearLayout_3.removeView(per_3);
                        linearLayout_3.addView(per_8);
                        break;
                    }
                    default:
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Log.d("SeekBar", "开始拖动");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Log.d("SeekBar", "结束拖动");

            }
        });
    }
}























