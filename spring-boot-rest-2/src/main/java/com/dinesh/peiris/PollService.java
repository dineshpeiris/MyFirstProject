package com.dinesh.peiris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollService {
	
	@Autowired
	PollRepository pollRepository;

	public Iterable<Poll> getAllPolls() {
		Iterable<Poll> allPolls = pollRepository.findAll();
		return allPolls;
	}
}
