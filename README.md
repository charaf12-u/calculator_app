# Calculator App 📱

![Calculator Banner](./calculator_app.png)

A modern, high-performance Android calculator application built with Kotlin. This app provides a seamless mathematical experience with real-time expression evaluation and a sleek, user-friendly interface.

## ✨ Features

- **Real-time Evaluation**: Get instant results as you type your mathematical expressions.
- **Advanced Math Support**: Supports basic arithmetic, percentages, and complex expressions with parentheses.
- **Dynamic Context Menu**: Intelligent long-press actions for bracket selection.
- **Dark Mode UI**: A premium, high-contrast dark aesthetic for comfortable use in any lighting condition.
- **Responsive Grid**: Efficient layout design that adapts perfectly to various screen sizes.

## 🛠️ Tech Stack

- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Framework**: Native Android (XML Layouts)
- **Expression Engine**: [exp4j](https://www.objecthunter.net/exp4j/) (Lightweight mathematical expression evaluator)
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)

## 🚀 Getting Started

### Prerequisites

- Android Studio Koala | 2024.1.1 or newer
- JDK 17
- Android SDK 34+

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/Calculator.git
   ```
2. **Open in Android Studio**:
   - File -> Open -> Select the `Calculator` folder.
3. **Build and Run**:
   - Select your device/emulator and click the **Run** button.

## 📁 Project Structure

```text
app/
├── src/main/java/com/example/calculator/
│   └── MainActivity.kt       # Main logic and event handling
├── src/main/res/layout/
│   └── activity_main.xml     # Modern UI design
└── build.gradle.kts          # Dependencies and configurations
```

## 📸 Screenshots

| Main Screen | Context Menu |
| :---: | :---: |
| ![Screen 1](./screenshots/main.png) | ![Screen 2](./screenshots/menu.png) |
*Note: Please add your screenshots to the `/screenshots` directory.*

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
Developed with ❤️ by [Your Name/Handle]
