package com.thanhduc91tpk.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.thanhduc91tpk.test1.model.Girl;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edtTen1,edtTuoi1,edtTen2,edtTuoi2,edtTen3,edtTuoi3,edtTen4,edtTuoi4,edtTen5,edtTuoi5;
    Button btnChon,btnNhapLai,btnThoat;
    List<Girl> listGirl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();

    }

    public void addControls(){
        edtTen1 = findViewById(R.id.txtTen1);
        edtTen2 = findViewById(R.id.txtTen2);
        edtTen3 = findViewById(R.id.txtTen3);
        edtTen4 = findViewById(R.id.txtTen4);
        edtTen5 = findViewById(R.id.txtTen5);

        edtTuoi1 = findViewById(R.id.edtTuoi1);
        edtTuoi2 = findViewById(R.id.edtTuoi2);
        edtTuoi3 = findViewById(R.id.edtTuoi3);
        edtTuoi4 = findViewById(R.id.edtTuoi4);
        edtTuoi5 = findViewById(R.id.edtTuoi5);

        btnChon = findViewById(R.id.btnChon);
        btnNhapLai = findViewById(R.id.btnNhapLai);
        btnThoat = findViewById(R.id.btnThoat);

        listGirl = new ArrayList<>();

    }

    public void addEvents(){
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData();
                Intent intent = new Intent(MainActivity.this,ResulActivity.class);
                Girl girl = listGirl.get(0);
                intent.putExtra("Key_1",girl.getmTen());  // Truyền một String
                intent.putExtra("Key_2", girl.getmTuoi());                    // Truyền một Int
                startActivity(intent);

                Log.d("Result",girl.getmTen());
                Log.d("Result",String.valueOf(girl.getmTuoi()));
            }
        });
    }

    public void addData(){
        if(edtTuoi1.getText()!=null&&edtTen1.getText()!=null){
            String ten = edtTen1.getText().toString();
            int tuoi = Integer.parseInt(edtTuoi1.getText().toString());
            Girl girl = new Girl(ten,tuoi);
            listGirl.add(girl);
        }
        if(edtTuoi2.getText()!=null&&edtTen2.getText()!=null){
            String ten = edtTen2.getText().toString();
            int tuoi = Integer.parseInt(edtTuoi2.getText().toString());
            Girl girl = new Girl(ten,tuoi);
            listGirl.add(girl);
        }
        if(edtTuoi3.getText()!=null&&edtTen3.getText()!=null){
            String ten = edtTen3.getText().toString();
            int tuoi = Integer.parseInt(edtTuoi3.getText().toString());
            Girl girl = new Girl(ten,tuoi);
            listGirl.add(girl);
        }
        if(edtTuoi4.getText()!=null&&edtTen4.getText()!=null){
            String ten = edtTen4.getText().toString();
            int tuoi = Integer.parseInt(edtTuoi4.getText().toString());
            Girl girl = new Girl(ten,tuoi);
            listGirl.add(girl);
        }
        if(edtTuoi5.getText()!=null&&edtTen5.getText()!=null){
            String ten = edtTen5.getText().toString();
            int tuoi = Integer.parseInt(edtTuoi5.getText().toString());
            Girl girl = new Girl(ten,tuoi);
            listGirl.add(girl);
        }
    }
}