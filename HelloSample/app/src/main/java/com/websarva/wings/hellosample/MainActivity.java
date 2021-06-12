package com.websarva.wings.hellosample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**create listener object**/
        HelloListener listener = new HelloListener();
        /**表示Buttonオブジェクト取得**/
        Button btClick = findViewById(R.id.btClick);
        /**表示Buttonにリスナを設定**/
        btClick.setOnClickListener(listener);

        /**クリアButtonオブジェクト取得**/
        Button btClear = findViewById(R.id.btClear);
        /**クリアButtonにリスナを設定**/
        btClear.setOnClickListener(listener);
    }

    /**Button click listener**/
    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View view){
            /**名前入力欄であるEditText object取得**/
            EditText input = findViewById(R.id.etName);
            /**メッセージを表示するTextView object取得**/
            TextView output = findViewById(R.id.tvOutput);

            /**idのR値取得**/
            int id = view.getId();
            /**idで分岐**/
            switch(id){
                case R.id.btClick:
                    /**文字列を取得**/
                    String inputStr = input.getText().toString();
                    /**メッセージを表示**/
                    output.setText(inputStr + "さん、こんにちは！");
                    break;
                case R.id.btClear:
                    /**名前入力欄を空文字に**/
                    input.setText("");
                    /**メッセージ表示欄を空文字に**/
                    output.setText("");
                    break;
            }
        }
    }
}