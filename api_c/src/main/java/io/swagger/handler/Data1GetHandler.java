package io.swagger.handler;

import java.util.ArrayList;
import java.util.List;

import com.networknt.config.Config;

import io.swagger.PluginWrapperClient;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

public class Data1GetHandler implements HttpHandler {
	//PluginWrapperClient PluginWrapperClient = new PluginWrapperClient();
    public void handleRequest(HttpServerExchange exchange) throws Exception {
    	long one = System.currentTimeMillis();
    	//PluginWrapperClient.doAuthorize(exchange);
    	long two = System.currentTimeMillis();
    	long took = two-one;
    	
    	List<String> messages = new ArrayList<String>();
    	messages.add("API C: "+this.getClass().getName()+" Message 1");
    	messages.add("API C: "+this.getClass().getName()+" Message 2");
    	exchange.getResponseSender().send(Config.getInstance().getMapper().writeValueAsString(messages));
    }
}