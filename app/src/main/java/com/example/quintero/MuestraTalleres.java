package com.example.quintero;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MuestraTalleres extends AppCompatActivity {
    Connection connect;
    String ConnectionResult="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_talleres);
    }


    public void GetTextFromSQL (View v){
        TextView tx1 = (TextView) findViewById(R.id.textView);
        TextView tx2 = (TextView) findViewById(R.id.textView2);

        try {
            ConnectionHelper connectionHelper = new ConnectionHelper();
            connect = connectionHelper.connectionclass();
            if (connect != null){
                String query = "SELECT * FROM persona";
                Statement st = connect.createStatement();
                ResultSet rs = ((Statement) st).executeQuery(query);

                while (rs.next()){
                    tx1.setText(rs.getString(1));
                    tx2.setText(rs.getString(2));
                }
            }else{
                ConnectionResult = "Check Connection";
            }
        }catch (Exception ex){


        }
    }
}
