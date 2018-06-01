package admin.trunghq.fundamenture;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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
        Intent intentFromMainActivity = getIntent();
        String dataFromMainActivity = intentFromMainActivity.getStringExtra("key_data");
        Toast.makeText(this, dataFromMainActivity, Toast.LENGTH_SHORT).show();
        SinhVien objSinhVien = (SinhVien) intentFromMainActivity.getParcelableExtra("objSinhVien");
        //int i = MainActivity.caculate(1, 3, 4, 5);
        Toast.makeText(this, objSinhVien.toString(), Toast.LENGTH_SHORT).show();
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
