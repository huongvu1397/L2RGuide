package com.example.a84974.l2rguide.classnhanvat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a84974.l2rguide.R;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.io.ByteArrayOutputStream;

public class Warlord extends AppCompatActivity {
    private String chucvu,nhanxet,tenclass,tentoc,vukhi,tenhe,giap;
    private TextView cv,nx,classtenclass,classtentoc,classvukhi,classtenhe,classgiap;
    private ImageView img,imgIc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warlord);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        cv = findViewById(R.id.textChucvu);
        nx = findViewById(R.id.textNhanxet);
        img = findViewById(R.id.skillboook);
        imgIc = findViewById(R.id.icClass);
        classtenclass = findViewById(R.id.class_tenclass);
        classtentoc = findViewById(R.id.class_tentoc);
        classvukhi = findViewById(R.id.class_vukhi);
        classtenhe = findViewById(R.id.class_tenhe);
        classgiap = findViewById(R.id.class_giap);
        Intent a = getIntent();
        Bundle bundle = getIntent().getExtras();
        int hinhanhic = bundle.getInt("hinhanhic");
        imgIc.setImageResource(hinhanhic);
        chucvu = a.getStringExtra("chucvu");
        nhanxet = a.getStringExtra("nhanxet");

        tenclass = a.getStringExtra("tenclass");
        tentoc = a.getStringExtra("tentoc");
        vukhi = a.getStringExtra("vukhi");
        tenhe = a.getStringExtra("tenhe");
        giap = a.getStringExtra("giap");

        cv.setText(chucvu);
        nx.setText(nhanxet);

        classtenclass.setText(tenclass);
        classtenhe.setText(tenhe);
        classtentoc.setText(tentoc);
        classvukhi.setText(vukhi);
        classgiap.setText(giap);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Warlord.this,ZoomImage.class);
                Bundle bundlex = getIntent().getExtras();
                int hinhanhskill = bundlex.getInt("hinhanhskill");
                x.putExtra("hinhanh", hinhanhskill);
                startActivity(x);

            }
        });
        ShimmerFrameLayout container =
                (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container2);
        container.startShimmer();


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
