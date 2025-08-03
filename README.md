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

## 🔍 OWASP ZAP Scan Findings

### 1. Incomplete or No Cache-control Header

- **Risk**: Medium
- **Description**: The application does not set proper cache control headers, which can allow sensitive information to be cached.
- **Remediation**: Add appropriate `Cache-Control: no-store` headers to sensitive pages.

### 2. Cookie Without Secure Flag

- **Risk**: Medium
- **Description**: Session cookies are transmitted over HTTP and are not marked secure.
- **Remediation**: Ensure cookies have the `Secure` and `HttpOnly` flags set.

### 3. X-Frame-Options Header Not Set

- **Risk**: Low
- **Description**: Clickjacking protection header missing.
- **Remediation**: Add `X-Frame-Options: DENY` or `SAMEORIGIN` to all responses.

### 4. Cross-Domain JavaScript Source

- **Risk**: Low
- **Description**: JS is being loaded from a different origin.
- **Remediation**: Use trusted domains only and implement Subresource Integrity (SRI).

## ✅ Remediation Plan

| Finding                        | Risk   | Remediation                            | Status    |
| ------------------------------ | ------ | -------------------------------------- | --------- |
| No Cache-Control Header        | Medium | Add `Cache-Control: no-store`          | Pending   |
| Cookie Without Secure Flag     | Medium | Use `Secure` and `HttpOnly` attributes | Pending   |
| X-Frame-Options Header Missing | Low    | Add `X-Frame-Options: DENY`            | Done      |
| Cross-Domain JavaScript Source | Low    | Apply Subresource Integrity (SRI)      | In Review |

## 📄 ZAP Report Access

All reports are available in the GitHub Actions artifact section or in the `/zap-report` directory.
