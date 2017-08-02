package com.example.admin.layoutsandveiws;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;

import static com.example.admin.layoutsandveiws.R.styleable.View;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Error";
    EditText etNum1, etNum2;
    Button btnName;
    TextView twName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNumber1);
        etNum2 = (EditText) findViewById(R.id.etNumber2);


        /*etName = (EditText) findViewById(R.id.etName);
        etName.setText("Hello World");*/

        btnName = (Button) findViewById(R.id.btnDoMage);
        twName = (TextView) findViewById(R.id.tvName);

        btnName.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //String etValue = etName.getText().toString();
                //twName.setText(etValue);
                int sum = Integer.parseInt(etNum1.getText().toString());
                sum += Integer.parseInt(etNum2.getText().toString());
                twName.setText(String.valueOf(sum));
                Log.d(TAG, "onClick: "+ sum);
            }
        });
    Log.d(TAG, "onCreate:" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    public void goToActivity(View view){

        String value = etNum1.getText().toString();

        Intent intent = new Intent(this, SecActivity.class);
        intent.putExtra(getString(R.string.KEY_VALUE1), value);

        startActivity(intent);
    }

    public void passPersonToSecond(Veiw veiw){
        String personName = etPersonName.getText().toString();
        String personGender = etPersonGender.getText().toString();

        Person person = new Person(personName, personGender);
        Intent intent = new Intent(this, SecActivity.class);
        intent.putExtra("person", person);

        startActivity(intent);
    }

}
