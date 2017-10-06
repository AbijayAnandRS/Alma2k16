package com.example.user.alma2k16;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 23-10-2015.
 */
public class Contactus  extends AppCompatActivity{ MenuDrawer mDrawer;
    Button c;  LinearLayout l1,l2,l3,l4,l5,l6;
Button akshayraj,vishnu,jayanth,steevan,shankara,thushar,alok,piyush,saichandrika,aayush,rajath,manisha,sachinrawat,ankur,alok2,mridul,abhinav,
        rahul,guna,kiran,ipsitha,jayanth2,akshayraj2,kunjan,sarika,ruchith,gaurav,aniket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mDrawer=MenuDrawer.attach(Contactus.this);
        mDrawer.setMenuView(R.layout.menudrawer);
        mDrawer.setContentView(R.layout.contactus);
        SharedPreferences sp=this.getSharedPreferences("myPrefsKe",Context.MODE_PRIVATE);
       int cz=sp.getInt("ha", 0);
        if(cz==0)
        {overridePendingTransition(R.anim.entering, R.anim.leaving);}
        else if(cz==1){
            overridePendingTransition(R.anim.entering1, R.anim.leaving1);

        }
        SharedPreferences.Editor ed =sp.edit();
        ed.putInt("ha", 0);
        ed.commit();
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("CONTACT US");
        c=(Button)toolbar.findViewById(R.id.btnearth);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#00796B"));
        }
        LinearLayout abc=(LinearLayout)findViewById(R.id.lgolout);
        Button cde=(Button)findViewById(R.id.lgo);
        Animation asd= AnimationUtils.loadAnimation(Contactus.this, R.anim.start);
        Animation ads=AnimationUtils.loadAnimation(Contactus.this,R.anim.stop);
        abc.startAnimation(asd);
        cde.startAnimation(ads);


        l1=(LinearLayout)findViewById(R.id.ll1);
        l2=(LinearLayout)findViewById(R.id.ll2);
        l3=(LinearLayout)findViewById(R.id.ll3);
        l4=(LinearLayout)findViewById(R.id.ll4);
        l5=(LinearLayout)findViewById(R.id.ll5);
        l6=(LinearLayout)findViewById(R.id.ll6);
        akshayraj=(Button)findViewById(R.id.aksyraj);
        vishnu=(Button)findViewById(R.id.vishnu);
        jayanth=(Button)findViewById(R.id.jayanth);
        steevan=(Button)findViewById(R.id.steevan);
        shankara=(Button)findViewById(R.id.shankar);
        thushar=(Button)findViewById(R.id.thushar);
        alok=(Button)findViewById(R.id.alokmishra);
        piyush=(Button)findViewById(R.id.piyush);
        saichandrika=(Button)findViewById(R.id.saichandrika);
        aayush=(Button)findViewById(R.id.ayushgarg);
        rajath=(Button)findViewById(R.id.rajath);
        manisha=(Button)findViewById(R.id.manisha);
        sachinrawat=(Button)findViewById(R.id.rawat);
        ankur=(Button)findViewById(R.id.ankurgarg);
        alok2=(Button)findViewById(R.id.alokmishra2);
        mridul=(Button)findViewById(R.id.mridhul);
        abhinav=(Button)findViewById(R.id.abhinavbharathi);
        rahul=(Button)findViewById(R.id.rahul);
        guna=(Button)findViewById(R.id.guna);
        kiran=(Button)findViewById(R.id.kiran);
        ipsitha=(Button)findViewById(R.id.ipsita);
        jayanth2=(Button)findViewById(R.id.jayanth2);
        akshayraj2=(Button)findViewById(R.id.aksyraj2);
        kunjan=(Button)findViewById(R.id.kunjan);
        sarika=(Button)findViewById(R.id.sarika);
        ruchith=(Button)findViewById(R.id.ruchit);
        gaurav=(Button)findViewById(R.id.guarav);
        aniket=(Button)findViewById(R.id.ankitdaas);
        akshayraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg=new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();


                Button fb=(Button)dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/akshyrraj?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        vishnu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr=(TextView)dlg.findViewById(R.id.naame);
                Button rty=(Button)dlg.findViewById(R.id.phooto);
                TextView tvw=(TextView)dlg.findViewById(R.id.emmail);
                TextView saki=(TextView)dlg.findViewById(R.id.phoneno);
                tvr.setText("VISHNU SATHEESAN");
                rty.setBackgroundResource(R.mipmap.visshnu);
                tvw.setText("Email :vishnus@almafiesta.com");
                saki.setText("Phone :7749996168");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/vishnu.satheesan.31?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        akshayraj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg=new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();


                Button fb=(Button)dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/akshyrraj?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        jayanth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr=(TextView)dlg.findViewById(R.id.naame);
                Button rty=(Button)dlg.findViewById(R.id.phooto);
                TextView tvw=(TextView)dlg.findViewById(R.id.emmail);
                TextView saki=(TextView)dlg.findViewById(R.id.phoneno);
                tvr.setText("JAYANT MEENA");
                rty.setBackgroundResource(R.mipmap.jayanyt);
                tvw.setText("Email :jayant@almafiesta.com");
                saki.setText("Phone :8093195810");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/jayant.meena.3139");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        jayanth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr=(TextView)dlg.findViewById(R.id.naame);
                Button rty=(Button)dlg.findViewById(R.id.phooto);
                TextView tvw=(TextView)dlg.findViewById(R.id.emmail);
                TextView saki=(TextView)dlg.findViewById(R.id.phoneno);
                tvr.setText("JAYANT MEENA");
                rty.setBackgroundResource(R.mipmap.jayanyt);
                tvw.setText("Email :jayant@almafiesta.com");
                saki.setText("Phone :8093195810");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/jayant.meena.3139");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        steevan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("STEEVAN");
                rty.setBackgroundResource(R.mipmap.steevn);
                tvw.setText("Email :steevanbabu@gmail.com");
                saki.setText("Phone :7749994734");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/steevanbablu?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        shankara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("SHANKAR CHAUDHARY");
                rty.setBackgroundResource(R.mipmap.shankr);
                tvw.setText("Email :sc16@iitbbs.ac.in");
                saki.setText("Phone :9438397653");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/shankar.kumar.chaudhary.96?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        thushar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("TUSHAR GAUTAM");
                rty.setBackgroundResource(R.mipmap.thusr);
                tvw.setText("Email :tushar@almafiesta.com");
                saki.setText("Phone :9680899328");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/tushargautam.nick?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        alok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("ALOK MISHRA");
                rty.setBackgroundResource(R.mipmap.alkmishra);
                tvw.setText("Email :alok@almafiesta.com");
                saki.setText("Phone :7873376638");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/profile.php?id=100004155522564&fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        alok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("ALOK MISHRA");
                rty.setBackgroundResource(R.mipmap.alkmishra);
                tvw.setText("Email :alok@almafiesta.com");
                saki.setText("Phone :7873376638");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/profile.php?id=100004155522564&fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        piyush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("PIYUSH MITTAL");
                rty.setBackgroundResource(R.mipmap.piyush);
                tvw.setText("Email :piyush@almafiesta.com");
                saki.setText("Phone :7750894867");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/piyush.mittal.7543?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        saichandrika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("SAI CHANDRIKA");
                rty.setBackgroundResource(R.mipmap.saichandrika);
                tvw.setText("Email :gandhamchandrika@gmail.com");
                saki.setText("Phone :9040890582");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/sai.chandrika.925?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        aayush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("AAYUSH GARG");
                rty.setBackgroundResource(R.mipmap.ayshgarg);
                tvw.setText("Email :aayush@almafiesta.com");
                saki.setText("Phone :7749994887");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/aayush.garg.73345?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        rajath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("RAJAT SINHA");
                rty.setBackgroundResource(R.mipmap.rajat);
                tvw.setText("Email :rajat@almafiesta.com");
                saki.setText("Phone :8280329035");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/rajat.sinha.752?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        manisha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("MANISHA BANDLA");
                rty.setBackgroundResource(R.mipmap.mnsha);
                tvw.setText("Email :manishabandlat@gmail.com");
                saki.setText("Phone :7749995957");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/manisha.bandla?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        sachinrawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("SACHIN RAWAT");
                rty.setBackgroundResource(R.mipmap.rwt);
                tvw.setText("Email :sachin@almafiesta.com");
                saki.setText("Phone :7749994498");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/sachin.rawat.1466?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        ankur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("ANKUR GARG");
                rty.setBackgroundResource(R.mipmap.ankiet);
                tvw.setText("Email :akgarg007@gmail.com");
                saki.setText("Phone :7077103633");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/ankur.garg.94?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        mridul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("MRIDUAL MEENA");
                rty.setBackgroundResource(R.mipmap.mrithl);
                tvw.setText("Email :mridul@almafiesta.com");
                saki.setText("Phone :7737222216");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/mridul.meena?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        abhinav .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("ABHINAV BHARTI");
                rty.setBackgroundResource(R.mipmap.abinvbrthi);
                tvw.setText("Email :abhinavbharti@almafiesta.com");
                saki.setText("Phone :8093574900");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/abhinav.bharti2?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        rahul .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("RAHUL SHENDRE");
                rty.setBackgroundResource(R.mipmap.rhl);
                tvw.setText("Email :cchesterahulshendre@gmail.com");
                saki.setText("Phone :7077102046");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/cchesterahul.shendre?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        guna .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("GUNA SHANMUKH");
                rty.setBackgroundResource(R.mipmap.guna);
                tvw.setText("Email :sg16@iitbbs.ac.in");
                saki.setText("Phone :9040893654");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/guna.shanmukh?fref=ts&ref=br_tf");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        kiran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("KIRAN PILLI");
                rty.setBackgroundResource(R.mipmap.kiran);
                tvw.setText("Email :kiran734@gmail.com");
                saki.setText("Phone :9680899328");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/kiran734");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        ipsitha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("IPSITA OHJA");
                rty.setBackgroundResource(R.mipmap.ipsta);
                tvw.setText("Email :ipsithaojha67@gmail.com");
                saki.setText("Phone :9438063635");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/profile.php?id=100002510835497&fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        kunjan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("KUNJAN SHRIVASTAVA");
                rty.setBackgroundResource(R.mipmap.kungan);
                tvw.setText("Email :kunjan@almafiesta.com");
                saki.setText("Phone :9938790845");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/kunjan.shrivastava?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        sarika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("SARIKA DUDDELLA");
                rty.setBackgroundResource(R.mipmap.sarika);
                tvw.setText("Email :sarika@almafiesta.com");
                saki.setText("Phone :9680899328");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/sarika.duddela?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        ruchith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("RUCHIT");
                rty.setBackgroundResource(R.mipmap.rchit);
                tvw.setText("Email :ruchit@almafiesta.com");
                saki.setText("Phone :9500157836");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/RUCHITKAPLESH?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });

        gaurav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("GOURAV AGARWAL");
                rty.setBackgroundResource(R.mipmap.guarav);
                tvw.setText("Email :gourav@almafiesta.com");
                saki.setText("Phone :8908229775");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/gourav.agarwal.35?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });
        aniket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg = new Dialog(Contactus.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.senior);
                dlg.setCancelable(true);
                dlg.show();
                TextView tvr = (TextView) dlg.findViewById(R.id.naame);
                Button rty = (Button) dlg.findViewById(R.id.phooto);
                TextView tvw = (TextView) dlg.findViewById(R.id.emmail);
                TextView saki = (TextView) dlg.findViewById(R.id.phoneno);
                tvr.setText("ANIKET DAS");
                rty.setBackgroundResource(R.mipmap.ankitdas);
                tvw.setText("Email :aniket@almafiesta.com");
                saki.setText("Phone :7750894707");


                Button fb = (Button) dlg.findViewById(R.id.fconnect);
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                        NetworkInfo ni = cm.getActiveNetworkInfo();
                        if (ni == null) {
                            Toast t = Toast.makeText(Contactus.this, "Please Connect to Network", Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            Dialog thj = new Dialog(Contactus.this, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                            thj.setContentView(R.layout.wbalt);
                            WebView w = (WebView) thj.findViewById(R.id.wb);
                            w.setWebViewClient(new Web());
                            w.getSettings().setJavaScriptEnabled(true);
                            w.getSettings().setLoadWithOverviewMode(true);
                            w.getSettings().setUseWideViewPort(true);
                            w.loadUrl("https://www.facebook.com/aniket.das.982845?fref=ts");
                            thj.setCancelable(true);
                            thj.show();


                        }

                    }
                });

            }
        });





































        c.setOnClickListener(new View.OnClickListener() {
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
                    Intent g=new Intent(Contactus.this,fg);
                    startActivity(g);
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
                    Intent g=new Intent(Contactus.this,fg);
                    startActivity(g);
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
                    Intent g=new Intent(Contactus.this,fg);
                    startActivity(g);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.workshop");
                    Intent g=new Intent(Contactus.this,fg);
                    startActivity(g);


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
            Intent g=new Intent(Contactus.this,gh);
            startActivity(g);
            this.finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
