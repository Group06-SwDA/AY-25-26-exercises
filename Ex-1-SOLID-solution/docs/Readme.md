## SOLID - Exercise 1

What you need in your computer: 

- JDK (e.g., [https://openjdk.org/](https://openjdk.org/));
- Maven ([https://maven.apache.org/](https://maven.apache.org/));
- Visual Studio code with the extension Pack for Java ([https://code.visualstudio.com/docs/languages/java](https://code.visualstudio.com/docs/languages/java))
- Optional: 
  - Graphivz for lcoal UML generation support ([https://graphviz.org/]())
  - UMLPlant plugin `jebbs.plantuml `



**Goals of Exercise 1:**

- **[Goal 1]** Understand Solid violations.
- **[Goal 2]** Refactor the code to make it SOLID-compliant.

**Steps:**

- **[Step1]** For each design principle, check the Java classes inside package "_<design\_principle\_name>.violation_" (e.g., "_srp.violation_") and understand why the corresponding principle is violated. You can generate UML to support your analysis, either manually with VS code plugins (_PlantUML_ for UML generation and _UML Generator for Java_ for UML preview), or automatically with Maven pipeline.

  - **[Step 1a] UML class diagram, manual generation.** Install plugins _PlantUML_ for UML generation and _UML Generator for Java_ for UML preview. 
  - **[Step 1b] UML class diagram, automatic generation.** Check the file `pom.xml` at the project's root. Run, either from command line or from VS code interface, `mvn clean` , `mvn compile` , `mvn site` exactly in this order. You can also combine them in a unique command: `mvn clean compile site`. 


- **[Step2]** Then, create package "_<design\_principle\_name>.compliant_" (e.g., "_srp.compliant_") and refactor the Java classes there so that the solution is compliant to the design principle. Generate again UML class diagrams and compare them with previous version. If you use the automatic version, you can add packages and files by changing the `de.elnarion.maven` plugin configuration, as in the following examples:

```
 <scanPackages> 
              <scanPackage>solid.dip.violation</scanPackage>
              <scanPackage>solid.dip.compliant</scanPackage>
 </scanPackages> 
```

```
<scanPackages>
  <scanPackage>solid.dip</scanPackage>
</scanPackages>
<includeFiles>
  <includeFile>${project.basedir}/src/main/java/solid/isp/violation/Car.java</includeFile>
</includeFiles>
```

It is recommended that you follow this order: SRP, OCP, LSP, ISP, DIP.

