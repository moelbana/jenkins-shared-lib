def build() {
    def mvnHome = tool name: 'mvn-3-5-4', type: 'hudson.tasks.Maven$MavenInstallation'
    sh "${mvnHome}/bin/mvn clean package -DskipTests"
}

def test() {
    def mvnHome = tool name: 'mvn-3-5-4', type: 'hudson.tasks.Maven$MavenInstallation'
    sh "${mvnHome}/bin/mvn test"
}
