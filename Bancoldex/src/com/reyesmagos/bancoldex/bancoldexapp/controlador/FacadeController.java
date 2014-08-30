package com.reyesmagos.bancoldex.bancoldexapp.controlador;

import com.reyesmagos.bancoldex.bancoldexapp.activities.LoginActivityMain;

import android.app.Activity;

public class FacadeController {

	private static FacadeController instance;
	private LoginController loginController;

	private FacadeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void registerActivityToController(Activity activity) {
		if (activity instanceof LoginActivityMain)
			this.loginController = new LoginController(activity);
	}

	public void login(String username, String password) {
		this.loginController.login(username, password);

	}

	public static FacadeController getInstance() {
		if (instance == null)
			instance = new FacadeController();
		return instance;
	}

	public static void setInstance(FacadeController instance) {
		FacadeController.instance = instance;
	}

	public LoginController getLoginController() {
		return loginController;
	}

	public void setLoginController(LoginController loginController) {
		this.loginController = loginController;
	}

}
