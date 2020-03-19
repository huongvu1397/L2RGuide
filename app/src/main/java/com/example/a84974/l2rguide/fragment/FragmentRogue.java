package com.example.a84974.l2rguide.fragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.a84974.l2rguide.R;
import com.example.a84974.l2rguide.classnhanvat.Warlord;

public class FragmentRogue extends Fragment {
    LinearLayout lyTH,lyhaw,lyplain,lysilver,lyabys,lyphantom,lysca,lywar;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_rogue,container, false);
        lyTH = view.findViewById(R.id.layoutTreasure);
        lyhaw = view.findViewById(R.id.layouthaw);
        lyplain = view.findViewById(R.id.layoutPlains);
        lysilver = view.findViewById(R.id.layoutSilver);
        lyabys = view.findViewById(R.id.layoutAbys);
        lyphantom = view.findViewById(R.id.layoutPhantom);
        lysca = view.findViewById(R.id.layoutScavenger);
        lywar = view.findViewById(R.id.layoutWarranger);


        lyTH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_treasure));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_treasure));

                intent.putExtra("tenclass",getResources().getString(R.string.class_th));
                intent.putExtra("tentoc",getResources().getString(R.string.tocnguoi));
                intent.putExtra("tenhe",getResources().getString(R.string.rogue));
                intent.putExtra("vukhi",getResources().getString(R.string.daogam));
                intent.putExtra("giap",getResources().getString(R.string.giapnhe));
                intent.putExtra("hinhanhskill",R.drawable.skilltresue);
                intent.putExtra("hinhanhic",R.drawable.ic_class_treasurer);

                startActivity(intent);
            }
        });
        lyhaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_haweye));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_haweye));

                intent.putExtra("tenclass",getResources().getString(R.string.class_haw));
                intent.putExtra("tentoc",getResources().getString(R.string.tocnguoi));
                intent.putExtra("tenhe",getResources().getString(R.string.rogue));
                intent.putExtra("vukhi",getResources().getString(R.string.cung));
                intent.putExtra("giap",getResources().getString(R.string.giapnhe));
                intent.putExtra("hinhanhskill",R.drawable.skillhaw);
                intent.putExtra("hinhanhic",R.drawable.ic_class_hawkeye);

                startActivity(intent);
            }
        });
        lyabys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_abys));
                intent.putExtra("nhanxet", getResources().getString(R.string.nx_abys));

                intent.putExtra("tenclass",getResources().getString(R.string.class_abyss));
                intent.putExtra("tentoc",getResources().getString(R.string.tochactien));
                intent.putExtra("tenhe",getResources().getString(R.string.rogue));
                intent.putExtra("vukhi",getResources().getString(R.string.daogam));
                intent.putExtra("giap",getResources().getString(R.string.giapnhe));
                intent.putExtra("hinhanhskill",R.drawable.combat);
                intent.putExtra("hinhanhic",R.drawable.ic_class_abyss);

                startActivity(intent);
            }
        });
        lyplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_plains));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_plains));

                intent.putExtra("tenclass",getResources().getString(R.string.class_paladin));
                intent.putExtra("tentoc",getResources().getString(R.string.toctien));
                intent.putExtra("tenhe",getResources().getString(R.string.rogue));
                intent.putExtra("vukhi",getResources().getString(R.string.daogam));
                intent.putExtra("giap",getResources().getString(R.string.giapnhe));
                intent.putExtra("hinhanhskill",R.drawable.skillplain);
                intent.putExtra("hinhanhic",R.drawable.ic_class_plains);

                startActivity(intent);
            }
        });
        lyphantom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_phantom));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_phantom));

                intent.putExtra("tenclass",getResources().getString(R.string.class_phantom));
                intent.putExtra("tentoc",getResources().getString(R.string.tochactien));
                intent.putExtra("tenhe",getResources().getString(R.string.rogue));
                intent.putExtra("vukhi",getResources().getString(R.string.cung));
                intent.putExtra("giap",getResources().getString(R.string.giapnhe));
                intent.putExtra("hinhanhskill",R.drawable.combat);
                intent.putExtra("hinhanhic",R.drawable.ic_class_phantomranger);

                startActivity(intent);
            }
        });
        lysca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_scaven));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_scaven));

                intent.putExtra("tenclass",getResources().getString(R.string.class_scaven));
                intent.putExtra("tentoc",getResources().getString(R.string.toclun));
                intent.putExtra("tenhe",getResources().getString(R.string.rogue));
                intent.putExtra("vukhi",getResources().getString(R.string.daogam));
                intent.putExtra("giap",getResources().getString(R.string.giapnhe));
                intent.putExtra("hinhanhskill",R.drawable.combat);
                intent.putExtra("hinhanhic",R.drawable.ic_class_scavenger);

                startActivity(intent);
            }
        });
        lysilver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_silver));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_silver));

                intent.putExtra("tenclass",getResources().getString(R.string.class_silver));
                intent.putExtra("tentoc",getResources().getString(R.string.toctien));
                intent.putExtra("tenhe",getResources().getString(R.string.rogue));
                intent.putExtra("vukhi",getResources().getString(R.string.cung));
                intent.putExtra("giap",getResources().getString(R.string.giapnhe));
                intent.putExtra("hinhanhskill",R.drawable.skillsilverrange);
                intent.putExtra("hinhanhic",R.drawable.ic_class_silver);

                startActivity(intent);
            }
        });
        lywar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Warlord.class);
                intent.putExtra("chucvu",getResources().getString(R.string.chucvu_warranger));
                intent.putExtra("nhanxet",getResources().getString(R.string.nx_warranger));

                intent.putExtra("tenclass",getResources().getString(R.string.class_warranger));
                intent.putExtra("tentoc",getResources().getString(R.string.toclun));
                intent.putExtra("tenhe",getResources().getString(R.string.rogue));
                intent.putExtra("vukhi",getResources().getString(R.string.cung));
                intent.putExtra("giap",getResources().getString(R.string.giapnhe));
                intent.putExtra("hinhanhskill",R.drawable.combat);
                intent.putExtra("hinhanhic",R.drawable.ic_class_warranger);

                startActivity(intent);
            }
        });



        return view;
    }
}
