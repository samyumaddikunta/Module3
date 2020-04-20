package com.cg.anurag.spmvc.dao;



import java.util.List;


import com.cg.anurag.spmvc.entity.Trainee;

public interface TraineeDao {
    
    public void insertTrainee1(Trainee trainee);
    public Trainee getTrainee(int traineeId);
    public void deleteTrainee(int traineeId);
    public List<Trainee> getTrainees();
    public void updateTrainee(Trainee trainee);
 
}
