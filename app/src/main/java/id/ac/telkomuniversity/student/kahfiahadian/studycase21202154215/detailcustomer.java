package id.ac.telkomuniversity.student.kahfiahadian.studycase21202154215;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class detailcustomer extends AppCompatActivity {
    private Spinner noMeja;
    private TextView nama;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailcustomer);

        nama = (TextView)findViewById(R.id.editText_nama);
        noMeja = (Spinner)findViewById(R.id.spinner);

    }


    public void pilihmenu(View view){
        String nomejaa, namaa;
        nomejaa = String.valueOf(noMeja.getSelectedItem());
        namaa = nama.getText().toString();
        Toast.makeText(this, nomejaa+" atas Nama "+namaa+" Dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), menuMakanan.class));
    }
    }
