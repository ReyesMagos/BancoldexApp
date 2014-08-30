package com.reyesmagos.bancoldex.bancoldexapp.persistencia.dao;

import java.util.ArrayList;
import java.util.List;

import com.parse.ParseQuery;
import com.reyesmagos.bancoldex.bancoldexapp.modelo.Notice;
import com.reyesmagos.bancoldex.bancoldexapp.services.asyntask.DAOAsynTask;

public class NoticeDAO extends AbstractDAO implements INoticeDAO {

	@Override
	public void getNoticesFromDepartment(String department) {
		// TODO Auto-generated method stub
		ParseQuery query = new ParseQuery("Notice");
		query.whereEqualTo("departament", department);
		executeAsynTaskDAO(query);
	}

	@Override
	public void getNoticesFromRegion(String region) {
		// TODO Auto-generated method stub
		ParseQuery query = new ParseQuery("Notice");
		query.whereEqualTo("region", region);
		executeAsynTaskDAO(query);

	}

	@Override
	public void getNoticesFromGremio(String gremio) {
		// TODO Auto-generated method stub
		ParseQuery query = new ParseQuery("Notice");
		query.whereEqualTo("gremio", gremio);
		executeAsynTaskDAO(query);
	}

	@Override
	public void executeAsynTaskDAO(ParseQuery parseQuery) {
		// TODO Auto-generated method stub
		super.executeAsynTaskDAO(parseQuery);

	}

	public void createNotice(List lista) {
		List<Notice> noticeList = new ArrayList<Notice>();

	}

}
