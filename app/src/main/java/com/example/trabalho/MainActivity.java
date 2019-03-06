package com.example.trabalho;

import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends Activity {

TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                Locale pt = new Locale("PT", "BR");
                tts.setLanguage(pt);
            }
        });
    }

    public void onclickBTN1(View v){

    tts.speak("Eu sou o terror", TextToSpeech.QUEUE_FLUSH, null);

    }

    public void onclickBTN2(View v){

        tts.speak("Vim para te ver", TextToSpeech.QUEUE_FLUSH, null);

    }

    public void onclickBTN3(View v){

        tts.speak("E te comer", TextToSpeech.QUEUE_FLUSH, null);

    }
}
