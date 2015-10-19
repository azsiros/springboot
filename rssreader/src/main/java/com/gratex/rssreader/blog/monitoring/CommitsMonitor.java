package com.gratex.rssreader.blog.monitoring;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource
public class CommitsMonitor {
	
	private int commitsCount = 0;
	
	
	@ManagedAttribute(description="Number of commits since filter date was set.")
	public int getCommitsCount() {
		return commitsCount;
	}
	
	public void incrementCommitsCount() {
		this.commitsCount++;
	}
}
