# 🏋️‍♂️ WahooFitnessProjectPOM

Automated testing framework for **Wahoo Fitness** web application using **Page Object Model (POM)**, **Selenium**, **TestNG**, **Cucumber (BDD)**, and **Excel (Apache POI)** for data-driven testing.  

## 🚀 Tech Stack
- **Java 17**
- **Selenium WebDriver**
- **TestNG**
- **Cucumber (BDD)**
- **Apache POI** (Excel read/write for test data)
- **Maven**
- **GitHub Actions CI**

---

## 📂 Project Structure



```
  WahooFitnessProjectPOM/
│── data/ # Test data (Excel files)
│── Features/ # Cucumber feature files
│── reports/ # Test reports (generated after run)
│── src/
│ ├── main/java/
│ │ ├── lib/ # Utility classes (ExcelReader, etc.)
│ │ ├── Model/ # Page element definitions
│ │ └── Page/ # Page logic and actions
│ └── test/java/
│ ├── Test/ # TestNG test cases
│ ├── runner/ # TestNG+Cucumber runner
│ └── steps/ # Cucumber step definitions
│── pom.xml # Maven dependencies
│── testng.xml # TestNG suite configuration

```


---


## 🧪 Features
- Page Object Model for maintainability
- Cucumber BDD scenarios with step definitions
- Data-driven tests using Excel
- Positive, Negative, and Boundary test cases
- GitHub Actions CI/CD pipeline

---


## ▶️ Running Tests

  # Run all tests via TestNG
  
    ```
      mvn clean test -DsuiteXmlFile=testng.xml
    ```

  # Run Cucumber features

    ```
      mvn test -Dcucumber.options="classpath:Features/Wahoo.feature"
    ```


## 📊 Reports

  HTML/Extent reports generated in reports/

  TestNG default reports generated in test-output/



---
