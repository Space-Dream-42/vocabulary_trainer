package com.example.arminpuranyoussef.vokabeltrainer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class trainerActivity extends AppCompatActivity implements View.OnClickListener {

    private int n = 0; //
    private TextView deutsch;
    private TextView tof;
    private EditText englisch;
    private String[] deutschB;
    private String[] englischB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer);

        Button log = (Button) findViewById(R.id.log);
        Button next = (Button) findViewById(R.id.next);
        Intent intent = getIntent();
        deutschB = new String[50 + intent.getStringArrayExtra("deutsch").length];
        englischB = new String[50 + intent.getStringArrayExtra("deutsch").length];
        toArray();

        log.setOnClickListener(this);
        next.setOnClickListener(this);

        toArray2(intent);


        intent.putExtra("deutschB", deutschB);
        intent.putExtra("englischB", englischB);

       // deutschA = intent.getStringArrayExtra("deutsch");

       // englischA = intent.getStringArrayExtra("englisch");
        tof = (TextView) findViewById(R.id.tof);
        deutsch = (TextView) findViewById(R.id.deutsch);
        englisch = (EditText) findViewById(R.id.writeEnglisch);
        deutsch.setText(deutschB[n]);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.log:
                if (englisch.getText().toString().equals(englischB[n])) {
                    tof.setText("Super das ist Richtig!");
                } else {
                     tof.setText("Falsch! Richtig wäre: " + englischB[n]);
                }
                break;
            case R.id.next:
                if (n == deutschB.length - 1) {
                    n = 0;
                    deutsch.setText(deutschB[n]);
                    tof.setText("");
                    englisch.setText(null,null);
                } else {
                    n++;
                    deutsch.setText(deutschB[n]);
                    tof.setText("");
                    englisch.setText(null,null);
                }
        }
    }

    public void toArray2(Intent intent)
    {
        for (int i = 50; i < intent.getStringArrayExtra("deutsch").length + 50; i++)
        {
            deutschB[i] = intent.getStringArrayExtra("deutsch")[i-50];
            englischB[i] = intent.getStringArrayExtra("englisch")[i-50];
        }
    }

    public void toArray()
    {
        deutschB[0] = "Apfelsaft";
        englischB[0] = "apple juice";
        deutschB[1] = "Kaffee";
        englischB[1] = "coffee";
        deutschB[2] = "Kakao";
        englischB[2] = "cocoa";
        deutschB[3] = "Krischsaft";
        englischB[3] = "cherry juice";
        deutschB[4] = "Limonade";
        englischB[4] = "lemonade";
        deutschB[5] = "Mineralwasser";
        englischB[5] = "mineral water";
        deutschB[6] = "Tee";
        englischB[6] = "tea";
        deutschB[7] = "Wein";
        englischB[7] = "wine";
        deutschB[8] = "Badezimmer";
        englischB[8] = "bathroom";
        deutschB[9] = "Dachboden";
        englischB[9] = "garret";
        deutschB[10] = "Esszimmer";
        englischB[10] = "dining room";
        deutschB[11] = "Fenster";
        englischB[11] = "window";
        deutschB[12] = "Flur";
        englischB[12] = "hall";
        deutschB[13] = "Gästezimmer";
        englischB[13] = "guest room";
        deutschB[14] = "Keller";
        englischB[14] = "cellar";
        deutschB[15] = "Kinderzimmer";
        englischB[15] = "child's room";
        deutschB[16] = "Küche";
        englischB[16] = "kitchen";
        deutschB[17] = "Schlafzimmer";
        englischB[17] = "bedroom";
        deutschB[18] = "Tür";
        englischB[18] = "door";
        deutschB[19] = "Wohnzimmer";
        englischB[19] = "living room";
        deutschB[20] = "Zimmer";
        englischB[20] = "room";
        deutschB[21] = "Frühling";
        englischB[21] = "spring";
        deutschB[22] = "Truthtahn";
        englischB[22] = "turkey";
        deutschB[23] = "Sommer";
        englischB[23] = "summer";
        deutschB[24] = "sommerlich";
        englischB[24] = "summerly";
        deutschB[25] = "Herbst";
        englischB[25] = "autumn";
        deutschB[26] = "Bluse";
        englischB[26] = "blouse";
        deutschB[27] = "Gürtel";
        englischB[27] = "belt";
        deutschB[28] = "Hemd";
        englischB[28] = "shirt";
        deutschB[29] = "Hose";
        englischB[29] = "trousers";
        deutschB[30] = "Hut";
        englischB[30] = "hat";
        deutschB[31] = "Jacke";
        englischB[31] = "jacket";
        deutschB[32] = "Krawatte";
        englischB[32] = "tie";
        deutschB[33] = "Mantel";
        englischB[33] = "coat";
        deutschB[34] = "Mütze";
        englischB[34] = "cap";
        deutschB[35] = "Regenmantel";
        englischB[35] = "raincoat";
        deutschB[36] = "Rock";
        englischB[36] = "skirt";
        deutschB[37] = "Schal";
        englischB[37] = "scarf";
        deutschB[38] = "Schuhe";
        englischB[38] = "shoe";
        deutschB[39] = "Schalfanzug";
        englischB[39] = "pyjama";
        deutschB[40] = "Unterhose";
        englischB[40] = "underpants";
        deutschB[41] = "Arm";
        englischB[41] = "arm";
        deutschB[42] = "Hüfte";
        englischB[42] = "hip";
        deutschB[43] = "Kinn";
        englischB[43] = "chin";
        deutschB[44] = "Stirn";
        englischB[44] = "forehead";
        deutschB[45] = "Zahn";
        englischB[45] = "tooth";
        deutschB[46] = "Rasierer";
        englischB[46] = "shaver";
        deutschB[47] = "Zahnpaste";
        englischB[47] = "toothpaste";
        deutschB[48] = "Sonnenhut";
        englischB[48] = "sunhat";
        deutschB[49] = "Personalausweis";
        englischB[49] = "identification card";
        }
}

