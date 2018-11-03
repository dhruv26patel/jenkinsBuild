node {
    // Clean workspace before doing anything
    deleteDir()

    try {
        // stage ('Clone') {
        //     checkout scm
        // }
        tools {
            maven 'Maven_3.5.2' 
        }
        stage ('Build') {
            sh "echo 'shell scripts to build project...'"
            
            steps {
                bat "echo 'mvn'"
            }
        }
        stage ('Tests') {
            parallel 'static': {
                sh "echo 'shell scripts to run static tests...'"
            },
            'unit': {
                sh "echo 'shell scripts to run unit tests...'"
            },
            'integration': {
                sh "echo 'shell scripts to run integration tests...'"
            }
        }
        stage ('Deploy') {
            sh "echo 'shell scripts to deploy to server...'"
        }
    } catch (err) {
        currentBuild.result = 'FAILED'
        throw err
    }
}
