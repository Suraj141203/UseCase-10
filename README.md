# 🚀 Full Stack Use Case Practice (Spring Boot + Angular)

This repository is created for **practice and learning full-stack application development** using a **clean, reusable Use Case–based architecture**.

Each use case follows the **same backend and frontend pattern**, where:
- Only **attributes and data types change**
- Core **logic, structure, and flow remain the same**
- This minimizes bugs and improves development speed

---

## 🧩 Tech Stack

### Backend
- Java 11+
- Spring Boot
- Spring Data JPA (Hibernate)
- REST APIs
- MySQL
- Maven

### Frontend
- Angular
- Bootstrap
- TypeScript
- HTML / CSS
- ngx-translate (i18n support)

---

## 📁 Project Structure

### Backend (Spring Boot)

backend/
├── common/
│ ├── BaseDTO
│ ├── BaseDAOImpl
│ ├── BaseServiceImpl
│ ├── BaseCtl
│
├── dto/
│ └── <UseCase>DTO
│
├── dao/
│ ├── <UseCase>DAOInt
│ └── <UseCase>DAOImpl
│
├── service/
│ ├── <UseCase>ServiceInt
│ └── <UseCase>ServiceImpl
│
├── ctl/
│ └── <UseCase>Ctl


✔ All use cases reuse the same **Base classes**

---

### Frontend (Angular)

frontend/
├── app/
│ ├── <usecase>/
│ │ ├── <usecase>.component.ts
│ │ ├── <usecase>.component.html
│ │
│ ├── <usecase>list/
│ │ ├── <usecase>list.component.ts
│ │ ├── <usecase>list.component.html
│ │
│ ├── base/
│ │ ├── base.component.ts
│ │ ├── base-list.component.ts
│
│ ├── service-locator.service.ts
│ ├── app-routing.module.ts


✔ Same HTML & logic reused  
✔ Only **field names and bindings change**

---

## 🧠 Use Case Pattern (Important)

Each use case contains:

### Backend
- DTO
- DAO (Interface + Impl)
- Service (Interface + Impl)
- Controller

### Frontend
- Add Page (Form)
- List Page (Search + Pagination + Delete)
- Routing
- Navbar Integration

---

## 📌 Example Use Cases Implemented

- Report Module
- Address Module
- Order Module
- (More coming…)

---

## ❗ Key Rules Followed

- ✅ Same Base Classes for all use cases
- ✅ No duplicate logic
- ✅ Static preload data handled in frontend when required
- ✅ Delete works using `name="list_name"` convention
- ✅ i18n support using `translate` pipe
- ✅ Pagination, search & bulk delete supported

---

## 🌐 Internationalization (i18n)

- Language support using `ngx-translate`
- Easily switch between languages (English / Hindi)
- All labels and messages are configurable

---

## ▶️ How to Run

### Backend
```bash
cd backend
mvn spring-boot:run
Frontend
cd frontend
npm install
ng serve
Open browser:

http://localhost:4200
🎯 Purpose of This Repository
Practice real-world full-stack architecture

Improve confidence in reusable design

Prepare for interviews & professional projects

Build a strong GitHub portfolio

👨‍💻 Author
Suraj Yadav
Full Stack Developer (Java + Angular)