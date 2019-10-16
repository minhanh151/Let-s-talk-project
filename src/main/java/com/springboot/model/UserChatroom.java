package com.springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class UserChatroom implements Serializable{

	@Id
    @ManyToOne
    @JoinColumn
    private User user;

    @Id
    @ManyToOne
    @JoinColumn
    private Chatroom chatroom;
    
    private int rate;
    
    
    public UserChatroom(User user, Chatroom chatroom) {
		super();
		this.user = user;
		this.chatroom = chatroom;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserChatroom)) return false;
        UserChatroom that = (UserChatroom) o;
        return Objects.equals(user.getId(), that.user.getId()) &&
                Objects.equals(chatroom.getId(), that.chatroom.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, chatroom);
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Chatroom getChatroom() {
		return chatroom;
	}

	public void setChatroom(Chatroom chatroom) {
		this.chatroom = chatroom;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
    
    
}
