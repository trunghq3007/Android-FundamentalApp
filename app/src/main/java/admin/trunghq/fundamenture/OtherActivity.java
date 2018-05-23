package admin.trunghq.fundamenture;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class OtherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("log","OtherActivity chay");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        Log.d("log", "onCreate: OtherActivity Screen ");
    }

    public void clickMe(View view) {
    }
}
