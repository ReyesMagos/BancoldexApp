package com.reyesmagos.bancoldex.bancoldexapp.controlador;

import android.app.Activity;

public class LoginController extends AbstractController {
	
	private final String tagFieldOK="OK";
	private final String tagFielWrong="WRONG";
	public LoginController(Activity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showAlertMessage(String title, String message) {
		// TODO Auto-generated method stub
		super.showAlertMessage(title, message);
	}
	
	public String verifyUsername(String username){
		if(username!=null&&!username.equals("")&&username.length()>5){
			return tagFieldOK;
		}
		
		return tagFielWrong;
		
		
	}
	
	public String verifyPassword(String password){
		if(password!=null && !password.equals("") && password.length()>6){
			return tagFieldOK;
		}
		return tagFielWrong;
	}

	public String getTagFieldOK() {
		return tagFieldOK;
	}

	public String getTagFielWrong() {
		return tagFielWrong;
	}
	
	
	
	
	
	

}
