package id.ac.telkomuniversity.student.kahfiahadian.studycase21202154215;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static id.ac.telkomuniversity.student.kahfiahadian.studycase21202154215.R.id.radioButton_makandisini;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton_sini;
    private RadioButton radioButton_pulang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getBaseContext(),"KAHFI AHADIAN MUTAQIN, 1202154215, SI3907",
                Toast.LENGTH_SHORT).show();
        radioButton_sini = (RadioButton) findViewById(radioButton_makandisini);
        radioButton_pulang = (RadioButton) findViewById(R.id.radioButton_bawapulang);

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        Button btSubmit = (Button) findViewById(R.id.button_pesan);
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            int id = radioGroup.getCheckedRadioButtonId();
        switch(id){

        case radioButton_makandisini:
            Toast.makeText(getBaseContext(),"Makan Disini Terpilih",
                    Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), detailcustomer.class));
            break;
        case R.id.radioButton_bawapulang :
            Toast.makeText(getBaseContext(),"Bawa Pulang Terpilih ",
                    Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), identitaspembeli.class));
            break;
            }
        }
        });

    }
}