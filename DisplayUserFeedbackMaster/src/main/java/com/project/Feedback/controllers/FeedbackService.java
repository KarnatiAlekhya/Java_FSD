package com.project.Feedback.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
	@Autowired
    FeedbackRepository feedbackRepository;//reference object of interface
	public Iterable<Feedback> GetAllFeedback() {
		return feedbackRepository.findAll();
}
	public Feedback addNewFeedback(Feedback fb) {
	return feedbackRepository.save(fb);
	}}
