package com.example.expandablelistviewdemo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class LayerListAdapter extends RecyclerView.Adapter<LayerListAdapter.LayerListViewHolder> {

    private LayerListData[] mLayerListData;
    private Context mContext;

    public LayerListAdapter(LayerListData[] layerListData, Context context) {
        this.mLayerListData = layerListData;
        this.mContext = context;
    }

    @NonNull
    @Override
    public LayerListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewTWO = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_layers, parent, false);
        LayerListViewHolder rowTWO = new LayerListViewHolder(viewTWO);
        return rowTWO;

        /*LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        return new LayerListViewHolder(listItem);*/
    }

    @Override
    public void onBindViewHolder(@NonNull LayerListViewHolder holder, int position) {

        final LayerListData layerListData = mLayerListData[position];
        holder.textView.setText("abc");
        //holder.imageView.setImageDrawable(mLayerListData[position].getImage());
        Glide
                .with(mContext)
                .load(mLayerListData[position].getImage())
                .centerCrop()
                .into(holder.imageView);
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+layerListData.getLayer(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mLayerListData.length;
    }

    public static class LayerListViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public ConstraintLayout constraintLayout;
        public LayerListViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image_view);
            textView = (TextView) itemView.findViewById(R.id.textView);
            constraintLayout = itemView.findViewById(R.id.constraint_layout);
        }
    }
}
