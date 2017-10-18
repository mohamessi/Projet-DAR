package com.pokechange.jetty_jersey.dao;

import java.util.List;

import com.pokechange.jetty_jersey.Object.Card;

public interface CardDAO {
	
	public List<Card> getLastCards();
	
	public List<Card> getCardsByExtentionNameCity(String extention, String name, String city);
}