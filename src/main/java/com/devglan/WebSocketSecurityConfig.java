package com.devglan;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WebSocketSecurityConfig {
	 
	
	protected boolean sameOriginDisabled() {
	        return true;
	    }
	
	
}
