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
public class litrary extends AppCompatActivity{int d=0;
    LinearLayout l1,l2,l3,l4,l5,l6;Button b1;
    Button b4,b2,b3;Button c1,c2,c3;Button reg1,reg2,reg3;


    MenuDrawer mDrawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawer=MenuDrawer.attach(litrary.this);
        mDrawer.setMenuView(R.layout.menudrawer);
        mDrawer.setContentView(R.layout.literary);
        overridePendingTransition(R.anim.entering, R.anim.leaving);
        LinearLayout c =(LinearLayout)findViewById(R.id.logobg);
        c.setBackgroundColor(Color.parseColor("#FF800080"));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#FF800080"));
        }
        LinearLayout abc=(LinearLayout)findViewById(R.id.lgolout);
        Button cde=(Button)findViewById(R.id.lgo);
        Animation asd= AnimationUtils.loadAnimation(litrary.this, R.anim.start);
        Animation ads=AnimationUtils.loadAnimation(litrary.this,R.anim.stop);
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
        getSupportActionBar().setTitle("LITERARY");

        b1=(Button)toolbar.findViewById(R.id.btnearthhd);
        b2=(Button)findViewById(R.id.rl1);
        b3=(Button)findViewById(R.id.rl2);
        b4=(Button)findViewById(R.id.rl3);
        c1=(Button)findViewById(R.id.lc1);
        c2=(Button)findViewById(R.id.lc2);
        c3=(Button)findViewById(R.id.lc3);
        reg1=(Button)findViewById(R.id.regl1);
        reg2=(Button)findViewById(R.id.regl2);
        reg3=(Button)findViewById(R.id.regl3);
        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo ni=cm.getActiveNetworkInfo();
                if(ni==null)
                {
                    Toast t=Toast.makeText(litrary.this,"Please Connect to Network",Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Dialog thj=new Dialog(litrary.this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
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
                    Toast t=Toast.makeText(litrary.this,"Please Connect to Network",Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Dialog thj=new Dialog(litrary.this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
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
                    Toast t=Toast.makeText(litrary.this,"Please Connect to Network",Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Dialog thj=new Dialog(litrary.this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
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






                final Dialog dlg = new Dialog(litrary.this);
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
                        if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                        final Dialog fgh=new Dialog(litrary.this);
                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        fgh.setContentView(R.layout.email);
                        final EditText content=(EditText)fgh.findViewById(R.id.emailtext);
                        Button emailsend=(Button)fgh.findViewById(R.id.emailsend);
                        emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(litrary.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(litrary.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

                                                    final Dialog fgh = new Dialog(litrary.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                                    callIntent.setData(Uri.parse("tel:7077100287 "));
                                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                                    final Dialog fgh = new Dialog(litrary.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
            int v1=1;
            @Override
            public void onClick(View v) {






                final Dialog dlg = new Dialog(litrary.this);
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
                        if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                        final Dialog fgh=new Dialog(litrary.this);
                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        fgh.setContentView(R.layout.email);
                        final EditText content=(EditText)fgh.findViewById(R.id.emailtext);
                        Button emailsend=(Button)fgh.findViewById(R.id.emailsend);
                        emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(litrary.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(litrary.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

                                                    final Dialog fgh = new Dialog(litrary.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                                    callIntent.setData(Uri.parse("tel:7077100287 "));
                                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                                    final Dialog fgh = new Dialog(litrary.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
        c3.setOnClickListener(new View.OnClickListener() {
            int v1=1;
            @Override
            public void onClick(View v) {






                final Dialog dlg = new Dialog(litrary.this);
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
                        if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                        final Dialog fgh=new Dialog(litrary.this);
                        fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        fgh.setContentView(R.layout.email);
                        final EditText content=(EditText)fgh.findViewById(R.id.emailtext);
                        Button emailsend=(Button)fgh.findViewById(R.id.emailsend);
                        emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(litrary.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(litrary.this);
                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    fgh.setContentView(R.layout.email);
                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

                                                    final Dialog fgh = new Dialog(litrary.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
                                                    callIntent.setData(Uri.parse("tel:7077100287 "));
                                                    if (ActivityCompat.checkSelfPermission(litrary.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                                    final Dialog fgh = new Dialog(litrary.this);
                                                    fgh.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                                    fgh.setContentView(R.layout.email);
                                                    final EditText content = (EditText) fgh.findViewById(R.id.emailtext);
                                                    Button emailsend = (Button) fgh.findViewById(R.id.emailsend);
                                                    emailsend.setBackgroundColor(Color.parseColor("#FF8B008B"));
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
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog=new Dialog(litrary.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.rules5);
                TextView tv1=(TextView)dialog.findViewById(R.id.tvwa1);
                TextView tv2=(TextView)dialog.findViewById(R.id.tvwa2);
                TextView tv3=(TextView)dialog.findViewById(R.id.tvwa3);
                TextView tv4=(TextView)dialog.findViewById(R.id.tvwa4);
                TextView tv5=(TextView)dialog.findViewById(R.id.tvwa5);
                TextView tv6=(TextView)dialog.findViewById(R.id.tvwa6);

                tv1.setText("•\t It is an individual event." +
                        "Each participant will have to speak for and against the motion.\n");
                tv2.setText("•\t Topic will be given at the time of competition.");

                tv3.setText("•\t Total time per motion (for and against): 3 minutes + 3 minutes.");

                tv4.setText("•\t All participants must bring their college identity cards when they come for the competition. Participants without identity cards will not be allowed to participate.");

                tv5.setText("•\t Plagiarism will not be tolerated.Any participant violating this rule will be disqualified.\n");
                tv6.setText("•\t The decision of the judges will be final and binding.");


                dialog.setCancelable(true);
                dialog.show();



            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog(litrary.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.rlasalert);
                TextView tv1=(TextView)dialog.findViewById(R.id.tvw1);
                TextView tv2=(TextView)dialog.findViewById(R.id.tvw2);
                TextView tv3=(TextView)dialog.findViewById(R.id.tvw3);
                TextView tv4=(TextView)dialog.findViewById(R.id.tvw4);
                TextView tv5=(TextView)dialog.findViewById(R.id.tvw5);
                TextView tv6=(TextView)dialog.findViewById(R.id.tvw6);
                TextView tv7=(TextView)dialog.findViewById(R.id.tvw7);
                TextView tv8=(TextView)dialog.findViewById(R.id.tvw8);
                TextView tv9=(TextView)dialog.findViewById(R.id.tvw9);
                TextView tv10=(TextView)dialog.findViewById(R.id.tvw10);

                tv1.setText("•\t It is a team event.");
                tv2.setText("•\t Each team will consist of 2-3 members.");

                tv3.setText("•\t Problem statement will be released soon on social networks.");

                tv4.setText("•\t A report on the topic has to be mailed to events@almafiesta.com within 5th January, 2014. The format should be .pdf and the page limit is 20.");

                tv5.setText("•\t Selected participants will be informed and they have to give a powerpoint presentation on the problem statement during the fest. ");
                tv6.setText("•\t Total time per team: 15 minutes - Presentation + 5 minutes - Question/Answer");
                tv7.setText("•\t Participants without identity cards will not be allowed to participate. All participants must bring their college identity cards when they come for final presentation. Participants without identity cards will not be allowed to present even if they are selected for the finals.");
                tv8.setText("•\t Plagiarism will not be tolerated. Any participant violating this rule will be disqualified.");
                tv9.setText("•\t Sources of data should be mentioned clearly in the report as well as the powerpoint presentation(s).");
                tv10.setText("•\t The decision of the judges will be final and binding.");

                dialog.setCancelable(true);
                dialog.show();


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog(litrary.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.rules5);
                TextView tv1=(TextView)dialog.findViewById(R.id.tvwa1);
                TextView tv2=(TextView)dialog.findViewById(R.id.tvwa2);
                TextView tv3=(TextView)dialog.findViewById(R.id.tvwa3);
                TextView tv4=(TextView)dialog.findViewById(R.id.tvwa4);
                TextView tv5=(TextView)dialog.findViewById(R.id.tvwa5);
                TextView tv6=(TextView)dialog.findViewById(R.id.tvwa6);


                tv1.setText("•\t It is a team event.");
                tv2.setText("•\t Each team will consist of 2-3 members.");

                tv3.setText("•\t The event consists of a complete assortment of literary rounds (Crosswords, Puzzles, and so on)");

                tv4.setText("•\t Participants must carry their college ID cards. Participants without identity cards will not be allowed for the event.");

                tv5.setText("•\t Cross college teams are allowed.");
                tv6.setText("•\t In case of any dispute, the decision of the organizers will be final and binding on the participants.");

                dialog.setCancelable(true);
                dialog.show();

            }
        });


        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();
                try {
                    Class fg = Class.forName("com.example.user.alma2k16.MainActivity");
                    Intent ia = new Intent(litrary.this, fg);
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
                   Intent ia=new Intent(litrary.this,gh);
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
                    Intent ia=new Intent(litrary.this,fg);
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
                    Intent ia=new Intent(litrary.this,fg);
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
                    Intent ia=new Intent(litrary.this,fg);
                    startActivity(ia);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });






    }  @Override
       public void onBackPressed() {
        mDrawer.closeMenu();
        SharedPreferences sp=this.getSharedPreferences("myPrefsKe",Context.MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putInt("ha",1);
        ed.commit();
        try {
            Class gh=Class.forName("com.example.user.alma2k16.menu1");
            Intent ia=new Intent(litrary.this,gh);
            startActivity(ia);
            this.finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
