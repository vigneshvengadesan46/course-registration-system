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
├── public/               # Static assets & icons
│   ├── favicon.svg
│   └── icons.svg
├── src/
│   ├── assets/           # UI images and illustrations
│   ├── AdminCourses.jsx  # Admin course management component & styles
│   ├── AdminDashboard.jsx# Admin dashboard analytics component
│   ├── AdminRegistrations.jsx # Course enrollment records
│   ├── AdminStudents.jsx # Student directory and details
│   ├── App.jsx           # Application entry & authentication handling
│   ├── Register.jsx      # Student registration form
│   ├── StudentDashboard.jsx # Student portal & course enrollment
│   ├── VerifyOtp.jsx     # Email OTP verification interface
│   ├── api.js            # Central API configuration
│   └── main.jsx          # React DOM root render
├── .env                  # Environment variables
├── index.html            # Main HTML entry
├── package.json          # Dependencies and scripts
└── vite.config.js        # Vite configuration
```

---

## 🚀 Getting Started

### Prerequisites
- [Node.js](https://nodejs.org/) (v18 or higher recommended)
- [npm](https://www.npmjs.com/)

### 1. Install Dependencies
```bash
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
