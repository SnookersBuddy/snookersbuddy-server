root := justfile_directory()
app_dir := join(root, "test-application-be")
docker_dir := join(root, "docker")

prepare-dev:
    echo "[SS/DEV] Starting Docker development environment"
    docker-compose -f {{docker_dir}}/docker-compose.dev.yml up -d

# Runs the application on host, using Docker to handle dependencies.
run-local: prepare-dev
    echo "[SS/DEV] Starting Spring server"
    cd {{app_dir}}; {{app_dir}}/mvnw spring-boot:run -f {{app_dir}}/pom.xml

# Build and runs the application completly containerized.
run-cont:
    echo "[SS] Starting application containerized"
    docker-compose -f {{docker_dir}}/docker-compose.dev.yml -f {{docker_dir}}/docker-compose.yml up --build

# Stops all docker containers potentially running
stop-env:
    echo "[SS] Stopping all containers"
    docker-compose -f {{docker_dir}}/docker-compose.dev.yml -f {{docker_dir}}/docker-compose.yml down

