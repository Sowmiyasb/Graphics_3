package com.example.graphics_3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MainActivity extends Activity {
	DemoView demoview;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		demoview = new DemoView(this);
		setContentView(demoview);
	}

	private class DemoView extends View {
		public DemoView(Context context) {
			super(context);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			// custom drawing code here
			Paint paint = new Paint();
			paint.setStyle(Paint.Style.FILL);
			// make the entire canvas white
			paint.setColor(Color.WHITE);
			canvas.drawPaint(paint);
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
