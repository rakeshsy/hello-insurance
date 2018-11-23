package com.rocky.insurance.common.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Agent implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long agentId;
	
	private String agentName;
	
	private Address agentAddress;

	public long getAgentId() {
		return agentId;
	}

	public void setAgentId(long agentId) {
		this.agentId = agentId;
	}

	public Address getAgentAddress() {
		return agentAddress;
	}

	public void setAgentAddress(Address agentAddress) {
		this.agentAddress = agentAddress;
	}
	
	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}	

}
