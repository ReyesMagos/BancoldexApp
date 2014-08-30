package com.reyesmagos.bancoldex.bancoldexapp.modelo;

import java.util.ArrayList;
import java.util.List;

import com.parse.ParseUser;

public class FactoryUsers {

	public static FactoryUsers instance;

	private FactoryUsers() {

	}

	public static FactoryUsers getInstance() {
		if (instance == null)
			instance = new FactoryUsers();
		return instance;
	}

	public void createUserFromParseUser(ParseUser parseUser) {
		int type = parseUser.getInt("type");
		if (type == 1) {
			NationalBusinessManUser nationalBusinessManUser = new NationalBusinessManUser();
			nationalBusinessManUser.setUsername(parseUser.getUsername());
			nationalBusinessManUser.setEnterpriseType(parseUser
					.getString("enterpriseType"));
			nationalBusinessManUser.setPartners(getListFromToken(
					parseUser.getString("partners"), ","));
			nationalBusinessManUser.setNit(parseUser.getString("nit"));
			nationalBusinessManUser.setSector(parseUser.getString("sector"));
			nationalBusinessManUser.setSubSectro(parseUser.getString("subSector"));
			Location location = new Location();
			location.setAdress(parseUser.getString("adress"));
			location.setDepartament(parseUser.getString("departament"));
			location.setMunicipio(parseUser.getString("municipio"));
			location.setLat(Double.parseDouble(parseUser.getString("lat")));
			location.setLng(Double.parseDouble(parseUser.getString("lng")));	
			
		}
	}

	public List<String> getListFromToken(String s, String token) {
		List<String> partnersList = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.toString(s.charAt(i)).equals(token)) {
				String x = s.substring(0, i);
				s.replaceFirst(x + ",", "");
				partnersList.add(x);
			}
		}

		return partnersList;
	}

}