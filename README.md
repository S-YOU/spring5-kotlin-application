# spring5-kotlin-application

## Overview

This repository contains the todo list application that implemented by Spring Boot 2.0.0.M1 (support kotlin).

## Motivation

HTTP routing service and gRPC clinet/server both applications are able to run on Spring Framework 5.0 ? I want to know that.  
So that this repository of applicaiton developed according to following diagram.

![diagram](https://raw.githubusercontent.com/nsoushi/spring5-kotlin-application/master/docs/spring5-kotlin.png)

## Apis

**Create task**
```
$ curl -X POST http://localhost:8080/api/task/ -H "Content-Type: application/json" -d '{"title": "remember the milk"}'
  [{"title":"remember the milk"}]%
```

**Update task**
```
$ curl -X PUT http://localhost:8080/api/task/2 -H "Content-Type: application/json" -d '{"title": "remember the eggs"}'
  [{"title":"remember the eggs"}]%
```

**Finish task**
```
$ curl -X PUT http://localhost:8080/api/task/2/finish
  {"id":2,"title":"remember the eggs","finishedAt":"2017-06-13T16:25:55Z","createdAt":"2017-06-13T16:22:52Z","updatedAt":"2017-06-13T16:25:55Z"}%
```

**Get task(s)**

```
$ curl -XGET http://localhost:8080/api/task/2
  {"id":2,"title":"remember the milk","finishedAt":"","createdAt":"2017-06-13T16:22:52Z","updatedAt":"2017-06-13T16:22:52Z"}%
```

```
$ curl -XGET http://localhost:8080/api/tasks | jq
  [
    {
      "id": 2,
      "title": "remember the milk",
      "finishedAt": "",
      "createdAt": "2017-06-13T16:22:52Z",
      "updatedAt": "2017-06-13T16:22:52Z"
    },
    {
      "id": 1,
      "title": "task title",
      "finishedAt": "",
      "createdAt": "2017-06-13T15:51:42Z",
      "updatedAt": "2017-06-13T15:51:42Z"
    }
  ]
```

## Running the applications

Running docker containers.
```
(spring5-kotlin-application) $ docker-compose up -d
```
After running docker containers, you can confirm api response via API of HTTP and gRPC client.

**via API of HTTP**

```
$ curl -XGET http://localhost:8080/api/task/1
  {"id":1,"title":"task title","finishedAt":"","createdAt":"2017-06-13T15:51:42Z","updatedAt":"2017-06-13T15:51:42Z"}%
```

**via gRPC client**

use grpc-gateway

```
(spring5-kotlin-application/gateway) $ go get ./...
(spring5-kotlin-application/gateway) $ go run gateway.go
```

then request to the grpc-client on api-server via grpc-gateway.

```
curl -XGET http://localhost:8081/v1/task?task_id=1
{"task_id":1,"title":"task title"}%
```
