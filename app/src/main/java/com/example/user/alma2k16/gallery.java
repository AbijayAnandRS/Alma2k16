package com.example.user.alma2k16;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by user on 16-11-2015.
 */
public class gallery extends AppCompatActivity {Button b1;
    private GridView gv;
    private Animator mCurrentAnimator;
    private int mShortAnimationDuration;
    private int j=0;

    private   GestureDetector detector;
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private int thumb[]={R.mipmap.btn3,R.mipmap.bt1,R.mipmap.bt2,R.mipmap.bt4,R.mipmap.a1,R.mipmap.a2,R.mipmap.a3,R.mipmap.a4,R.mipmap.a5,R.mipmap.a6,R.mipmap.a7,R.mipmap.a8,R.mipmap.a9,R.mipmap.a10,R.mipmap.a11,R.mipmap.a12,R.mipmap.a13,R.mipmap.magic};


    private ImageView expandedImageView;MenuDrawer mDrawer;
    LinearLayout l1,l2,l3,l4,l5,l6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawer=MenuDrawer.attach(gallery.this);
        mDrawer.setMenuView(R.layout.menudrawer);
        mDrawer.setContentView(R.layout.gallery);
        overridePendingTransition(R.anim.entering, R.anim.leaving);
        l1=(LinearLayout)findViewById(R.id.ll1);
        l2=(LinearLayout)findViewById(R.id.ll2);
        l3=(LinearLayout)findViewById(R.id.ll3);
        l4=(LinearLayout)findViewById(R.id.ll4);

