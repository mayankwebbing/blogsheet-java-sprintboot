Register a new user:

```
POST http://localhost:8080/api/auth/register
Content-Type: application/json

{
    "username": "testuser",
    "email": "test@example.com",
    "password": "password123"
}
```

Login to get JWT token:

```
POST http://localhost:8080/api/auth/login
Content-Type: application/json

{
    "username": "testuser",
    "password": "password123"
}
```

Create a new post (Include the JWT token in the Authorization header):

```
POST http://localhost:8080/api/posts
Authorization: Bearer <your_jwt_token>
Content-Type: application/json

{
    "title": "My First Post",
    "content": "This is the content of my first blog post."
}
```

Get all posts:

```
GET http://localhost:8080/api/posts
Authorization: Bearer <your_jwt_token>
```

Update a post:

```
PUT http://localhost:8080/api/posts/{post_id}
Authorization: Bearer <your_jwt_token>
Content-Type: application/json

{
    "title": "Updated Post Title",
    "content": "Updated content of my blog post."
}
```

Delete a post:

```
DELETE http://localhost:8080/api/posts/{post_id}
Authorization: Bearer <your_jwt_token>
```
