# Brycklenvue
With this project, I aimed to make a student management system similar to the one used by school districts to manage students and courses.
Right now, the system is built on **Maven** and currently has a CRUD database that is used to create, read, update, and delete students/courses.

Technologies used:
- Apache Maven (using Spring Initializr)
- Spring Boot
- Thymeleaf
- JPA/H2 Database
- HTML/CSS/Bootstrap

Files of importance:
- pom.xml (Dependencies and metadata)
---
- Folders/files in src/main/java
![](main-files.JPG?)
---
- Folders/files in src/main/resources
![](design-and-configuration-files.JPG)

# Getting Started

1. Download Spring Tool Suite for Eclipse (https://spring.io/tools) and download/unzip the zip file for this project
2. Run the downloaded file and open SpringToolSuite4.exe
3. Set workspace directory to whatever you want it to be
4. On the center left of the application window, select "Import Projects", click on the Maven Folder, then select "Existing Maven Projects" before clicking next
5. CLick "Browse..." and select the **unzipped** folder for the application
6. Press "Finish"

IMPORTANT: Start at localhost:7890 and go from there (no login info is needed for login page; just click "Sign in"); the navigation bar at the top has both pages (students and courses)
---

# Bugs
- Courses not appearing on Courses page but inputted courses appear in H2 console.
- Many-to-Many relationship database (COURSE_REGISTRATION) is glitching too much to make it pragmatic to implement
- No input sanitization, leading to error pages when submitting wrong types into fields (entering String into form field made for int, etc.)
