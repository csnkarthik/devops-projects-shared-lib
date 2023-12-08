def call(String project, String hubUser){
    sh """
        trivy image tag ${hubUser}/${project}  ${hubUser}/${project}:latest > scan.txt cat scan.txt
    """
}
