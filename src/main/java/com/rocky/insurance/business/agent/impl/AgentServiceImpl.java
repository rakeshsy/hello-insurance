package com.rocky.insurance.business.agent.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocky.insurance.business.agent.AgentService;
import com.rocky.insurance.common.model.Agent;
import com.rocky.insurance.data.agent.AgentDao;

@Service
public class AgentServiceImpl implements AgentService {

	@Autowired
	private AgentDao agentDao;

	@Override
	public Agent getAgent(long agentId) {
		// do some validations, if any
		// ...
		
		// retrieve Agent data from Agent Dao (Data layer)...
		Agent agent = agentDao.getAgent(agentId);
		
		// return data to API
		return agent;
	}

	@Override
	public List<Agent> getAgents() {
		// do some validations, if any
		// ...
		
		// retrieve Agent data from Agent Dao (Data layer)...
		List<Agent> agents = agentDao.getAgents();
		
		// return data to API
		return agents;
	}

}
