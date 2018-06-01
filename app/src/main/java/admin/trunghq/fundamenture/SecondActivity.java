package admin.trunghq.fundamenture;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //Log.d("log", "SecondActivity chay");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        Log.d("log", "onCreate: SecondActivity Screen ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("log", "onRestart SecondActivity: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("log", "onStart: SecondActivity ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intentFromMainActivity = getIntent();
        String dataFromMainActivity = intentFromMainActivity.getStringExtra("key_data");
        Toast.makeText(this, dataFromMainActivity, Toast.LENGTH_SHORT).show();
        SinhVien objSinhVien = (SinhVien) intentFromMainActivity.getParcelableExtra("objSinhVien");
        //int i = MainActivity.caculate(1, 3, 4, 5);
        Toast.makeText(this, objSinhVien.toString(), Toast.LENGTH_SHORT).show();
        Log.d("log", "onResume: SecondActivity");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("log", "onPause:SecondActivity ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("log", "onStop:SecondActivity ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("log", "onDestroy: SecondActivity");
    }

    /**
     * Show.
     *
     * @param x the x
     * @param j the j
     *
     * @return the int
     */
    public int show(int x, int j) {
        return x + j;
    }
}
