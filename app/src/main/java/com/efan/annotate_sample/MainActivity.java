package com.efan.annotate_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.efan.annotations.AnnotateUtils;
import com.efan.annotations.ContentView;
import com.efan.annotations.ViewInject;

@ContentView(id = R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @ViewInject(id = R.id.button1,clickable = true)
    private Button button1;
    @ViewInject(id = R.id.button2)
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AnnotateUtils.inJect(this);
        button1.setText("button1");
        button2.setText("button2");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(MainActivity.this, "reger", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
