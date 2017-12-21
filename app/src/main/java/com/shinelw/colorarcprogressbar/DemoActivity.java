package com.shinelw.colorarcprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.shinelw.library.ColorArcProgressBar;

public class DemoActivity extends AppCompatActivity {
    private Button button1;
    private ColorArcProgressBar bar1;
    private Button button2;
    private ColorArcProgressBar bar2;
    private Button button3;
    private ColorArcProgressBar bar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);//
//        Tiny.getInstance().init(DemoActivity.this);
        bar1 = (ColorArcProgressBar) findViewById(R.id.bar1);
        button1 = (Button) findViewById(R.id.button1);
        bar2 = (ColorArcProgressBar) findViewById(R.id.bar2);
        button2 = (Button) findViewById(R.id.button2);
        bar3 = (ColorArcProgressBar) findViewById(R.id.bar3);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar1.setCurrentValues(100);
            }
        });
        final int[] pm = {0};//pm2.5的值
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pm[0] +=  50;
                if (pm[0] > 500) {
                    pm[0] = 0;
                }
                /**
                 * 当前进度
                 */
               int progress = 0;//最大对应498-》150刻度
                //progress = 310（实际值） - 0刻度
                //progress =375（实际值） - 50（对应虚拟刻度(pm2.5)）
                //progress =439（实际值） - 100（对应虚拟刻度(pm2.5)）
                //progress =498（实际值） - 150（对应虚拟刻度(pm2.5)）
                //progress =61 （实际值）- 200（对应虚拟刻度(pm2.5)）
                //progress =124（实际值） - 250（对应虚拟刻度(pm2.5)）
                //progress =190（实际值） - 500（对应虚拟刻度(pm2.5)）
                if (pm[0] >= 0 && pm[0] < 50) {
                    progress= 310 + pm[0];
                }else if (pm[0] >= 50 && pm[0] < 100) {
                    progress= 375 + pm[0] - 50;
                } else if (pm[0] >= 100 && pm[0] < 150) {
                    progress= 439 + pm[0] - 50;
                } else {
                    progress= pm[0] - 140;
                }
                bar2.setProgress(progress);
                Log.e("zhu","progress:" + progress);
//                bar2.setCurrentValues(100);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar3.setCurrentValues(77);
            }
        });
    }
}
