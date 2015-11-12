package com.gratex.rssreader.maven;

import java.io.File;
import java.util.Arrays;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;
import org.junit.Test;

public class MavenInvocationTest {

	
	@Test
	public void testInvokeMaven() throws MavenInvocationException {
		InvocationRequest request = new DefaultInvocationRequest();
		request.setPomFile( new File( "pom.xml" ) );
		request.setGoals( Arrays.asList( "dependency-check:check" ) );

		Invoker invoker = new DefaultInvoker();
		InvocationResult result = invoker.execute( request );
		System.out.println("exit code " + result.getExitCode());
		System.out.println("exit code " + result.getExecutionException());
	}
}
