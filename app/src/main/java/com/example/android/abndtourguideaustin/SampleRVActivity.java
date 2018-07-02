package com.example.android.abndtourguideaustin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SampleRVActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rVAdapter;
    private RecyclerView.LayoutManager rVLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);
        recyclerView = findViewById(R.id.guide_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        rVLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rVLayoutManager);

        ArrayList<PointOfInterest> pointsofInterest = new ArrayList<>();

        pointsofInterest.add(new PointOfInterest("Santorini Cafe","Greek","North Austin",
                "https://www.facebook.com/Santorini-Cafe-Austin-TX-186609728147903/",
                "Great outdoor space for kiddos and dogs. Go for the $2.50 sangria during Happy Hour!"));
        pointsofInterest.add(new PointOfInterest("Torchy's Tacos","Tex-mex","Multiple locations",
                "https://torchystacos.com/","Secret menu"));
        pointsofInterest.add(new PointOfInterest("Baguette House","Vietnamese","North Austin",
                "http://www.baguettehouseaustin.com/","Get veggies separate for to-go orders."));

        //specify an adapter
        rVAdapter = new POIRecyclerViewAdapter(pointsofInterest);
        recyclerView.setAdapter(rVAdapter);
    }
}
