package admin.trunghq.fundamenture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonOpenOtherActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Log.d("log","MainActivity chay");
        buttonOpenOtherActivity = findViewById(R.id.btnOpenOtherActivity);
        buttonOpenOtherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("log","MainActivity onClick");
                //Log.d("log","onClickOpenOtherActivity");
                // Open OtherActivity Screen
                Intent intent = new Intent(MainActivity.this,OtherActivity.class);
                // open activity
                startActivity(intent);
                startActivity(intent);
            }
        });


    }
}
