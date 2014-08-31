package com.reyesmagos.bancoldex.bancoldexapp.activities.register;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;
import com.reyesmagos.bancoldex.bancoldexapp.R;
import com.reyesmagos.bancoldex.bancoldexapp.R.string;
import com.reyesmagos.bancoldex.bancoldexapp.util.mocks.SectorMock;
import com.reyesmagos.bancoldex.bancoldexapp.util.mocks.UserMocks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class RegisterActivity extends Activity {

	private Spinner spinnerRol;
	private EditText passwordEdittext;
	private EditText nitEdittext;
	private EditText userNameEditText;
	public static TextView selectedNeed;
	private ImageView acceptImageView;
	public static ImageView imageViewNecessity;

	private UserMocks userMocks;
	private String userName;
	public static String sector;
	public static String subSector;
	private String password;
	private SectorMock sectorMock;

=======
import android.util.Log;

public class RegisterActivity extends Activity {

>>>>>>> origin/master
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_activity);
<<<<<<< HEAD
		createComponents();
	}

	private void createComponents() {

		ArrayAdapter<CharSequence> rolAdapter = ArrayAdapter
				.createFromResource(this, R.array.rol_array,
						android.R.layout.simple_spinner_item);
		rolAdapter
				.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		this.spinnerRol = (Spinner) super.findViewById(R.id.spinner_rol);
		this.spinnerRol.setAdapter(rolAdapter);

		this.passwordEdittext = (EditText) super
				.findViewById(R.id.edittext_password);
		this.nitEdittext = (EditText) super
				.findViewById(R.id.editText_nit_number);
		this.userNameEditText = (EditText) super
				.findViewById(R.id.edittext_username);
		this.acceptImageView = (ImageView) super
				.findViewById(R.id.imageView_accept);
		RegisterActivity.selectedNeed = (TextView) super
				.findViewById(R.id.textView2);
		RegisterActivity.imageViewNecessity = (ImageView) super
				.findViewById(R.id.imageView_neccesity);
	}

	public void onSectorClick(View view) {
		Intent sectorIntent = new Intent(this, SectorSelectorActivity.class);
		startActivity(sectorIntent);
	}

	public void onNeedClick(View view) {
		startActivity(new Intent(this, NeedSelectorActivity.class));
	}
	
//	public void onRegisterClick(View view){
//		
//	}
=======
		
	}

>>>>>>> origin/master

}
