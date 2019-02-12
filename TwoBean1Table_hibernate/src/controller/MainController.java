package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.EmpBean;
import dao.empDao;
@Controller
public class MainController {
	
	@RequestMapping("/")
	    public ModelAndView empInsert()
	    {
	     ModelAndView mv=new ModelAndView("empInsert");
	     return mv;
	    }
	
	    @RequestMapping("/insertEmpDetails")
	    public ModelAndView Insert(@ModelAttribute EmpBean e)
	    {
	    	empDao obj=new empDao();
	    	ModelAndView mv=new ModelAndView("empInsert");
	   	  int x=obj.Insert(e);
	 	   if(x==1) {
	 	   //System.out.println("Data Inserted");
	 	  mv.addObject("msg","Data inserted....");
	 	   }else {
	 		//  ModelAndView mv=new ModelAndView("registration");
	 	 	  mv.addObject("msg","Data not inserted....");
	 	 	 		}
	 	  return mv;
	 	  }

}
