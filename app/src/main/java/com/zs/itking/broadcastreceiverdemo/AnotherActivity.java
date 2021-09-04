package com.zs.itking.broadcastreceiverdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AnotherActivity extends Activity {

	public static final String action = "jason.broadcast.action";

	Button update;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.another);
		update = (Button) findViewById(R.id.updateMain);
		update.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(action);
				intent.putExtra("data", "yes i 111am data");
				sendBroadcast(intent);
				finish();
			}
		});
	}
}
