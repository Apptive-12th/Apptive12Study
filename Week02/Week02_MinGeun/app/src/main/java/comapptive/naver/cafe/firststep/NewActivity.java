package comapptive.naver.cafe.firststep;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    private RadioButton option1, option2, option3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        option1 = (RadioButton) findViewById(R.id.option1);
        option2 = (RadioButton) findViewById(R.id.option2);
        option3 = (RadioButton) findViewById(R.id.option3);
        option1.setOnClickListener(optionOnClickListener);
        option2.setOnClickListener(optionOnClickListener);
        option3.setOnClickListener(optionOnClickListener);
        option1.setChecked(true);


    }

    RadioButton.OnClickListener optionOnClickListener
            = new RadioButton.OnClickListener() {

        public void onClick(View v) {
            Toast.makeText(
                    NewActivity.this,
                    "Option 1 : " + option1.isChecked() + "\n"
                            + "Option 2 : " + option2.isChecked() + "\n"
                            + "Option 3 : " + option3.isChecked(),
                    Toast.LENGTH_LONG).show();

        }
    };
}
