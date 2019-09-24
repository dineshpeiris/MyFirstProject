package com.dinesh.peiris;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {

	@Autowired
	private PollRepository pollRepository;
	
	@Autowired
	private PollService pollService;
	
	
//	@RequestMapping(value="/polls", method=RequestMethod.GET)
//	@GetMapping("/polls")
//	public ResponseEntity<Iterable<Poll>> getAllPolls() {
//	Iterable<Poll> allPolls = pollRepository.findAll();
//	return new ResponseEntity<>(pollRepository.findAll(), HttpStatus.OK);
//	}
	
	@GetMapping("/polls")
	@ResponseBody
	public Iterable<Poll> getAllPolls() {
		return pollService.getAllPolls();
	}
	
}
