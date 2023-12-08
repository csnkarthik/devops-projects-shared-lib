def call(String imageName, String hubUser){
    sh """
        trivy image ${hubUser}/${imageName}:latest > scan.txt 
        cat scan.txt
    """
}
