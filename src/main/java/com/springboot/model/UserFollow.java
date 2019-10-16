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
public class UserFollow implements Serializable{
	
	@Id
    @ManyToOne
    @JoinColumn
    private User userfollowing;

    @Id
    @ManyToOne
    @JoinColumn
    private User userfollowed;
    
    private int enable;
    
    @Column(name = "createdTime")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")
	private Date createdTime;
    
    public UserFollow(User userfollowing, User userfollowed) {
		super();
		this.userfollowing = userfollowing;
		this.userfollowed = userfollowed;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserFollow)) return false;
        UserFollow that = (UserFollow) o;
        return Objects.equals(userfollowing.getId(), that.userfollowing.getId()) &&
                Objects.equals(userfollowed.getId(), that.userfollowed.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(userfollowing, userfollowed);
    }

	public User getUserfollowing() {
		return userfollowing;
	}

	public void setUserfollowing(User userfollowing) {
		this.userfollowing = userfollowing;
	}

	public User getUserfollowed() {
		return userfollowed;
	}

	public void setUserfollowed(User userfollowed) {
		this.userfollowed = userfollowed;
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
