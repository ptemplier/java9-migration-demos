module bookapp {
	requires spring.context;
	requires spring.tx;
	
	requires javax.inject;
	
	requires hibernate.core;
	requires hibernate.jpa;
	
	requires java.naming;

	exports books.api.entities;
	exports books.api.service;
	exports private books.impl.entities;
	exports private books.impl.service;

	exports bookstore.api.service;
	exports private bookstore.impl.service;
}