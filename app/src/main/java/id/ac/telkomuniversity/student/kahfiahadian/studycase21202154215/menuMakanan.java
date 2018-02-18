package id.ac.telkomuniversity.student.kahfiahadian.studycase21202154215;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class menuMakanan extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter menuAdapter;

    public static ArrayList<model> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);

        menuList = eusiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.rv_main);
        menuAdapter = new RecyclerViewAdapter(menuList);
        recyclerView.setAdapter(menuAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<model> eusiMenu(){
        ArrayList<model> data = new ArrayList<>();
        data.add(new model("Pie Berries", 35000, R.drawable.berries_pie, "Kue Pie dengan macam macam buah beri"));
        data.add(new model("Chicken Fillet", 45000, R.drawable.chicken_fillet, "Ayam Fillet dengan saus rahasia"));
        data.add(new model("Fried Shrimp", 27000, R.drawable.fried_ebi_indonesian_style, "Udang tepung dengan saus madu dipadu dengan rempah rempah khas Indonesia"));
        data.add(new model("Red Velvet Cream Pie", 40000, R.drawable.redvelvet_cream_pie, "Pie dengan campuran crackers dan buah buahan dan dicampurkan dengan cream yang menggugah selera"));
        data.add(new model("Cuttlefish ring", 33000, R.drawable.shrimp_ring, "Cumi goreng tepung dengan saus padang"));
        data.add(new model("Tender Tuna With Fried Rice", 56000, R.drawable.tender_tuna_friedrice, "Potongan ikan tuna yang matang di luar dan juicy didalam, dipadukan dengan nasigoreng putih andalan"));
        data.add(new model("Tuna With Asparagus", 54000, R.drawable.tuna_with_asparagus, "Ikan tuna dengan asparagus memberikan kesegaran terhadap tubuh"));
        return data;
    }
}
