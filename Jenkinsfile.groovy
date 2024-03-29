pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven-3"
        jdk "jdk-17"
    }

    stages {
        stage('Clean') {
            steps {
                cleanWs()
            }
        }
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'master', url: 'https://github.com/Angiz/pl.sii.ZTA052021.git'
            }
        }
        stage('Build') {
            //when {
            //    not {
            //        changelog '.*^\\[ci skip\\] .+$'
            //    }
            //}
            steps {
                // Run Maven on a Unix agent.
                scmSkip(deleteBuild: true, skipPattern:'.*\\[ci skip\\].*')
                sh "mvn -Dmaven.test.failure.ignore=true clean verify"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
                // false change
            }
        }
    }
    post {
        // If Maven was able to run the tests, even if some of the test
        // failed, record the test results and archive the jar file.
        success {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'target/*.jar'
            slackSend(color: 'good', message:
                    """Build success!
                    BUILD_TAG: ${BUILD_TAG} 
                    BUILD_URL: ${BUILD_URL}""")
        }
        failure {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'target/*.jar'
            slackSend(color: 'bad', message:
                    """Build failed!
                    BUILD_TAG: ${BUILD_TAG} 
                    BUILD_URL: ${BUILD_URL}""")
        }
    }
}