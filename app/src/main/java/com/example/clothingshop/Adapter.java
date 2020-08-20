package com.example.clothingshop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    int count_1= 0;

    public List<ModelClass> modelClassList;

    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        int resource = modelClassList.get(position).getImageResource();
        String title = modelClassList.get(position).getTitle();
        String body = modelClassList.get(position).getBody();
        holder.setData(resource,title,body);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title;
        TextView body;


        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById((R.id.imageView));
            title = itemView.findViewById((R.id.textView1));
            body = itemView.findViewById((R.id.textView3));


        }
        private void setData(int resource, String titleText, String bodyText){
            imageView.setImageResource(resource);
            title.setText(titleText);
            body.setText(bodyText);
        }

    }

}
