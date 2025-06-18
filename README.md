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
- JUnit 
- Page Object Model (POM)
- ECucumber HTML Reports

---

## 📁 Project Structure

![image](https://github.com/user-attachments/assets/553fe233-c5fb-40e6-8c9a-70f846653e11)



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

## 📄 Feature Files

1. `register.feature` – User registration scenarios *(can be ignored)*
2. `login.feature` – Login and logout scenarios *(can be ignored)*
3. `fullflow.feature` – End-to-end scenarios including registration and login

---

## 📊 Reports

After execution, detailed reports are generated in the `/target/cucumber-reports/` directory:

- `report.html` – Interactive test report
- `cucumber.json` – JSON formatted results
- `Magento_Test_Cases.xlsx` – Manual test case documentation
