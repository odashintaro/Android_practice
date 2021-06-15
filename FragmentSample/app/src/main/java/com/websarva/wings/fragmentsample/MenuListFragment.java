package com.websarva.wings.fragmentsample;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //このフラグメントが所属するアクティビティオブジェクトを取得
        Activity parentActivity = getActivity();
        //フラグメントで表示する画面をXMLファイルからインフレ―ト
        View view = inflater.inflate(R.layout.fragment_menu_list, container, false);
        //画面部品ListViewを取得
        ListView lvMenu = view.findViewById(R.id.lvMenu);
        //SimpleAdapterで使用するListオブジェクトを用意
        List<Map<String, String>> menuList = new ArrayList<>();
        //menuListデータ生成
        Map<String, String> menu = new HashMap<>();
        menu.put("name", "から揚げ定食");
        menu.put("price", "800円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "850円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "生姜焼き定食");
        menu.put("price", "850円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ステーキ定食");
        menu.put("price", "1000円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "野菜炒め定食");
        menu.put("price", "750円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "とんかつ定食");
        menu.put("price", "900円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ミンチかつ定食");
        menu.put("price", "850円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "チキンカツ定食");
        menu.put("price", "900円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "コロッケ定食");
        menu.put("price", "850円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "回鍋肉定食");
        menu.put("price", "750円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "麻婆豆腐定食");
        menu.put("price", "800円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "青椒肉絲定食");
        menu.put("price", "900円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "焼き魚定食");
        menu.put("price", "850円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "焼肉定食");
        menu.put("price", "950円");
        menuList.add(menu);

        //SimpleAdapterの第４引数from用データ
        String[] from = {"name", "price"};
        //SimpleAdapterの第５引数to用データ
        int[] to = {android.R.id.text1, android.R.id.text2};
        //SimpleAdapter生成
        SimpleAdapter adapter = new SimpleAdapter(parentActivity, menuList,
                android.R.layout.simple_list_item_2,from, to);
        //アダプタの登録
        lvMenu.setAdapter(adapter);
        //インフレートされた画面を戻り値として返す
        return view;
    }
}