package com.example.test_project_2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MyActivity extends Activity implements CompoundButton.OnCheckedChangeListener {
    CheckBox checkBox;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        checkBox = (CheckBox) findViewById(R.id.check_box);
        checkBox.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Toast.makeText(this, "CheckBox state changed! Currently is checked = " + isChecked, Toast.LENGTH_SHORT).show();
    }
}
