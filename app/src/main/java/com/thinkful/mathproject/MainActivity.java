package com.thinkful.mathproject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int x = 5;
        int y = 6;
        int sumValue,subtractValue, multiplyValue;
        double divideValue;


        sumValue = myAdd(x, y);
        Log.i("MyData", "sumValue = " + sumValue);

        subtractValue = mySubtract(x, y);
        Log.i("MyData", "subtractValue = " + subtractValue);

        multiplyValue = myMultiply(x, y);
        Log.i("MyData", "multiplyValue = " + multiplyValue);

        divideValue = myDivide(x, y);
        Log.i("MyData", "divideValue = " + divideValue);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public int myAdd(int number1, int number2) {

        int sum;
        sum = number1 + number2;

        return sum;
    }

    public int mySubtract(int number1, int number2) {

        int subtract;
        subtract = number1 - number2;

        return subtract;
    }

    public int myMultiply(int number1, int number2) {

        int multiply;
        multiply = number1 * number2;

        return multiply;
    }

    public double myDivide(int number1, int number2) {

        double divide;
        divide = (double) number1 / number2;

        return divide;
    }
}
