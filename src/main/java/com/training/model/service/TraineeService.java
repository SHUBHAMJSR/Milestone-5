package com.training.model.service;

import java.util.List;

import com.training.model.exceptions.DataAccessException;
import com.training.model.persistance.TraineeMgmt;

public interface TraineeService {
	public List<TraineeMgmt> getAll()throws DataAccessException;
	public TraineeMgmt addTrainee(TraineeMgmt trainee);
}
