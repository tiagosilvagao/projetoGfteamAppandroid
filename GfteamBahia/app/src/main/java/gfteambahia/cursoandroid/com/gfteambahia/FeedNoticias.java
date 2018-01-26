package gfteambahia.cursoandroid.com.gfteambahia;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class FeedNoticias extends Activity {

    private SeekBar seekbar;
    private ImageView vidaNoTatame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_noticias);

        seekbar = (SeekBar) findViewById(R.id.seekBarId);
        vidaNoTatame = (ImageView) findViewById(R.id.vidaNoTatameId);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

               int valorProgesso = progress;

                if(valorProgesso == 1) {
                    vidaNoTatame.setImageResource(R.drawable.vida);
                }else if(valorProgesso == 2){
                    vidaNoTatame.setImageResource( R.drawable.vidanotatame);
                }else if(valorProgesso == 3){
                    vidaNoTatame.setImageResource( R.drawable.vidadois);
                }else if(valorProgesso == 2){
                    vidaNoTatame.setImageResource( R.drawable.vidatres);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {



            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {



            }
        });

    }
}
