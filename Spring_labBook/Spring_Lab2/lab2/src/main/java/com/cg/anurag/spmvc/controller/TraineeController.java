package com.cg.anurag.spmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cg.anurag.spmvc.entity.Trainee;
import com.cg.anurag.spmvc.service.TraineeService;

@Controller
public class TraineeController {
	
	@Autowired
	TraineeService traineeService;
	public TraineeController(){this.traineeService=traineeService;}
	@GetMapping("/getAddProductForm")
    public String getAddProductForm(Model model)
    {
		 model.addAttribute("trainee",new Trainee());
   	     return "addtrainee";      
    }
   @GetMapping("/addtrainee")
    @ResponseBody
    public void  addTrainee(@ModelAttribute() Trainee trainee)
    {
   	 traineeService.insertTrainee(trainee);
  
    }
    @GetMapping("/deletrainee")
    public String deleteTrainee()
    {
    	return "deletetrainee";
    }
    @GetMapping("/deltrainee")
    public String deleteTraine(@RequestParam("traineeId")int traineeId,Model model)
    {
   	 model.addAttribute("trainee",traineeService.getTrainee(traineeId));
   	 return "deletetrainee";
    }
    @GetMapping("/delete")
    @ResponseBody
    public void deleteProductNow(@RequestParam("traineeId")int traineeId)
    {
   	 traineeService.deleteTrainee(traineeId);
    }
    @GetMapping("/showall")
    public String getAllTrainees(Model model)
    {
   	 model.addAttribute("tList",traineeService.getTrainees());
   	 return "showTrainee";
    }
    @GetMapping("/search")
    public String SearchTrainee()
    {
    	return "searchtrainee";
    }
    @GetMapping("/searchtrainee")
    public String searchTrainee(@RequestParam("traineeId")int traineeId,Model model)
    {
   	 model.addAttribute("trainee",traineeService.getTrainee(traineeId));
   	 return "searchtrainee";
    }
    @GetMapping("/modifyTrainee")
    @ResponseBody
	 public void updateTrainee(@ModelAttribute("trainee") Trainee trainee)
	 {
		 traineeService.updateTrainee(trainee);
	 }
    @GetMapping("/md")
    public String modfity()
    {
    	return "updatetrainee";
    }
    @GetMapping("/modtrainee")
    public String modTrainee(@RequestParam("traineeId")int traineeId,Model model)
    {
   	 model.addAttribute("trainee",traineeService.getTrainee(traineeId));
   	 return "updatetrainee";
    }
    /*   @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("emp") Emp emp){  
        dao.update(trainee);  
        return "redirect:/viewemp";  
    } */
	/*@GetMapping("/add")
	public String addtraineer()
	{
		return "addtrainee";
	}*/
}
