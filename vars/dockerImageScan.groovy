def call(String imageName, String hubUser){
    sh """
        trivy image tag ${hubUser}/${imageName}  ${hubUser}/${imageName}:latest > scan.txt cat scan.txt
    """
}
