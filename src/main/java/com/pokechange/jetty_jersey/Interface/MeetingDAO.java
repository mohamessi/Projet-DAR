package com.pokechange.jetty_jersey.Interface;

import com.pokechange.jetty_jersey.Object.Meeting;

public interface MeetingDAO {
	
	public boolean insertMeeting(Meeting m);
	
	public boolean getMeetings(String login);

}
