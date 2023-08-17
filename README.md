Spring Boot REST API with MongoDB Atlas
This is a simple Spring Boot REST API that allows you to create, read, update, and delete students. The API is backed by a MongoDB Atlas database.

Prerequisites
You need to have MongoDB Atlas installed and running.
You need to have Java 17 installed.
You need to have Maven installed.


The API will be available at http://localhost:8080/.

## Using the API

You can use the following curl commands to interact with the API:

Create a student
```
curl -X POST -H "Content-Type: application/json" -d '{
"name": "John Doe",
"surname": "Doe"
}' http://localhost:8080/v1/students
```

Get all students
```
curl http://localhost:8080/v1/students
```

Get a student by id
```
curl http://localhost:8080/v1/students/1
```

Update a student
```
curl -X PUT -H "Content-Type: application/json" -d '{
"name": "Jane Doe"
}' http://localhost:8080/v1/students/1
```

Delete a student
```
curl -X DELETE http://localhost:8080/v1/students/1
```


## Documentation

The API documentation is available at http://localhost:8080/swagger-ui/.
