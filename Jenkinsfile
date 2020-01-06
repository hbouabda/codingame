pipeline {
   agent any

   stages {
      stage('Compile') {
         steps {
            // Get some code from a GitHub repository
            sh 'mvn compile'
            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }
      }
      
      stage('JUnit') {
         steps {
            // Get some code from a GitHub repository
            sh 'mvn test'
            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }
      }
      
      stage('Quality-Gate') {
         steps {
            // Get some code from a GitHub repository
            sh 'mvn deploy'
            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }
      }
   }
}