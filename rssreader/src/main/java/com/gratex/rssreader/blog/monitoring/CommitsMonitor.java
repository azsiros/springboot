package com.gratex.rssreader.blog.monitoring;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource
public class CommitsMonitor {
	
	private int commitsCount = 0;
	
	
	@ManagedAttribute
	public int getCommitsCount() {
		return commitsCount;
	}
	
	public void incrementCommitsCount() {
		this.getCommitsCount();
	}
}
