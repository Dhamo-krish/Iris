package com.example.hp.iris;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by HP on 3/22/2018.
 */

public class BlindFit extends AppCompatActivity {
    Button feelpad;
    Boolean flag=false;
    CardView vision,textscanner,barcodescanner,peoplemarker,facedetection,call,message;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.blindfitlayout);
        vision=(CardView)findViewById(R.id.vision);
        textscanner=(CardView)findViewById(R.id.textscanner);
        barcodescanner=(CardView)findViewById(R.id.qrscanner);
        peoplemarker=(CardView)findViewById(R.id.peoplemarker);
        facedetection=(CardView)findViewById(R.id.facedetection);
        call=(CardView)findViewById(R.id.call);
        message=(CardView)findViewById(R.id.message);

        feelpad=(Button)findViewById(R.id.feelpad);
        feelpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vibrator=(Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(100);
                flag=true;

            }
        });
        vision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==true)
                {

                }

            }
        });
        vision.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(flag==true)
                {

                }
                return false;
            }
        });
        textscanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==true)
                {

                }

            }
        });
        textscanner.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(flag==true)
                {

                }
                return false;
            }
        });

       facedetection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==true)
                {

                }

            }
        });
        facedetection.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(flag==true)
                {

                }
                return false;
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==true)
                {

                }

            }
        });
        call.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(flag==true)
                {

                }
                return false;
            }
        });

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==true)
                {

                }

            }
        });
        message.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(flag==true)
                {

                }
                return false;
            }
        });


        peoplemarker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==true)
                {

                }

            }
        });
       peoplemarker.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(flag==true)
                {

                }
                return false;
            }
        });
        barcodescanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==true)
                {

                }

            }
        });
        barcodescanner.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(flag==true)
                {

                }
                return false;
            }
        });
    }
}
