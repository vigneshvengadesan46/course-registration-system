# Course Registration System — Backend

Spring Boot REST API for the Course Registration System. It provides JWT authentication, email OTP verification, role-based authorization (Student and Admin), course management, and registration management.

---

## 🛠️ Tech Stack

- **Framework**: Spring Boot
- **Security**: Spring Security with JWT
- **Database**: MySQL with Spring Data JPA
- **Email**: Gmail SMTP (asynchronous)
- **API Docs**: Swagger / OpenAPI
- **Build Tool**: Maven

---

## 📁 Project Structure

```text
course-registration-system/
├── .mvn/wrapper/
├── src/
│   ├── main/
│   │   ├── java/com/example/course_registration_system/
│   │   │   ├── config/
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── entity/
│   │   │   ├── exception/
│   │   │   ├── repository/
│   │   │   ├── security/
│   │   │   └── service/
│   │   └── resources/application.properties
│   └── test/
├── .gitattributes
├── .gitignore
├── README.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```

---

## 🚀 Getting Started

### Prerequisites
- Java (use the version set in `pom.xml`)
- MySQL

### 1. Configure Environment Variables
Create a `.env` file or set these values in your environment. Use your own values and never commit them:
```env
DB_URL=jdbc:mysql://localhost:3306/your_database
DB_
# Course Registration System — Frontend

A modern, responsive web application for student course registrations and administrative academic management, built with **React** and **Vite**.

---

## 🌟 Key Features

### 👨‍🎓 Student Portal
- **Account Registration & Verification**: Fast student sign-up with email OTP verification.
- **Available Courses**: View course catalog with department, credits, capacity, and real-time seat availability.
- **One-Click Course Registration**: Enroll in available courses with automatic duplicate and capacity checks.
- **Course Management**: View registered courses and drop registered courses at any time.
- **Profile Management**: View and update profile details (name, department, year).

### 👨‍💼 Administrator Portal
- **Dashboard Analytics**: Real-time statistics including total students, courses, active registrations, and verified student counts.
- **Course Management**: Add new courses, edit course details, and delete courses.
- **Student Monitoring**: Browse all registered students and view individual student academic profiles.
- **Registration Tracking**: Monitor course-wise student enrollment lists and recent activity.

---

## 🛠️ Tech Stack

- **Framework**: [React 19](https://react.dev/)
- **Build Tool**: [Vite](https://vite.dev/)
- **Styling**: Modern Vanilla CSS with responsive design, glassmorphism UI, and smooth animations
- **State & Routing**: React Hooks (`useState`, `useEffect`) and lightweight route management
- **Code Quality**: ESLint with modern React Hooks rules

---

## 📁 Project Structure

```text
frontend/
├── public/                  # Static assets & icons
├── src/
│   ├── assets/              # UI images and illustrations
│   ├── AdminCourses.jsx     # Admin course management
│   ├── AdminDashboard.jsx   # Admin dashboard analytics
│   ├── AdminRegistrations.jsx # Course enrollment records
│   ├── AdminStudents.jsx    # Student directory and details
│   ├── App.jsx              # Application entry & authentication handling
│   ├── Register.jsx         # Student registration form
│   ├── StudentDashboard.jsx # Student portal & course enrollment
│   ├── VerifyOtp.jsx        # Email OTP verification interface
│   ├── api.js               # Central API configuration
│   └── main.jsx             # React DOM root render
├── .gitignore
├── README.md
├── eslint.config.js         # ESLint configuration
├── index.html               # Main HTML entry
├── package-lock.json
├── package.json             # Dependencies and scripts
└── vite.config.js           # Vite configuration
```

---

## 🚀 Getting Started

### Prerequisites
- [Node.js](https://nodejs.org/) (v18 or higher recommended)
- [npm](https://www.npmjs.com/)

### 1. Install Dependencies
```bash
cd frontend
npm install
```

### 2. Configure Environment Variables
Create a `.env` file in the `frontend` root directory:
```env
VITE_API_URL=http://localhost:8080
```

### 3. Run Development Server
```bash
npm run dev
```
Open [http://localhost:5173](http://localhost:5173) in your browser.

### 4. Build for Production
```bash
npm run build
```

### 5. Run Linter
```bash
npm run lint
```
