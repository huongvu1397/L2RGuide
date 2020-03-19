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

public class FragmentWarrior extends Fragment {
    LinearLayout lyPladin,lyWarlord,lyTemple,lySS,lySK,lyBD,lyGuar,lySlayer;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_warrior,container, false);
        lyPladin = view.findViewById(R.id.layoutPladin);
        lyWarlord = view.findViewById(R.id.layoutWarLord);
        lyTemple = view.findViewById(R.id.layoutTempleKnight);
        lySS = view.findViewById(R.id.layoutSSinger);
        lySK = view.findViewById(R.id.layoutShilien);
        lyBD = view.findViewById(R.id.layoutBladeDance);
        lyGuar = view.findViewById(R.id.layoutGuardian);
        lySlayer = view.findViewById(R.id.layoutSlayer);

        lyPladin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu", getResources().getString(R.string.chucvu_pladin) );
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_pladin));
                intent.putExtra("tenclass",getResources().getString(R.string.class_paladin));
                intent.putExtra("tentoc",getResources().getString(R.string.tocnguoi));
                intent.putExtra("tenhe",getResources().getString(R.string.warrior));
                intent.putExtra("vukhi",getResources().getString(R.string.kiemkhien));
                intent.putExtra("giap",getResources().getString(R.string.giapnang));
                intent.putExtra("hinhanhskill",R.drawable.skillpladin);
                intent.putExtra("hinhanhic",R.drawable.ic_class_paladin);
                startActivity(intent);
            }
        });
        lyWarlord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_warlord));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_warlord));
                intent.putExtra("tenclass",getResources().getString(R.string.class_warlord));
                intent.putExtra("tentoc",getResources().getString(R.string.tocnguoi));
                intent.putExtra("tenhe",getResources().getString(R.string.warrior));
                intent.putExtra("vukhi",getResources().getString(R.string.kiemthuong));
                intent.putExtra("giap",getResources().getString(R.string.giapnang));
                intent.putExtra("hinhanhskill",R.drawable.skillwwarlor);
                intent.putExtra("hinhanhic",R.drawable.ic_class_warlord);
                startActivity(intent);
            }
        });
        lyTemple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_templeknigt));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_templeknigt));
                intent.putExtra("tenclass",getResources().getString(R.string.class_temple));
                intent.putExtra("tentoc",getResources().getString(R.string.toctien));
                intent.putExtra("tenhe",getResources().getString(R.string.warrior));
                intent.putExtra("vukhi",getResources().getString(R.string.kiemkhien));
                intent.putExtra("giap",getResources().getString(R.string.giapnang));
                intent.putExtra("hinhanhskill",R.drawable.skilltemple);
                intent.putExtra("hinhanhic",R.drawable.ic_class_templeknight);
                startActivity(intent);
            }
        });
        lySS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_ss));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_ss));
                intent.putExtra("tenclass",getResources().getString(R.string.class_ss));
                intent.putExtra("tentoc",getResources().getString(R.string.toctien));
                intent.putExtra("tenhe",getResources().getString(R.string.warrior));
                intent.putExtra("vukhi",getResources().getString(R.string.kiemthuong));
                intent.putExtra("giap",getResources().getString(R.string.giapnang));
                intent.putExtra("hinhanhskill",R.drawable.skillss);
                intent.putExtra("hinhanhic",R.drawable.ic_class_swordsinger);
                startActivity(intent);
            }
        });
        lySK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_sk));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_sk));
                intent.putExtra("tenclass",getResources().getString(R.string.class_sk));
                intent.putExtra("tentoc",getResources().getString(R.string.tochactien));
                intent.putExtra("tenhe",getResources().getString(R.string.warrior));
                intent.putExtra("vukhi",getResources().getString(R.string.kiemkhien));
                intent.putExtra("giap",getResources().getString(R.string.giapnang));
                intent.putExtra("hinhanhskill",R.drawable.combat);
                intent.putExtra("hinhanhic",R.drawable.ic_class_sk);
                startActivity(intent);
            }
        });
        lyBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_bd));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_bd));
                intent.putExtra("tenclass",getResources().getString(R.string.class_bd));
                intent.putExtra("tentoc",getResources().getString(R.string.tochactien));
                intent.putExtra("tenhe",getResources().getString(R.string.warrior));
                intent.putExtra("vukhi",getResources().getString(R.string.kiemthuong));
                intent.putExtra("giap",getResources().getString(R.string.giapnang));
                intent.putExtra("hinhanhskill",R.drawable.combat);
                intent.putExtra("hinhanhic",R.drawable.ic_class_bladedancer);
                startActivity(intent);
            }
        });
        lyGuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_guar));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_guar));
                intent.putExtra("tenclass",getResources().getString(R.string.class_guardian));
                intent.putExtra("tentoc",getResources().getString(R.string.toclun));
                intent.putExtra("tenhe",getResources().getString(R.string.warrior));
                intent.putExtra("vukhi",getResources().getString(R.string.kiemkhien));
                intent.putExtra("giap",getResources().getString(R.string.giapnang));
                intent.putExtra("hinhanhskill",R.drawable.combat);
                intent.putExtra("hinhanhic",R.drawable.ic_class_guardian);
                startActivity(intent);
            }
        });
        lySlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_slayer));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_slayer));
                intent.putExtra("tenclass",getResources().getString(R.string.class_slayer));
                intent.putExtra("tentoc",getResources().getString(R.string.toclun));
                intent.putExtra("tenhe",getResources().getString(R.string.warrior));
                intent.putExtra("vukhi",getResources().getString(R.string.kiemthuong));
                intent.putExtra("giap",getResources().getString(R.string.giapnhe));
                intent.putExtra("hinhanhskill",R.drawable.combat);
                intent.putExtra("hinhanhic",R.drawable.ic_class_slayer);
                startActivity(intent);
            }
        });



        return view;
    }
}
