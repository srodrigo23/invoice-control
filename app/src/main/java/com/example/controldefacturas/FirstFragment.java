package com.example.controldefacturas;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

/**
 * https://github.com/yuriy-budiyev/code-scanner
 */

public class FirstFragment extends Fragment {

    private CodeScanner     mCodeScanner;
    private CodeScannerView scannerView;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        final Activity activity = getActivity();
        View root = inflater.inflate(R.layout.fragment_first, container, false);

        scannerView = root.findViewById(R.id.scanner_view);
        mCodeScanner = new CodeScanner(activity, scannerView);

        mCodeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull com.google.zxing.Result result) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(activity, result.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        scannerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCodeScanner.startPreview();
            }
        });
        return root;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
//            }
//        });
    }
}