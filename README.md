# hello-insurance
---

## Steps

1. Start the Spring Boot application.
2. Test the application - 'http://localhost:8090/insurance/api/'

## Test Cases

### TC#1 - retrieve Agent details of Agent Id '1'

request: 
GET `http://localhost:8090/insurance/api/agent/1`

response: 
```
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
```

### TC#2 - retrieve Agent details of Agent Id '2'

request: 
GET `http://localhost:8090/insurance/api/agent/2`

response: 
```
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
```

### TC#3 - retrieve Agent details of invalid Agent Id, say '9'

request: 
GET `http://localhost:8090/insurance/api/agent/9`

response: 
```
{
  "error": {
    "code": "E0001",
    "message": "Invalid Agent Id - 9"
  }
}
```

### TC#4 - retrieve details of all Agents

request: 
GET `http://localhost:8090/insurance/api/agent`

response: 
```
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
```

