package com.example.user.alma2k16;

import android.app.Activity;
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
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by user on 25-10-2015.
 */
public class workshop extends AppCompatActivity {
    MenuDrawer mDrawer;Button b1,c1,c2,c3,c4,c5,c6;
    LinearLayout l1,l2,l3,l4,l5,l6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawer=MenuDrawer.attach(workshop.this);
        mDrawer.setMenuView(R.layout.menudrawer);
        mDrawer.setContentView(R.layout.workshop);
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
        l1=(LinearLayout)findViewById(R.id.ll1);
        l2=(LinearLayout)findViewById(R.id.ll2);
        l3=(LinearLayout)findViewById(R.id.ll3);
        l4=(LinearLayout)findViewById(R.id.ll4);
        l5=(LinearLayout)findViewById(R.id.ll5);
        l6=(LinearLayout)findViewById(R.id.ll6);

        Button bc1=(Button)findViewById(R.id.lgo);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("WORKSHOP");
        b1=(Button)toolbar.findViewById(R.id.btnearth);
        c1=(Button)findViewById(R.id.salsa);
        c2=(Button)findViewById(R.id.selfdefence);
        c3=(Button)findViewById(R.id.paperq);

        c4=(Button)findViewById(R.id.moviemaking);
        c6=(Button)findViewById(R.id.claym);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#00796B"));
        }
        LinearLayout abc=(LinearLayout)findViewById(R.id.lgolout);
        Button cde=(Button)findViewById(R.id.lgo);
        Animation asd=AnimationUtils.loadAnimation(workshop.this,R.anim.start);
        Animation ads=AnimationUtils.loadAnimation(workshop.this,R.anim.stop);
        abc.startAnimation(asd);
        cde.startAnimation(ads);

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.extramor");
                    Intent ij=new Intent(workshop.this,fg);
                    startActivity(ij);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.hiphope");
                    Intent ij=new Intent(workshop.this,fg);
                    startActivity(ij);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });



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
                    Intent ij=new Intent(workshop.this,fg);
                    startActivity(ij);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.menu1");
                    Intent ij=new Intent(workshop.this,fg);
                    startActivity(ij);

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
                    Intent ij=new Intent(workshop.this,fg);
                    startActivity(ij);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
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
                    Intent ij=new Intent(workshop.this,fg);
                    startActivity(ij);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.salsaa");
                    Intent ij=new Intent(workshop.this,fg);
                    startActivity(ij);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.selfdfnce");
                    Intent ij=new Intent(workshop.this,fg);
                    startActivity(ij);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
        c4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.mviemkng");
                    Intent ij=new Intent(workshop.this,fg);
                    startActivity(ij);
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
            Intent ij=new Intent(workshop.this,gh);
            startActivity(ij);
            this.finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
