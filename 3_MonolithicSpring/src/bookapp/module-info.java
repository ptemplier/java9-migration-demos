module bookapp {
	requires spring.context;
	requires spring.tx;
	
	requires javax.inject;
	
	requires hibernate.core;
	requires hibernate.jpa;
	
	requires java.naming;

	exports books.api.service;
	exports books.api.entities;

	exports dynamic books.impl.entities;
	exports dynamic books.impl.service;
	exports dynamic bookstore.impl.service;
}