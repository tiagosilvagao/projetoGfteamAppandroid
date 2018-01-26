package gfteambahia.cursoandroid.com.gfteambahia;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView feedNoticias;
    private ImageView divulgacoes;
    private ImageView materiais;
    private ImageView eventos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        feedNoticias = (ImageView) findViewById(R.id.feedNoticiasId);
        divulgacoes = (ImageView) findViewById(R.id.divulgacoesId);
        materiais = (ImageView) findViewById(R.id.materiaisId);
        eventos = (ImageView) findViewById(R.id.eventosId);

        feedNoticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FeedNoticias.class));
            }
        });

        divulgacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DivulgacoesActivity.class));

            }
        });

        materiais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MateriaisActivity.class));
            }
        });

        eventos.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EventosActivity.class));
            }
        });    }
}
