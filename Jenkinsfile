// Scripted pipeline (Experiment 6, part B), read from the repository by
// 'Pipeline script from SCM': one stage per Maven goal.
node {
    def mvnHome = tool 'Maven3'          // names from Manage Jenkins > Tools
    def javaHome = tool 'JDK25'
    withEnv(["JAVA_HOME=${javaHome}", "PATH+JAVA=${javaHome}/bin", "PATH+MAVEN=${mvnHome}/bin"]) {
        stage('Checkout') { checkout scm }
        stage('Clean')    { sh 'mvn -B clean' }
        stage('Validate') { sh 'mvn -B validate' }
        stage('Compile')  { sh 'mvn -B compile' }
        stage('Test')     { sh 'mvn -B test' }
        stage('Package')  { sh 'mvn -B package' }
        stage('Verify')   { sh 'mvn -B verify' }
        stage('Install')  { sh 'mvn -B install' }
        stage('Site')     { sh 'mvn -B site' }
        stage('Deploy')   { sh 'mvn -B deploy' }
    }
}
