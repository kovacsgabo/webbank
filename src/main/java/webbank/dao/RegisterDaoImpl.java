package webbank.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import webbank.model.Register;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	private List<Register> dummyList = new ArrayList<Register>();

	public RegisterDaoImpl() {
		dummyList.add(new Register("01", "test"));

	}

	public List<Register> getRegister() {
		List<Register> registerList = new ArrayList<Register>();

		registerList = dummyList;

		return registerList;
	}

}
