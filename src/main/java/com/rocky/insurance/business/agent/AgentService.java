package com.rocky.insurance.business.agent;

import java.util.List;

import com.rocky.insurance.common.model.Agent;

public interface AgentService {
	
	public Agent getAgent(long agentId);

	public List<Agent> getAgents();

}
