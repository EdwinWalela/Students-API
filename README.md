# Spring Boot REST API

Demo REST API built with Spring Boot with basic CRUD functionalities using Postgres as the database server.

## Routes

Base URL: `http://localhost:8080/api/v1/students`

### POST / 
Creates a student. Email should be unique

request body:
```json
{
  "name":"edwin",
  "dob":"26-09-1999",
  "email":"edwin@mail.com"
}
```

### GET /
Retrieves all students

```json
"students": [
  {
    "id":1,
    "name":"edwin",
    "dob":"26-09-1999",
    "email":"edwin@mail.com"
  },
   {
    "id":2,
    "name":"walela",
    "dob":"26-09-1999",
    "email":"walela@mail.com"
  }
]
```

### GET /:id
Retrieve student based on their id

```json
{
  "id":1,
  "name":"edwin",
  "dob":"26-09-1999",
  "email":"edwin@mail.com"
}
```
