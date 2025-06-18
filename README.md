# IncubyteAssesmentTask
Automate creating an account on the website https://magento.softwaretestingboard.com/ and signing in with that account.


# Magento Automation Testing Framework

This project is an automated testing framework built using **Java**, **Selenium WebDriver**, **Cucumber (BDD)**, and the **Page Object Model (POM)** design pattern to test user registration, login, and end-to-end flows on [Magento Practice Website](https://magento.softwaretestingboard.com).

---

## 🛠️ Technologies Used

- Java 8
- Maven
- Selenium WebDriver
- Cucumber (BDD)
- JUnit / TestNG (Optional)
- Page Object Model (POM)
- Extent/Cucumber HTML Reports

---

## 📁 Project Structure

incubyteAID/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com.magento.pages/ # Page classes (POM)
│ │ └── com.magento.steps/ # Step definitions
│ │ └── com.magento.utils/ # Utility classes
│ └── resources/
│ └── features/ # Feature files
├── src/test/java/
│ └── com.magento.runners/ # TestRunner class
├── target/ # Compiled files & reports
│ └── cucumber-reports/ # HTML/JSON reports
├── pom.xml # Maven configuration
├── Magento_Test_Cases.xlsx # Manual test cases
└── README.md # Project documentation



---

## ✅ How to Run the Tests

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/incubyteAID.git
   cd incubyteAID
2. **Import into Eclipse or IntelliJ**
3. **Build the project using Maven**
4. **Run Cucumber Tests:**
   Right-click on TestRunner.java and select Run As → JUnit Test

📄 Feature Files
register.feature: User registration scenarios

login.feature: Login and logout scenarios

fullflow.feature: End-to-end scenarios including registration and login

📊 Reports
After execution, detailed reports are generated in the /target/cucumber-reports/ directory:

report.html: Interactive test report

cucumber.json: JSON formatted results

Magento_Test_Cases.xlsx: Manual test case documentation
