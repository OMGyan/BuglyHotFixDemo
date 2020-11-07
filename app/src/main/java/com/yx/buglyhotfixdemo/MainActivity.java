package com.yx.buglyhotfixdemo;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.bugly.beta.Beta;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getString(View view) {
        Toast.makeText(this, BugClass.bug(), Toast.LENGTH_SHORT).show();

    }

    public void checkUpgrade(View view) {
        Beta.checkUpgrade();
    }
}