package titaniumstudios.algoritmicagraphs;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Valeria on 28/03/2017.
 */

public class Nodos extends View {

    public Nodos nodos;



    //Para Posicionamiento y dibujo
    float x = 0;
    float y = 0;
    boolean primerToque = false;
    Paint paint;

    //Datos para el Algoritmo
    int id = 0;
    int sumasder = 0;
    int restaizq = 0;

    public Nodos(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(primerToque != true) {
            return;
        }else{
            canvas.drawCircle(x, y, 80, paint);

        }
    }



    public boolean onTouchEvent(MotionEvent event) {
        primerToque = true;
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            x = event.getX();
            y = event.getY();
            invalidate();
        }
        return false;
    }


}

