package id.ac.uinsuska.swimmingstrokes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreaststrokeMain extends AppCompatActivity implements View.OnClickListener {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breaststroke_main);

        btn = (Button) findViewById(R.id.back_btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        int id = v.getId();
        if (id == R.id.back_btn) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}