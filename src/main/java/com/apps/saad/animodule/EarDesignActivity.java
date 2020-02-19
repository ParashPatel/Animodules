package com.apps.saad.animodule;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.content.ClipData;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.Picasso;

//Create by Saad Anwar 7/1/2017
public class EarDesignActivity extends AppCompatActivity {
    Button main, next,designs,background,color, bred,bmagenta,bblue,bgreen,byellow,bgray;
    ImageButton and, henna,mandala;
    ImageView backarrow, henna2,henna3,henna4,mandala2,mandala3,mandala4,
            and3,and5,and7,elephantearcutout;
    HorizontalScrollView tags, ands,hennas,mandalas,backgrounds;
    LinearLayout paintlayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_ear);

        next();
        getItems();
        imageLoad();
        tabs();
        listeners();
    }

    private void next() {
        main = (Button) findViewById(R.id.main);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(EarDesignActivity.this, SubMainActivity.class);
                startActivity(myIntent);
            }
        });
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(EarDesignActivity.this, ColorMenuActivity.class);
                startActivity(myIntent);
            }
        });
    }

    private void getItems() {

        designs = (Button) findViewById(R.id.designs);
        background = (Button) findViewById(R.id.background);
        color = (Button) findViewById(R.id.color);

        paintlayout = (LinearLayout) findViewById(R.id.paintlayout);

        and = (ImageButton) findViewById(R.id.and1);
        henna = (ImageButton) findViewById(R.id.henna1);
        mandala = (ImageButton) findViewById(R.id.mandala1);
        backarrow= (ImageView) findViewById(R.id.backarrow);

        tags = (HorizontalScrollView) findViewById(R.id.tags);
        backgrounds = (HorizontalScrollView) findViewById(R.id.backgrounds);
        ands = (HorizontalScrollView) findViewById(R.id.ands);
        hennas = (HorizontalScrollView) findViewById(R.id.hennas);
        mandalas = (HorizontalScrollView) findViewById(R.id.mandalas);

        and3= (ImageView) findViewById(R.id.and3);
        and5= (ImageView) findViewById(R.id.and5);
        and7= (ImageView) findViewById(R.id.and7);

        henna2= (ImageView) findViewById(R.id.henna2);
        henna3= (ImageView) findViewById(R.id.henna3);
        henna4= (ImageView) findViewById(R.id.henna4);
        bred= (Button) findViewById(R.id.bred);
        bmagenta= (Button) findViewById(R.id.bmagenta);
        bblue= (Button) findViewById(R.id.bblue);
        byellow= (Button) findViewById(R.id.byellow);
        bgreen= (Button) findViewById(R.id.bgreen);
        bgray= (Button) findViewById(R.id.bgray);
        elephantearcutout= (ImageView) findViewById(R.id.elephantearcutout);

        mandala2= (ImageView) findViewById(R.id.mandala2);
        mandala3= (ImageView) findViewById(R.id.mandala3);
        mandala4= (ImageView) findViewById(R.id.mandala4);

    }

    private void imageLoad(){
        henna2.setImageResource(R.drawable.henna2);
        henna3.setImageResource(R.drawable.henna3);
        henna4.setImageResource(R.drawable.henna4);

        mandala2.setImageResource(R.drawable.mandala2);
        mandala3.setImageResource(R.drawable.mandala3);
        mandala4.setImageResource(R.drawable.mandala4);

        and3.setImageResource(R.drawable.and3);
        and5.setImageResource(R.drawable.and5);
        and7.setImageResource(R.drawable.and7);
    }

    private void tabs() {
        and.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ands.setVisibility(View.VISIBLE);
                tags.setVisibility(View.GONE);
                hennas.setVisibility(View.GONE);
                mandalas.setVisibility(View.GONE);
                backgrounds.setVisibility(View.GONE);
                backarrow.setVisibility(View.VISIBLE);
                paintlayout.setVisibility(View.GONE);
            }
        });
        henna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hennas.setVisibility(View.VISIBLE);
                ands.setVisibility(View.GONE);
                tags.setVisibility(View.GONE);
                mandalas.setVisibility(View.GONE);
                backgrounds.setVisibility(View.GONE);
                backarrow.setVisibility(View.VISIBLE);
                paintlayout.setVisibility(View.GONE);
            }
        });
        mandala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mandalas.setVisibility(View.VISIBLE);
                hennas.setVisibility(View.GONE);
                ands.setVisibility(View.GONE);
                tags.setVisibility(View.GONE);
                backgrounds.setVisibility(View.GONE);
                backarrow.setVisibility(View.VISIBLE);
                paintlayout.setVisibility(View.GONE);

            }
        });


        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tags.setVisibility(View.VISIBLE);
                ands.setVisibility(View.GONE);
                hennas.setVisibility(View.GONE);
                mandalas.setVisibility(View.GONE);
                backgrounds.setVisibility(View.GONE);
                paintlayout.setVisibility(View.GONE);
                backarrow.setVisibility(View.GONE);
            }
        });
        designs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tags.setVisibility(View.VISIBLE);
                ands.setVisibility(View.GONE);
                hennas.setVisibility(View.GONE);
                mandalas.setVisibility(View.GONE);
                backgrounds.setVisibility(View.GONE);
                paintlayout.setVisibility(View.GONE);
            }
        });
        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tags.setVisibility(View.GONE);
                ands.setVisibility(View.GONE);
                hennas.setVisibility(View.GONE);
                mandalas.setVisibility(View.GONE);
                backgrounds.setVisibility(View.VISIBLE);
                backarrow.setVisibility(View.GONE);
                paintlayout.setVisibility(View.GONE);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paintlayout.setVisibility(View.VISIBLE);
                tags.setVisibility(View.GONE);
                ands.setVisibility(View.GONE);
                hennas.setVisibility(View.GONE);
                mandalas.setVisibility(View.GONE);
                backgrounds.setVisibility(View.GONE);
                backarrow.setVisibility(View.GONE);
            }
        });
        bred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elephantearcutout.setColorFilter(Color.RED);
            }
        });
        bmagenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elephantearcutout.setColorFilter(Color.MAGENTA);
            }
        });
        bblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elephantearcutout.setColorFilter(Color.BLUE);
            }
        });
        byellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elephantearcutout.setColorFilter(Color.YELLOW);
            }
        });
        bgray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elephantearcutout.setColorFilter(Color.GRAY);
            }
        });
        bgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elephantearcutout.setColorFilter(Color.GREEN);
            }
        });



    }

    private void listeners() {


        findViewById(R.id.henna2).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.henna3).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.henna4).setOnTouchListener(new MyTouchListener());


        findViewById(R.id.mandala2).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.mandala3).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.mandala4).setOnTouchListener(new MyTouchListener());

        findViewById(R.id.and3).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.and5).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.and7).setOnTouchListener(new MyTouchListener());

        findViewById(R.id.designedEar).setOnDragListener(new MyDragListener());
        findViewById(R.id.designedHead).setOnDragListener(new MyDragListener());
    }

    private final class MyTouchListener implements OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);

                view.startDrag(data, shadowBuilder, view, 0);

                return true;
            } else {
                return false;
            }
        }
    }

    private class MyDragListener implements OnDragListener {

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (action) {
                case DragEvent.ACTION_DRAG_STARTED:
                    // do nothing
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    // Dropped, reassign View to ViewGroup
                    PhotoView target = (PhotoView) findViewById(R.id.blank2);
                    View view = (View) event.getLocalState();

                    ImageView oldView =  (ImageView)view;
                    ImageView newView = new ImageView(getApplicationContext());
                    newView.setImageBitmap(((BitmapDrawable) oldView.getDrawable()).getBitmap());

                    ImageView dragged =  newView;

                    Drawable target_draw = target.getDrawable();
                    Drawable dragged_draw = dragged.getDrawable();

                    dragged.setImageDrawable(target_draw);
                    target.setImageDrawable(dragged_draw);

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        dragged.setBackground(null);
                    }
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                default:
                    break;
            }
            return true;
        }
    }


}

