def call(String project, String imageTag, String hubUser){
    sh """
        trivy image tag ${hubUser}/${project}  ${hubUser}/${project}:latest > scan.txt     
    """
}
