pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'Maven_3_5_2') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'Maven_3_5_2') {
                    sh 'mvn test'
                }
            }
        }

        stage ('Deploy') {

               steps {
                    withMaven(maven: 'Maven_3_5_2' ) {
                         sh 'mvn deploy'
                     }
              }

         }
    }
}