        l6=(LinearLayout)findViewById(R.id.ll6);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#00796B"));
        }
        LinearLayout abc=(LinearLayout)findViewById(R.id.lgolout);
        Button cde=(Button)findViewById(R.id.lgo);
        Animation asd= AnimationUtils.loadAnimation(gallery.this, R.anim.start);
        Animation ads=AnimationUtils.loadAnimation(gallery.this,R.anim.stop);
        abc.startAnimation(asd);
        cde.startAnimation(ads);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        b1=(Button)toolbar.findViewById(R.id.btnearth);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.openMenu();

            }
        });




        l4.setOnClickListener(new View.OnClickListener() {
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

                    Class gh=Class.forName("com.example.user.alma2k16.menu1");
                    Intent ij=new Intent(gallery.this,gh);
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
                    Intent ij=new Intent(gallery.this,fg);
                    startActivity(ij);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeMenu();

                try {

                    Class fg=Class.forName("com.example.user.alma2k16.MainActivity");
                    Intent ij=new Intent(gallery.this,fg);
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
                    Intent ij=new Intent(gallery.this,fg);
                    startActivity(ij);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });



        detector=new GestureDetector(this,new SwipeGestureDetector());

        gv=(GridView)findViewById(R.id.grid_view);
        gv.setAdapter(new ImageAdapter(gallery.this));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
                j = pos;
                zoomImageFromThumb(v, thumb[pos]);

            }
        });

        mShortAnimationDuration=getResources().getInteger(android.R.integer.config_shortAnimTime);
    }
    class ImageAdapter extends BaseAdapter{
        private LayoutInflater layoutInflater;
        public ImageAdapter(gallery activity){
            layoutInflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return thumb.length;
        }

        @Override
        public Object getItem(int pos) {
            return pos;
        }

        @Override
        public long getItemId(int pos) {
            return pos;
        }

        @Override
        public View getView(int pos, View convertView, ViewGroup parent) {

            View listitem=convertView;
            int p=pos;
            if(listitem==null){

                listitem=layoutInflater.inflate(R.layout.singlephoto,null);
            }
            ImageView iv=(ImageView)listitem.findViewById(R.id.thumb);
            iv.setBackgroundResource(thumb[p]);
            return listitem;
        }
    }
    private void zoomImageFromThumb(final View thumbView,int imageResId){
        if(mCurrentAnimator!=null){
            mCurrentAnimator.cancel();
        }
        expandedImageView=(ImageView)findViewById(R.id.snglphoto);
        expandedImageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (detector.onTouchEvent(event)) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        expandedImageView.setImageResource(imageResId);

        final Rect startBounds=new Rect();
        final Rect finalBounds=new Rect();
        final Point globalOffset=new Point();

        thumbView.getGlobalVisibleRect(startBounds);
        findViewById(R.id.container).getGlobalVisibleRect(finalBounds, globalOffset);

        startBounds.offset(-globalOffset.x, -globalOffset.y);
        finalBounds.offset(-globalOffset.x,-globalOffset.y);

        float startScale;

        if((float)finalBounds.width()/finalBounds.height()>(float)startBounds.width()/startBounds.height()){

            startScale =(float)startBounds.height()/finalBounds.height();
            float startWidth=startScale*finalBounds.width();
            float deltaWidth=(startWidth-startBounds.width())/2;
            startBounds.left -= deltaWidth;
            startBounds.right += deltaWidth;
        }
        else{
            startScale=(float)startBounds.width()/finalBounds.width();
            float startHeight=startScale*finalBounds.height();
            float deltaHeight=(startHeight-startBounds.height())/2;
            startBounds.top -= deltaHeight;
            startBounds.bottom += deltaHeight;


        }
        thumbView.setAlpha(0f);
        expandedImageView.setVisibility(View.VISIBLE);
        expandedImageView.setPivotX(0f);
        expandedImageView.setPivotY(0f);

        AnimatorSet set =new AnimatorSet();

        set.play(ObjectAnimator.ofFloat(expandedImageView,View.X,startBounds.left,finalBounds.left))
                .with(ObjectAnimator.ofFloat(expandedImageView,View.Y,startBounds.top,finalBounds.top))
                .with(ObjectAnimator.ofFloat(expandedImageView,View.SCALE_X,startScale,1f))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_Y, startScale, 1f));

        set.setDuration(mShortAnimationDuration);
        set.setInterpolator(new DecelerateInterpolator());
        set.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                mCurrentAnimator = null;
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                mCurrentAnimator = null;
            }
        });
        set.start();
        mCurrentAnimator=set;
        final float startScaleFinal=startScale;
        expandedImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCurrentAnimator!=null){
                    mCurrentAnimator.cancel();
                }
                AnimatorSet set=new AnimatorSet();

                set.play(ObjectAnimator.ofFloat(expandedImageView,View.X,startBounds.left))
                        .with(ObjectAnimator.ofFloat(expandedImageView,View.Y,startBounds.top))
                        .with(ObjectAnimator.ofFloat(expandedImageView,View.SCALE_X,startScaleFinal))
                        .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_Y, startScaleFinal));

set.setDuration(mShortAnimationDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;

                    }
                });
                set.start();
                mCurrentAnimator=set;



            }
        });




    }
private class SwipeGestureDetector extends  GestureDetector.SimpleOnGestureListener{
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        try{
            if(e1.getX()-e2.getX()>SWIPE_MIN_DISTANCE && Math.abs(velocityX)>SWIPE_THRESHOLD_VELOCITY){
               if(thumb.length<j){

                   j++;
                   if(j<thumb.length){
                       expandedImageView.setImageResource(thumb[j]);
                       return true;

                   }else{
                       j=0;
                       expandedImageView.setImageResource(thumb[j]);
                       return true;

                   }
               }

            }else if(e2.getX()-e1.getX()>SWIPE_MIN_DISTANCE && Math.abs(velocityX)>SWIPE_THRESHOLD_VELOCITY){

            if(j>0){
                j--;
                expandedImageView.setImageResource(thumb[j]);
                return true;

            }else{
                j=thumb.length-1;
                expandedImageView.setImageResource(thumb[j]);
                return true;

            }



            }




        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
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
            Intent ij=new Intent(gallery.this,gh);
            startActivity(ij);
            this.finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
