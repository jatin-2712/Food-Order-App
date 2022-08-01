package com.masterandroid.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.masterandroid.foodorderapp.Adapters.MainAdapter;
import com.masterandroid.foodorderapp.Models.MainModel;
import com.masterandroid.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add( new MainModel(R.drawable.burger,"Burger","5","Veg Burger with Spicy Taste"));
        list.add( new MainModel(R.drawable.pizza,"Pizza","2","Veg Pizza with Spicy Taste"));
        list.add( new MainModel(R.drawable.fries,"Fries","12","Fries with cheesy Taste"));
        list.add( new MainModel(R.drawable.images,"Combo","8","combo"));
        list.add( new MainModel(R.drawable.burger,"Chicken Burger","10","chicken tasty burger"));
        list.add( new MainModel(R.drawable.pizza,"Chicken Pizza","15","chicken pizza with Spicy Taste"));


        MainAdapter adapter = new MainAdapter(list,this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders: startActivity(new Intent(MainActivity.this,OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}