package com.pokechange.jetty_jersey.Interface;

import com.pokechange.jetty_jersey.Object.User;

public interface UserDAO {
	
	public User getUser(String login);
	
	public boolean connection (String login,String pass);
	
	public String getSecretQuestion(String mail);
	
	public String testAnswer(String mail,String answer);
	
	public String getBasket(String login);
	
	public boolean insertCard(String login,String extention,String number);
	
}
