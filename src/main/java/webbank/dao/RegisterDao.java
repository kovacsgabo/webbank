package webbank.dao;

import java.util.List;

import webbank.model.Register;

public interface RegisterDao{
/**
 * it will return all register from the database
 * @return {@code register}
 */
	public List<Register> getRegister();
}
