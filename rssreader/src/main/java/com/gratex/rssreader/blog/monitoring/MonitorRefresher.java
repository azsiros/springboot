package com.gratex.rssreader.blog.monitoring;

import com.rometools.rome.feed.synd.SyndEntry;

public class MonitorRefresher {

	private CommitsMonitor commitsMonitor;
	
	public void updateMOnitor(SyndEntry feedEntry) {
		System.err.println(feedEntry.getAuthor());
		this.commitsMonitor.incrementCommitsCount();
		System.err.println("monitor count: " + (this.commitsMonitor.getCommitsCount()));
	}
	
	public void setCommitsMonitor(CommitsMonitor commitsMonitor) {
		this.commitsMonitor = commitsMonitor;
	}
}
