def build() {
    echo "Running Maven build..."
    sh "mvn clean package -DskipTests"
}

def test() {
    echo "Running Maven tests..."
    sh "mvn test"
}
