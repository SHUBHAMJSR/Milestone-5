package com.training.model.service;

import java.util.List;

import com.training.model.exceptions.DataAccessException;
import com.training.model.persistance.TraineeDao;
import com.training.model.persistance.TraineeDaoImpl;
import com.training.model.persistance.TraineeMgmt;

public class TraineeServiceImpl implements TraineeService{

	private TraineeDao traineeDao=null;
	public TraineeServiceImpl() {
		traineeDao=new TraineeDaoImpl();
	}

	@Override
	public List<TraineeMgmt> getAll() throws DataAccessException {
		return traineeDao.getAll();
	}

	@Override
	public TraineeMgmt addTrainee(TraineeMgmt trainee) {
		return traineeDao.addTrainee(trainee);
	}

}
