def call(String project, String imageTag, String hubUser){
    ssh """
        docker build -t ${hubUser}/${project} .
        docker image tag ${hubUser}/${project}  ${hubUser}/${project}:${imageTag}
        docker image tag ${hubUser}/${project}  ${hubUser}/${project}:latest

    """
}