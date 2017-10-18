package com.pokechange.jetty_jersey.dao;

import com.pokechange.jetty_jersey.Object.Meeting;

public interface MeetingDAO {
	
	public boolean insertMeeting(Meeting m);
	
	public boolean getMeetings(String login);

}
