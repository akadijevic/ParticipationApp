package css.cis3334.participationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaring variable here
    EditText etBill;
    EditText etNumParty;
    TextView tvTotalTip;
    TextView tvTipPerPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing variables
        etBill = (EditText) findViewById(R.id.editTextBill);
        etNumParty = (EditText) findViewById(R.id.editTextNumParty);
        tvTotalTip = (TextView) findViewById(R.id.textViewTotalTip);
        tvTipPerPerson= (TextView) findViewById(R.id.textViewTipPerPerson);

    }
public void onClickCalcButton(View view) {

    Double bill = Double.parseDouble( etBill.getText());
    Double NumbPeople= Double.parseDouble( etNumParty.getText());
    Double totTip= bill * 0.1;
    Double tipPerPerson= totTip/ NumbPeople;
    tvTotalTip.setText("Total bill:" + totTip.toString());
    tvTipPerPerson.setText("Tip per person:" + tipPerPerson.toString());

}

}

