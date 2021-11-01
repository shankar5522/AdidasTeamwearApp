# AdidasTeamwearApp.
Here in this framework we only search the product via mobile-based application and give some review comments.  

# Build Info.
##### As per the current build, 
- Only users can able to navigate to the particular product and can give the review but are unable to submitting the review. Hence, automation for submit and verifying the review comments can be possible in the next build.

# Limitation or Future Enhancement.
- Currently, framework supports only Mobile based applications.
- We can pass data either via TestNG parameters or excel. 
- Does not implement any mechanism for taking screenshots.
- Able to enhance the framework using Page Object Model [POM].

# Pending.
- Automation for saving & verifying review comments.
- API Automation Testing via Rest Assured.

# Prerequisites.
Below are the few packages/ software should install in your system before running the scenarios.
- Eclipse IDE or any suitable IDE's
- Java
- Maven 
- TestNg Plugin
- Docker

# Built With.
- The Automation framework has been designed in Java Language using Maven.

# Installation.
Below are the steps that we need to follow in order to run the project
- [Clone](https://github.com/shankar5522/AdidasTeamwearApp.git) the project into you local system (i.e. into your         eclipse IDE or any other IDE)
- Navigate to **testng.xml** file and Right-click on **testng.xml** file then Select **Run as TestNG Suite.**

# For Functional Testing Evidence follows the below path.
	Take a clone -> FunctionalTestingEvidence folder
##### Few points need to assume/ take into consideration.
- All the cases are covered based on the current shared build. Any other functionality are considered a new build.
- For failed/ Blocked cases, we can raise a defect on ALM or Jira, or any-other bug tracking tool.
- Cases cover only from the functionality point of view as per the current shared build.
- Possible some API Testing related to other negative scenarios.
- Possible some automation API Testing for the identified scenarios.
- Unable to hit any API's via postman, even docker service is up & running. Need more info. But achieved same via swagger.

# Author.
  - Shankar Gupta
  **[GitHub profile](https://github.com/shankar5522)** || **[LinkedIn profile](https://www.linkedin.com/in/shankarlal-gupta/)**
  
# License.
No License is required.