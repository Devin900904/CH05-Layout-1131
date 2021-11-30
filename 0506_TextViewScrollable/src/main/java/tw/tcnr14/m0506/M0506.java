package tw.tcnr14.m0506;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class M0506 extends AppCompatActivity {

    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0506);
        setContentView();
    }

    private void setContentView() {
        msg = (TextView)findViewById(R.id.m0506_msg);
        msg.setMovementMethod(ScrollingMovementMethod.getInstance());

    }
}