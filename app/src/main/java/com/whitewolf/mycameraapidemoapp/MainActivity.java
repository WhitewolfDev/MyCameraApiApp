package com.whitewolf.mycameraapidemoapp;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean hasCamera;

        TextView myHasCamera = (TextView) findViewById(R.id.mainActivityHasCameraText);

        hasCamera = checkForCameraHardware(this);

        if (hasCamera == true) {
            myHasCamera.setText("There is a camera onboard.");
        } else {
            myHasCamera.setText("There is no camera anywhee.");
        }

    }


    private boolean checkForCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
            return true;
        } else {
            return false;
        }
    }
}
