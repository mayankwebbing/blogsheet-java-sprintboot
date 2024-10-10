# Blog Sheet Development Tasklist

## Backend

- [ ] **Setup Database**

  - [ ] Connecting with MSSQL
  - [ ] Define Database Schema (Users, Blogs, Comments, Upvotes, Views)
  - [ ] Implement Migrations

- [ ] **API Development**

  - [ ] Create RESTful APIs
    - [ ] User Registration
    - [ ] User Authentication
    - [ ] JWT Token with Refresh Token
    - [ ] CRUD Operations for Blog (Create, Read, Update, Delete)
    - [ ] 3-Level Comment Functionality (Nested Comments)
    - [ ] Upvote Functionality for Blogs and Comments
    - [ ] View Count Functionality

- [ ] **Authentication**

  - [ ] Implement User Registration
  - [ ] Implement User Authentication (Login)
  - [ ] Implement JWT Authentication
    - [ ] Check and validate JWT Token with refresh token mechanism
    - [ ] Token Expiry Handling (Access and Refresh Tokens)
  - [ ] Secure APIs with JWT Authentication (Public vs Private Endpoints)

- [ ] **Blog Functionality**

  - [ ] Create Blog
  - [ ] Edit Blog
  - [ ] View Single Blog
  - [ ] View All Blogs (with pagination)
  - [ ] Implement Blog Upvote and View Count
  - [ ] Implement Blog Filtering (by Author, Date, Popularity)

- [ ] **Comments**
  - [ ] Implement Comment Creation
  - [ ] Implement Nested Commenting (Up to 3 Levels)
  - [ ] Display Comments (with pagination)
  - [ ] Implement Upvote for Comments
  - [ ] Track and Display Comment Count for Blogs

## Frontend (Optional based on tech stack)

- [ ] **User Interface**
  - [ ] User Registration Form
  - [ ] User Login Form
  - [ ] Blog Creation/Edit Form
  - [ ] Blog Listing Page (with filters)
  - [ ] Blog Details Page (with Comments and Upvotes)
  - [ ] Commenting System UI (with Nested Comments)
  - [ ] User Profile Page (with Blogs, Upvotes, and Comments)

## Testing

- [ ] **API Testing**

  - [ ] Unit Test for User Registration and Authentication APIs
  - [ ] Test JWT Token Refresh Mechanism
  - [ ] Unit Test for Blog CRUD APIs
  - [ ] Unit Test for Commenting System
  - [ ] Test Upvote and View Count APIs

- [ ] **Load Testing**
  - [ ] Test API Performance with High Load
  - [ ] Test Database Performance with Concurrent Requests

## Deployment

- [ ] **Environment Setup**

  - [ ] Configure MSSQL in Production Environment
  - [ ] Deploy API Server
  - [ ] Environment Variables Setup (JWT, Database Connection)
  - [ ] Ensure HTTPS and Secure Connections
  - [ ] Implement Logging and Error Handling for APIs

- [ ] **Documentation**
  - [ ] API Documentation (Swagger or Postman Collection)
  - [ ] Code Documentation
