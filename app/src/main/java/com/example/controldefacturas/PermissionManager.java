package com.example.controldefacturas;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

//https://medium.com/programming-lite/runtime-permissions-in-android-7496a5f3de55

public class PermissionManager {

    private Context context;
    private SessionManager sessionManager;

    public PermissionManager(Context context){
        this.context = context;
        sessionManager = new SessionManager(context);
    }

    public boolean shouldAskPermission() {
        return (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M);
    }

    private boolean shouldAskPermission(Context context, String permission){
        if (shouldAskPermission()) {
            int permissionResult = ActivityCompat.checkSelfPermission(context, permission);
            if (permissionResult != PackageManager.PERMISSION_GRANTED) {
                return true;
            }
        }
        return false;
    }

    public void checkPermission(Context context, String permission, PermissionAskListener listener){
        if (shouldAskPermission(context, permission)){
            if (ActivityCompat.shouldShowRequestPermissionRationale((AppCompatActivity)context,permission)) {
                listener.onPermissionPreviouslyDenied();
            } else {
                if (sessionManager.isFirstTimeAsking(permission)) {
                    sessionManager.firstTimeAsking(permission, false);
                    listener.onNeedPermission();
                } else {
                    listener.onPermissionPreviouslyDeniedWithNeverAskAgain();
                }
            }
        } else {
            listener.onPermissionGranted();
        }
    }

    public interface PermissionAskListener {
        void onNeedPermission();
        void onPermissionPreviouslyDenied();
        void onPermissionPreviouslyDeniedWithNeverAskAgain();
        void onPermissionGranted();
    }
}