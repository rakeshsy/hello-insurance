package com.rocky.insurance.data.agent.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rocky.insurance.common.model.Address;
import com.rocky.insurance.common.model.Agent;
import com.rocky.insurance.data.agent.AgentDao;

@Service
public class AgentDaoImpl implements AgentDao {

	@Override
	public Agent getAgent(long agentId) {
		// retrieve data from database
		// for now, returning hard coding data here for testing purpose...
		Agent agent = getAgentTestData(agentId);
		
		// return data to Business layer
		return agent;
	}

	@Override
	public List<Agent> getAgents() {
		// retrieve data from database
		// for now, returning hard coding data here for testing purpose...
		List<Agent> agents = getAgentsTestData();
		
		// return data to Business layer
		return agents;
	}
	
	
	/**
	 * test data for an Agent
	 * 
	 * @param agentId
	 * @return Agent
	 */
	private Agent getAgentTestData(long agentId) {
		Agent agent = null;
		
		if(agentId == 1) {
			agent = new Agent();

			// Address
			Address addr = new Address();
			addr.setAddr1("460 Park Ave.");
			addr.setAddr2("South");
			addr.setCity("New York");
			addr.setState("NY");
			addr.setZip(10016);
			
			agent.setAgentId(1);
			agent.setAgentName("Rocky");			
			agent.setAgentAddress(addr);
			
		} else if(agentId == 2) {
			agent = new Agent();
			
			// Address
			Address addr = new Address();
			addr.setAddr1("5800 Northampton Blvd");
			addr.setCity("Norfolk");
			addr.setState("VA");
			addr.setZip(23502);

			agent.setAgentId(2);
			agent.setAgentName("Immo");
			agent.setAgentAddress(addr);
		} else {
			// No data found
		}
		
		return agent;
	}
	
	/**
	 * test data for list of agents
	 * 
	 * @return  List<Agent>
	 */
	private List<Agent> getAgentsTestData() {
		
		List<Agent> agents = new ArrayList<Agent>();
		agents.add(getAgentTestData(1)); // Rocky
		agents.add(getAgentTestData(2)); // Immo

		return agents;
	}

}
