package com.websarva.wings.fragmentsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MenuThanksFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //このフラグメントが所属するアクティビティオブジェクトを取得
        Activity parentActivity = getActivity();
        //フラグメントで表示する画面をxmlファイルからインフレート
        View view = inflater.inflate(R.layout.fragment_menu_thanks, container, false);

        //所属アクティビティからインテントを取得
        Intent intent = parentActivity.getIntent();
        //インテントから引継ぎデータをまとめたもの(Bundleオブジェクト)を取得
        Bundle extras = intent.getExtras();

        //注文した定食名と金額変数を用意。引継ぎデータがうまく取得できなかったときのために""で初期化
        String menuName = "";
        String menuPrice = "";
        //
    }
}