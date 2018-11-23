package com.rocky.insurance.data.agent;

import java.util.List;

import com.rocky.insurance.common.model.Agent;

public interface AgentDao {
	
	public Agent getAgent(long agentId);

	public List<Agent> getAgents();

}
