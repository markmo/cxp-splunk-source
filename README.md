## cxp-splunk-source

A custom Spring XD source for Splunk.

To build the project:

    ./gradlew clean build

Spring XD deployable JAR created under build/libs/cxp-splunk-source-1.0.jar

Start xd-shell

Issue the following commands in the shell:

    module upload --type source --name cxp-splunk-source --file ./build/libs/cxp-splunk-source-1.0.jar
    
    stream create --name splunktest --definition "cxp-splunk-source | log" --deploy

Dependencies:

* [spring-integration-splunk](https://github.com/markmo/spring-integration-splunk)
* [Guava](https://github.com/google/guava) V19.0
* [jackson-databind](https://github.com/FasterXML/jackson-databind) V2.7.0