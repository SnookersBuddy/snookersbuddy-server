# Docker instructions

The provided docker-compose files stack.

## Develop on host
Simply run `docker-compose -f docker-compose.dev.yml up -d` and start the application via your IDE.
The port of the container can be found inside die docker-compose file but is set to a reasonable default: *25432*.

## Develop in container
If you want to compile and test the application completely inside Docker, you have to stack the files:
```shell
docker-compose -f docker-compose.dev.yml -f docker-compose.yml up
```

Everytime you make the changes to the source, you'll have to restart that command.
Because only VSCode properly supports devcontainers, remove debugging in the container is not configured.
