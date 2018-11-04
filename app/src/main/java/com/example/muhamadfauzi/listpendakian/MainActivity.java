package com.example.muhamadfauzi.listpendakian;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.muhamadfauzi.listpendakian.adapter.MainAdapter;
import com.example.muhamadfauzi.listpendakian.model.MainModel;

import java.util.LinkedList;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<MainModel> listTim = new LinkedList<>();
    private RecyclerView recyclerView;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        changeLanguage();

        String tenda = "Tenda memiliki peran yang sangat vital dalam pendakian, selain tenda bisa melindungi dari dinginnya suhu, tenda juga diperlukan untuk kita istirahat saat lelah mendaki";
        String cookingset = "Mendaki gunung memakan waktu lebih dari satu hari atau malah sampai berhari-hari. Tentu saja Anda harus memasak saat mendaki gunung agar bisa menjaga stamina dan tidak kelaparan";
        String sleepingbag = "Sleepingbag adalah salah satu perlengkapan fital dalam untuk mendaki gunung. Kamu pasti tidak mau dong kedinginan saat tidur digunung, karena hawa dingin akan tetap menembus tenda kita. Jadi dengan menggunakan sleepingbag kamu tetap bisa tidur dengan nyaman digunung.";
        String matras = "Matras adalah salah satu perlengkapan yang sangat fital untuk endaki. befungsi sebagai alas agar idak kotor dan alas untuktidur kita agar saat tidur alas tenda yang bermaterialkan terpal tidak terasa dingin karena langsung bersentuhan dengan tanah.";
        String lamputenda = "Lampu tenda sangat beguna saat pendakian, selain untuk menerangi tenda agar tidak gelap, lampu tenda juga sangat brguna melindungi dari serangan binatang buas.";
        String sepatu = "Sepatu Trecking sangat membantu kita saat melakukan pendakian, karena sepatu tracking sangat jauh berbeda dengan sepatu cats jadi saat mendaki kita bisa safety.";

        listTim.addLast(new MainModel("Tenda", tenda, R.drawable.tenda4));
        listTim.addLast(new MainModel("Cookingset", cookingset, R.drawable.cook));
        listTim.addLast(new MainModel("SleepingBag", sleepingbag, R.drawable.sb));
        listTim.addLast(new MainModel("Matras", matras, R.drawable.matras));
        listTim.addLast(new MainModel("Lampu Tenda", lamputenda, R.drawable.lampu));
        listTim.addLast(new MainModel("Sepatu Tracking", sepatu, R.drawable.sepatu));

        recyclerView = findViewById(R.id.rvList_tim);
        mainAdapter = new MainAdapter(MainActivity.this,listTim);
        recyclerView.setAdapter(mainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void changeLanguage() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.profile:
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                return true;
            case R.id.gantiBahasa:
                Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(mIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
