# WahooFitnessProjectPOM

Hybrid automation framework for the **Wahoo Fitness** web app using **Page Object Model (POM)**, **Selenium**, **TestNG**, **Cucumber (BDD)**, and **Apache POI** for Excel data-driven tests.

## Tech
- Java 11, Maven
- Selenium WebDriver
- TestNG
- Cucumber (Gherkin)
- Apache POI (Excel)
- GitHub Actions (CI)

## Structure
```
WahooFitnessProjectPOM/
├── pom.xml
├── testng.xml
├── Features/
├── data/               # Wahoo.xlsx
├── src/
│   ├── main/java/
│   │   ├── Page/
│   │   ├── Model/
│   │   └── lib/        # ExcelReader.java
│   └── test/java/
│       ├── Test/
│       └── steps/
└── .github/workflows/maven.yml
```

## Run
```bash
mvn clean test
```
Reports appear under `test-output/` (local). CI artifacts are uploaded by GitHub Actions.
