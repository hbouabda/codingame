pipeline {
   agent any

   options {
        skipStagesAfterUnstable()
    }
	
   stages {
      stage('Compile') {
         steps {
            // Get some code from a GitHub repository
            bat 'mvn compile'
            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }
      }
      
      stage('JUnit') {
         steps {
            // Get some code from a GitHub repository
            bat 'mvn test'
            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }
      }
   }
   
   post {
        always {
            echo 'This will always run'
        }
        success {
			archiveArtifacts(artifacts: '**/target/*.jar', allowEmptyArchive: true)
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}