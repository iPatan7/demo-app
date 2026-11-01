// Scripted pipeline (Experiment 6, part B): Jenkins reads this file from the
// repository ("Pipeline script from SCM") and runs each of the 9 Maven goals
// as its own stage.
node {
    // Tool names as configured under Manage Jenkins > Tools.
    def mvnHome = tool 'Maven3'
    def javaHome = tool 'JDK25'

    withEnv(["JAVA_HOME=${javaHome}", "PATH+JAVA=${javaHome}/bin", "PATH+MAVEN=${mvnHome}/bin"]) {
        stage('Checkout') {
            checkout scm
        }
        stage('Clean') {
            sh 'mvn -B clean'
        }
        stage('Validate') {
            sh 'mvn -B validate'
        }
        stage('Compile') {
            sh 'mvn -B compile'
        }
        stage('Test') {
            sh 'mvn -B test'
        }
        stage('Package') {
            sh 'mvn -B package'
        }
        stage('Verify') {
            sh 'mvn -B verify'
        }
        stage('Install') {
            sh 'mvn -B install'
        }
        stage('Site') {
            sh 'mvn -B site'
        }
        stage('Deploy') {
            sh 'mvn -B deploy'
        }
    }
}
