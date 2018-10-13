package webbank.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import webbank.model.Register;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	private List<Register> dummyList = new ArrayList<Register>();

	public RegisterDaoImpl() {
		dummyList.add(new Register("01", "Architecture"));
		dummyList.add(new Register("01001", "Architectural Engineering"));
		dummyList.add(new Register("01002", "Architectural History and Criticism"));
		dummyList.add(new Register("02", "Arts and Humanities"));
		dummyList.add(new Register("02001", "African Languages and Societies"));
		dummyList.add(new Register("02002", "American Studies"));
		dummyList.add(new Register("02002001", "American Film Studies"));
		dummyList.add(new Register("02002002", "American Literature"));
		dummyList.add(new Register("02002003", "American Material Culture"));
		dummyList.add(new Register("02003", "Appalachian Studies"));
		dummyList.add(new Register("03", "Business"));
		dummyList.add(new Register("03001", "Accounting"));
	}

	public List<Register> getRegister() {
		List<Register> registerList = new ArrayList<Register>();

		registerList = dummyList;

		return registerList;
	}

}
