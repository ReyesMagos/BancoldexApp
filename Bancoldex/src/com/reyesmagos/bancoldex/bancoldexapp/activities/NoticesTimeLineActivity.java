package com.reyesmagos.bancoldex.bancoldexapp.activities;

import com.reyesmagos.bancoldex.bancoldexapp.R;
import com.reyesmagos.bancoldex.bancoldexapp.R.id;
import com.reyesmagos.bancoldex.bancoldexapp.R.layout;
import com.reyesmagos.bancoldex.bancoldexapp.R.menu;
import com.reyesmagos.bancoldex.bancoldexapp.controlador.FacadeController;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.BusinessManUser;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.IntermediaryAgent;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.os.Build;

public class NoticesTimeLineActivity extends Activity {
	private FacadeController facadeController;
	private ListView listviewNotices;
	private ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notices_time_line);
		facadeController = FacadeController.getInstance();
		facadeController.registerActivityToController(this);
		actionBar = getActionBar();
		init();
		BusinessManUser businessManUser = facadeController.getBusinessManUser();
		if (businessManUser != null) {
			facadeController.getNoticesFromBusinessMan(facadeController
					.getBusinessManUser());
		} else {
			IntermediaryAgent intermediaryAgent = facadeController
					.getIntermediaryAgent();
			facadeController.getNoticesFromEntity(intermediaryAgent);
		}

	}

	public void init() {
		listviewNotices = (ListView) findViewById(R.id.listView_notices);

	}

	public ListView getListviewNotices() {
		return listviewNotices;
	}

	public void setListviewNotices(ListView listviewNotices) {
		this.listviewNotices = listviewNotices;
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
