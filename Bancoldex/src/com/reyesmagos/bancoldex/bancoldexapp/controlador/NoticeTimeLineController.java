package com.reyesmagos.bancoldex.bancoldexapp.controlador;

import java.util.List;

import com.reyesmagos.bancoldex.bancoldexapp.activities.NoticesTimeLineActivity;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.BusinessManUser;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.CustomAdapter;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.InternationalBussinessManUser;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.NationalBusinessManUser;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.Notice;
import com.reyesmagos.bancoldex.bancoldexapp.persistencia.dao.NoticeDAO;

import android.app.Activity;

public class NoticeTimeLineController extends AbstractController {

	public NoticeTimeLineController(Activity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
	}

	public void getNoticesFromBusinessMan(BusinessManUser businessManUser) {
		if (businessManUser instanceof NationalBusinessManUser) {
			NoticeDAO noticeDAO = new NoticeDAO();
			noticeDAO.getNoticesFromDepartment(businessManUser.getLocation()
					.getDepartament());
		}
		if (businessManUser instanceof InternationalBussinessManUser) {
			NoticeDAO noticeDAO = new NoticeDAO();
			noticeDAO
					.getNoticesFromCountrie(((InternationalBussinessManUser) businessManUser)
							.getOperatingCountries());
		}

	}

	public void getNoticesFromGremio(BusinessManUser businessManUser) {
		NoticeDAO noticeDAO = new NoticeDAO();
		noticeDAO.getNoticesFromGremio(businessManUser.getGremio());
	}

	public void showNotices(List<Notice> noticeList) {
		NoticesTimeLineActivity noticesTimeLineActivity = (NoticesTimeLineActivity) getActivity();
		CustomAdapter customAdapter = new CustomAdapter(getActivity(),
				noticeList);
		noticesTimeLineActivity.getListviewNotices().setAdapter(customAdapter);
	}

}
