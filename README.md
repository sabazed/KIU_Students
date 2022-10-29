# KIU_Students

REST API for a university (KIU in this case) using Spring Boot, Hibernate and MariaDB with Flyway

Entities are = ['students', 'courses', 'schools', 'professors']<br>
Endpoints:
```
Getting all entities - GET "/kiu/<entity>"
Getting entity by id - GET "/kiu/<entity>/<id>"
Adding entity - POST "/kiu/<entity>/new"
Deleting entity - DELETE "/kiu/<entity>/remove/<id>"
```
