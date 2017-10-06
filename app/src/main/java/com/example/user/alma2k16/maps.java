package com.example.user.alma2k16;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);



        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camera
        LatLng iitbbsr = new LatLng(20.303, 85.8240);
        LatLng argul=new LatLng(20.127,85.6704);
        LatLng Thoshali=new LatLng(20.294,85.8241);
        LatLng rail1=new LatLng(20.1535,85.7086);
        LatLng rail2=new LatLng(20.2656,85.8431);
        LatLng hos1=new LatLng(20.3000,85.8665);
        LatLng hos2=new LatLng(20.30559,85.8317877);
        LatLng airport=new LatLng(20.2444,85.8178);
        mMap.addMarker(new MarkerOptions().position(Thoshali).title("TOSHALI").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions().position(argul).title("HOSTEL").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))) ;
        mMap.addMarker(new MarkerOptions().position(iitbbsr).title("EVENTS").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iit)));
        mMap.addMarker(new MarkerOptions().position(rail1).title("KHURDHA RLY STATION").icon(BitmapDescriptorFactory.fromResource(R.mipmap.train)));
        mMap.addMarker(new MarkerOptions().position(rail2).title("RLY STATION BBSR").icon(BitmapDescriptorFactory.fromResource(R.mipmap.train)));
        mMap.addMarker(new MarkerOptions().position(hos1).title("HI-TECH HOSPITAL").icon(BitmapDescriptorFactory.fromResource(R.mipmap.hospital)));
        mMap.addMarker(new MarkerOptions().position(hos2).title("APOLLO HOSPITAL").icon(BitmapDescriptorFactory.fromResource(R.mipmap.hospital)));
        mMap.addMarker(new MarkerOptions().position(airport).title("BIJU PATNAIK AIRPORT").icon(BitmapDescriptorFactory.fromResource(R.mipmap.plane)));

       mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(iitbbsr,10));


    }
    @Override
    public void onBackPressed() {
        SharedPreferences sp=this.getSharedPreferences("myPrefsKe", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putInt("ha",1);
        ed.commit();
        try {
            Class gh=Class.forName("com.example.user.alma2k16.MainActivity");
            Intent ie=new Intent(maps.this,gh);
            startActivity(ie);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}