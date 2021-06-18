package com.example.techteamdemoapp;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Delivery extends Fragment {
    TextView restaurantNo;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.delivery, null);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        restaurantNo = (TextView) view.findViewById(R.id.no_restaurants);
        //(String restaurantName, String restaurantAdd, String restaurantCuisine, String restaurantTimings, int imageID, float ratings)
        MyListData[] myListData = new MyListData[] {
                new MyListData("Thai-end Restaurant", "3949  Par Drive, Lompoc", "Thai, Asian", "11 AM to 6PM", R.drawable.thai_img, 4.8f),
                new MyListData("Sushi-Kart", "1718  Hershell Road, Johnson City", "Asian, Rice", "11 AM to 6PM",R.drawable.sushi_img, 4.7f),
                new MyListData("Smith's Cafe", "1367  Hillhaven Drive, Irvine", "Cafe, Coffee, Snacks", "11 AM to 6PM", R.drawable.cafe_img , 4.6f),
                new MyListData("Pizza House", "4453  Bassell Avenue, Twin Rocks", "Italian, Pizza", "11 AM to 9PM",  R.drawable.pizza_img, 4.5f),
                new MyListData("Mom's Spaghetti", "3635  Lighthouse Drive, Southington", "Italian, Pasta", "11 AM to 9PM", R.drawable.italian_img, 4.9f),
                new MyListData("The Fries", "10  Faraway Junction, Leicester", "Snacks, American, Fast-food", "9 AM to 2PM", R.drawable.fries_img, 4.4f),
                new MyListData("GOAT House", "255  Garinchha Residency, Aires", "South-American, Dinner", "7 AM to 11PM", R.drawable.steaks_img, 4.1f),
        };
        int length = myListData.length;
        restaurantNo.setText(String.valueOf(length)+" restaurants");

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        ListAdapter adapter = new ListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        recyclerView.scrollToPosition(0);
    }



}
