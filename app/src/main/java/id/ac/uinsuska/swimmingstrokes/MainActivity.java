package id.ac.uinsuska.swimmingstrokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8;
    private long Timeback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv1 = (CardView) findViewById(R.id.IntroCV);
        cv2 = (CardView) findViewById(R.id.FreestyleCV);
        cv3 = (CardView) findViewById(R.id.BackstrokeCV);
        cv4 = (CardView) findViewById(R.id.BreaststrokeCV);
        cv5 = (CardView) findViewById(R.id.Butterfly);
        cv6 = (CardView) findViewById(R.id.ProfileCV);
        cv7 = (CardView) findViewById(R.id.AboutCV);
        cv8 = (CardView) findViewById(R.id.CloseCV);

        cv1.setOnClickListener(this);
        cv2.setOnClickListener(this);
        cv3.setOnClickListener(this);
        cv4.setOnClickListener(this);
        cv5.setOnClickListener(this);
        cv6.setOnClickListener(this);
        cv7.setOnClickListener(this);
        cv8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        int id = v.getId();
        if (id == R.id.IntroCV) {
            i = new Intent(this,IntroMain.class);
            startActivity(i);
        } else if (id == R.id.FreestyleCV) {
            i = new Intent(this,FreestyleMain.class);
            startActivity(i);
        } else if (id == R.id.BackstrokeCV) {
            i = new Intent(this,BackstrokeMain.class);
            startActivity(i);
        } else if (id == R.id.BreaststrokeCV) {
            i = new Intent(this,BreaststrokeMain.class);
            startActivity(i);
        } else if (id == R.id.Butterfly) {
            i = new Intent(this, ButterflyMain.class);
            startActivity(i);
        } else if (id == R.id.ProfileCV) {
            i = new Intent(this,ProfileMain.class);
            startActivity(i);
        } else if (id == R.id.AboutCV) {
            i = new Intent(this,AboutMain.class);
            startActivity(i);
        } else if (id == R.id.CloseCV) {
            if (System.currentTimeMillis() - Timeback > 1500) {
                Timeback = System.currentTimeMillis();
                Toast.makeText(this, "Press Again to Exit", Toast.LENGTH_SHORT).show();
                return;
            }
            finish();
            System.exit(0);
        }
    }

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - Timeback < 1500) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(getBaseContext(), "Press Again to Exit", Toast.LENGTH_SHORT).show();
        }
        Timeback = System.currentTimeMillis();
    }
}