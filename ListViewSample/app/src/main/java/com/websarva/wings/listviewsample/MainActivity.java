package com.websarva.wings.listviewsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMenu = findViewById(R.id.lvMenu);
        lvMenu.setOnItemClickListener(new ListItemClickListener());
    }

    /**リストがタップされた時の処理が書かれたメンバクラス（リスナ定義）**/
    private class ListItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            /**タップされた定食名を記述**/
            String item = (String) parent.getItemAtPosition(position);
            /**トーストで表示する文字列を生成**/
            String show = "あなたが選んだ定食：" + item;
            /**トーストの表示**/
            Toast.makeText(MainActivity.this, show, Toast.LENGTH_SHORT).show();
        }
    }
}