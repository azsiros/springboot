package com.gratex.rssreader.blog.monitoring;

import java.util.Date;

import javax.management.Notification;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;

@ManagedResource
public class CommitsMonitor implements NotificationPublisherAware {
	
	private int commitsCount = 0;
	
	private Date lastCommitDate;
	
	private Date filterDate;
	
	private NotificationPublisher publisher;
	private int sequencer = 0;
	
	@ManagedAttribute(description="Number of commits since filter date was set.")
	public int getCommitsCount() {
		return commitsCount;
	}
	
	@ManagedAttribute(description="Date of last commit")
	public Date getLastCommitDate() {
		return lastCommitDate;
	}
	
	@ManagedAttribute(description="Filter date for commits")
	public Date getFilterDate() {
		return filterDate;
	}
	
	public void incrementCommitsCount() {
		this.commitsCount++;
	}
	
	public void setLastCommitDate(Date lastCommitDate) {
		this.lastCommitDate = (Date)lastCommitDate.clone();
	}
	
	@ManagedOperation
	public void updateFilter(String filter) {
		System.err.println("NOTIFICAITON: " + filter);
		publisher.sendNotification(new Notification("change", this, sequencer++));
	}

	@Override
	public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
		this.publisher = notificationPublisher;
	}
}
