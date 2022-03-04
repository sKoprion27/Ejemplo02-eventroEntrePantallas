package com.example.ejemplo02_eventroentrepantallas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView atextview;
    private CheckBox checkboxWork;
    private CheckBox checkboxStudy;
    private CheckBox checkboxTrain;
    private Switch aSwitch;
    private Button button1;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        atextview.findViewById(R.id.textView);
        checkboxStudy.findViewById(R.id.checkBox2);
        checkboxWork.findViewById(R.id.checkBox);
        checkboxTrain.findViewById(R.id.checkBox3);
        aSwitch.findViewById(R.id.switch1);
        button1.findViewById(R.id.button);
        

    }
}