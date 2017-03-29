package titaniumstudios.algoritmicagraphs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

    LinearLayout layout;


    ImageView drawingImageView;
    private Button btnCrearNodo;
    private Button btnCrearArista;
    private boolean btnEncendido = false;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout) findViewById(R.id.Map);
        layout.addView(new Nodos(MainActivity.this));

        drawingImageView = (ImageView) this.findViewById(R.id.DrawingImageView);
        btnCrearNodo = (Button) this.findViewById(R.id.btnCrearNodo);
        btnCrearArista = (Button) this.findViewById(R.id.btnCrearArista);

        btnCrearNodo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (btnEncendido != true){
                    btnEncendido = true;
                }
            }
        });


    }
}




