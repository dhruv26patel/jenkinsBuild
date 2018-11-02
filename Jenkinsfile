pipeling {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven: '' ) {
                    sh 'mvn clean compile'
                }
            }

        }

        stage ('Testing Stage') {

               steps {
                   withMaven(maven: '' ) {
                      sh 'mvn test'
                   }
               }

         }

        stage ('Deploy') {

               steps {
                    withMaven(maven: '' ) {
                         sh 'mvn deploy'
                     }
              }

         }

    }

}