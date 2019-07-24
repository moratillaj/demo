
pipeline {
    agent any
    stages {
        stage ('Clone') {
            steps {
                git branch: 'master', url: "https://github.com/moratillaj/demo.git"
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Deploy') {
            steps {
                sh 'cp target/demo-0.0.1-SNAPSHOT.jar $HOME/mystuff/sw-projects/deploy'
            }
        }
    }
}