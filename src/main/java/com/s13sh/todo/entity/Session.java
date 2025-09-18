package com.s13sh.todo.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.s13sh.todo.helper.SessionStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Session {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String sessionId;
	private Long userId;
	@CreationTimestamp
	private LocalDateTime loggedInTime;
	private LocalDateTime loggedOutTime;
	@Enumerated(EnumType.STRING)
	private SessionStatus status;
	
	public void setSessionId(String id2) {
		// TODO Auto-generated method stub
		
	}

	public void setUserId(Object id2) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(SessionStatus active) {
		// TODO Auto-generated method stub
		
	}

	public void setLoggedOutTime(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}

	public Long getUserId() {
		// TODO Auto-generated method stub
		return this.userId;
	}

	public SessionStatus getStatus() {
		// TODO Auto-generated method stub
		return this.status;
	}

}
