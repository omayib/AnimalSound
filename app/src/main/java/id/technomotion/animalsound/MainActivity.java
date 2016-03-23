package id.technomotion.animalsound;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnChicken,btnCow,btnSheep,btnDuck;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChicken= (ImageButton) findViewById(R.id.imageButton1);
        btnSheep= (ImageButton) findViewById(R.id.imageButton2);
        btnCow= (ImageButton) findViewById(R.id.imageButton3);
        btnDuck= (ImageButton) findViewById(R.id.imageButton4);

        btnChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.chicken_sound);
                mediaPlayer.start();
            }
        });
        btnSheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.sheep_sound);
                mediaPlayer.start();
            }
        });
        btnCow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.sheep_sound);
                mediaPlayer.start();
            }
        });
        btnDuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.duck_sound);
                mediaPlayer.start();
            }
        });
    }
}
