package net.androidbootcamp.bootcampconcerttickets;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	double costPerTicket = 79.99;
	int numberOfTickets;
	double totalCost;
	String groupChoice;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText tickets = (EditText)findViewById(R.id.txtTickets);
		final Spinner group = (Spinner)findViewById(R.id.txtGroup);
		Button cost = (Button)findViewById(R.id.btnCost);
		cost.setOnClickListener(new OnClickListener() {
			final TextView result = ((TextView)findViewById(R.id.txtResult));
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				numberOfTickets = Integer.parseInt(tickets.getText().toString());
				totalCost = numberOfTickets * costPerTicket;
				DecimalFormat currency = new DecimalFormat("$###,###.##");
				
				groupChoice = group.getSelectedItem().toString();
					if (numberOfTickets > 0)
					result.setText("Total cost for" + groupChoice + " is " + currency.format(totalCost));
					else
					result.setText("Please enter how many tickets you require.");
				
				
			}
		});
	
	}
}
