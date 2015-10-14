package hpes.calci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class calcisplashscreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calcisplashscreen);
		Thread t=new Thread(){
			public void run()
			{
				try {
					sleep(3000);
					Intent i=new Intent(calcisplashscreen.this,MyCalciActivity.class);
					startActivity(i);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					
				}
			}
		};
		t.start();
		 
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	

}
