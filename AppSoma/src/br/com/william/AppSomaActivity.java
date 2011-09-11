package br.com.william;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AppSomaActivity extends Activity {
	/** Called when the activity is first created. */
	EditText num1, num2, resultado;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		num1 = (EditText) findViewById(R.id.txtNum1);
		num2 = (EditText) findViewById(R.id.txtNum2);
		resultado = (EditText) findViewById(R.id.txtResultado);
		Button btMostrar = (Button) findViewById(R.id.button1);
		btMostrar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				double numero1 = Double.parseDouble(num1.getText().toString());
				double numero2 = Double.parseDouble(num2.getText().toString());
				double res = numero1 + numero2;

				resultado.setText(String.valueOf(res));
			}
		});
	}

}