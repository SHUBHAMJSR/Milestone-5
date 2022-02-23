package com.training.model.persistance;

import java.util.List;

import com.training.model.exceptions.DataAccessException;

public interface TraineeDao {
	public List<TraineeMgmt> getAll()throws DataAccessException;
	public TraineeMgmt addTrainee(TraineeMgmt trainee);
}
