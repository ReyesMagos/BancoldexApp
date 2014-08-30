package com.reyesmagos.bancoldex.bancoldexapp.persistencia.dao;

import java.util.List;

import com.reyesmagos.bancoldex.bancoldexapp.modelo.Notice;

public interface INoticeDAO {

	public void getNoticesFromDepartment(String department);

	public void  getNoticesFromRegion(String region);

	public void getNoticesFromGremio(String Gremio);

}
