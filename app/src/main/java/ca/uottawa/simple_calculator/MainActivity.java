package ca.uottawa.simple_calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private enum Operator {none, add, minus, multiply, divide};
    private double data1 = 0;
    private double data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void btn00Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+ "0");
    }

    public void btn01Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+ "1");
    }

    public void btn02Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+ "2");
    }

    public void btn03Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+ "3");
    }

    public void btn04Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+ "4");
    }

    public void btn05Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+ "5");
    }

    public void btn06Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+ "6");
    }

    public void btn07Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+ "7");
    }

    public void btn08Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+ "8");
    }

    public void btn09Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+ "9");
    }

    public void btnAddClick(View view){

        optr = Operator.add;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMinusClick(View view){

        optr = Operator.minus;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMultiplyClick(View view){

        optr = Operator.multiply;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnDivideClick(View view){

        optr = Operator.divide;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnClearClick(View view){

        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText("");
    }

    public void btnDotClick(View view){

        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");
    }

    public void btnResultClick(View view){

        if(optr != Operator.none){

            EditText eText = (EditText)findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;

            if (optr == Operator.add){

                result = data1 + data2;

            } else if(optr == Operator.minus){

                result = data1+data2;

            } else if(optr == Operator.multiply){

                result = data1*data2;

            } else if(optr == Operator.divide){

                result = data1/data2;

            }

            optr = Operator.none;
            data1 = result;
            if((result -(int)result)!=0){

                eText.setText(String.valueOf(result));

            } else {

                eText.setText(String.valueOf((int)result));
            }
        }
    }
}
