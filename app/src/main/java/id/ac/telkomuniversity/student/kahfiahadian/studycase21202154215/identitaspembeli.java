package id.ac.telkomuniversity.student.kahfiahadian.studycase21202154215;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class identitaspembeli extends AppCompatActivity {
private EditText nama;
private EditText hape;
private EditText alamat;
private EditText catatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identitaspembeli);

        nama = (EditText) findViewById(R.id.editText_namasaya);
        hape = (EditText) findViewById(R.id.editText_telepon);
        alamat = (EditText) findViewById(R.id.editText_alamat);
        catatan = (EditText) findViewById(R.id.editText_catatan);

    }

    public void pilihmenu(View view) {
        String namaurang,hapeurang,alamaturang,catatanurang;
        namaurang = nama.getText().toString();
        hapeurang = hape.getText().toString();
        alamaturang = alamat.getText().toString();
        catatanurang = catatan.getText().toString();

        Toast.makeText(this, namaurang + "dengan no hp "+hapeurang +" di "+alamaturang+" dengan catatan "+catatanurang, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), menuMakanan.class));
    }
}
