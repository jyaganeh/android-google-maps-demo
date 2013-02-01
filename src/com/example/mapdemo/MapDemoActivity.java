package com.example.mapdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class MapDemoActivity extends FragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		GoogleMap map = ((SupportMapFragment)
				getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		
		map.setMyLocationEnabled(true);
	}
}
