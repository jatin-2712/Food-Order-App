package com.masterandroid.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;

import com.masterandroid.foodorderapp.Adapters.OrdersAdapter;
import com.masterandroid.foodorderapp.Models.OrdersModel;
import com.masterandroid.foodorderapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        DBHelper helper = new DBHelper(this);
        ArrayList<OrdersModel> list = helper.getOrders();


        OrdersAdapter adapter = new OrdersAdapter(list,this);

        binding.orderRecylerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        binding.orderRecylerView.setLayoutManager(layoutManager);




    }
}