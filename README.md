## Updates
- Updated SonarQube configuration
- Added Jenkinsfile with 4 pipeline stages
<div align="center">

# 🚀 CI/CD Pipeline Automation

### Automated Build & Deployment Pipeline for Java Web Applications



![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white)




![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)




![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)




![SonarQube](https://img.shields.io/badge/SonarQube-4E9BCD?style=for-the-badge&logo=sonarqube&logoColor=white)




![Linux](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)




![AWS](https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white)



</div>

---

## 📌 Project Overview
A complete CI/CD pipeline that automates the build, test,
code quality check, and deployment of a Java web application.

---

## 🔄 Pipeline Flow
GitHub → Jenkins → Maven Build → SonarQube → Docker → Tomcat
---

## 🛠️ Tech Stack
| Tool | Purpose |
|------|---------|
| ⚙️ Jenkins | CI/CD automation and orchestration |
| 📦 Maven | Build tool and dependency management |
| 🔍 SonarQube | Code quality and security analysis |
| 🐳 Docker | Application containerization |
| 🚀 Tomcat | Web application server |
| 🐙 GitHub | Source code version control |
| 🐧 Linux | Host operating system |

---

## 📁 Project Structure
CI-CD-pipeline-project/
├── Jenkinsfile        # Pipeline definition
├── Dockerfile         # Docker image config
├── pom.xml            # Maven build config
├── src/
│   └── main/java/com/harivasanth/
│       └── HelloServlet.java
└── README.md
---

## 🚀 How to Run
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
5. App accessible at `http://localhost:8090`

---

## 👨‍💻 Author
**Harivasanth Arava**

📧 hariarava41@gmail.com
🔗 [LinkedIn](https://linkedin.com/in/harivasanth-arava)
🎓 MCA Cloud Computing — Jain University, Bengaluru
