# CHANGE LOG LEVE AT RUNTIME

An example of how to change the log level at run time by using Spring Boot & Actuactor

Just run the application and to change log level, make a POST request to: 

    localhost:8080/actuator/loggers/ROOT
and in the body content enter the below code like a JSON application


    {
        "configuredLevel": "warn"
    }

or, with you want, make a CURL request like that:


    curl -X POST \
      http://localhost:8080/actuator/loggers/ROOT \
      -H 'Content-Type: application/json' \
      -H 'Postman-Token: c15521a1-ca73-4d51-aa69-7e83f5752862' \
      -H 'cache-control: no-cache' \
      -d '{
        "configuredLevel": "warn"
    }'