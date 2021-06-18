package com.example.techteamdemoapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
     private MyListData[] listdata;

        // RecyclerView recyclerView;
        public ListAdapter(MyListData[] listdata) {
            this.listdata = listdata;
        }
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            final MyListData myListData = listdata[position];
            holder.restaurantTiming.setText(listdata[position].getRestaurantTimings());
            holder.restaurantName.setText(listdata[position].getRestaurantName());
            holder.restaurantAdd.setText(listdata[position].getRestaurantAdd());
            holder.restaurantCuisines.setText(listdata[position].getRestaurantCuisine());
            holder.restaurantRatings.setText(String.valueOf(listdata[position].getRatings()));
            holder.foodPhoto.setImageResource(listdata[position].getImageID());

        }


        @Override
        public int getItemCount() {
            return listdata.length;
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView foodPhoto;
            public TextView restaurantName;
            public TextView restaurantAdd;
            public TextView restaurantCuisines;
            public TextView restaurantRatings;
            public TextView restaurantTiming;
            public ViewHolder(View itemView) {
                super(itemView);
                this.foodPhoto = (ImageView) itemView.findViewById(R.id.foodPhoto);
                this.restaurantName = (TextView) itemView.findViewById(R.id.restaurantName);
                this.restaurantAdd = (TextView) itemView.findViewById(R.id.restaurantAdd);
                this.restaurantCuisines = (TextView) itemView.findViewById(R.id.restaurantCuisine);
                this.restaurantRatings = (TextView) itemView.findViewById(R.id.restaurantRating);
                this.restaurantTiming = (TextView) itemView.findViewById(R.id.restaurantTiming);
            }
        }
    }

