package admin.trunghq.fundamenture;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class OtherActivity extends AppCompatActivity {
    private static final String TAG = "OtherActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //Log.d("log", "OtherActivity chay");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        Log.d("log", "onCreate: OtherActivity Screen ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("log", "onRestart OtherActivity: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("log", "onStart: OtherActivity ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("log", "onResume: OtherActivity");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("log", "onPause:OtherActivity ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("log", "onStop:OtherActivity ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("log", "onDestroy: OtherActivity");
    }
}
