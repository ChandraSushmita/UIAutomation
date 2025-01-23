# eBay Automation Framework

## Overview

This is a Selenium-based automation framework designed to automate workflows on the eBay website. The framework is built using Java, Maven, TestNG, and additional tools like WebDriverManager and ExtentReports.

### Features
- Automated browser testing using Selenium WebDriver.
- Modular framework structure for better scalability and maintainability.
- TestNG for test management and execution.
- ExtentReports for detailed test reporting.
- Supports Chrome browser with WebDriverManager.

---

## Prerequisites

Ensure the following are installed on your system before running the project:

1. **Java**: JDK 8 or higher ([Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html))
2. **Maven**: Apache Maven 3.6+ ([Download Maven](https://maven.apache.org/download.cgi))
3. **Chrome Browser**: Latest version ([Download Chrome](https://www.google.com/chrome/))

---

## Project Structure

```plaintext
ebay-automation-framework/
├── pom.xml                     # Maven dependencies
├── src/main/java/
│   ├── base/
│   │   └── BaseTest.java       # Base test setup
│   ├── pages/
│   │   ├── HomePage.java       # Page object for Home page
│   │   ├── SearchResultsPage.java # Page object for Search Results
│   │   ├── ItemPage.java       # Page object for Item details
│   │   └── CartPage.java       # Page object for Cart
├── src/test/java/
│   ├── tests/
│   │   └── AddToCartTest.java  # Test case for adding an item to the cart
```

---

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/<your-username>/ebay-automation-framework.git
    cd ebay-automation-framework
    ```

2. **Run Maven to install dependencies**:
    ```bash
    mvn clean install
    ```

3. **Execute the tests**:
    ```bash
    mvn test
    ```

---

## Test Scenario Automated

The framework automates the following test scenario on the eBay website:

1. Open the browser and navigate to [eBay](https://www.ebay.com).
2. Search for a product (e.g., `book`).
3. Click on the first product in the search results.
4. Add the product to the cart.
5. Verify the cart count is updated and displays the correct number of items.

---

## Reporting

After running the tests, a detailed HTML report will be generated using ExtentReports. The report will be available under the `test-output` folder.

---

## License

This project is licensed under the MIT License - feel free to modify and distribute.
