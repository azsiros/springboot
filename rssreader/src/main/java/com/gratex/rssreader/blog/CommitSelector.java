package com.gratex.rssreader.blog;

import java.util.Date;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

import com.rometools.rome.feed.synd.SyndEntryImpl;

public class CommitSelector implements MessageSelector{
	
	private Date conditionDate;
	
	public  CommitSelector(Date currentDate) {
		this.conditionDate = new Date (currentDate.getTime() - 10000000);
	}
	
	public Date getConditionDate() {
		return conditionDate;
	}
	
	public void setConditionDate(Date conditionDate) {
		this.conditionDate = conditionDate;
	}

	@Override
	public boolean accept(Message<?> message) {
		SyndEntryImpl feed = (SyndEntryImpl) message.getPayload();
		return conditionDate.compareTo(feed.getPublishedDate()) < 0;
	}

}
