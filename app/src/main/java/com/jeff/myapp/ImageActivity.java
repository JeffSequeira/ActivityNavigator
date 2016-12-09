package com.jeff.myapp;

import android.content.ComponentName;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {

    private static int RESULT_LOAD_IMAGE = 1;
    private int PICK_IMAGE_REQUEST = 1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_layout);
    }


    public void Gallery(View view){
       // Intent intent = new Intent();
// Show only images, no videos or anything else
       // intent.setType("image/*");
       // intent.setAction(Intent.ACTION_GET_CONTENT);
        Intent galleryIntent = new Intent(
                Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);


        startActivityForResult(Intent.createChooser(galleryIntent, "Select Picture"), PICK_IMAGE_REQUEST);

        }


    @Override
    public void onStart(){
        super.onStart();

        Intent intent=getIntent();
        ImageView imageView=(ImageView) findViewById(R.id.imgView);
        Uri uri=intent.getParcelableExtra(Intent.EXTRA_STREAM);
        if(uri!=null){
            imageView.setImageURI(uri);
        }
    }


    }


