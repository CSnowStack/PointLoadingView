package csnowstack.pointloadingview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final PointLoadingView loadingView= (PointLoadingView) findViewById(R.id.loading);
        loadingView.postDelayed(new Runnable() {
            @Override
            public void run() {
                loadingView.startLoadingAnimation();
            }
        },100);
    }
}
