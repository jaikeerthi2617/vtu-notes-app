package com.example.emailauthapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

public class mod211 extends AppCompatActivity {
    PDFView mat_mod1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow();
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getSupportActionBar().hide();
        setContentView((int) C0681R.layout.activity_mod211);
        PDFView pDFView = (PDFView) findViewById(C0681R.C0684id.pdfView211);
        this.mat_mod1 = pDFView;
        pDFView.fromAsset("mat_mod1.pdf").load();
    }
}