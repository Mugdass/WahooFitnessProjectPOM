# 🏃‍♂️ WahooFitnessProjectPOM  

Data-Driven Hybrid Automation Framework for testing the **Wahoo Fitness** web application.  
Implements **Page Object Model (POM)** with **Selenium, TestNG, Cucumber (BDD), and Apache POI** for Excel-driven tests.  

Includes **customized XPaths, reusable utilities, reporting, and CI/CD integration**.  

---

## 📌 Features
- ✅ Page Object Model (POM) structure for maintainability  
- ✅ **Cucumber BDD** (Gherkin + Step Definitions + Runner)  
- ✅ **Data-Driven Testing** using Excel (Apache POI)  
- ✅ **TestNG** for execution and reporting  
- ✅ **Customized XPaths** for robust locators  
- ✅ **Cross-browser testing** with WebDriverManager  
- ✅ **Reports**: TestNG HTML + Allure/Extent reports  
- ✅ **CI/CD Ready**: GitHub Actions workflow for Maven builds  

---

## 📂 Project Structure


```
  WahoofitnessProjectPOM/
├── pom.xml # Maven dependencies
├── testng.xml # TestNG suite configuration
├── Features/ # Gherkin feature files
│ └── Wahoo.feature
├── src/ (main Java code via target/classes)
│ ├── Page/ # Page Object classes
│ ├── Model/ # Model classes
│ └── lib/ # Utilities (ExcelReader, helpers)
├── target/
│ ├── test-classes/
│ │ ├── Test/ # Test cases
│ │ └── steps/ # Cucumber Step Definitions + Runner
│ └── report/ # Reports (HTML/JSON)
├── test-output/ # TestNG generated reports
│ ├── emailable-report.html
│ ├── testng-results.xml
│ └── junitreports/
└── drivers/ # Browser drivers (if local execution)


```
---

## ⚙️ Tech Stack
- **Java 11+**  
- **Selenium WebDriver**  
- **Cucumber (BDD, Gherkin)**  
- **TestNG**  
- **Apache POI (Excel Data)**  
- **Maven** (Build/Dependencies)  
- **Allure / Extent Reports**  
- **GitHub Actions CI/CD**  

---



## 🚀 Getting Started

### 🔹 Prerequisites
- Install **Java 11+**
- Install **Maven**
- Clone this repository:
  ```bash
  git clone https://github.com/yourusername/WahooFitnessProjectPOM.git
  cd WahooFitnessProjectPOM


___


## 🔹 Run Tests with Maven

  ```
    mvn clean test

  ```


## 🔹 Run with TestNG

  ```
    mvn test -DsuiteXmlFile=testng.xml

  ```


## 🔹 Run Cucumber Features

  ```
      mvn test -Dcucumber.options="--tags @Regression"

  ```


---




## 📊 Reports

  TestNG Reports → test-output/emailable-report.html

  Allure Reports (if enabled) →

  ```
      mvn allure:serve
  ```


___


## 📌 CI/CD (GitHub Actions)

 This project includes a workflow file:

  ```
    .github/workflows/maven.yml
  ```

  It runs tests automatically on every push/pull request.


  ---
    
