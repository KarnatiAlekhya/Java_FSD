package com.JPA;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FeedbackController {
	@Autowired
	FeedbackDAO dao;
	@PostMapping("/feedback")
	public Feedback insert(HttpServletRequest req, HttpServletResponse res,@RequestParam(value="text", required=false) String f) 
	{
		if(f!=null) 
		{
			String fb = req.getParameter("text");
			return dao.insert(fb);
			
		}
		else {
			return dao.insert(f);
		}
	}
	@GetMapping("/feedback")
	public List<Feedback> getall(){
		return dao.getall();
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable  int id) 
	{
		   return dao.delete(id);
	}
}


