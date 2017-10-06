package com.example.user.alma2k16;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.SubMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;


public class MainActivity extends AppCompatActivity {TextView txt;Button ivw;
    MenuDrawer mDrawer;LinearLayout l1,l2,l3,l4,l5,l6;Button b1;TextView th;
    Animation abhi;int c=0;Animation ic,ig;int abc=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        mDrawer=MenuDrawer.attach(MainActivity.this);
        mDrawer.setMenuView(R.layout.menudrawer);
        mDrawer.setContentView(R.layout.activity_main);
        SharedPreferences sp=this.getSharedPreferences("myPrefsKe",Context.MODE_PRIVATE);
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
        Animation asd=AnimationUtils.loadAnimation(MainActivity.this,R.anim.start);
        Animation ads=AnimationUtils.loadAnimation(MainActivity.this,R.anim.stop);
        abc.startAnimation(asd);
        cde.startAnimation(ads);


        fun();

        ivw=(Button)findViewById(R.id.iv1);


        l1=(LinearLayout)findViewById(R.id.ll1);
        l2=(LinearLayout)findViewById(R.id.ll2);
        l3=(LinearLayout)findViewById(R.id.ll3);
        l4=(LinearLayout)findViewById(R.id.ll4);

        l6=(LinearLayout)findViewById(R.id.ll6);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Alma Fiesta");
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
            }
        });



        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDrawer.closeMenu();


                try {

                    Class gh = Class.forName("com.example.user.alma2k16.menu1");
                    Intent ij = new Intent(MainActivity.this, gh);
                    startActivity(ij);


                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDrawer.closeMenu();


                try {
                    Class fg=Class.forName("com.example.user.alma2k16.Contactus");
                    Intent ij=new Intent(MainActivity.this,fg);
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
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.workshop");
                    Intent ij=new Intent(MainActivity.this,fg);
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
                    Intent ij=new Intent(MainActivity.this,fg);
                    startActivity(ij);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
        ic=AnimationUtils.loadAnimation(MainActivity.this,R.anim.imagecome);
        ig=AnimationUtils.loadAnimation(MainActivity.this,R.anim.imagego);
        ivw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                if(c==1){
                    ivw.startAnimation(ig);

                   ivw.setBackgroundResource(R.mipmap.bt2);
                    ivw.startAnimation(ic);
                }
                else if(c==2){
                    ivw.startAnimation(ig);

                    ivw.setBackgroundResource(R.mipmap.btn3);

                    ivw.startAnimation(ic);
                }
                else if(c==3){
                    ivw.startAnimation(ig);

                    ivw.setBackgroundResource(R.mipmap.bt4);

                    ivw.startAnimation(ic);
                }
                else if(c==4){
                    ivw.startAnimation(ig);

                    ivw.setBackgroundResource(R.mipmap.bt1);

                    ivw.startAnimation(ic);
                    c=0;
                }


            }
        });








    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo ni = cm.getActiveNetworkInfo();
            if (ni == null) {
                Toast t = Toast.makeText(MainActivity.this, "Please Connect to Network", Toast.LENGTH_LONG);
                t.show();
            } else {
                Dialog thj = new Dialog(MainActivity.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                thj.setContentView(R.layout.wbalt);
                WebView w = (WebView) thj.findViewById(R.id.wb);
                w.setWebViewClient(new Web());
                w.getSettings().setJavaScriptEnabled(true);
                w.getSettings().setLoadWithOverviewMode(true);
                w.getSettings().setUseWideViewPort(true);
                w.loadUrl("http://register.almafiesta.com");
                thj.setCancelable(true);
                thj.show();}


           return true;



        }
        if (id == R.id.almawebsite) {
            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo ni = cm.getActiveNetworkInfo();
            if (ni == null) {
                Toast t = Toast.makeText(MainActivity.this, "Please Connect to Network", Toast.LENGTH_LONG);
                t.show();
            } else {
                Dialog thj = new Dialog(MainActivity.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                thj.setContentView(R.layout.wbalt);
                WebView w = (WebView) thj.findViewById(R.id.wb);
                w.setWebViewClient(new Web());
                w.getSettings().setJavaScriptEnabled(true);
                w.getSettings().setLoadWithOverviewMode(true);
                w.getSettings().setUseWideViewPort(true);
                w.loadUrl("http://almafiesta.com");
                thj.setCancelable(true);
                thj.show();}


            return true;



        }

        return super.onOptionsItemSelected(item);
    }
    public void fun(){
ImageView icon=new ImageView(this);
        icon.setImageResource(R.mipmap.icolor);



        FloatingActionButton fButton=new FloatingActionButton.Builder(this).setContentView(icon).build();


        ImageView twiter=new ImageView(this);
        twiter.setImageResource(R.mipmap.twitter);

        ImageView youtbe=new ImageView(this);
        youtbe.setImageResource(R.mipmap.youtube);


        ImageView map=new ImageView(this);
        map.setImageResource(R.mipmap.map);


        ImageView fcbk=new ImageView(this);
        fcbk.setImageResource(R.mipmap.facebook);



        SubActionButton.Builder blder=new SubActionButton.Builder(this);
        SubActionButton ta=blder.setContentView(map).build();



        SubActionButton tw=blder.setContentView(twiter).build();

        SubActionButton gh=blder.setContentView(youtbe).build();

        SubActionButton jh=blder.setContentView(fcbk).build();



        FloatingActionMenu actmnu=new FloatingActionMenu.Builder(this).addSubActionView(ta).addSubActionView(tw).addSubActionView(gh).addSubActionView(jh).attachTo(fButton).build();

      ta.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {


              try {
                  Class fg = Class.forName("com.example.user.alma2k16.maps");
                  Intent ij = new Intent(MainActivity.this, fg);
                  startActivity(ij);

              } catch (ClassNotFoundException e) {
                  e.printStackTrace();
              }
          }

      });
  tw.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
          NetworkInfo ni=cm.getActiveNetworkInfo();
          if(ni==null)
          {
              Toast t=Toast.makeText(MainActivity.this,"Please Connect to Network",Toast.LENGTH_LONG);
              t.show();
          }
          else{

              try {
                  Class fg=Class.forName("com.example.user.alma2k16.twitter");
                  Intent ij=new Intent(MainActivity.this,fg);
                  startActivity(ij);

              } catch (ClassNotFoundException e) {
                  e.printStackTrace();
              }

          }


      }
  });
        gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo ni=cm.getActiveNetworkInfo();
                if(ni==null)
                {
                    Toast t=Toast.makeText(MainActivity.this,"Please Connect to Network",Toast.LENGTH_LONG);
                    t.show();
                }
                else{

                    try {
                        Class fg=Class.forName("com.example.user.alma2k16.youtube");
                        Intent ij=new Intent(MainActivity.this,fg);
                        startActivity(ij);

                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                }

            }
        });
        jh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo ni = cm.getActiveNetworkInfo();
                if (ni == null) {
                    Toast t = Toast.makeText(MainActivity.this, "Please Connect to Network", Toast.LENGTH_LONG);
                    t.show();
                } else {

                    try {
                        Class fg = Class.forName("com.example.user.alma2k16.facebook");
                        Intent ij = new Intent(MainActivity.this, fg);
                        startActivity(ij);

                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                }

            }
        });

        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(5000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                c++;
                                if(c==1){
                                    ivw.startAnimation(ig);

                                    ivw.setBackgroundResource(R.mipmap.bt2);
                                    ivw.startAnimation(ic);
                                }
                                else if(c==2){
                                    ivw.startAnimation(ig);

                                    ivw.setBackgroundResource(R.mipmap.btn3);

                                    ivw.startAnimation(ic);
                                }
                                else if(c==3){
                                    ivw.startAnimation(ig);

                                    ivw.setBackgroundResource(R.mipmap.bt4);

                                    ivw.startAnimation(ic);
                                }
                                else if(c==4){
                                    ivw.startAnimation(ig);

                                    ivw.setBackgroundResource(R.mipmap.bt1);

                                    ivw.startAnimation(ic);
                                    c=0;
                                }



                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t.start();





    }


}
