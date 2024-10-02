
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 870912676422.dkr.ecr.us-east-1.amazonaws.com
docker tag anupamsen/sample-spring-boot-app:0.0.1-SNAPSHOT 870912676422.dkr.ecr.us-east-1.amazonaws.com/quickysoft/sample-spring-boot-app:latest
docker push 870912676422.dkr.ecr.us-east-1.amazonaws.com/quickysoft/sample-spring-boot-app:latest
