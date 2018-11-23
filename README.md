# hello-insurance
---

Start the Spring Boot Application.

### Test Case #1 - retrieve Agent details of Agent Id '1'

request: 
GET http://localhost:8090/insurance/api/agent/1

response: 
{
  "agent": {
    "agentId": 1,
    "agentName": "Rocky",
    "agentAddress": {
      "addr1": "460 Park Ave.",
      "addr2": "South",
      "city": "New York",
      "state": "NY",
      "zip": 10016
    }
  }
}

### Test Case #2 - retrieve Agent details of Agent Id '2'

request: 
GET http://localhost:8090/insurance/api/agent/2

response: 
{
  "agent": {
    "agentId": 2,
    "agentName": "Immo",
    "agentAddress": {
      "addr1": "5800 Northampton Blvd",
      "city": "Norfolk",
      "state": "VA",
      "zip": 23502
    }
  }
}

### Test Case #3 - retrieve Agent details of invalid Agent Id, say '3'

request: 
GET http://localhost:8090/insurance/api/agent/3

response: 
{
  "error": {
    "code": "E0001",
    "message": "Invalid Agent Id - 3"
  }
}

### Test Case #4 - retrieve details of all Agents

request: 
GET http://localhost:8090/insurance/api/agent

response: 
{
  "agents": [
    {
      "agentId": 1,
      "agentName": "Rocky",
      "agentAddress": {
        "addr1": "460 Park Ave.",
        "addr2": "South",
        "city": "New York",
        "state": "NY",
        "zip": 10016
      }
    },
    {
      "agentId": 2,
      "agentName": "Immo",
      "agentAddress": {
        "addr1": "5800 Northampton Blvd",
        "city": "Norfolk",
        "state": "VA",
        "zip": 23502
      }
    }
  ]
}










