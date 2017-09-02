package com.abhiprae.aaruush17;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Camera extends AppCompatActivity implements View.OnClickListener {


    public static final String TAG = "CamActivity";
    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView imageView;
    ImageView captureButton;
    LayerDrawable layerDrawable;
    Drawable d;
    ImageButton store;
    // Create the File where the photo should go
    File photoFile = null;
    private boolean isFilterOpen = false;
    private ImageView filterButton;
    private Bitmap mImageBitmap;
    private String mCurrentPhotoPath;

    void startCam() {
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (cameraIntent.resolveActivity(getPackageManager()) != null) {
            try {
                photoFile = createImageFile();
            } catch (IOException ex) {
                // Error occurred while creating the File
                Log.i(TAG, "IOException");
                Toast.makeText(getApplicationContext(), "here", Toast.LENGTH_SHORT).show();
            }
            // Continue only if the File was successfully created
            if (photoFile != null) {
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
                startActivityForResult(cameraIntent, REQUEST_IMAGE_CAPTURE);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        startCam();

        imageView = (ImageView) findViewById(R.id.imageView);

        // Add a listener to the Capture button
        captureButton = (ImageView) findViewById(R.id.button_capture);
        if (captureButton != null) {
            captureButton.setOnClickListener(this);
        }
        // Add listener to filter button
        filterButton = (ImageView) findViewById(R.id.filterButton);
        if (filterButton != null) {
            filterButton.setOnClickListener(this);
        }

        store = (ImageButton) findViewById(R.id.bu_save);
        if (store != null) {
            store.setOnClickListener(this);
        }
    }

    // Method for set the camera filters
    public void colorEffectFilter(View v) {
        try {
            switch (v.getId()) {
                case R.id.effectNone:
                    Drawable[] layers = new Drawable[2];
                    layers[0] = d;
                    layers[1] = ResourcesCompat.getDrawable(getResources(), R.drawable.f1, null);
                    layerDrawable = new LayerDrawable(layers);
                    imageView.setImageDrawable(layerDrawable);
                    findViewById(R.id.record_filter_layout).setVisibility(View.GONE);
                    findViewById(R.id.bottomViewContainer).setVisibility(View.VISIBLE);
                    filterButton.setImageResource(R.drawable.filter_off);
                    isFilterOpen = false;

                    break;
                case R.id.effectAqua:
                    Drawable[] layers1 = new Drawable[2];
                    layers1[0] = d;
                    layers1[1] = getResources().getDrawable(R.drawable.f2);
                    layerDrawable = new LayerDrawable(layers1);
                    imageView.setImageDrawable(layerDrawable);
                    findViewById(R.id.record_filter_layout).setVisibility(View.GONE);
                    findViewById(R.id.bottomViewContainer).setVisibility(View.VISIBLE);
                    filterButton.setImageResource(R.drawable.filter_off);
                    isFilterOpen = false;

                    break;
                case R.id.effectBlackboard:
                    Drawable[] layers2 = new Drawable[2];
                    layers2[0] = d;
                    layers2[1] = getResources().getDrawable(R.drawable.f3);
                    layerDrawable = new LayerDrawable(layers2);
                    imageView.setImageDrawable(layerDrawable);
                    findViewById(R.id.record_filter_layout).setVisibility(View.GONE);
                    findViewById(R.id.bottomViewContainer).setVisibility(View.VISIBLE);
                    filterButton.setImageResource(R.drawable.filter_off);
                    isFilterOpen = false;

                    break;
                case R.id.effectMono:
                    Drawable[] layers3 = new Drawable[2];
                    layers3[0] = d;
                    layers3[1] = getResources().getDrawable(R.drawable.f4);
                    layerDrawable = new LayerDrawable(layers3);
                    imageView.setImageDrawable(layerDrawable);
                    findViewById(R.id.record_filter_layout).setVisibility(View.GONE);
                    findViewById(R.id.bottomViewContainer).setVisibility(View.VISIBLE);
                    filterButton.setImageResource(R.drawable.filter_off);
                    isFilterOpen = false;

                    break;
                case R.id.effectNegative:
                    Drawable[] layers4 = new Drawable[2];
                    layers4[0] = d;
                    layers4[1] = getResources().getDrawable(R.drawable.f5);
                    layerDrawable = new LayerDrawable(layers4);
                    imageView.setImageDrawable(layerDrawable);
                    findViewById(R.id.record_filter_layout).setVisibility(View.GONE);
                    findViewById(R.id.bottomViewContainer).setVisibility(View.VISIBLE);
                    filterButton.setImageResource(R.drawable.filter_off);
                    isFilterOpen = false;

                    break;
            }
        } catch (Exception ex) {
            Log.d(TAG, ex.getMessage());
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.filterButton:
                if (!isFilterOpen) {
                    findViewById(R.id.record_filter_layout).setVisibility(View.VISIBLE);
                    findViewById(R.id.bottomViewContainer).setVisibility(View.GONE);
                    filterButton.setImageResource(R.drawable.filter_on);
                    isFilterOpen = true;
                } else {
                    findViewById(R.id.record_filter_layout).setVisibility(View.GONE);
                    findViewById(R.id.bottomViewContainer).setVisibility(View.VISIBLE);
                    filterButton.setImageResource(R.drawable.filter_off);
                    isFilterOpen = false;
                }
                break;
            case R.id.button_capture:
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (cameraIntent.resolveActivity(getPackageManager()) != null) {
                    // Create the File where the photo should go
                    try {
                        photoFile = createImageFile();
                    } catch (IOException ex) {
                        // Error occurred while creating the File
                        Log.i(TAG, "IOException");
                    }
                    // Continue only if the File was successfully created
                    if (photoFile != null) {
                        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
                        startActivityForResult(cameraIntent, REQUEST_IMAGE_CAPTURE);
                    }
                }
                break;
            case R.id.bu_save:
                if (imageView.getDrawable() == null)
                    Toast.makeText(Camera.this, "Please Click a Pic First", Toast.LENGTH_SHORT).show();
                else
                    store(new LayerDrawable(new Drawable[]{imageView.getDrawable()}));
                break;
            //case R.id.RotateButton:
            //  if(imageView.getDrawable() == null)
            //     Toast.makeText(Camera.this, "Please Click a Pic First", Toast.LENGTH_SHORT).show();
            // else
            //   rotate(imageView.getDrawingCache());
            // break;

        }
    }

    private File createImageFile() throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,  // prefix
                ".jpg",         // suffix
                storageDir      // directory
        );
        // Save a file: path for use with ACTION_VIEW intents
        mCurrentPhotoPath = "file:" + image.getAbsolutePath();
        return image;
    }


    private void store(LayerDrawable myLayerDrawable) {


        final int width = myLayerDrawable.getIntrinsicWidth();
        final int height = myLayerDrawable.getIntrinsicHeight();
        final Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        myLayerDrawable.setBounds(0, 0, width, height);
        myLayerDrawable.draw(new Canvas(bitmap));

        MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Aaruush-17", "SRM University");

        Toast.makeText(Camera.this, "Image Saved Successfully", Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            try {
                mImageBitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), Uri.parse(mCurrentPhotoPath));
                imageView.setImageBitmap(mImageBitmap);

            } catch (IOException e) {
                e.printStackTrace();
            }
            // rotate(mImageBitmap);
            d = new BitmapDrawable(mImageBitmap);
        }

    }

    private void rotate(Bitmap mImageBitmap) {

        Matrix matrix = new Matrix();
        matrix.postRotate(90);
        if (mImageBitmap != null) {
            Bitmap scaledBitmap = Bitmap.createScaledBitmap(mImageBitmap, mImageBitmap.getWidth(), mImageBitmap.getHeight(), true);

            Bitmap rotatedBitmap = Bitmap.createBitmap(scaledBitmap, 0, 0, scaledBitmap.getWidth(), scaledBitmap.getHeight(), matrix, true);

            imageView.setImageBitmap(rotatedBitmap);
            d = new BitmapDrawable(rotatedBitmap);
        }
    }


}