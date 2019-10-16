package com.springboot.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class UserBlock implements Serializable{
	@Id
    @ManyToOne
    @JoinColumn
    private User userblocking;

    @Id
    @ManyToOne
    @JoinColumn
    private User userblocked;
    
    private int enable;
    
    @Column(name = "createdTime")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")
	private Date createdTime;
    
    public UserBlock(User userblocking, User userblocked) {
		super();
		this.userblocking = userblocking;
		this.userblocked = userblocked;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserBlock)) return false;
        UserBlock that = (UserBlock) o;
        return Objects.equals(userblocking.getId(), that.userblocking.getId()) &&
                Objects.equals(userblocked.getId(), that.userblocked.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(userblocking, userblocked);
    }

	public User getUserblocking() {
		return userblocking;
	}

	public void setUserblocking(User userblocking) {
		this.userblocking = userblocking;
	}

	public User getUserblocked() {
		return userblocked;
	}

	public void setUserblocked(User userblocked) {
		this.userblocked = userblocked;
	}

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
    
}
