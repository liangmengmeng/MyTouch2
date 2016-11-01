package touch.bwie.com.mytouch;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by admina on 2016/11/1.
 */
public class MyImageVivew extends View{

    private Bitmap bitmap;
    private float cx=100;
    private float cy=10;
    private Paint paint=new Paint();

    public MyImageVivew(Context context) {
        super(context);
    }

    public MyImageVivew(Context context, AttributeSet attrs) {
        super(context, attrs);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
    }

    public MyImageVivew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap,cx,cy,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                cx=event.getX();
                cy=event.getY();
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                cx=event.getX();
                cy=event.getY();
                invalidate();
                break;
        }
        return true;
    }
}
