package com.example.user.alma2k16;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
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
 * Created by user on 25-10-2015.
 */
public class extramor extends AppCompatActivity {
    int d=0;
    MenuDrawer mDrawer;LinearLayout l1,l2,l3,l4,l5,l6;Button b1;Button r1,ct1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawer=MenuDrawer.attach(extramor.this);
        mDrawer.setMenuView(R.layout.menudrawer);
        mDrawer.setContentView(R.layout.extra);
        overridePendingTransition(R.anim.entering, R.anim.leaving);
        l1=(LinearLayout)findViewById(R.id.ll1);
        l2=(LinearLayout)findViewById(R.id.ll2);
        l3=(LinearLayout)findViewById(R.id.ll3);
        l4=(LinearLayout)findViewById(R.id.ll4);
        l5=(LinearLayout)findViewById(R.id.ll5);
        l6=(LinearLayout)findViewById(R.id.ll6);
        r1=(Button)findViewById(R.id.clayreg);
        ct1=(Button)findViewById(R.id.clayct);

        LinearLayout c =(LinearLayout)findViewById(R.id.logobg);
        c.setBackgroundColor(Color.parseColor("#FF6A5ACD"));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#FF0000FF"));
        }
        LinearLayout abc=(LinearLayout)findViewById(R.id.lgolout);
        Button cde=(Button)findViewById(R.id.lgo);
        Animation asd=AnimationUtils.loadAnimation(extramor.this,R.anim.start);
        Animation ads=AnimationUtils.loadAnimation(extramor.this,R.anim.stop);
        abc.startAnimation(asd);
        cde.startAnimation(ads);


        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo ni=cm.getActiveNetworkInfo();
                if(ni==null)
                {
                    Toast t=Toast.makeText(extramor.this,"Please Connect to Network",Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Dialog thj=new Dialog(extramor.this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
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
        ct1.setOnClickListener(new View.OnClickListener() {
            int v1=1;
            @Override
            public void onClick(View v) {






                final Dialog dlg = new Dialog(extramor.this);
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
                        if (ActivityCompat.checkSelfPermission(extramor.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                        final Dialog fgh=new Dialog(extramor.this);
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
                                    if (ActivityCompat.checkSelfPermission(extramor.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(extramor.this);
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
                                    if (ActivityCompat.checkSelfPermission(extramor.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                    final Dialog fgh = new Dialog(extramor.this);
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
                                                    if (ActivityCompat.checkSelfPermission(extramor.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

                                                    final Dialog fgh = new Dialog(extramor.this);
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
                                                    if (ActivityCompat.checkSelfPermission(extramor.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                                                    final Dialog fgh = new Dialog(extramor.this);
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


        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("CLAY MODELLING");
        b1=(Button)toolbar.findViewById(R.id.btnearthhd);
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

                    Class fg = Class.forName("com.example.user.alma2k16.MainActivity");
                    Intent ij = new Intent(extramor.this, fg);
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
                    Intent ij=new Intent(extramor.this,fg);
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
                    Class fg = Class.forName("com.example.user.alma2k16.workshop");
                    Intent ij = new Intent(extramor.this, fg);
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
                    Class fg = Class.forName("com.example.user.alma2k16.Contactus");
                    Intent ij = new Intent(extramor.this, fg);
                    startActivity(ij);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        try {
            Class gh=Class.forName("com.example.user.alma2k16.workshop");
            Intent ij=new Intent(extramor.this,gh);
            startActivity(ij);
            this.finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
