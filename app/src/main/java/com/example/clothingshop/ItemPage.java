package com.example.clothingshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ItemPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_page);

    }
    public void startMenuActivity(){
        Intent intent= new Intent(this,ShoppingCart.class);
        startActivity(intent);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.contactpage) {
            Intent myintent = new Intent(ItemPage.this, Contact.class);
            startActivity(myintent);
        }


        if (id == R.id.action_shoppingcart) {
            Intent myintent = new Intent(ItemPage.this, ShoppingCart.class);
            startActivity(myintent);
        }
        return super.onOptionsItemSelected(item);
    }
}

