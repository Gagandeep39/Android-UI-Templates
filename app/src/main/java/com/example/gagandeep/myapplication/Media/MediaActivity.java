package com.example.gagandeep.myapplication.Media;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gagandeep.myapplication.Mainv2Activity.MainActivity;
import com.example.gagandeep.myapplication.R;

public class MediaActivity extends AppCompatActivity {
    Button button;
    MediaPlayer mediaPlayer;
    SeekBar seekBar;
    TextView textView;
    ImageView back;
    int progressValue = 0;


    //mediaPlayer = MediaPlayer.create(MediaActivity.this, R.raw.song_of_the_sea);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        mediaPlayer = MediaPlayer.create(MediaActivity.this, R.raw.song_of_the_sea);
        button  = findViewById(R.id.buttonMedia);
        back = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click();
            }
        });

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                click2();
                return true;
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaActivity.this, MainActivity.class);
                startActivity(i);
            }
        });



    }




    void seek() {
        seekBar = findViewById(R.id.seekBar);
        textView = findViewById(R.id.textView);
        seekBar.setMax(R.raw.song_of_the_sea);



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

                if(mediaPlayer!=null) {
                    mediaPlayer.seekTo(progress);
                    seekBar.setProgress(progress);

                }
                }
//                textView.setText("" + seekBar.getProgress());
//                Toast.makeText(MediaActivity.this, "Seekbar", Toast.LENGTH_LONG).show();



            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                textView.setText("" + seekBar.getProgress());

            }
        });
    }




    private void click2() {
        if (mediaPlayer.isPlaying())
            mediaPlayer.seekTo(0);
            mediaPlayer.pause();
            Toast.makeText(this, "Reset", Toast.LENGTH_SHORT).show();
    }

    private void click() {


        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show();
        }
        else {
            mediaPlayer.start();
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.pause();
        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        }
    }


