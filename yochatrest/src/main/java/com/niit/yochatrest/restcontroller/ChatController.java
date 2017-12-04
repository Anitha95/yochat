package com.niit.yochatrest.restcontroller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.niit.yochatbackend.dto.Message;
import com.niit.yochatbackend.dto.OutputMessage;

@Controller
public class ChatController {

	private static final Logger log = LoggerFactory.getLogger(ChatController.class);
	
	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message) {
		
		log.debug("Starting of the method SendMessage");
		return new OutputMessage(message, new Date());	
	}
}
