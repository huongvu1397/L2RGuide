package com.example.a84974.l2rguide.fragment;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.a84974.l2rguide.R;
import com.example.a84974.l2rguide.classnhanvat.Warlord;

public class FragmentMystic extends Fragment {
  LinearLayout lysor,lybishop,lyspells,lyelder,lybmage,lysage,lyspelhow,lyshilel;
  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.activity_fragment_mystic,container, false);
    lysor = view.findViewById(R.id.layoutSorceror);
    lybishop = view.findViewById(R.id.layoutbishop);
    lyspells = view.findViewById(R.id.layoutSpellsinger);
    lyelder = view.findViewById(R.id.layoutElder);
    lybmage = view.findViewById(R.id.layoutBattlemage);
    lysage = view.findViewById(R.id.layoutSage);
    lyspelhow = view.findViewById(R.id.layoutspellhow);
    lyshilel = view.findViewById(R.id.layoutShilienElder);

    lysor.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), Warlord.class);
        intent.putExtra("chucvu",getResources().getString(R.string.chucvu_sorcer));
        intent.putExtra("nhanxet",getResources().getString(R.string.nx_sorcer));

        intent.putExtra("tenclass",getResources().getString(R.string.class_sor));
        intent.putExtra("tentoc",getResources().getString(R.string.tocnguoi));
        intent.putExtra("tenhe",getResources().getString(R.string.mage));
        intent.putExtra("vukhi",getResources().getString(R.string.truong));
        intent.putExtra("giap",getResources().getString(R.string.aochoang));
        intent.putExtra("hinhanhskill",R.drawable.skillsor);
        intent.putExtra("hinhanhic",R.drawable.ic_class_sorcerer);

        startActivity(intent);
      }
    });
    lybishop.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), Warlord.class);
        intent.putExtra("chucvu",getResources().getString(R.string.chucvu_bishop));
        intent.putExtra("nhanxet",getResources().getString(R.string.nx_bishop));

        intent.putExtra("tenclass",getResources().getString(R.string.class_bishop));
        intent.putExtra("tentoc",getResources().getString(R.string.tocnguoi));
        intent.putExtra("tenhe",getResources().getString(R.string.mage));
        intent.putExtra("vukhi",getResources().getString(R.string.truong));
        intent.putExtra("giap",getResources().getString(R.string.aochoang));
        intent.putExtra("hinhanhskill",R.drawable.skillbishop);
        intent.putExtra("hinhanhic",R.drawable.ic_class_bishop);

        startActivity(intent);
      }
    });
    lyshilel.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), Warlord.class);
        intent.putExtra("chucvu",getResources().getString(R.string.chucvu_shillien));
        intent.putExtra("nhanxet",getResources().getString(R.string.nx_shillien));

        intent.putExtra("tenclass",getResources().getString(R.string.class_shillienelder));
        intent.putExtra("tentoc",getResources().getString(R.string.tochactien));
        intent.putExtra("tenhe",getResources().getString(R.string.mage));
        intent.putExtra("vukhi",getResources().getString(R.string.truong));
        intent.putExtra("giap",getResources().getString(R.string.aochoang));
        intent.putExtra("hinhanhskill",R.drawable.combat);
        intent.putExtra("hinhanhic",R.drawable.ic_class_shillienelder);

        startActivity(intent);
      }
    });
    lyspells.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), Warlord.class);
        intent.putExtra("chucvu",getResources().getString(R.string.chucvu_spellsinger));
        intent.putExtra("nhanxet",getResources().getString(R.string.nx_spellsinger));

        intent.putExtra("tenclass",getResources().getString(R.string.class_spellsinger));
        intent.putExtra("tentoc",getResources().getString(R.string.toctien));
        intent.putExtra("tenhe",getResources().getString(R.string.mage));
        intent.putExtra("vukhi",getResources().getString(R.string.truong));
        intent.putExtra("giap",getResources().getString(R.string.aochoang));
        intent.putExtra("hinhanhskill",R.drawable.skillspellsinger);
        intent.putExtra("hinhanhic",R.drawable.ic_class_spellsinger);

        startActivity(intent);
      }
    });
    lyelder.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), Warlord.class);
        intent.putExtra("chucvu",getResources().getString(R.string.chucvu_elder));
        intent.putExtra("nhanxet",getResources().getString(R.string.nx_elder));

        intent.putExtra("tenclass",getResources().getString(R.string.class_elder));
        intent.putExtra("tentoc",getResources().getString(R.string.toctien));
        intent.putExtra("tenhe",getResources().getString(R.string.mage));
        intent.putExtra("vukhi",getResources().getString(R.string.truong));
        intent.putExtra("giap",getResources().getString(R.string.aochoang));
        intent.putExtra("hinhanhskill",R.drawable.skillelder);
        intent.putExtra("hinhanhic",R.drawable.ic_class_elder);

        startActivity(intent);
      }
    });
    lyspelhow.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), Warlord.class);
        intent.putExtra("chucvu",getResources().getString(R.string.chucvu_spellhow));
        intent.putExtra("nhanxet",getResources().getString(R.string.nx_spellhow));

        intent.putExtra("tenclass",getResources().getString(R.string.class_spellhowler));
        intent.putExtra("tentoc",getResources().getString(R.string.tochactien));
        intent.putExtra("tenhe",getResources().getString(R.string.mage));
        intent.putExtra("vukhi",getResources().getString(R.string.truong));
        intent.putExtra("giap",getResources().getString(R.string.aochoang));
        intent.putExtra("hinhanhskill",R.drawable.combat);
        intent.putExtra("hinhanhic",R.drawable.ic_class_spellhowler);

        startActivity(intent);
      }
    });
    lybmage.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), Warlord.class);
        intent.putExtra("chucvu",getResources().getString(R.string.chucvu_battlemage));
        intent.putExtra("nhanxet",getResources().getString(R.string.nx_battlemage));

        intent.putExtra("tenclass",getResources().getString(R.string.class_battlemage));
        intent.putExtra("tentoc",getResources().getString(R.string.toclun));
        intent.putExtra("tenhe",getResources().getString(R.string.mage));
        intent.putExtra("vukhi",getResources().getString(R.string.truong));
        intent.putExtra("giap",getResources().getString(R.string.aochoang));
        intent.putExtra("hinhanhskill",R.drawable.combat);
        intent.putExtra("hinhanhic",R.drawable.ic_class_battlemage);

        startActivity(intent);
      }
    });
    lysage.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), Warlord.class);
        intent.putExtra("chucvu",getResources().getString(R.string.chucvu_sage));
        intent.putExtra("nhanxet",getResources().getString(R.string.nx_sage));

        intent.putExtra("tenclass",getResources().getString(R.string.class_sage));
        intent.putExtra("tentoc",getResources().getString(R.string.toclun));
        intent.putExtra("tenhe",getResources().getString(R.string.mage));
        intent.putExtra("vukhi",getResources().getString(R.string.truong));
        intent.putExtra("giap",getResources().getString(R.string.aochoang));
        intent.putExtra("hinhanhskill",R.drawable.combat);
        intent.putExtra("hinhanhic",R.drawable.ic_class_sage);

        startActivity(intent);
      }
    });


    return view;
  }
}
