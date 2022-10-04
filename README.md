# demoblaze
# Pre-requisites


Docker installed
To use mvn outside of project terminal , install maven
Make sure to have Java JDK ( at least version 8 ) installed on the machine and linked to project as project default SDK.

# serenity-bdd


Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, 
with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, 
and API testing using RestAssured.

The project directory structure

The project is built using maven, and follows the standard directory structure used in most Serenity projects:

```
src
  + main
  + test
    + java                        
        + pages                   Page Objects for page manipulation  
        + runners                 Test Runners
        + stepDefinitions         Step definitions for implementating features
        + steps                   Another layer of abstractions Serenity Steps are here 
    + resources
        + assets                  Location to store any assets needed for the reports
        + features                Feature files
       + webdriver               Folder to store webdrivers for local runs/debugs
       logback-test.xml          Configuration file for logs
        serenity.conf             Configuration file for serenity
    docker-compose.yaml           Docker compose file to bring services up to run on dockerized envs.
```

# Grid Hub


http://localhost:4444/grid/admin/live


# Executing the tests

## Run Tests Locally


Make sure the driver you want to use is located in the `resources/webdriver` folder, then just use maven:
`mvn clean verify -Ddriver=firefox`

## Run Tests on docker env:


This framework was built using an architecture that allows to run all tests using Selenium Grid, in a dockerized environment

To run tests in Docker: 
1 . Make sure docker is running in your machine

2 . `docker-compose -f docker-compose-zalenium.yaml up`

3 . `mvn clean verify`

you can inject tags for the reports, and context if needed, also override configurations in `serenity.conf` file
`mvn clean verify -Dcontext=firefox -Dwebdriver.remote.driver=firefox -Dinjected.tags="browser:firefox"`

it is possible to run tests sequentially and results will be automatically aggregated in report : 

1 . `mvn clean verify -Dcontext=firefox -Dwebdriver.remote.driver=firefox -Dinjected.tags="browser:firefox"`

2 . `mvn verify -Dcontext=chrome -Dwebdriver.remote.driver=chrome -Dinjected.tags="browser:chrome"`
