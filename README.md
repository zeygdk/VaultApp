# 🔐 VaultApp

A privacy-focused Android vault app for keeping **notes** and **photos** away from prying eyes. Everything sits behind a **biometric / password** screen and stored locally on the device.

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white)
![Room](https://img.shields.io/badge/Room-3DDC84?style=flat-square&logo=android&logoColor=white)
![Hilt](https://img.shields.io/badge/Hilt-3DDC84?style=flat-square&logo=android&logoColor=white)

## ✨ Features

- **Biometric authentication** with fingerprint or face unlock (AndroidX Biometric), plus a password fallback
- **Secure notes**: create, edit and delete private notes
- **Hidden photo albums**: create albums and add photos stored in the app's private database
- Onboarding flow on first launch

## 🏗️ Architecture

**MVVM + Repository pattern**, single-activity with Fragments and the Navigation Component.

```
├── data        # Room entities (Note, Album, Photo), DAOs, AppDatabase
├── repository  # NoteRepository, AlbumRepository, PhotoRepository
├── viewmodel   # NoteViewModel, AlbumViewModel
├── di          # Hilt modules
└── ui          # Biometric, Password, Home, Notes, Albums fragments
```

## 🛠️ Tech Stack

| Category | Libraries |
|---|---|
| UI | Fragments, Navigation Component, RecyclerView, CardView, Material Components |
| Security | AndroidX Biometric |
| Persistence | Room |
| DI | Dagger Hilt |
| Async | Kotlin Coroutines, LiveData, ViewModel |

## 🗺️ Roadmap

- [ ] In-app private browser (screen scaffolded)

## 🚀 Getting Started

Clone the repo, open it in Android Studio and run it on a device with biometric hardware for the full experience.
