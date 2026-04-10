# CI-CD-pipeline-project
CI/CD Pipeline Automation using Jenkins, Maven, SonarQube, Docker and Tomcat. Automated build and deployment pipeline for Java web application on Linux environment.

# CI/CD Pipeline Automation using Jenkins and Maven

## Project Overview
A complete CI/CD pipeline that automates the build,
test, code quality check, and deployment of a 
Java web application.

## Pipeline Flow
GitHub → Jenkins → Maven Build → SonarQube → Docker → Tomcat

## Tech Stack
| Tool | Purpose |
|------|---------|
| GitHub | Source code version control |
| Jenkins | CI/CD automation and orchestration |
| Maven | Build tool and dependency management |
| SonarQube | Code quality and security analysis |
| Docker | Application containerization |
| Apache Tomcat | Web application server |
| Linux Ubuntu | Host operating system |

## Project Structure
cicd-pipeline-project/
├── Jenkinsfile
├── Dockerfile
├── pom.xml
├── src/main/java/com/harivasanth/
│   └── HelloServlet.java
└── README.md
## How to Run
### Prerequisites
- Jenkins installed and running
- Maven configured in Jenkins
- Docker installed
- SonarQube running on port 9000

### Steps
1. Clone this repository
2. Create new Jenkins pipeline job
3. Point it to this repository
4. Jenkins runs Jenkinsfile automatically
5. App accessible at http://localhost:8090

## Author
**Harivasanth Arava**
- MCA Cloud Computing — Jain University, Bengaluru
- Email: hariarava41@gmail.com
- LinkedIn: linkedin.com/in/harivasanth

Author
Harivasanth Arava
MCA Cloud Computing — Jain University, Bengaluru
Email: hariarava41@gmail.com
LinkedIn: linkedin.com/in/harivasanth-arava
