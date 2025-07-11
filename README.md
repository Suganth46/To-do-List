# To-do-List
A full-stack To-Do List web application built with Spring Boot (Java) and PostgreSQL, featuring a clean HTML/JavaScript frontend. Users can create, update, delete, and mark tasks as complete, with persistent storage and real-time task statistics.


---

markdown
# 📝 Simple To-Do List Application

This is a full-stack **To-Do List** web application built with:

- 💻 **Spring Boot (Java)** – Backend REST API
- 🐘 **PostgreSQL** – Database
- 🌐 **HTML, CSS, JavaScript** – Frontend (Single Page App)

---

## 📸 Demo

![To-Do Demo Screenshot](demo.png) <!-- Replace with your image or remove if not applicable -->

---

## 🚀 Features

- ✅ Add, update, delete tasks
- 🏷️ Prioritize tasks (Low, Medium, High)
- 📊 View task statistics (total, completed, pending)
- 🔁 Toggle task status (completed/pending)
- 💾 Persistent storage with PostgreSQL
- 🌐 RESTful API (JSON-based)

---

## 🧰 Tech Stack

| Layer      | Technology         |
|------------|--------------------|
| Backend    | Spring Boot (Java) |
| Database   | PostgreSQL         |
| Frontend   | HTML + CSS + JS    |
| Build Tool | Maven   |

---

## 📁 Project Structure

```

src
└── main
├── java
│    └── com.example.todo       # Java source code
│         ├── controller        # REST controllers
│         ├── model             # JPA entities
|         ├── service           # Service
│         └── repository        # Spring Data JPA interfaces
└── resources
├── static/index.html     # Frontend
└── application.properties# Config

````

---

## ⚙️ Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/todo-app.git
cd To-Do-List
````

### 2. Set up PostgreSQL

* Create a database, e.g. `todo_db`
* Update your `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/todo_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run the app

```bash
./mvnw spring-boot:run
```

### 4. Access the app

Open your browser:

```
http://localhost:8080/index.html
```

---

## 📦 API Endpoints

| Method | Endpoint          | Description        |
| ------ | ----------------- | ------------------ |
| GET    | `/api/tasks`      | Get all tasks      |
| POST   | `/api/tasks`      | Add a new task     |
| PUT    | `/api/tasks/{id}` | Update task status |
| DELETE | `/api/tasks/{id}` | Delete a task      |

---

## 🧪 Example Task JSON

```json
{
  "text": "Learn Spring Boot",
  "priority": "HIGH",
  "completed": false
}
```

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙋‍♂️ Author

Made with ❤️ by [Suganth J](https://github.com/Suganth46)


