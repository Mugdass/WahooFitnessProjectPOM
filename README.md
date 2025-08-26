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
