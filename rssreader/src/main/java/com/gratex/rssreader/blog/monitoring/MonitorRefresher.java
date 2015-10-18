package com.gratex.rssreader.blog.monitoring;

import org.springframework.beans.factory.annotation.Autowired;

import com.rometools.rome.feed.synd.SyndEntry;

public class MonitorRefresher {

	@Autowired
	private CommitsMonitor commitsMonitor;
	
	public void updateMOnitor(SyndEntry feedEntry) {
		
		System.out.println("monitor is null: " + (this.commitsMonitor == null));
	}
}
