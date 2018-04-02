package id.ac.astra.polman.navogationapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashscreenActivity extends AppCompatActivity {

    private static final int splashTime=3000;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        handler=new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
//                startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
//
                Intent intent = new Intent(SplashscreenActivity.this, MainActivity.class);
//                intent.putExtra("name","Indonesia Android Kejar");
                startActivity(intent);
                finish();
            }
        };

        handler.postDelayed(runnable,splashTime);
    }
}
