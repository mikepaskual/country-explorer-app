# 🌍 Country Explorer App

A full stack application built with Angular and Spring Boot that allows users to explore countries and manage a list of favorites.

---

## 🚀 Tech Stack

### Frontend

* Angular
* TypeScript
* HTML / CSS

### Backend

* Spring Boot
* Java
* REST API

### External API

* REST Countries API

---

## 🧠 Architecture

The application follows a layered architecture:

Frontend (Angular) → Backend (Spring Boot) → External API

The backend acts as an intermediary, transforming and controlling the data before sending it to the frontend.

---

## ✨ Features

### 🌍 Country Explorer

* List of countries
* Basic information:

  * Name
  * Capital
  * Population
  * Flag

### ⭐ Favorites

* Add country to favorites
* Remove country from favorites
* Real-time toggle state (⭐)

---

## 🏗️ Project Structure

```
country-explorer-app/
  ├── backend/   # Spring Boot API
  └── frontend/  # Angular application
```

---

## 🔧 Installation & Setup

### 1️⃣ Clone the repository

```
git clone https://github.com/mikepaskual/country-explorer-app.git
cd country-explorer-app
```

---

### 2️⃣ Backend (Spring Boot)

```
cd backend
./mvnw spring-boot:run
```

Server runs on:

```
http://localhost:8080
```

---

### 3️⃣ Frontend (Angular)

```
cd frontend
npm install
ng serve
```

App runs on:

```
http://localhost:4200
```

---

## 🔗 API Endpoints

### Countries

```
GET /countries
```

### Favorites

```
GET    /favorites
POST   /favorites/{code}
DELETE /favorites/{code}
```

---

## 📌 Technical Decisions

* Use of DTOs to avoid exposing unnecessary data
* Country identification using `cca3` (ISO standard)
* Clear separation of concerns:

  * Controller
  * Service
  * Client
* Efficient frontend state management using `Set`

---

## ⚠️ Current Limitations

* Favorites are stored in memory (not persistent)
* No user authentication
* Basic UI (to be improved)

---

## 🚀 Future Improvements

* Database integration (H2 / PostgreSQL)
* Dedicated favorites page
* Country search functionality
* Country detail view
* UI/UX improvements

---

## 📸 Demo

*Add screenshots or GIFs here*

---

## 👨 Author

Built as a full stack learning project.

---

## 📄 License

Free to use for educational purposes.
