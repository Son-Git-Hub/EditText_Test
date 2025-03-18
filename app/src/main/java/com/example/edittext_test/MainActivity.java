package com.example.edittext_test;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //에디트텍스트 eText;
    //버튼 eButton;
    //텍스트뷰 eTextView;

    private EditText eText;
    private EditText eText2;
    private EditText eText3;
    private Button eButton;
    private TextView eTextView;
    private TextView eTextView2;
    private TextView eTextView3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        eText = (EditText) findViewById(R.id.edittext);
        eText2 = (EditText) findViewById(R.id.edittext2);
        eText3 = (EditText) findViewById(R.id.edittext3);
        eButton = (Button) findViewById(R.id.button);
        eTextView = (TextView) findViewById(R.id.textView);
        eTextView2 = (TextView) findViewById(R.id.textView2);
        eTextView3 = (TextView) findViewById(R.id.textView3);

    }

    public void onClicked(View view) {
        String enteredId = eText.getText().toString();
        eTextView.setText("아이디:" + enteredId);
        String enteredId2 = eText2.getText().toString();
        eTextView2.setText("패스워드:" + enteredId2);
        String enteredId3 = eText3.getText().toString();
        eTextView3.setText("전화번호:" + enteredId3);





    }
}