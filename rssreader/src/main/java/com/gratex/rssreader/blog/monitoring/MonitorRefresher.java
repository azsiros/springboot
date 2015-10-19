package com.gratex.rssreader.blog.monitoring;

import com.rometools.rome.feed.synd.SyndEntry;

public class MonitorRefresher {

	private CommitsMonitor commitsMonitor;
	
	public void updateMOnitor(SyndEntry feedEntry) {
		System.err.println(feedEntry.getAuthor());
		this.commitsMonitor.incrementCommitsCount();
		this.commitsMonitor.setLastCommitDate(feedEntry.getPublishedDate());
	}
	
	public void setCommitsMonitor(CommitsMonitor commitsMonitor) {
		this.commitsMonitor = commitsMonitor;
	}
	
	public void processNotifification(Object notif) {
		System.err.println(notif);
	}
	
	
}
