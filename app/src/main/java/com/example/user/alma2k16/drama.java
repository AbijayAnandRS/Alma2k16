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
 * Created by user on 23-10-2015.
 */
public class drama extends AppCompatActivity {
    LinearLayout l1,l2,l3,l4,l5,l6;Button b1;Button b2,b3,b4;
    Button c1,c2,c3;Button reg1,reg2,reg3;int d=0;


    MenuDrawer mDrawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawer=MenuDrawer.attach(drama.this);
        mDrawer.setMenuView(R.layout.menudrawer);
        mDrawer.setContentView(R.layout.drama);

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
            window.setStatusBarColor(Color.parseColor("#FFB8860B"));
        }
        LinearLayout c =(LinearLayout)findViewById(R.id.logobg);
        c.setBackgroundColor(Color.parseColor("#FFB8860B"));
        LinearLayout abc=(LinearLayout)findViewById(R.id.lgolout);
        Button cde=(Button)findViewById(R.id.lgo);
        Animation asd= AnimationUtils.loadAnimation(drama.this, R.anim.start);
        Animation ads=AnimationUtils.loadAnimation(drama.this,R.anim.stop);
        abc.startAnimation(asd);
        cde.startAnimation(ads);

        l1=(LinearLayout)findViewById(R.id.ll1);
        l2=(LinearLayout)findViewById(R.id.ll2);
        l3=(LinearLayout)findViewById(R.id.ll3);
        l4=(LinearLayout)findViewById(R.id.ll4);
        l5=(LinearLayout)findViewById(R.id.ll5);
        l6=(LinearLayout)findViewById(R.id.ll6);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("DRAMA");

        b1=(Button)toolbar.findViewById(R.id.btnearthhd);
        b2=(Button)findViewById(R.id.rdr1);
        b3=(Button)findViewById(R.id.rdr2);
        b4=(Button)findViewById(R.id.rdr3);
        c1=(Button)findViewById(R.id.drc1);
        c2=(Button)findViewById(R.id.drc2);
        c3=(Button)findViewById(R.id.drc3);
        reg1=(Button)findViewById(R.id.regdr1);
        reg2=(Button)findViewById(R.id.regdr2);
        reg3=(Button)findViewById(R.id.regdr3);
        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo ni=cm.getActiveNetworkInfo();
                if(ni==null)
                {
                    Toast t=Toast.makeText(drama.this,"Please Connect to Network",Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Dialog thj=new Dialog(drama.this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
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
                    Toast t=Toast.makeText(drama.this,"Please Connect to Network",Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Dialog thj=new Dialog(drama.this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
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
                ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo ni=cm.getActiveNetworkInfo();
                if(ni==null)
                {
                    Toast t=Toast.makeText(drama.this,"Please Connect to Network",Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Dialog thj=new Dialog(drama.this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
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

        c1.setOnClickListener(new View.OnClickListener() {
            int v1=1;
            @Override
            public void onClick(View v) {






                final Dialog dlg = new Dialog(drama.this);
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
                contact.setText("Mobile : 8093424101");
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
                        callIntent.setData(Uri.parse("tel:8093424101"));
                        if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                        final Dialog fgh=new Dialog(drama.this);
                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        fgh.setContentView(R.layout.email);
                        final EditText content=(EditText)fgh.findViewById(R.id.emailtext);
                        Button emailsend=(Button)fgh.findViewById(R.id.emailsend);
                        emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
                        if (v1 == 0) {


                            btncntcte.setBackgroundResource(R.mipmap.vikas);
                            tve.setText("PUBLICITY");
                            emailp.setText("Email : vasu.meena80@gmail.com");
                            contact.setText("Mobile : 8093424101");
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
                                    callIntent.setData(Uri.parse("tel:8093424101"));
                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(drama.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
                            v1 =1;
                        } else if (v1 == 1) {


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
                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(drama.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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




                                            btncntcte.setBackgroundResource(R.mipmap.vikas);
                                            tve.setText("PUBLICITY");
                                            emailp.setText("Email : vasu.meena80@gmail.com");
                                            contact.setText("Mobile : 8093424101");
                                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                                            dlg.setCancelable(true);

                                            call.setOnClickListener(new View.OnClickListener() {

                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();

                                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                                    callIntent.setData(Uri.parse("tel:8093424101"));
                                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

                                                    final Dialog fgh = new Dialog(drama.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
                                            v1 = 1;
                                        } else if (v1 == 1) {


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
                                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                                    final Dialog fgh = new Dialog(drama.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
            int v2=1;
            @Override
            public void onClick(View v) {





                final Dialog dlg = new Dialog(drama.this);
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
                contact.setText("Mobile : 8093424101");
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
                        if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                        final Dialog fgh=new Dialog(drama.this);
                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        fgh.setContentView(R.layout.email);
                        final EditText content=(EditText)fgh.findViewById(R.id.emailtext);
                        Button emailsend=(Button)fgh.findViewById(R.id.emailsend);
                        emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
                        if (v2 == 0) {


                            btncntcte.setBackgroundResource(R.mipmap.vikas);
                            tve.setText("PUBLICITY");
                            emailp.setText("Email : vasu.meena80@gmail.com");
                            contact.setText("Mobile : 8093424101");
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
                                    callIntent.setData(Uri.parse("tel:8093424101"));
                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(drama.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(drama.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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




                                            btncntcte.setBackgroundResource(R.mipmap.vikas);
                                            tve.setText("PUBLICITY");
                                            emailp.setText("Email : vasu.meena80@gmail.com");
                                            contact.setText("Mobile :  8093424101");
                                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                                            dlg.setCancelable(true);

                                            call.setOnClickListener(new View.OnClickListener() {

                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();

                                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                                    callIntent.setData(Uri.parse("tel: 8093424101"));
                                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

                                                    final Dialog fgh = new Dialog(drama.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
                                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                                    final Dialog fgh = new Dialog(drama.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
            int v3=1;
            @Override
            public void onClick(View v) {





                final Dialog dlg = new Dialog(drama.this);
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
                contact.setText("Mobile : 8093424101");
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
                        callIntent.setData(Uri.parse("tel:8093424101"));
                        if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                        final Dialog fgh=new Dialog(drama.this);
                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        fgh.setContentView(R.layout.email);
                        final EditText content=(EditText)fgh.findViewById(R.id.emailtext);
                        Button emailsend=(Button)fgh.findViewById(R.id.emailsend);
                        emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
                            contact.setText("Mobile : 8093424101");
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
                                    callIntent.setData(Uri.parse("tel:8093424101"));
                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(drama.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(drama.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
                                            contact.setText("Mobile :  8093424101");
                                            LinearLayout call = (LinearLayout) dlg.findViewById(R.id.call);
                                            LinearLayout message = (LinearLayout) dlg.findViewById(R.id.message);


                                            dlg.setCancelable(true);

                                            call.setOnClickListener(new View.OnClickListener() {

                                                @Override
                                                public void onClick(View v) {
                                                    d = 1;
                                                    dlg.cancel();

                                                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                                                    callIntent.setData(Uri.parse("tel: 8093424101"));
                                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

                                                    final Dialog fgh = new Dialog(drama.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
                                                    if (ActivityCompat.checkSelfPermission(drama.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                                    final Dialog fgh = new Dialog(drama.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FFDAA520"));
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
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
                try {
                    Class fg = Class.forName("com.example.user.alma2k16.MainActivity");
                    Intent ia = new Intent(drama.this, fg);
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
                    Intent ia=new Intent(drama.this,gh);
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
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Dialog alg=new Dialog(drama.this);
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
               tv1.setText("•\t This is a team event. Each team should have 2-3 members.");
               tv2.setText("•\t All participants must bring their college identity cards. Participants without identity cards will not be allowed to participate.");
               tv3.setText("•\t One member of the team will act the topic given to him/her while the other team members guess the topic.");
               tv4.setText("•\t The event consists of 2 rounds:In the first round the participants have to guess the names of movies. \t\n");
               tv5.setText("•\t In the second round they guess the names of different products and their taglines.");
               tv6.setText("•\t No lip movements are allowed.");
               tv7.setText("•\t The actor cannot point out objects in the near vicinity. It can lead to deduction of marks or even disqualification.");
               tv8.setText("•\t A single word can be broken into maximum 2 parts.");
               tv9.setText("•\t Showing numbers by fingers is not allowed. Usually any gesture is allowed other than spelling out the words, but any act indicating the form of the phrase is prohibited, so that only the meaning may be acted out.");
               tv10.setText("•\t The decision of the judges will be FINAL & BINDING on all participants.");

               alg.setCancelable(true);
               alg.show();

           }
       });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog alg=new Dialog(drama.this);
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
                tv1.setText("•\t It is an inter-collegiate Street Play contest.Plays will have to deal with subjects of social relevance.");
                tv2.setText("•\t All participants must bring their college identity cards. Participants without identity cards will not be allowed to participate. ");
                tv3.setText("•\t Each team should have a minimum of 5 members and a maximum of 15 members.");
                tv4.setText("•\t The time limit shall be 15-20 minutes inclusive of performance and setup.");
                tv5.setText("•\t The language of the play must be either English or Hindi.No props/costume will be provided.\n");
                tv6.setText("•\t Only live music is allowed. Teams will have to bring their own instruments.");
                tv7.setText("•\t Use of fire/fluid/smoke machines during the act is not permitted.");
                tv8.setText("•\t Audience response will have substantial points in scoring criteria.");
                tv9.setText("•\t Any vulgarity or disturbing content of any order will lead to immediate disqualification.");
                tv10.setText("•\t Decision of the judges will be FINAL and BINDING on all teams.");

                alg.setCancelable(true);
                alg.show();


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog alg=new Dialog(drama.this);
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
                tv1.setText("•\t It is a stage play competition.Cross college team will be allowed.\n");
                tv2.setText("•\t All participants must bring their college identity cards. Participants without identity cards will not be allowed to participate.");
                tv3.setText("•\t Each team should have a minimum of 7 members and max. 15. ");
                tv4.setText("•\t There will be one person in charge of sound and maximum 3 in charge of light. Participants must have to carry laptops with sounds. ");
                tv5.setText("•\t The time limit shall be 20-45 minutes inclusive of performance and setup.");
                tv6.setText("•\t The language of the play must be either English or Hindi.");
                tv7.setText("•\t No recorded vocals will be allowed.");
                tv8.setText("•\t Use of fire/fluid/smoke machines during the act is not permitted.");
                tv9.setText("•\t Any vulgarity or disturbing content of  any order will lead to immediate disqualification.");
                tv10.setText("•\t Decision of the judges will be FINAL and BINDING on all teams.");

                alg.setCancelable(true);
                alg.show();


            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
                try {
                    Class fg=Class.forName("com.example.user.alma2k16.Contactus");
                    Intent ia=new Intent(drama.this,fg);
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
                    Class fg=Class.forName("com.example.user.alma2k16.gallery");
                    Intent ia=new Intent(drama.this,fg);
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
                    Intent ia=new Intent(drama.this,fg);
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
            Intent ia=new Intent(drama.this,gh);
            startActivity(ia);
            this.finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
