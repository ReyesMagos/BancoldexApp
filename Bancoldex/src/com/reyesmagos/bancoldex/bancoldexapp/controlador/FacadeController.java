package com.reyesmagos.bancoldex.bancoldexapp.controlador;

import com.reyesmagos.bancoldex.bancoldexapp.activities.LoginActivityMain;
import com.reyesmagos.bancoldex.bancoldexapp.activities.NoticesTimeLineActivity;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.BusinessManUser;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.IntermediaryAgent;

import android.app.Activity;

public class FacadeController {

	private static FacadeController instance;
	private LoginController loginController;
	private BusinessManUser businessManUser;
	private IntermediaryAgent intermediaryAgent;
	private NoticeTimeLineController noticeTimeLineController;

	private FacadeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessManUser getBusinessManUser() {
		return businessManUser;
	}

	public void setBusinessManUser(BusinessManUser businessManUser) {
		this.businessManUser = businessManUser;
	}

	public IntermediaryAgent getIntermediaryAgent() {
		return intermediaryAgent;
	}

	public void setIntermediaryAgent(IntermediaryAgent intermediaryAgent) {
		this.intermediaryAgent = intermediaryAgent;
	}

	public void registerActivityToController(Activity activity) {
		if (activity instanceof LoginActivityMain)
			this.loginController = new LoginController(activity);
		if (activity instanceof NoticesTimeLineActivity)
			this.noticeTimeLineController = new NoticeTimeLineController(
					activity);

	}

	public void login(String username, String password) {
		this.loginController.showProgressDialog("alert", "Espere Por Favor");
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
