package com.in28minutes.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.Entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDAOService;
import com.in28minutes.learning.jpa.jpain10steps.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements
CommandLineRunner{
	
	private static final Logger log = 
			LogManager.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User(0,"Jack","Admin");
		//New User is created : User [id=1, name=Jack, role=Admin]
		userRepository.save(user);
		Optional<User> userWithIdOne = userRepository.findById(1L);		
		log.info("User is retrieved : " + userWithIdOne);
		
		List<User> users = userRepository.findAll();
		log.info("All Users : " + users);
		
		
		
	}

}

/*

	public class SomeEntityDAOService{
	
	@PersistenceCOntext
	private EntityManager entityManager;
	
	
	public long insert(SomeEntity entity)
		{
		entityManager.persist(entity);
		return entity.getId();
		}
	}

*/