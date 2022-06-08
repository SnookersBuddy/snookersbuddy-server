# SnookersSellsBE

## Development

To ease the development without an IDE or systems without
a proper Java installation, we utilize [Just](https://github.com/casey/just) to provide run config/recipes.

### Start app with host Java installation

```shell
just run-local
```
This will start the necessary dependencies (database etc.) before starting the application via maven.


### Build and start app inside a container

```shell
just run-cont
```
This will build the Dockerfile and start the application inside Docker.


### Start database for development via IDE

```shell
just prepare-dev
```
This will simply run the necessary dependencies for the application
to be able to start.

After that you can simply compile and start the application via e.g. IntelliJ.


### Usage without Just

Simply open the *justfile* and copy the command and paste it into your terminal.
If you want to fully utilize your IDE, you can do something like this in Intellij:

1. Right-click on *docker-compose.dev.yml*.
2. Choose *Run 'docker-compose.dev.yml'*.
3. Next time you start IntelliJ, you will find this under your run configurations.


## Architecture

This project loosely follows DDD tactical patterns and is oriented towards a hexagonal architecture.
Inside any of the following folders, subpackages will be grouped by their use case / domain model.

### Application

Entrypoint for the ports to the domain. Usually, controller speak to just services inside the application layer.
Everything in there is basically a Spring Service.

### Domain (Model)

The domain package is only concerned about domain logic.

### Infrastructure

Everything that is needed for the application to run but is not part of the domain model is put here.
Infrastructure concerns can be interfaces that talk to external services (email, rest clients, ...) or simply 
configuration files for Spring.

### Ports

Define ways in and out of the application. Subpackages usually denote the protocol that is used (rest, websocket, 
grcp, ...).
