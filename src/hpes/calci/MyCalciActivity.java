package hpes.calci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MyCalciActivity extends Activity  {
    /** Called when the activity is first created. */
	TextView tv;
	int flag=0;
	String res=new String();
	String j=new String();
    String p=new String();
    Button b1,b2,b3,b4,b5,b6,b7,b8;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
         tv=(TextView)findViewById(R.id.textView1);
         b1=(Button)findViewById(R.id.b11);
         b2=(Button)findViewById(R.id.b22);
         b3=(Button)findViewById(R.id.b33);
         b4=(Button)findViewById(R.id.b44);
         b5=(Button)findViewById(R.id.b01);
         b6=(Button)findViewById(R.id.bb1);
         b7=(Button)findViewById(R.id.bb2);
         b8=(Button)findViewById(R.id.bb4);
        b1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				flag=1;
				p=res;
				res=res+"+";
				tv.setText(res);
				
			}
        	
        });
        b2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				flag=2;
				p=res;
				res=res+"-";
				tv.setText(res);
				
			}
        	
        });
        b3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				flag=3;
				p=res;
				res=res+"*";
				tv.setText(res);
				
			}
        	
        });
        b4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				flag=4;
				p=res;
				res=res+"/";
				tv.setText(res);
				
			}
        	
        });
        b5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				float i=Float.parseFloat(p);
				float k=Float.parseFloat(j);
				
				switch(flag)
				{
				case 1:
					{Float l=i+k;
					res=l.toString();
				tv.setText(res);
				flag=0;
				j="";
				  break;}
				case 2:
				{
					Float l=i-k;
					res=l.toString();
					tv.setText(res);
                    flag=0;
                    j="";
					break;
				}
				case 3:
				{
					Float l=i*k;
					res=l.toString();
					tv.setText(res);
					flag=0;
					j="";
					break;
				}
				case 4:
				{  try{
					Float l=i/k;
					res=l.toString();
					tv.setText(res);
					flag=0;
					j="";
					break;}catch(Exception e)
					{
						
					}
				}
					
					
					
				}
				
			}
        	
        });
        b8.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String lf=tv.getText().toString();
				int var=lf.length()-1;
				lf=lf.subSequence(0, var).toString();
				tv.setText(lf);
				if(flag==0)
				{
					res=lf;
				}
				else
				{    int vari=j.length()-1;
					j=j.substring(0, vari).toString();
				}
				
				
				
				
			}
        	
        });
        b7.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(MyCalciActivity.this,myfunc.class);
				String m=tv.getText().toString();
				in.putExtra("strname",m);
				startActivity(in);
				
				
				
			}
        	
        });
        b6.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv.setText(" ");
				res="";
				j="";
				p="";
				flag=0;
				
			}
        	
        });
        
    }
    public void show(View v)
    {   Button b=(Button)v;
    	if(flag==0)
    {
    	if(res.equals(null))
    	{
    		res=b.getText().toString();
    		tv.setText(res);
    	}
    	else
    	{
    		res=res+b.getText().toString();
    		tv.setText(res);
    	}
    }
    	else
    	{
    		if(j.equals(null))
    		{
    			j=b.getText().toString();
        		tv.setText(res+j);
    		}
    		else
    		{
    			j=j+b.getText().toString();
        		tv.setText(res+j);
    		}
    	}
    
    	
    }
    
   
    
}