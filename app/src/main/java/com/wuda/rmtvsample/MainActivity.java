package com.wuda.rmtvsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wuda.readmoretextview.ReadMoreTextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setText(R.string.text1);

        ReadMoreTextView text2 = (ReadMoreTextView) findViewById(R.id.text2);
        text2.setClickableTextColorId(R.color.colorPrimaryDark);
        text2.setTrimCollapsedText(R.string.read_more);
        text2.setTrimExpandedText(R.string.read_less);
        text2.setTrimLines(2);


        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setText(R.string.text3);

        TextView text4 = (TextView) findViewById(R.id.text4);
        text4.setText(R.string.one_line_text);
    }
}
