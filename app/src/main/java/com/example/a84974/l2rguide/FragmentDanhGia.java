package com.example.a84974.l2rguide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.a84974.l2rguide.danhgia.defldanhgia;
import com.example.a84974.l2rguide.danhgia.dwarfdanhgia;
import com.example.a84974.l2rguide.danhgia.humandanhgia;
import com.example.a84974.l2rguide.danhgia.tiendanhgia;

public class FragmentDanhGia extends Fragment {
      LinearLayout dghm,dgelf,dgdelf,dgdwarf;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_danh_gia,container,false);
        dghm = view.findViewById(R.id.danhgiahuman);
        dgelf = view.findViewById(R.id.danhgiaelf);
        dgdelf = view.findViewById(R.id.danhgiadarkelf);
        dgdwarf = view.findViewById(R.id.danhgiadwarf);
        //human
        dghm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),humandanhgia.class);
                startActivity(intent);
            }
        });
        //elf
        dgelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),tiendanhgia.class);
                startActivity(intent);
            }
        });
        //delf
        dgdelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),defldanhgia.class);
                startActivity(intent);
            }
        });
        //dwarf
        dgdwarf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),dwarfdanhgia.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
