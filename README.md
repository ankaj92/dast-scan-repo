# Fake Store - Vulnerable Java Spring Boot App

This project simulates a vulnerable eCommerce platform built with Spring Boot, designed for educational purposes to perform Dynamic Application Security Testing (DAST) using OWASP ZAP.

## 🔧 Tech Stack
- Java 17
- Spring Boot
- Gradle
- Thymeleaf
- OWASP ZAP (DAST)
- GitHub Actions (CI)

## 📸 Screenshots

### App Home Page
![Fake Store Home Page](screenshots/app_home.png)

### GitHub Actions - ZAP Scan
![ZAP Scan in GitHub Actions](screenshots/zap_pipeline_success.png)

## 🧪 DAST with OWASP ZAP

A GitHub Actions workflow was implemented using the `zaproxy/zap-stable` Docker image to scan the running app.

### 🔁 CI Workflow Summary
- Checkout code
- Grant permission to Gradle wrapper
- Start Spring Boot app
- Set up report directory
- Run ZAP baseline scan
- Upload ZAP report artifact

### 🔍 Scan Report

Reports are saved as artifacts in the GitHub Actions workflow and include:
- `index.html`
- `report.json`
- `zap.log`

## 📁 Directory Structure

```
src/main/resources/static/img/
├── bag1.jpg
├── headphone1.jpg
└── shoe1.jpg
```

## 🧷 Purpose

This project helps demonstrate:
- DAST integration in CI/CD pipeline
- Vulnerability discovery using OWASP ZAP
- Secure DevOps (DevSecOps) practices

## 📄 License

MIT License
