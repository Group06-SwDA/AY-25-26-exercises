# SOLID - Exercise 2 - Payroll Management System

##Goals of Exercise 2

- **[Goal 1]** Identify SOLID violations inside a system.
- **[Goal 2]** Refactor the system classes to make it SOLID-compliant.

##Steps:

- **[Step 1]  Understand the system**. 
The Payroll Management System is used to calculate the salary for different employees in a University. Draw UML classes: do it first manually with VS code plugins, then automatically with Maven pipeline.

  - **[Step 1a] UML class diagram, manual generation.** Install plugins _PlantUML_ for UML generation and _UML Generator for Java_ for UML preview. 
  - **[Step 1b] UML class diagram, automatic generation.** Check the file _pom.xml_" at the project's root. Run, either from command line or from VS code interface, "_mvn clean_" , "_mvn compile_" , "_mvn site_" exactly in this order. You can also combine them in a unique command: "_mvn clean compile site_". 

- **[Step 2] Identify SOLID design principles violations.** 
  Analyse the generated UML classes: the problems in the design occur if the requirements are changed. Suppose we change the requirement as follows:

    - There should be an additional +1% tax (on the total gross income) for those employees whose gross salary is more than 750000 per year.
    - We need to add one more employee "Researcher" who will get 2000 gross per month.
  
- **[Step 3] Refactor the code to make it SOLID-compliant**. 
    - **[3.1]** Copy and paste the current project (run "_mvn clean_" before doing that, to be sure that all automatically generated files are deleted).
    - **[3.2]** For each identified SOLID violations, make all necessary modifications in the source code, including implementing the requirements' changes.
    - **[3.3]** Modify tests to be sure that the behavior of the code is correct  after refactoring(including tests for the new requirements). Is the structure of tests the same after refactoring? 
    - **[3.4]** Generate UML class diagrams and check for differences with the previous version.
