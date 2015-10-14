package hpes.calci;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class myfunc  extends Activity implements OnClickListener{
	TextView tvv;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myfunc);
		tvv=(TextView)findViewById(R.id.tvv1);
		Bundle b=getIntent().getExtras();
		 if (b.getString("strname")!= null)
		 {
			tvv.setText(b.getString("strname")); 
		 }
		 b1=(Button)findViewById(R.id.myb1);
		 b2=(Button)findViewById(R.id.myb2);
		 b3=(Button)findViewById(R.id.myb3);
		 b4=(Button)findViewById(R.id.myb4);
		 b5=(Button)findViewById(R.id.myb5);
		 b6=(Button)findViewById(R.id.myb6);
		 b7=(Button)findViewById(R.id.myb7);
		 b8=(Button)findViewById(R.id.myb8);
		 b9=(Button)findViewById(R.id.myb9);
		 b1.setOnClickListener(this);
		 b2.setOnClickListener(this);
		 b3.setOnClickListener(this);
		 b4.setOnClickListener(this);
		 b5.setOnClickListener(this);
		 b6.setOnClickListener(this);
		 b7.setOnClickListener(this);
		 b8.setOnClickListener(this);
		 b9.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String my=tvv.getText().toString();
		float f=Float.parseFloat(my);
		switch(v.getId())
		{case R.id.myb1:
		  {double re=Math.sin(f);
		  tvv.setText(""+re);
		  break;}
		case R.id.myb2:
		   {double re =Math.cos(f);
		    tvv.setText(""+re);
		    break;
		   }
		case R.id.myb3:
		   {double re =Math.tan(f);
		    tvv.setText(""+re);
		    break;
		   }
		case R.id.myb4:
		   {double re =f*f;
		    tvv.setText(""+re);
		    break;
		   }
		case R.id.myb5:
		   {double re =f*f*f;
		    tvv.setText(""+re);
		    break;
		   }
		case R.id.myb6:
		   {double re =Math.sqrt(f);
		    tvv.setText(""+re);
		    break;
		   }
		case R.id.myb7:
		   {String re=Float.toHexString(f);
		    tvv.setText(re);
		    break;
		   }
		case R.id.myb8:
		   {float re=(float)Math.log10(f);
		    tvv.setText(""+re);
		    break;
		   }
		case R.id.myb9:
		   {double re=Math.exp(f);
		    tvv.setText(""+re);
		    break;
		   }
		
		   
		   
		   
		   
		   
			
		
		}
	}

}
