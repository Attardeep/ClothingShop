package com.example.clothingshop;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    List<ModelClass> modelClassList;

    private RecyclerView recyclerView;
    private FloatingActionButton Checkout;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView=findViewById(R.id.recycler_view);
        LinearLayoutManager LayoutManager = new LinearLayoutManager(this);
        LayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(LayoutManager);


        EditText editText = findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });


        modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.half,"Half hands Shirt","Price : 40$","this is half hands shirt for the man and it are large size only"));
        modelClassList.add(new ModelClass(R.drawable.shirt,"Shirt","Price : 60$","this is shirt for the man and it good for suite"));
        modelClassList.add(new ModelClass(R.drawable.denimshrit,"Denim Shirt","Price : 80$","this is denim shirt for the man and woman,it very comfortable and fashion"));
        modelClassList.add(new ModelClass(R.drawable.hoodedjacket,"Hooded Jacket","Price : 120$","this is hooded jacket for the man and woman,it very comfortable"));
        modelClassList.add(new ModelClass(R.drawable.hoodedjean,"Hooded Jeans Jacket","Price : 90$","this is hooded jeans jacket for the man and woman"));
        modelClassList.add(new ModelClass(R.drawable.tshirt1,"T-Shirt","Price : 240$","this is T-shirt for the man"));
        modelClassList.add(new ModelClass(R.drawable.tshirt2,"T-Shirt","Price : 200$","this is T-shirt for the man"));
        modelClassList.add(new ModelClass(R.drawable.hoodies1,"Hoodie","Price : 330$","this is Hoodie which can be weared by woman and man both"));
        modelClassList.add(new ModelClass(R.drawable.hoodies2,"Hoodie","Price : 400$","this is Hoodie from GCDS which can be weared by woman and man both"));
        modelClassList.add(new ModelClass(R.drawable.jacket1,"Jacket","Price : 750$","this is Jacket from Gucci which can be weared by woman and man both"));

        adapter = new Adapter(this,modelClassList);
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


    private void filter(String text){
        ArrayList<ModelClass>filteredList=new ArrayList<>();

        for(ModelClass item:modelClassList){
            if(item.getTitle().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);
    }


    public void onCreateDialog() {
        Intent intent5 = new Intent(this, ShoppingCart.class);
        startActivity(intent5);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_favorite) {
            Intent myintent = new Intent(Main2Activity.this, ShoppingCart.class);
            startActivity(myintent);
        }
        if (id == R.id.contactpage) {
            Intent myintent = new Intent(Main2Activity.this, Contact.class);
            startActivity(myintent);
        }

        return super.onOptionsItemSelected(item);
    }

}
