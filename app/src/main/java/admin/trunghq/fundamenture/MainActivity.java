package admin.trunghq.fundamenture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

/**
 * The type Main activity.
 */
public class MainActivity extends Activity {

    /**
     * The Button open other activity.
     */
    private Button buttonOpenOtherActivity;
    private Button btnOpenThreeActivity;
    private SinhVien sinhVien;
    // logt
    private static final String TAG = "MainActivity";

    /**
     * @param savedInstanceState
     */
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// Phan comment

        //Canh comment
        setContentView(R.layout.activity_main);
        Log.d("log", "MainActivity chay");
        Log.d(TAG, "onCreate: ");
        buttonOpenOtherActivity = findViewById(R.id.btnOpenOtherActivity);
        btnOpenThreeActivity = findViewById(R.id.btnOpenThreeActivity);

        Log.d(TAG, "onCreate: ád");
        buttonOpenOtherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("log", "MainActivity onClick");
                //Log.d("log","onClickOpenOtherActivity");
                // Open SecondActivity Screen
                // khai báo và khởi tạo explicit intent
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                // open activity
                intent.putExtra("key_data", "dữ liệu truyền sang từ MainActivity");
                sinhVien = new SinhVien("Truong Gia Binh",58);
                intent.putExtra("objSinhVien",sinhVien);
                Bundle bundle = new Bundle();
                bundle.putString("key_String_data","string in bundle");
                bundle.putInt("key_Int_data",1);
                //bundle.putin

             /*   int x = 10;
                float f = 1;
                double d = 5;

                Integer X = 10;
                Float F = 100f;
                Long L = 1000L;*/

                startActivity(intent);
                //startActivity(intent);
            }
        });
        btnOpenThreeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction("actionOpenThreeActivity");
                startActivity(intent);
            }
        });

        Log.d("log", "onCreated Activity");
        Log.i(TAG, "onCreate: ");

    }


    /**
     * Caculate int.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     * @param f the f
     *
     * @return the int
     *
     * @throws IOException               the io exception
     * @throws IndexOutOfBoundsException the index out of bounds exception
     */
    public static int caculate(int x, int y, double z, float f) throws IndexOutOfBoundsException {
        return 0;
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
