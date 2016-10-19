package csnowstack.pointloadingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView start= (TextView) findViewById(R.id.txt);
        final PointLoadingView loadingView= (PointLoadingView) findViewById(R.id.loading);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingView.startLoadingAnimation();
            }
        });
    }
}
