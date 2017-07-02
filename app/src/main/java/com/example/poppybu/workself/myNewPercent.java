package com.example.poppybu.workself;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;


public class myNewPercent extends AppCompatActivity {

    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        final LinearLayout linearLayout_3 = (LinearLayout)inflater.inflate(R.layout.mythree,null);
        setContentView(linearLayout_3);

        seekBar = (SeekBar) findViewById(R.id.mSeek);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                Message msg = new Message();
                Log.d("SeekBar", "获取当前值" + progress);
                //setVioew(prgress);
                switch (progress){
                    case 0:
                    {
                        TextView per_3 = (TextView) linearLayout_3.findViewById(R.id.ThreePercent);
                        linearLayout_3.removeView(per_3);
                    }
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























