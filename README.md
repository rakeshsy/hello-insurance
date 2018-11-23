# hello-insurance

1. Start the Spring Boot Application.
2. Test the application


### Case1 - retrieve Agent details of Agent Id '1'

request: 
GET http://localhost:8090/insurance/api/agent/1

response:
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




