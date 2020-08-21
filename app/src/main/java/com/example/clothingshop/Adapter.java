package com.example.clothingshop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    int count_1 = 0;
    private Context mCtx;
    public List<ModelClass> modelClassList;

    public Adapter(Context mCtx, List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        int resource = modelClassList.get(position).getImageResource();
        String title = modelClassList.get(position).getTitle();
        String shortDesc = modelClassList.get(position).getShortDesc();
        String body = modelClassList.get(position).getBody();
        holder.setData(resource, title, body, shortDesc);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public void filterList(ArrayList<ModelClass> filteredList) {
        modelClassList = filteredList;
        notifyDataSetChanged();
    }

    public class Viewholder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView title;
        TextView body;
        TextView shortDesc;
        Button shopping;


        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById((R.id.imageView));
            title = itemView.findViewById((R.id.textView1));
            body = itemView.findViewById((R.id.textView3));
            shortDesc = itemView.findViewById(R.id.textView2);
            shopping = (Button) itemView.findViewById(R.id.buy_button);

            shopping.setOnClickListener(this);

        }

        private void setData(int resource, String titleText, String bodyText, String descText) {
            imageView.setImageResource(resource);
            title.setText(titleText);
            body.setText(bodyText);
            shortDesc.setText(descText);
        }

        @Override
        public void onClick(View v) {
            Intent intent=new Intent(mCtx,ShoppingCart.class);
            mCtx.startActivity(intent);

            }


        }
    }



