package com.cg.anurag.spmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.anurag.spmvc.dao.TraineeDao;
import com.cg.anurag.spmvc.entity.Trainee;



@Service
public class TraineeService {
	
	@Autowired
	TraineeDao tdao;
	public  void setPdao(TraineeDao tdao) { this.tdao=tdao;}
	
	  @Transactional
	  public void insertTrainee(Trainee trainee)
	    {
	    	
	    	tdao.insertTrainee1(trainee);
	    }
	     /*@Transactional
		public static void insertProduct(int id, String name, String location, String domain) {
			 tdao.insertTrainee1(new Trainee(id, name, location,domain));
			
		}*/
	   @Transactional(readOnly=true)
	    public Trainee getTrainee(int traineeId)
	    {
	    	return tdao.getTrainee(traineeId);
	    }
	   
	   @Transactional
	    public void deleteTrainee(int traineeId)
	    {
	    	tdao.deleteTrainee(traineeId);
	    }
	    @Transactional(readOnly=true)
	    public List<Trainee> getTrainees()
	    {
	    	return tdao.getTrainees();
	    }
	    @Transactional
	    public void updateTrainee(Trainee trainee)
	    {
	    	tdao.updateTrainee(trainee);
	    }
	

}
