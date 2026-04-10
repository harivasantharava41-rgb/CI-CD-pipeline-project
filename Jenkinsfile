pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    environment {
        DOCKER_IMAGE = 'myapp:latest'
        TOMCAT_URL   = 'http://localhost:8080'
    }

    stages {

        stage('Clone Repository') {
            steps {
                echo '📥 Cloning source code from GitHub...'
                git branch: 'main', url: 'https://github.com/YOUR_USERNAME/cicd-pipeline-project.git'
            }
        }

        stage('Build with Maven') {
            steps {
                echo '📦 Building application with Maven...'
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                echo '🔍 Running SonarQube code quality analysis...'
                sh '''
                    mvn sonar:sonar \
                      -Dsonar.projectKey=myapp \
                      -Dsonar.host.url=http://localhost:9000 \
                      -Dsonar.login=your_sonar_token
                '''
            }
        }

        stage('Build Docker Image') {
            steps {
                echo '🐳 Building Docker image...'
                sh 'docker build -t ${DOCKER_IMAGE} .'
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                echo '🚀 Deploying to Tomcat...'
                sh '''
                    docker stop myapp-container || true
                    docker rm myapp-container || true
                    docker run -d --name myapp-container -p 8090:8080 ${DOCKER_IMAGE}
                '''
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline completed! Application deployed.'
        }
        failure {
            echo '❌ Pipeline failed. Check the logs.'
        }
    }
}
