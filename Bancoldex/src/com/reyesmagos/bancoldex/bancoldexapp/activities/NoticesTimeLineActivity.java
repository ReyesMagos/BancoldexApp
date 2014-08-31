package com.reyesmagos.bancoldex.bancoldexapp.activities;

import com.reyesmagos.bancoldex.bancoldexapp.R;
import com.reyesmagos.bancoldex.bancoldexapp.R.id;
import com.reyesmagos.bancoldex.bancoldexapp.R.layout;
import com.reyesmagos.bancoldex.bancoldexapp.R.menu;
import com.reyesmagos.bancoldex.bancoldexapp.controlador.FacadeController;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.BusinessManUser;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class NoticesTimeLineActivity extends Activity {
	private FacadeController facadeController;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notices_time_line);
		facadeController = FacadeController.getInstance();
		BusinessManUser businessManUser= facadeController.getBusinessManUser();
		if(businessManUser!=null){
			
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.notices_time_line, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
