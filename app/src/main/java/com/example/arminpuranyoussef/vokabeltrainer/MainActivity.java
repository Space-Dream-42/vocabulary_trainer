package com.example.arminpuranyoussef.vokabeltrainer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public static List start;
    public static final String EXTRA_TEXT = "EXTRA_TEXT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                start = new List();
            Button addVokabel = (Button) findViewById(R.id.addVokabel);
            Button liste      = (Button) findViewById(R.id.liste);
            Button trainer    = (Button) findViewById(R.id.trainer);
                addVokabel.setOnClickListener(this);
                liste.setOnClickListener(this);
                trainer.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
       switch (view.getId())
       {
           case R.id.addVokabel:
               EditText d = (EditText) findViewById(R.id.deutsch);
               EditText e = (EditText) findViewById(R.id.englisch);

               if(d.getText().toString().isEmpty() || e.getText().toString().isEmpty())
               {

               }
                else
                    {
                   start.add(new ListNode(d.getText().toString(), e.getText().toString()));

                   d.setText(null, null);
                   e.setText(null, null);
                    }

               break;

           case R.id.liste:
                openListeActivity();
                break;
           case R.id.trainer:
                if (start.isEmpty())
                {
                    //< Message erstellen >
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Meldung");
                    msg.setMessage("Bitte füge Vokabeln hinzu");
                    msg.setCancelable(true);
                    //</ Message erstellen >

                    //< anzeigen >
                    AlertDialog msgDialog = msg.create();
                    msgDialog.show();
                    //</ anzeigen >


                }
                else
                    {
                        openTrainerActivity();
                    }

                break;
       }


    }

    public void openListeActivity()
    {
        Intent intent = new Intent(this, listeActivity.class);
        String[] deutsch = start.toArrayStringDeu();
        String[] englisch = start.toArrayStringEng();
        intent.putExtra("deutsch", deutsch);
        intent.putExtra("englisch", englisch);
        startActivity(intent);


    }

    public void openTrainerActivity()
    {
        Intent intent = new Intent(this, trainerActivity.class);

        String[] deutsch = start.toArrayStringDeu();

        String[] englisch = start.toArrayStringEng();
        intent.putExtra("deutsch", deutsch);
        intent.putExtra("englisch", englisch);
        startActivity(intent);
    }
}

