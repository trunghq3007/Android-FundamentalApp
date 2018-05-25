package admin.trunghq.fundamenture;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * The type Main activity.
 */
public class MainActivity extends Activity {

    /**
     * The Button open other activity.
     */
    Button buttonOpenOtherActivity;
    // logt
    private static final String TAG = "MainActivity";

    /**
     * @param savedInstanceState
     */
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Log.d("log", "MainActivity chay");
        Log.d(TAG, "onCreate: ");
        buttonOpenOtherActivity = findViewById(R.id.btnOpenOtherActivity);
        buttonOpenOtherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("log", "MainActivity onClick");
                //Log.d("log","onClickOpenOtherActivity");
                // Open OtherActivity Screen
                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                // open activity
                startActivity(intent);
                startActivity(intent);
            }
        });

        Log.d("log", "onCreated Activity");
        Log.i(TAG, "onCreate: ");

    }

    /**
     * Show.
     */
    public  void show(){

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("log", "onRestart: Activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("log", "onStart:Activity ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("log", "onResume:Activity ");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("log", "onPause: Activity ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("log", "onStop:Activity ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("log", "onDestroy:Activity ");
    }
}
