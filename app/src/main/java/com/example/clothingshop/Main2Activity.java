package com.example.clothingshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FloatingActionButton Checkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView=findViewById(R.id.recycler_view);
        LinearLayoutManager LayoutManager = new LinearLayoutManager(this);
        LayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(LayoutManager);

        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.half,"Half hands Shirt","Price : 40$"));
        modelClassList.add(new ModelClass(R.drawable.shirt,"Shirt","Price : 60$"));
        modelClassList.add(new ModelClass(R.drawable.denimshrit,"Denim Shirt","Price : 80$"));
        modelClassList.add(new ModelClass(R.drawable.hoodedjacket,"Hooded Jacket","Price : 120$"));
        modelClassList.add(new ModelClass(R.drawable.hoodedjean,"Hooded Jeans Jacket","Price : 90$"));
        modelClassList.add(new ModelClass(R.drawable.shirt,"Shirt","Price : 300$"));
        modelClassList.add(new ModelClass(R.drawable.shirt,"Shirt","Price : 500$"));
        modelClassList.add(new ModelClass(R.drawable.shirt,"Shirt","Price : 130$"));
        modelClassList.add(new ModelClass(R.drawable.shirt,"Shirt","Price : 160$"));
        modelClassList.add(new ModelClass(R.drawable.shirt,"Shirt","Price : 450$"));

        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        Checkout= findViewById(R.id.fab_checkout);
        Checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCreateDialog();
                Toast.makeText(getApplicationContext(),"You have Successfully completed your shopping. Please select a Payment Method ",Toast.LENGTH_LONG).show();
            }
        });

    }
    public void onCreateDialog() {
        Intent intent5 = new Intent(this, ShoppingCart.class);
        startActivity(intent5);
    }

}
