package tw.tcnr14.m0504;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import tw.tcnr14.m0504.R;

public class M0504 extends AppCompatActivity {

      private CheckBox chb01, chb02, chb03, chb04, chb05;
      private CheckBox chb06, chb07, chb08, chb09, chb10;
      private CheckBox chb11, chb12, chb13, chb14, chb15;
      private CheckBox chb16, chb17, chb18, chb19, chb20;

      private Button b001;
      private TextView t001;
      private CheckBox[] checks;


      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.m0504);
            setViewComponent();
      }

      private void setViewComponent() {
            chb01 = (CheckBox) findViewById(R.id.m0504_chb01);
            chb02 = (CheckBox) findViewById(R.id.m0504_chb02);
            chb03 = (CheckBox) findViewById(R.id.m0504_chb03);
            chb04 = (CheckBox) findViewById(R.id.m0504_chb04);

            chb05 = (CheckBox) findViewById(R.id.m0504_chb05);
            chb06 = (CheckBox) findViewById(R.id.m0504_chb06);
            chb07 = (CheckBox) findViewById(R.id.m0504_chb07);
            chb08 = (CheckBox) findViewById(R.id.m0504_chb08);
            chb09 = (CheckBox) findViewById(R.id.m0504_chb09);
            chb10 = (CheckBox) findViewById(R.id.m0504_chb10);

            chb11 = (CheckBox) findViewById(R.id.m0504_chb11);
            chb12 = (CheckBox) findViewById(R.id.m0504_chb12);
            chb13 = (CheckBox) findViewById(R.id.m0504_chb13);
            chb14 = (CheckBox) findViewById(R.id.m0504_chb14);
            chb15 = (CheckBox) findViewById(R.id.m0504_chb15);

            chb16 = (CheckBox) findViewById(R.id.m0504_chb16);
            chb17 = (CheckBox) findViewById(R.id.m0504_chb17);
            chb18 = (CheckBox) findViewById(R.id.m0504_chb18);
            chb19 = (CheckBox) findViewById(R.id.m0504_chb19);
            chb20 = (CheckBox) findViewById(R.id.m0504_chb20);
            checks = new CheckBox[]{chb01, chb02, chb03, chb04,chb05,chb06,chb07,chb08,chb09,chb10,
                    chb11,chb12,chb13,chb14,chb15,chb16,chb17,chb18,chb19,chb20};

            b001 = (Button) findViewById(R.id.m0504_b001);

            t001 = (TextView) findViewById(R.id.m0504_t001);

            b001.setOnClickListener(b001On);
      }

      private View.OnClickListener b001On = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  String ans = getString(R.string.m0504_t001) + " ";
                  for (int i = 0; i < checks.length; i++) {
                        if (checks[i].isChecked()) {
                              ans += checks[i].getText()+" ";
                        }
                  }


                  t001.setText(ans);
            }
      };
}