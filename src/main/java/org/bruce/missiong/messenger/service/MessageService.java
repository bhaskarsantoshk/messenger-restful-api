package org.bruce.missiong.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.bruce.missiong.messenger.model.Message;

public class MessageService {
	public List<Message> getAllMessages(){ 
		Message m1 = new Message(1L, "I'm Batman", "Bruce Wayne");
		Message m2 = new Message(2L, "I can do this all day", "Captain America");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
