root := justfile_directory()
app_dir := join(root, "app")
container_dir := join(root, "docker")
container_cmd := if `whereis podman` =~ "/podman" { "podman" } else { "docker" }

prepare-dev:
    echo "[SS/DEV] Starting Docker development environment"
    {{container_cmd}}-compose -f {{container_dir}}/docker-compose.dev.yml up -d

# Runs the application on host, using Docker or Podman to handle dependencies.
run-local: prepare-dev
    echo "[SS/DEV] Starting Spring server"
    cd {{app_dir}}; {{app_dir}}/mvnw spring-boot:run -f {{app_dir}}/pom.xml

# Build and runs the application completly containerized.
run-cont:
    echo "[SS] Starting application containerized"
    {{container_cmd}}-compose -f {{container_dir}}/docker-compose.dev.yml -f {{container_dir}}/docker-compose.yml up --build

# Stops all docker containers potentially running
stop-env:
    echo "[SS] Stopping all containers"
    {{container_cmd}}-compose -f {{container_dir}}/docker-compose.dev.yml -f {{container_dir}}/docker-compose.yml down

