package com.capdev.service.payload;

import java.util.Map;

public class ServiceResponse {

	private ServiceResponseHeader header ;
	private Map<String,Object> body;
	
	public ServiceResponseHeader getHeader() {
		return header;
	}
	public void setHeader(ServiceResponseHeader header) {
		this.header = header;
	}
	public Map<String, Object> getBody() {
		return body;
	}
	public void setBody(Map<String, Object> body) {
		this.body = body;
	}
	
	
	
}
