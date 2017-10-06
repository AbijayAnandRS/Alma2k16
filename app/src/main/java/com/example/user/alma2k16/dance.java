package com.example.user.alma2k16;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 22-10-2015.
 */
public class  dance extends AppCompatActivity {
    int cz;

    int v1=1,v2=1,v3=1;int d=0;
    Button reg1,reg2,reg3;
    LinearLayout l1, l2, l3, l4, l5, l6;
    Button b1;
    Button r1, r2, r3;
    Button c1, c2, c3;
    Button p1;
    TextView t1, t2;
    Dialog fgh;


    MenuDrawer mDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawer = MenuDrawer.attach(dance.this);
        mDrawer.setMenuView(R.layout.menudrawer);
        mDrawer.setContentView(R.layout.dance);

        SharedPreferences sp=this.getSharedPreferences("myPrefsKe",Context.MODE_PRIVATE);
        cz=sp.getInt("ha",0);
        if(cz==0)
        {overridePendingTransition(R.anim.entering, R.anim.leaving);}
        else if(cz==1){
            overridePendingTransition(R.anim.entering1, R.anim.leaving1);

        }
        SharedPreferences.Editor ed =sp.edit();
        ed.putInt("ha",0);
        ed.commit();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#FF006400"));
        }
        LinearLayout abc=(LinearLayout)findViewById(R.id.lgolout);
        Button cde=(Button)findViewById(R.id.lgo);
        Animation asd= AnimationUtils.loadAnimation(dance.this, R.anim.start);
        Animation ads=AnimationUtils.loadAnimation(dance.this, R.anim.stop);
        abc.startAnimation(asd);
        cde.startAnimation(ads);

        LinearLayout lgobg=(LinearLayout)findViewById(R.id.logobg);
        lgobg.setBackgroundColor(Color.parseColor("#FF006400"));



        l1 = (LinearLayout) findViewById(R.id.ll1);
        l2 = (LinearLayout) findViewById(R.id.ll2);
        l3 = (LinearLayout) findViewById(R.id.ll3);
        l4 = (LinearLayout) findViewById(R.id.ll4);
        l5 = (LinearLayout) findViewById(R.id.ll5);
        l6 = (LinearLayout) findViewById(R.id.ll6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("DANCE");

        b1 = (Button) toolbar.findViewById(R.id.btnearthhd);
        r1 = (Button) findViewById(R.id.rdd1);
        r2 = (Button) findViewById(R.id.rdtopsy);
        r3 = (Button) findViewById(R.id.rdd3);
        c1 = (Button) findViewById(R.id.dc1);
        c2 = (Button) findViewById(R.id.dc2);
        c3 = (Button) findViewById(R.id.dc3);
        reg1=(Button)findViewById(R.id.reg1dace);
        reg2=(Button)findViewById(R.id.reg2dnce);
        reg3=(Button)findViewById(R.id.reg3dnce);
        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo ni=cm.getActiveNetworkInfo();
                if(ni==null)
                {
                    Toast t=Toast.makeText(dance.this,"Please Connect to Network",Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Dialog thj=new Dialog(dance.this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                    thj.setContentView(R.layout.wbalt);
                    WebView w=(WebView)thj.findViewById(R.id.wb);
                    w.setWebViewClient(new Web());
                    w.getSettings().setJavaScriptEnabled(true);
                    w.getSettings().setLoadWithOverviewMode(true);
                    w.getSettings().setUseWideViewPort(true);
                    w.loadUrl("http://register.almafiesta.com");
                    thj.setCancelable(true);
                    thj.show();





                }
            }
        });
        reg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo ni=cm.getActiveNetworkInfo();
                if(ni==null)
                {
                    Toast t=Toast.makeText(dance.this,"Please Connect to Network",Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Dialog thj=new Dialog(dance.this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                    thj.setContentView(R.layout.wbalt);
                    WebView w=(WebView)thj.findViewById(R.id.wb);
                    w.setWebViewClient(new Web());
                    w.getSettings().setJavaScriptEnabled(true);
                    w.getSettings().setLoadWithOverviewMode(true);
                    w.getSettings().setUseWideViewPort(true);
                    w.loadUrl("http://register.almafiesta.com");
                    thj.setCancelable(true);
                    thj.show();





                }
            }
        });
        reg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo ni = cm.getActiveNetworkInfo();
                if (ni == null) {
                    Toast t = Toast.makeText(dance.this, "Please Connect to Network", Toast.LENGTH_LONG);
                    t.show();
                } else {
                    Dialog thj = new Dialog(dance.this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
                    thj.setContentView(R.layout.wbalt);
                    WebView w = (WebView) thj.findViewById(R.id.wb);
                    w.setWebViewClient(new Web());
                    w.getSettings().setJavaScriptEnabled(true);
                    w.getSettings().setLoadWithOverviewMode(true);
                    w.getSettings().setUseWideViewPort(true);
                    w.loadUrl("http://register.almafiesta.com");
                    thj.setCancelable(true);
                    thj.show();


                }
            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                final Dialog dlg = new Dialog(dance.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.mtcntct);
                LinearLayout bo=(LinearLayout)dlg.findViewById(R.id.lnrltb);
                final Button btncntcte=(Button)dlg.findViewById(R.id.btncntct);
                final TextView emailp=(TextView)dlg.findViewById(R.id.tvemail);
                final TextView contact=(TextView)dlg.findViewById(R.id.tvcontact);
                btncntcte.setBackgroundResource(R.mipmap.kushagrapndy);
                final TextView tve=(TextView)dlg.findViewById(R.id.publyevnts);
                tve.setText("PUBLICITY");
                 emailp.setText("Email : kushagra.alma@gmail.com");
                contact.setText("Mobile : 7077102204");
                LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                dlg.setCancelable(true);
                dlg.show();
                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        d=1;
                        dlg.cancel();

                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:7077102204"));
                        if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            // TODO: Consider calling
                            //    ActivityCompat#requestPermissions
                            // here to request the missing permissions, and then overriding
                            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                            //                                          int[] grantResults)
                            // to handle the case where the user grants the permission. See the documentation
                            // for ActivityCompat#requestPermissions for more details.
                            return;
                        }
                        startActivity(callIntent);

                    }
                });
                message.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        d=1;
                        dlg.cancel();
                        final Dialog fgh=new Dialog(dance.this);
                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        fgh.setContentView(R.layout.email);
                        final EditText content=(EditText)fgh.findViewById(R.id.emailtext);
                        Button emailsend=(Button)fgh.findViewById(R.id.emailsend);
                        emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                        fgh.setCancelable(true);
                        fgh.show();
                        emailsend.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String emailcontent = content.getText().toString();

                                fgh.cancel();

                                String emai[] = {"kushagra.alma@gmail.com"};

                                Intent emailintent = new Intent(Intent.ACTION_SEND);
                                emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                emailintent.setType("plain/text");
                                emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                startActivity(emailintent);
                            }
                        });


                    }
                });
                bo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v1 == 0) {


                            btncntcte.setBackgroundResource(R.mipmap.kushagrapndy);
                            tve.setText("PUBLICITY");
                            emailp.setText("Email : kushagra.alma@gmail.com");
                            contact.setText("Mobile : 7077102204");
                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                            dlg.setCancelable(true);
                            dlg.show();
                            call.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();

                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                    callIntent.setData(Uri.parse("tel:7077102204"));
                                    if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                        // TODO: Consider calling
                                        //    ActivityCompat#requestPermissions
                                        // here to request the missing permissions, and then overriding
                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                        //                                          int[] grantResults)
                                        // to handle the case where the user grants the permission. See the documentation
                                        // for ActivityCompat#requestPermissions for more details.
                                        return;
                                    }
                                    startActivity(callIntent);

                                }
                            });
                            message.setOnClickListener(new View.OnClickListener() {

                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();
                                    final Dialog fgh = new Dialog(dance.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                    fgh.setCancelable(true);
                                    fgh.show();
                                    emailsend.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            String emailcontent = content.getText().toString();

                                            fgh.cancel();

                                            String emai[] = {"kushagra.alma@gmail.com"};

                                            Intent emailintent = new Intent(Intent.ACTION_SEND);
                                            emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                            emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                            emailintent.setType("plain/text");
                                            emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                            startActivity(emailintent);
                                        }
                                    });


                                }
                            });
                            v1 = 1;
                        } else if (v1 == 1) {


                            btncntcte.setBackgroundResource(R.mipmap.maniyadav);

                            tve.setText("EVENTS");
                            emailp.setText("Email : Mani-maniy7838@gmail.com");
                            contact.setText("Mobile : 7077100155");
                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                            dlg.setCancelable(true);
                            dlg.show();
                            call.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();

                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                    callIntent.setData(Uri.parse("tel:7077100155"));
                                    if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                        // TODO: Consider calling
                                        //    ActivityCompat#requestPermissions
                                        // here to request the missing permissions, and then overriding
                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                        //                                          int[] grantResults)
                                        // to handle the case where the user grants the permission. See the documentation
                                        // for ActivityCompat#requestPermissions for more details.
                                        return;
                                    }
                                    startActivity(callIntent);

                                }
                            });
                            message.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();
                                    final Dialog fgh = new Dialog(dance.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                    fgh.setCancelable(true);
                                    fgh.show();
                                    emailsend.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            String emailcontent = content.getText().toString();

                                            fgh.cancel();

                                            String emai[] = {"Mani-maniy7838@gmail.com"};

                                            Intent emailintent = new Intent(Intent.ACTION_SEND);
                                            emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                            emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                            emailintent.setType("plain/text");
                                            emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                            startActivity(emailintent);
                                        }
                                    });


                                }
                            });
                            v1 = 0;

                        }

                    }
                });


                    Thread t = new Thread() {

                        @Override
                        public void run() {
                            try {


                                while (!isInterrupted()) {


                                    Thread.sleep(6000);
                                    runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            if (v1 == 0) {




                                                btncntcte.setBackgroundResource(R.mipmap.kushagrapndy);
                                                tve.setText("PUBLICITY");
                                                emailp.setText("Email : kushagra.alma@gmail.com");
                                                contact.setText("Mobile : 7077102204");
                                                LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                                                LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                                                dlg.setCancelable(true);

                                                call.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View v) {
                                                        d = 1;
                                                        dlg.cancel();

                                                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                                                        callIntent.setData(Uri.parse("tel:7077102204"));
                                                        if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                            // TODO: Consider calling
                                                            //    ActivityCompat#requestPermissions
                                                            // here to request the missing permissions, and then overriding
                                                            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                                            //                                          int[] grantResults)
                                                            // to handle the case where the user grants the permission. See the documentation
                                                            // for ActivityCompat#requestPermissions for more details.
                                                            return;
                                                        }
                                                        startActivity(callIntent);

                                                    }
                                                });
                                                message.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        d = 1;
                                                        dlg.cancel();

                                                        final Dialog fgh = new Dialog(dance.this);
                                                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                        fgh.setContentView(R.layout.email);
                                                        final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                        Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                        emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                                        fgh.setCancelable(true);
                                                        fgh.show();
                                                        emailsend.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                String emailcontent = content.getText().toString();

                                                                fgh.cancel();

                                                                String emai[] = {"kushagra.alma@gmail.com"};

                                                                Intent emailintent = new Intent(Intent.ACTION_SEND);
                                                                emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                                                emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                                                emailintent.setType("plain/text");
                                                                emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                                                startActivity(emailintent);
                                                            }
                                                        });


                                                    }
                                                });
                                                v1 = 1;
                                            } else if (v1 == 1) {


                                                btncntcte.setBackgroundResource(R.mipmap.maniyadav);
                                                tve.setText("EVENTS");
                                                emailp.setText("Email : Mani-maniy7838@gmail.com");
                                                contact.setText("Mobile : 7077100155");
                                                LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                                                LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                                                dlg.setCancelable(true);

                                                call.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View v) {
                                                        d = 1;
                                                        dlg.cancel();

                                                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                                                        callIntent.setData(Uri.parse("tel:7077100155"));
                                                        if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                            // TODO: Consider calling
                                                            //    ActivityCompat#requestPermissions
                                                            // here to request the missing permissions, and then overriding
                                                            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                                            //                                          int[] grantResults)
                                                            // to handle the case where the user grants the permission. See the documentation
                                                            // for ActivityCompat#requestPermissions for more details.
                                                            return;
                                                        }
                                                        startActivity(callIntent);

                                                    }
                                                });
                                                message.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        d = 1;
                                                        dlg.cancel();
                                                        final Dialog fgh = new Dialog(dance.this);
                                                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                        fgh.setContentView(R.layout.email);
                                                        final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                        Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                        emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                                        fgh.setCancelable(true);
                                                        fgh.show();
                                                        emailsend.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                String emailcontent = content.getText().toString();

                                                                fgh.cancel();

                                                                String emai[] = {"Mani-maniy7838@gmail.com"};

                                                                Intent emailintent = new Intent(Intent.ACTION_SEND);
                                                                emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                                                emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                                                emailintent.setType("plain/text");
                                                                emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                                                startActivity(emailintent);
                                                            }
                                                        });


                                                    }
                                                });
                                                v1 = 0;

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
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                final Dialog dlg = new Dialog(dance.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.mtcntct);
                LinearLayout bo=(LinearLayout)dlg.findViewById(R.id.lnrltb);
                final Button btncntcte=(Button)dlg.findViewById(R.id.btncntct);
                final TextView emailp=(TextView)dlg.findViewById(R.id.tvemail);
                final TextView contact=(TextView)dlg.findViewById(R.id.tvcontact);
                btncntcte.setBackgroundResource(R.mipmap.radesyam);
                final TextView tve=(TextView)dlg.findViewById(R.id.publyevnts);
                tve.setText("PUBLICITY");
                emailp.setText("Email : rt13@iitbbs.ac.in");
                contact.setText("Mobile : 8093214495");
                LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                dlg.setCancelable(true);
                dlg.show();
                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        d=1;
                        dlg.cancel();

                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:8093214495"));
                        if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            // TODO: Consider calling
                            //    ActivityCompat#requestPermissions
                            // here to request the missing permissions, and then overriding
                            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                            //                                          int[] grantResults)
                            // to handle the case where the user grants the permission. See the documentation
                            // for ActivityCompat#requestPermissions for more details.
                            return;
                        }
                        startActivity(callIntent);

                    }
                });
                message.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        d=1;
                        dlg.cancel();
                        final Dialog fgh=new Dialog(dance.this);
                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        fgh.setContentView(R.layout.email);
                        final EditText content=(EditText)fgh.findViewById(R.id.emailtext);
                        Button emailsend=(Button)fgh.findViewById(R.id.emailsend);
                        emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                        fgh.setCancelable(true);
                        fgh.show();
                        emailsend.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String emailcontent = content.getText().toString();

                                fgh.cancel();

                                String emai[] = {"rt13@iitbbs.ac.in"};

                                Intent emailintent = new Intent(Intent.ACTION_SEND);
                                emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                emailintent.setType("plain/text");
                                emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                startActivity(emailintent);
                            }
                        });


                    }
                });
                bo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v2 == 0) {


                            btncntcte.setBackgroundResource(R.mipmap.radesyam);
                            tve.setText("PUBLICITY");
                            emailp.setText("Email : rt13@iitbbs.ac.in");
                            contact.setText("Mobile : 8093214495");
                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                            dlg.setCancelable(true);
                            dlg.show();
                            call.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();

                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                    callIntent.setData(Uri.parse("tel:8093214495"));
                                    if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                        // TODO: Consider calling
                                        //    ActivityCompat#requestPermissions
                                        // here to request the missing permissions, and then overriding
                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                        //                                          int[] grantResults)
                                        // to handle the case where the user grants the permission. See the documentation
                                        // for ActivityCompat#requestPermissions for more details.
                                        return;
                                    }
                                    startActivity(callIntent);

                                }
                            });
                            message.setOnClickListener(new View.OnClickListener() {

                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();
                                    final Dialog fgh = new Dialog(dance.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                    fgh.setCancelable(true);
                                    fgh.show();
                                    emailsend.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            String emailcontent = content.getText().toString();

                                            fgh.cancel();

                                            String emai[] = {"rt13@iitbbs.ac.in"};

                                            Intent emailintent = new Intent(Intent.ACTION_SEND);
                                            emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                            emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                            emailintent.setType("plain/text");
                                            emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                            startActivity(emailintent);
                                        }
                                    });


                                }
                            });
                            v2 = 1;
                        } else if (v2 == 1) {


                            btncntcte.setBackgroundResource(R.mipmap.mayur);

                            tve.setText("EVENTS");
                            emailp.setText("Email : ma12@iitbbs.ac.in");
                            contact.setText("Mobile : 7077100287");
                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                            dlg.setCancelable(true);
                            dlg.show();
                            call.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();

                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                    callIntent.setData(Uri.parse("tel:7077100287"));
                                    if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                        // TODO: Consider calling
                                        //    ActivityCompat#requestPermissions
                                        // here to request the missing permissions, and then overriding
                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                        //                                          int[] grantResults)
                                        // to handle the case where the user grants the permission. See the documentation
                                        // for ActivityCompat#requestPermissions for more details.
                                        return;
                                    }
                                    startActivity(callIntent);

                                }
                            });
                            message.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();
                                    final Dialog fgh = new Dialog(dance.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                    fgh.setCancelable(true);
                                    fgh.show();
                                    emailsend.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            String emailcontent = content.getText().toString();

                                            fgh.cancel();

                                            String emai[] = {"ma12@iitbbs.ac.in"};

                                            Intent emailintent = new Intent(Intent.ACTION_SEND);
                                            emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                            emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                            emailintent.setType("plain/text");
                                            emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                            startActivity(emailintent);
                                        }
                                    });


                                }
                            });
                            v2 = 0;

                        }

                    }
                });


                Thread t = new Thread() {

                    @Override
                    public void run() {
                        try {


                            while (!isInterrupted()) {


                                Thread.sleep(6000);
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (v2 == 0) {




                                            btncntcte.setBackgroundResource(R.mipmap.radesyam);
                                            tve.setText("PUBLICITY");
                                            emailp.setText("Email : rt13@iitbbs.ac.in");
                                            contact.setText("Mobile :  8093214495");
                                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                                            dlg.setCancelable(true);

                                            call.setOnClickListener(new View.OnClickListener() {

                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();

                                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                                    callIntent.setData(Uri.parse("tel: 8093214495"));
                                                    if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                        // TODO: Consider calling
                                                        //    ActivityCompat#requestPermissions
                                                        // here to request the missing permissions, and then overriding
                                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                                        //                                          int[] grantResults)
                                                        // to handle the case where the user grants the permission. See the documentation
                                                        // for ActivityCompat#requestPermissions for more details.
                                                        return;
                                                    }
                                                    startActivity(callIntent);

                                                }
                                            });
                                            message.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();

                                                    final Dialog fgh = new Dialog(dance.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                                    fgh.setCancelable(true);
                                                    fgh.show();
                                                    emailsend.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            String emailcontent = content.getText().toString();

                                                            fgh.cancel();

                                                            String emai[] = {"rt13@iitbbs.ac.in"};

                                                            Intent emailintent = new Intent(Intent.ACTION_SEND);
                                                            emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                                            emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                                            emailintent.setType("plain/text");
                                                            emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                                            startActivity(emailintent);
                                                        }
                                                    });


                                                }
                                            });
                                            v2 = 1;
                                        } else if (v2 == 1) {


                                            btncntcte.setBackgroundResource(R.mipmap.mayur);
                                            tve.setText("EVENTS");
                                            emailp.setText("Email : ma12@iitbbs.ac.in");
                                            contact.setText("Mobile : 7077100287");
                                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                                            dlg.setCancelable(true);

                                            call.setOnClickListener(new View.OnClickListener() {

                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();

                                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                                    callIntent.setData(Uri.parse("tel:7077100287 "));
                                                    if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                        // TODO: Consider calling
                                                        //    ActivityCompat#requestPermissions
                                                        // here to request the missing permissions, and then overriding
                                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                                        //                                          int[] grantResults)
                                                        // to handle the case where the user grants the permission. See the documentation
                                                        // for ActivityCompat#requestPermissions for more details.
                                                        return;
                                                    }
                                                    startActivity(callIntent);

                                                }
                                            });
                                            message.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();
                                                    final Dialog fgh = new Dialog(dance.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                                    fgh.setCancelable(true);
                                                    fgh.show();
                                                    emailsend.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            String emailcontent = content.getText().toString();

                                                            fgh.cancel();

                                                            String emai[] = {"ma12@iitbbs.ac.in"};

                                                            Intent emailintent = new Intent(Intent.ACTION_SEND);
                                                            emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                                            emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                                            emailintent.setType("plain/text");
                                                            emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                                            startActivity(emailintent);
                                                        }
                                                    });


                                                }
                                            });
                                            v2 = 0;

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
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                final Dialog dlg = new Dialog(dance.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.mtcntct);
                LinearLayout bo=(LinearLayout)dlg.findViewById(R.id.lnrltb);
                final Button btncntcte=(Button)dlg.findViewById(R.id.btncntct);
                final TextView emailp=(TextView)dlg.findViewById(R.id.tvemail);
                final TextView contact=(TextView)dlg.findViewById(R.id.tvcontact);
                btncntcte.setBackgroundResource(R.mipmap.vikas);
                final TextView tve=(TextView)dlg.findViewById(R.id.publyevnts);
                tve.setText("PUBLICITY");
                emailp.setText("Email : vasu.meena80@gmail.com");
                contact.setText("Mobile : 7077102204");
                LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                dlg.setCancelable(true);
                dlg.show();
                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        d=1;
                        dlg.cancel();

                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:7077102204"));
                        if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            // TODO: Consider calling
                            //    ActivityCompat#requestPermissions
                            // here to request the missing permissions, and then overriding
                            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                            //                                          int[] grantResults)
                            // to handle the case where the user grants the permission. See the documentation
                            // for ActivityCompat#requestPermissions for more details.
                            return;
                        }
                        startActivity(callIntent);

                    }
                });
                message.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        d=1;
                        dlg.cancel();
                        final Dialog fgh=new Dialog(dance.this);
                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        fgh.setContentView(R.layout.email);
                        final EditText content=(EditText)fgh.findViewById(R.id.emailtext);
                        Button emailsend=(Button)fgh.findViewById(R.id.emailsend);
                        emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                        fgh.setCancelable(true);
                        fgh.show();
                        emailsend.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String emailcontent = content.getText().toString();

                                fgh.cancel();

                                String emai[] = {"vasu.meena80@gmail.com"};

                                Intent emailintent = new Intent(Intent.ACTION_SEND);
                                emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                emailintent.setType("plain/text");
                                emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                startActivity(emailintent);
                            }
                        });


                    }
                });
                bo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v3 == 0) {


                            btncntcte.setBackgroundResource(R.mipmap.vikas);
                            tve.setText("PUBLICITY");
                            emailp.setText("Email : vasu.meena80@gmail.com");
                            contact.setText("Mobile : 7077102204");
                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                            dlg.setCancelable(true);
                            dlg.show();
                            call.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();

                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                    callIntent.setData(Uri.parse("tel:7077102204"));
                                    if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                        // TODO: Consider calling
                                        //    ActivityCompat#requestPermissions
                                        // here to request the missing permissions, and then overriding
                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                        //                                          int[] grantResults)
                                        // to handle the case where the user grants the permission. See the documentation
                                        // for ActivityCompat#requestPermissions for more details.
                                        return;
                                    }
                                    startActivity(callIntent);

                                }
                            });
                            message.setOnClickListener(new View.OnClickListener() {

                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();
                                    final Dialog fgh = new Dialog(dance.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                    fgh.setCancelable(true);
                                    fgh.show();
                                    emailsend.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            String emailcontent = content.getText().toString();

                                            fgh.cancel();

                                            String emai[] = {"vasu.meena80@gmail.com"};

                                            Intent emailintent = new Intent(Intent.ACTION_SEND);
                                            emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                            emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                            emailintent.setType("plain/text");
                                            emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                            startActivity(emailintent);
                                        }
                                    });


                                }
                            });
                            v3 = 1;
                        } else if (v3 == 1) {


                            btncntcte.setBackgroundResource(R.mipmap.mayur);

                            tve.setText("EVENTS");
                            emailp.setText("Email : ma12@iitbbs.ac.in");
                            contact.setText("Mobile : 7077100287");
                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                            dlg.setCancelable(true);
                            dlg.show();
                            call.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();

                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                    callIntent.setData(Uri.parse("tel:7077100287"));
                                    if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                        // TODO: Consider calling
                                        //    ActivityCompat#requestPermissions
                                        // here to request the missing permissions, and then overriding
                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                        //                                          int[] grantResults)
                                        // to handle the case where the user grants the permission. See the documentation
                                        // for ActivityCompat#requestPermissions for more details.
                                        return;
                                    }
                                    startActivity(callIntent);

                                }
                            });
                            message.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    d = 1;
                                    dlg.cancel();
                                    final Dialog fgh = new Dialog(dance.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                    fgh.setCancelable(true);
                                    fgh.show();
                                    emailsend.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            String emailcontent = content.getText().toString();

                                            fgh.cancel();

                                            String emai[] = {"ma12@iitbbs.ac.in"};

                                            Intent emailintent = new Intent(Intent.ACTION_SEND);
                                            emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                            emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                            emailintent.setType("plain/text");
                                            emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                            startActivity(emailintent);
                                        }
                                    });


                                }
                            });
                            v3 = 0;

                        }

                    }
                });


                Thread t = new Thread() {

                    @Override
                    public void run() {
                        try {


                            while (!isInterrupted()) {


                                Thread.sleep(6000);
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (v3 == 0) {




                                            btncntcte.setBackgroundResource(R.mipmap.vikas);
                                            tve.setText("PUBLICITY");
                                            emailp.setText("Email : vasu.meena80@gmail.com");
                                            contact.setText("Mobile :  7077102204");
                                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                                            dlg.setCancelable(true);

                                            call.setOnClickListener(new View.OnClickListener() {

                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();

                                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                                    callIntent.setData(Uri.parse("tel: 7077102204"));
                                                    if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                        // TODO: Consider calling
                                                        //    ActivityCompat#requestPermissions
                                                        // here to request the missing permissions, and then overriding
                                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                                        //                                          int[] grantResults)
                                                        // to handle the case where the user grants the permission. See the documentation
                                                        // for ActivityCompat#requestPermissions for more details.
                                                        return;
                                                    }
                                                    startActivity(callIntent);

                                                }
                                            });
                                            message.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();

                                                    final Dialog fgh = new Dialog(dance.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                                    fgh.setCancelable(true);
                                                    fgh.show();
                                                    emailsend.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            String emailcontent = content.getText().toString();

                                                            fgh.cancel();

                                                            String emai[] = {"vasu.meena80@gmail.com"};

                                                            Intent emailintent = new Intent(Intent.ACTION_SEND);
                                                            emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                                            emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                                            emailintent.setType("plain/text");
                                                            emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                                            startActivity(emailintent);
                                                        }
                                                    });


                                                }
                                            });
                                            v3 = 1;
                                        } else if (v3 == 1) {


                                            btncntcte.setBackgroundResource(R.mipmap.mayur);
                                            tve.setText("EVENTS");
                                            emailp.setText("Email : ma12@iitbbs.ac.in");
                                            contact.setText("Mobile : 7077100287");
                                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                                            dlg.setCancelable(true);

                                            call.setOnClickListener(new View.OnClickListener() {

                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();

                                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                                    callIntent.setData(Uri.parse("tel:7077100287 "));
                                                    if (ActivityCompat.checkSelfPermission(dance.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                        // TODO: Consider calling
                                                        //    ActivityCompat#requestPermissions
                                                        // here to request the missing permissions, and then overriding
                                                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                                        //                                          int[] grantResults)
                                                        // to handle the case where the user grants the permission. See the documentation
                                                        // for ActivityCompat#requestPermissions for more details.
                                                        return;
                                                    }
                                                    startActivity(callIntent);

                                                }
                                            });
                                            message.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();
                                                    final Dialog fgh = new Dialog(dance.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FF228B22"));
                                                    fgh.setCancelable(true);
                                                    fgh.show();
                                                    emailsend.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            String emailcontent = content.getText().toString();

                                                            fgh.cancel();

                                                            String emai[] = {"ma12@iitbbs.ac.in"};

                                                            Intent emailintent = new Intent(Intent.ACTION_SEND);
                                                            emailintent.putExtra(Intent.EXTRA_EMAIL, emai);
                                                            emailintent.putExtra(Intent.EXTRA_SUBJECT, "ALMA DOUBTS");
                                                            emailintent.setType("plain/text");
                                                            emailintent.putExtra(Intent.EXTRA_TEXT, emailcontent);
                                                            startActivity(emailintent);
                                                        }
                                                    });


                                                }
                                            });
                                            v3 = 0;

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
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dlg=new Dialog(dance.this);
                dlg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dlg.setContentView(R.layout.rlasalert);
                TextView tv1=(TextView)dlg.findViewById(R.id.tvw1);
                TextView tv2=(TextView)dlg.findViewById(R.id.tvw2);
                TextView tv3=(TextView)dlg.findViewById(R.id.tvw3);
                TextView tv4=(TextView)dlg.findViewById(R.id.tvw4);
                TextView tv5=(TextView)dlg.findViewById(R.id.tvw5);
                TextView tv6=(TextView)dlg.findViewById(R.id.tvw6);
                TextView tv7=(TextView)dlg.findViewById(R.id.tvw7);
                TextView tv8=(TextView)dlg.findViewById(R.id.tvw8);
                TextView tv9=(TextView)dlg.findViewById(R.id.tvw9);
                TextView tv10=(TextView)dlg.findViewById(R.id.tvw10);
                tv1.setText("•\t\tIt is an inter-collegiate event. Only one team per college is allowed." +
                        "All participants must bring their college identity cards. Participants without identity cards will not be allowed to participate.\n");
                tv2.setText("•\t\tEach team will consist of minimum 5 and maximum 14 members." +
                        "Backstage helpers must not exceed 5.Team members must be present to provide cues for lighting and sound.\n");
                tv3.setText("•\t\tMinimum of 4 members must be present on the stage during the performance.");
                tv4.setText("•\t\tEach team will be allotted 6 - 12 minutes for their performance. Teams must follow the time limit strictly. Teams breaching the time limit will be penalized by the judges.");
                tv5.setText("•\t\tPre-recorded music must be brought by the participating team in a CD, DVD or Pen Drive. Audio cassettes are NOT allowed.");
                tv6.setText("•\t\tThe songs must not contain any illicit or offensive language. Any obscene action in the dance is prohibited and will lead to Disqualification.");
                tv7.setText("•\t\tAll props, costumes and make-up will have to be brought by the teams. No props will be provided by the organizers. In case of special prop requirement such as chairs, the teams will have to inform the organizers in advance.");
                tv8.setText("•\t\tUse of flame or fluid on stage, lighting of candles, matches or cigarettes is strictly NOT allowed and will lead in Disqualification of the team.");
                tv9.setText("•\t\tIn case of malfunctioning of any equipment provided, the team will be allowed to repeat the performance or start from the point of disruption as the team chooses, with the consent of the judges.");
                tv10.setText("•\t\tAll decisions of the judges will be FINAL & BINDING on all teams.");


                 dlg.setCancelable(true);

                dlg.show();

            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Dialog alg=new Dialog(dance.this);
                alg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                alg.setContentView(R.layout.rlasalert);
                TextView tv1=(TextView)alg.findViewById(R.id.tvw1);
                TextView tv2=(TextView)alg.findViewById(R.id.tvw2);
                TextView tv3=(TextView)alg.findViewById(R.id.tvw3);
                TextView tv4=(TextView)alg.findViewById(R.id.tvw4);
                TextView tv5=(TextView)alg.findViewById(R.id.tvw5);
                TextView tv6=(TextView)alg.findViewById(R.id.tvw6);
                TextView tv7=(TextView)alg.findViewById(R.id.tvw7);
                TextView tv8=(TextView)alg.findViewById(R.id.tvw8);
                TextView tv9=(TextView)alg.findViewById(R.id.tvw9);
                TextView tv10=(TextView)alg.findViewById(R.id.tvw10);
                tv1.setText("•\t It is a solo dance competition.");
                tv2.setText("•\t All participants must bring their college identity cards. Participants without identity cards will not be allowed to participate.");
                tv3.setText("•\t The event will be conducted in 2 rounds: Prelims and Finals.");
                tv4.setText("•\t Each participant will be given 2 minutes in prelims and 6 minutes in the finals.");
                tv5.setText("•\t Breaching of time limit will result in deduction of points.");
                tv6.setText("•\t Pre-recorded music has to be brought in .mp3 or .cda format in a Pen Drive/CD/DVD only. Audio cassettes will not be accepted.");
                tv7.setText("•\t Use of flame or fluid on stage, lighting of candles, matches or cigarettes is strictly NOT allowed and will lead in Disqualification.");
                tv8.setText("•\t Participants have to arrange for their own props, costumes & make-up. No props will be provided by the organizers. However, in case of special prop requirement such as chairs the participants will have to inform the organizers in advance.");
                tv9.setText("•\t In case of malfunctioning of any equipment provided, the participant  will be allowed to repeat the performance or start from the point of disruption as he/she chooses, with the consent of the judges. ");
                tv10.setText("•\t Decision of the judges will be FINAL and BINDING on all contestants.");

                alg.setCancelable(true);
                alg.show();
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Dialog alg=new Dialog(dance.this);
                alg.requestWindowFeature(Window.FEATURE_NO_TITLE);
                alg.setContentView(R.layout.rlasalert);
                TextView tv1=(TextView)alg.findViewById(R.id.tvw1);
                TextView tv2=(TextView)alg.findViewById(R.id.tvw2);
                TextView tv3=(TextView)alg.findViewById(R.id.tvw3);
                TextView tv4=(TextView)alg.findViewById(R.id.tvw4);
                TextView tv5=(TextView)alg.findViewById(R.id.tvw5);
                TextView tv6=(TextView)alg.findViewById(R.id.tvw6);
                TextView tv7=(TextView)alg.findViewById(R.id.tvw7);
                TextView tv8=(TextView)alg.findViewById(R.id.tvw8);
                TextView tv9=(TextView)alg.findViewById(R.id.tvw9);
                TextView tv10=(TextView)alg.findViewById(R.id.tvw10);
                tv1.setText("•\t It is a duet dance competition. One team contains only one couple. All participants must bring their college identity cards. Participants without identity cards will not be allowed to participate.");
                tv2.setText("•\t After registration you cannot change your partner. Only registered participants are allowed.");
                tv3.setText("•\t Song must be brought by the participating team in a CD, DVD or Pendrive. If they don’t ,disqualified.");
                tv4.setText("•\t In any circumstance if song is not playing well ,they are responsible.");
                tv5.setText("•\t The songs must not contain any illicit or offensive language. ");
                tv6.setText("•\t Any obscene action in the dance is prohibited and will lead to Disqualification.");
                tv7.setText("•\t Time limit is 6 minutes. Teams breaching the time limit will be penalized by the judges.");
                tv8.setText("•\t All props, costumes and make-up will have to be brought by the teams. No props will be provided by the organizers. In case of special prop requirement such as chairs, the teams will have to inform the organizers in advance.");
                tv9.setText("•\t Use of flame or fluid on stage, lighting of candles, matches or cigarettes is strictly NOT allowed and will lead  in Disqualification of the team.");
                tv10.setText("•\t All decisions of the judges and organizing team will be FINAL & BINDING on all teams.");


                alg.setCancelable(true);
                alg.show();


            }
        });




        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
                try {
                    Class fg = Class.forName("com.example.user.alma2k16.MainActivity");
                   Intent ia = new Intent(dance.this, fg);
                    startActivity(ia);
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
                    Class fg = Class.forName("com.example.user.alma2k16.gallery");
                    Intent ia = new Intent(dance.this, fg);
                    startActivity(ia);
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
                    Class gh=Class.forName("com.example.user.alma2k16.menu1");
                   Intent ia=new Intent(dance.this,gh);
                    startActivity(ia);
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
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.Contactus");
                    Intent ia=new Intent(dance.this,fg);
                    startActivity(ia);
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
                    Intent ia=new Intent(dance.this,fg);
                    startActivity(ia);

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

            Class gh=Class.forName("com.example.user.alma2k16.menu1");
            Intent ia=new Intent(dance.this,gh);
            startActivity(ia);
            this.finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
