package webbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webbank.dao.RegisterDao;
import webbank.model.RegistrationPreload;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterDao registerDao;

	public RegistrationPreload getRegister() {
		RegistrationPreload preload = new RegistrationPreload();

		preload.setRegisterList(registerDao.getRegister());
		return preload;
	}
}
