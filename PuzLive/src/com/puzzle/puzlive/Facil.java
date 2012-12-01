package com.puzzle.puzlive;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;


public class Facil extends Activity {
	
	ImagenCamara ic;
	FrameLayout frame;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
	}

	public void cargar() {
	

			frame = new FrameLayout(this);
			frame.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
					LayoutParams.FILL_PARENT));
			if(Main.MovDet()==1){
			ic = new ImagenCamara(this,5,4);
			frame.addView(ic);
			}
			setContentView(frame);

	}
		
	@Override
	protected void onResume() {
		super.onResume();
		cargar();
	}
}