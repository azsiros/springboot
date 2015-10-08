package com.gratex.rssreader.blog;

import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.UsernamePasswordCredentials;

import com.rometools.fetcher.impl.HttpClientFeedFetcher.CredentialSupplier;

public class GtiCreadentialSupplier implements CredentialSupplier{

	@Override
	public Credentials getCredentials(String realm, String host) {
		return new UsernamePasswordCredentials("azsiros", "");
	}

}
