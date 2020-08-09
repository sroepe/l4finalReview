package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.mapper.MessageMapper;
import com.udacity.jwdnd.c1.review.model.ChatForm;
import com.udacity.jwdnd.c1.review.model.Message;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MessageService {

    private MessageMapper messageMapper;

    public MessageService (MessageMapper messageMapper){
        this.messageMapper = messageMapper;
    }

    private String[] bannedWords = {"shit", "piss", "fuck", "bitch"};

    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating MessageService bean");
    }

    public void addMessage(ChatForm chatForm){
        Message newMessage = new Message();
        newMessage.setUsername(chatForm.getUsername());
        String lowercaseMessage = chatForm.getMessageText().toLowerCase();
        for (String bannedWord : bannedWords){
            if(lowercaseMessage.contains(bannedWord)){
                // add an error so that user knows their message was banned based on word list
                break;
            }
            else {

                switch(chatForm.getMessageType()){
                    case "Say":
                        newMessage.setMessageText(chatForm.getMessageText());
                        break;
                    case "Shout":
                        newMessage.setMessageText(chatForm.getMessageText().toUpperCase());
                        break;
                    case "Whisper":
                        newMessage.setMessageText(lowercaseMessage);
                        break;
                }
                messageMapper.addMessage(newMessage);
            }
        }
    }

    public List<Message> getChatHistory(){
        return messageMapper.showAllMessages();
    }
}
