package com.JPA;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FeedbackDAO {
	@Autowired
	FeedbackRepo repo;
	public Feedback insert(String f) 
	{
		Feedback fe=new Feedback();
		fe.setFedbk(f);
		return repo.save(fe);
		
	}
	public List<Feedback> getall(){
		return repo.findAll();
	}
	public Optional<Feedback> getbyid(int id) {
		return repo.findById(id);
	}
	public String delete(int id) {
		 repo.deleteById(id);
		 return "deleted the id "+id;
	}}
