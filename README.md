# 🚀 Spring Boot Dockerized Application

This project demonstrates how to containerize a **Java Spring Boot application** along with a **MySQL database** using **Docker** and **Docker Compose**.

The goal of this project is to understand how containerization simplifies application deployment and ensures consistent environments across different systems.

---

## 📌 Features

- Spring Boot REST API
- MySQL Database Integration
- Dockerized Application
- Docker Compose for multi-container setup
- Persistent database using Docker Volumes
- API testing using Postman

---

## 🏗️ Project Architecture

The project follows a standard Spring Boot layered architecture:

```
Controller → Service → Repository → Database
```

- **Entity** – Defines the database table structure  
- **Repository** – Handles database operations using JPA  
- **Service** – Contains business logic  
- **Controller** – Exposes REST APIs

---

## 🐳 Docker Setup

### 1️⃣ Dockerfile

The Dockerfile is used to build the application image.

Main instructions used:

- `FROM` – Defines the base image  
- `ADD` – Copies the application into the container  
- `ENTRYPOINT` – Runs the Spring Boot application

---

### 2️⃣ Docker Compose

`docker-compose.yml` is used to run **two containers**:

- **Spring Boot Application**
- **MySQL Database**

It also defines:

- Container networking
- Environment variables
- Port mappings
- Persistent storage using volumes

---

## ⚙️ How to Run the Project

### 1️⃣ Clone the repository

```bash
git clone https://github.com/AkhileshRawatGit/Docker-Demo.git
cd Docker-Demo
```

### 2️⃣ Build and start containers

```bash
docker-compose up --build
```

### 3️⃣ Access the application

Open in browser:

```
http://localhost:8080
```

---

## 📬 API Testing

You can use **Postman** to test the APIs.

Example request:

```
POST /post
```

This will store data in the MySQL database.

---

## 💾 Data Persistence

This project uses **Docker Volumes** to store MySQL data.

Even if containers stop or restart, the data will still remain.

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- MySQL
- Docker
- Docker Compose

---


## 📚 Learning Goal

This project was created as a **learning exercise** to understand:

- Containerization
- Multi-container applications
- Docker networking
- Docker volumes
- Backend deployment basics
