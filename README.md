# 📱 Vacation Planner Android App

This is a native Android application designed to help users plan vacations and track associated excursions entirely offline. Built using Java and the Android SDK, it stores all trip data locally using the Room persistence library, allowing full functionality without internet access. The app emphasizes mobile-first design, input validation, and secure local storage, making it ideal for travelers who want to organize trips on the go.

---

## 📌 Project Overview

The goal of this project was to build a fully offline-capable mobile experience that enables users to manage travel plans, excursions, and reminders in one place. By applying modern Android development practices—including ViewModel architecture, Room database integration, and modular UI components—the app delivers a responsive, user-friendly interface while ensuring data integrity and maintainability.

---

## 🧠 Key Skills & Concepts Demonstrated

- Object-Oriented Programming (OOP) in Java  
- Secure authentication with hashed credentials  
- Room database integration for persistent local storage  
- ViewModel and LiveData architecture for UI/data separation  
- Input validation for data reliability  
- XML-based UI design tailored for Android devices  
- Gradle project configuration and modular Android structure  
- Git version control and development in Android Studio  

---

## ⚙️ Technologies Used

- **Language:** Java  
- **Framework:** Android SDK  
- **IDE:** Android Studio  
- **UI:** XML Layouts with Material Design Components  
- **Database:** Room (SQLite)  
- **Build System:** Gradle  
- **Architecture:** MVVM (Model-View-ViewModel)  

---

## ✨ Features

1. **Offline Vacation Planning**  
   Users can create, update, and delete vacation entries and link excursions to each trip without needing internet access.

2. **Secure Login**  
   Simple login system with hashed password verification to protect user data locally.

3. **Excursion Management**  
   Each vacation can include multiple excursions with associated titles, descriptions, and optional date-based reminders.

4. **Robust Input Validation**  
   Built-in validation ensures accurate data entry and helps prevent invalid or conflicting inputs.

5. **Room Database Integration**  
   All data is stored locally in a structured database using Room, allowing fast and persistent access even when offline.

6. **Responsive Mobile UI**  
   Optimized layouts for Android phones using XML and Android UI components, providing a clean and intuitive user experience.

7. **Scalable Codebase**  
   Organized architecture using MVVM and object-oriented design principles for maintainability and feature expansion.

---

## 📦 APK Download

To try the app on your Android device, download the APK from the hosted portfolio page:

👉 [**Download Vacation Planner APK**](https://bobbyh03.github.io/portfolio/MobileVacationPlanner.html)

> 📱 To install: You may need to allow "Unknown Sources" in your device settings.  
> 🔐 Login credentials for demo:  
> **Username:** `admin`  
> **Password:** `password`

---

## 🔒 Notes

All data remains on the user's device. No personal data is transmitted externally. The project does not use cloud services or APIs, making it ideal for privacy-focused users or travelers with limited connectivity.

---

## 🌱 Future Enhancements

- Add cloud backup and sync via Firebase or AWS Amplify  
- Enable calendar integration for excursion reminders  
- Add profile-based multi-user support  
- Refine login with biometric authentication (e.g., fingerprint)
