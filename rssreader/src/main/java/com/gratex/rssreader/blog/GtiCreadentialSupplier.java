package com.gratex.rssreader.blog;

import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.springframework.beans.factory.annotation.Value;

import com.rometools.fetcher.impl.HttpClientFeedFetcher.CredentialSupplier;

public class GtiCreadentialSupplier implements CredentialSupplier{
	@Value("${username}")
	private String userName;
	
	@Value("${pwd}")
	private String pwd;
	
	@Override
	public Credentials getCredentials(String realm, String host) {
		return new UsernamePasswordCredentials(userName, pwd);
	}

}
