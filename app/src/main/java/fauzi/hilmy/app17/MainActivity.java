package fauzi.hilmy.app17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewBaju, recyclerViewJaket,recyclerViewSweater ;
    private ArrayList<Shirt> arrayListBaju, arrayListJaket, arrayListSweater;
    AdapterDetail adapterBaju, adapterJaket, adapterSweater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewBaju = findViewById(R.id.recyclerBaju);
        recyclerViewJaket = findViewById(R.id.recyclerJaket);
        recyclerViewSweater = findViewById(R.id.recyclerSweater);

        recyclerViewBaju.setHasFixedSize(true);
        recyclerViewJaket.setHasFixedSize(true);
        recyclerViewSweater.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerViewBaju.setLayoutManager(layoutManager);
        recyclerViewJaket.setLayoutManager(layoutManager1);
        recyclerViewSweater.setLayoutManager(layoutManager2);

        arrayListBaju = new ArrayList<>();
        arrayListJaket = new ArrayList<>();
        arrayListSweater = new ArrayList<>();


        arrayListBaju.addAll(ShirtData.getDataBaju());
        arrayListJaket.addAll(ShirtData.getDataJaket());
        arrayListSweater.addAll(ShirtData.getDataSweater());

        adapterBaju = new AdapterDetail(this);
        adapterBaju.setListShirt(arrayListBaju);

        adapterJaket = new AdapterDetail(this);
        adapterJaket.setListShirt(arrayListJaket);

        adapterSweater = new AdapterDetail(this);
        adapterSweater.setListShirt(arrayListSweater);

        recyclerViewBaju.setAdapter(adapterBaju);
        recyclerViewJaket.setAdapter(adapterJaket);
        recyclerViewSweater.setAdapter(adapterSweater);
    }


}
