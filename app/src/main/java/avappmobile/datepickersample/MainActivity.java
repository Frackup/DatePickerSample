package avappmobile.datepickersample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DatePicker dp = (DatePicker) findViewById(R.id.datePicker);
        final Button btnSet = (Button) findViewById(R.id.btnSet);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, dp.getDayOfMonth() + " " + dp.getMonth() + " " + dp.getYear(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
