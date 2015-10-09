package com.gratex.rssreader.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Application {
    public static void main(String[] args) throws Exception {
    	System.setProperty("javax.net.debug", "ssl");
    	System.setProperty("javax.net.ssl.keyStore", "mystore");
    	System.setProperty("javax.net.ssl.keyStorePassword", "marcus");
    	System.setProperty("javax.net.ssl.trustStore", "mystore");
    	System.setProperty("javax.net.ssl.trustStorePassword", "marcus");
        ConfigurableApplicationContext ctx = new SpringApplication("/blog/integration.xml").run(args);
        System.out.println("Hit Enter to terminate");
        System.in.read();
        ctx.close();
    }

}
