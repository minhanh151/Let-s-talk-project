package com.springboot.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "tokenId")
	private String tokenId;
	
	@Column(name = "firstname", length = 25)
	private String firstname;

	@Column(name = "surname", length = 25)
	private String surname;

	
	@Column(name = "email", unique=true)
	private String email;

	@Column(name = "password")
	private String password;
	
	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;
	
	@Column(name = "birthday")
	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Column(name = "avatar")
	private String avatar;
	
	@Column(name = "mark")
	private String mark;

	@Column(name = "rate")
	private String rate;
	
	@Column(name = "about")
	private String about;
	
	@Column(name = "enable")
	private int enable;
	
	@Column(name = "reason")
	private int reason;
	
	@Column(name = "bannedTime")
	private int bannedTime;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "createdTime")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")
	private Date createdTime;
	
	@Column(name = "deleted")
	private int deleted;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "role_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
	private Role role;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "level_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
	private Level level;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="user_target", 
	joinColumns={ @JoinColumn(name="user_id") },
	inverseJoinColumns = { @JoinColumn(name="target_id") } )
	@OrderColumn(name="display_order")
	private Set<Target> targets;
	
	@OneToMany(mappedBy = "user")
	private Set<UserChatroom> userchatroom;
	
	@OneToMany(mappedBy = "user")
	private Set<UserHint> userhint;
	
	@OneToMany(mappedBy = "userfollowing")
	private Set<UserFollow> userfollowing;
	
	@OneToMany(mappedBy = "userfollowed")
	private Set<UserFollow> userfollowed;
	
	@OneToMany(mappedBy = "userblocking")
	private Set<UserBlock> userblocking;
	
	@OneToMany(mappedBy = "userblocked")
	private Set<UserBlock> userblocked;
	
	public User() {
			
	}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public int getDeleted() {
		return deleted;
	}
	
	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Set<Target> getTargets() {
		return targets;
	}

	public void setTargets(Set<Target> targets) {
		this.targets = targets;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getReason() {
		return reason;
	}

	public void setReason(int reason) {
		this.reason = reason;
	}

	public int getBannedTime() {
		return bannedTime;
	}

	public void setBannedTime(int bannedTime) {
		this.bannedTime = bannedTime;
	}

	public Set<UserChatroom> getUserchatroom() {
		return userchatroom;
	}

	public void setUserchatroom(Set<UserChatroom> userchatroom) {
		this.userchatroom = userchatroom;
	}

	public Set<UserHint> getUserhint() {
		return userhint;
	}

	public void setUserhint(Set<UserHint> userhint) {
		this.userhint = userhint;
	}

	public Set<UserFollow> getUserfollowing() {
		return userfollowing;
	}

	public void setUserfollowing(Set<UserFollow> userfollowing) {
		this.userfollowing = userfollowing;
	}

	public Set<UserFollow> getUserfollowed() {
		return userfollowed;
	}

	public void setUserfollowed(Set<UserFollow> userfollowed) {
		this.userfollowed = userfollowed;
	}

	public Set<UserBlock> getUserblocking() {
		return userblocking;
	}

	public void setUserblocking(Set<UserBlock> userblocking) {
		this.userblocking = userblocking;
	}

	public Set<UserBlock> getUserblocked() {
		return userblocked;
	}

	public void setUserblocked(Set<UserBlock> userblocked) {
		this.userblocked = userblocked;
	}

	
}



