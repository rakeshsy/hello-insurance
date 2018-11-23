package com.rocky.insurance.api.agent;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rocky.insurance.business.agent.AgentService;
import com.rocky.insurance.common.dto.AgentApiResponse;
import com.rocky.insurance.common.dto.AgentListApiResponse;
import com.rocky.insurance.common.model.Agent;
import com.rocky.insurance.common.model.ErrorData;

@RestController
public class AgentController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(AgentController.class);
	
	private static final String LOGGER_PREFIX = "INSURANCE";
	
	@Autowired
	private Environment env;
	
	@Autowired
	private AgentService agentService;	

	/**
	 * Retrieve details for an Agent
	 * 
	 * @param agentId Agent Id
	 * @return Agent details
	 */
	@RequestMapping(value = "agent/{agentId}", method = RequestMethod.GET)
	public ResponseEntity<AgentApiResponse> getAgent(@PathVariable long agentId) {
		
		LOGGER.info("getAgent() - {} - About to retrieve Agent details - agentId:{}", 
				new Object[]{LOGGER_PREFIX, agentId});
		
		// retrieve Agent data from Agent Service (Business layer)...
		Agent agent = agentService.getAgent(agentId);
				
		// wrap the data in API response
		AgentApiResponse response = new AgentApiResponse();
		if(agent != null) { // if there is Agent data
			response.setAgent(agent);
		} else { // else return some error
			ErrorData error = new ErrorData("E0001", "Invalid Agent Id - " + agentId);
			response.setError(error);			
		}

		// return data to client
		return new ResponseEntity<AgentApiResponse>(response, null, HttpStatus.OK);
	}
	
	/**
	 *  Retrieve details for all Agents
	 *  
	 * @return list of all Agent details
	 */
	@RequestMapping(value = "agent", method = RequestMethod.GET)
	public ResponseEntity<AgentListApiResponse> getAgents() {
		
		LOGGER.info("getAgents() - {} - About to retrieve all Agent details", 
				new Object[]{LOGGER_PREFIX});
		
		// retrieve Agent data from Agent Service (Business layer)...
		List<Agent> agents = agentService.getAgents();
		
		// wrap the data in API response
		AgentListApiResponse response = new AgentListApiResponse();
		response.setAgents(agents);

		// return data to client
		return new ResponseEntity<AgentListApiResponse>(response, null, HttpStatus.OK);
	}	

}
