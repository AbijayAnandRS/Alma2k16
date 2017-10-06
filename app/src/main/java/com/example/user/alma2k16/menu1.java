package com.example.user.alma2k16;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by user on 20-10-2015.
 */
public class menu1 extends AppCompatActivity{
    MenuDrawer mDrawer;LinearLayout l1,l2,l3,l4,l5,l6;Button b1;
    LinearLayout iv1,iv2,iv3,iv4,iv5,iv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawer=MenuDrawer.attach(menu1.this);
        mDrawer.setMenuView(R.layout.menudrawer);
        mDrawer.setContentView(R.layout.home);
        SharedPreferences sp=this.getSharedPreferences("myPrefsKe", Context.MODE_PRIVATE);
        int cz=sp.getInt("ha",0);
        if(cz==0)
        {overridePendingTransition(R.anim.entering, R.anim.leaving);}
        else if(cz==1){
            overridePendingTransition(R.anim.entering1, R.anim.leaving1);

        }
        SharedPreferences.Editor ed =sp.edit();
        ed.putInt("ha", 0);
        ed.commit();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#00796B"));
        }
        LinearLayout abc=(LinearLayout)findViewById(R.id.lgolout);
        Button cde=(Button)findViewById(R.id.lgo);
        Animation asd= AnimationUtils.loadAnimation(menu1.this, R.anim.start);
        Animation ads=AnimationUtils.loadAnimation(menu1.this, R.anim.stop);
        abc.startAnimation(asd);
        cde.startAnimation(ads);


        l1=(LinearLayout)findViewById(R.id.ll1);
        l2=(LinearLayout)findViewById(R.id.ll2);
        l3=(LinearLayout)findViewById(R.id.ll3);
        l4=(LinearLayout)findViewById(R.id.ll4);
        l5=(LinearLayout)findViewById(R.id.ll5);
        l6=(LinearLayout)findViewById(R.id.ll6);

        iv1=(LinearLayout)findViewById(R.id.dance);
        iv2=(LinearLayout)findViewById(R.id.litarary);
        iv3=(LinearLayout)findViewById(R.id.fine_arts);
        iv4=(LinearLayout)findViewById(R.id.music);
        iv5=(LinearLayout)findViewById(R.id.drama);
        iv6=(LinearLayout)findViewById(R.id.moree);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("EVENTS");







        b1=(Button)toolbar.findViewById(R.id.btnearth);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.openMenu();

            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();

                try {

                    Class fg=Class.forName("com.example.user.alma2k16.MainActivity");
                   Intent ie=new Intent(menu1.this,fg);
                    startActivity(ie);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.Contactus");
                    Intent ie=new Intent(menu1.this,fg);
                    startActivity(ie);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv1.setBackgroundColor(Color.parseColor("#FF006400"));

                try {

                   Class fg=Class.forName("com.example.user.alma2k16.dance");
                   Intent ie=new Intent(menu1.this,fg);
                    startActivity(ie);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv2.setBackgroundColor(Color.parseColor("#520541"));

                try {
                    Class fg=Class.forName("com.example.user.alma2k16.litrary");
                   Intent ie=new Intent(menu1.this,fg);
                    startActivity(ie);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv3.setBackgroundColor(Color.parseColor("#2A0481"));

                try {
                    Class fg=Class.forName("com.example.user.alma2k16.finearts");
                   Intent ie=new Intent(menu1.this,fg);
                    startActivity(ie);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv4.setBackgroundColor(Color.parseColor("#616161"));

                try {
                    Class fg=Class.forName("com.example.user.alma2k16.music");
                   Intent ie=new Intent(menu1.this,fg);
                    startActivity(ie);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv5.setBackgroundColor(Color.parseColor("#AA9B1D"));
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.drama");
                   Intent ie=new Intent(menu1.this,fg);
                    startActivity(ie);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv6.setBackgroundColor(Color.parseColor("#FE1F01"));
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.more");
                   Intent ie=new Intent(menu1.this,fg);
                    startActivity(ie);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.workshop");
                    Intent ie=new Intent(menu1.this,fg);
                    startActivity(ie);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.gallery");
                    Intent ie=new Intent(menu1.this,fg);
                    startActivity(ie);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });




    }
    @Override
    public void onBackPressed() {
        mDrawer.closeMenu();
        SharedPreferences sp=this.getSharedPreferences("myPrefsKe",Context.MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putInt("ha",1);
        ed.commit();
        try {
            Class gh=Class.forName("com.example.user.alma2k16.MainActivity");
            Intent ie=new Intent(menu1.this,gh);
            startActivity(ie);
            this.finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
