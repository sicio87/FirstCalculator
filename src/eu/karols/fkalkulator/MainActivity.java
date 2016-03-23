package eu.karols.fkalkulator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view){
    	EditText numA  = (EditText)findViewById(R.id.editText1);
    	EditText numB  = (EditText)findViewById(R.id.editText2);
    	EditText wynik = (EditText)findViewById(R.id.editText3);
    	float num1 = Float.parseFloat(numA.getText().toString());
    	float num2 = Float.parseFloat(numB.getText().toString());
    	float eq = 0;

    	switch(view.getId()){
    		case R.id.button1:
    			eq = num1 + num2;
    			break;
    		case R.id.button2:
    			eq = num1 - num2;
    			break;
    		case R.id.button3:
    			eq = num1 * num2;
    			break;
    		case R.id.button4:
    			eq = num1 / num2;
    			break;
    	}

    	wynik.setText(String.format("%f", eq));
    }
}