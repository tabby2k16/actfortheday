package com.in28minutes.learning.jpa.jpain10steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.Entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements
CommandLineRunner{
	
	private static final Logger log = 
			LogManager.getLogger(UserDaoServiceCommandLineRunner.class);

	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User(0,"Jack","Admin");
		long insert = userDaoService.insert(user);
		log.info("New User is created: " + user);
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