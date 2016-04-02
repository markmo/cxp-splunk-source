## cxp-splunk-source

A custom Spring XD source for Splunk.

To build the project:

    ./gradlew clean build

Spring XD deployable JAR created under build/libs/cxp-splunk-source-1.0.jar

Start xd-shell

Issue the following commands in the shell:

    module upload --type source --name splunk --file ./build/libs/cxp-splunk-source-1.0.jar
    
    stream create --name splunktest --definition "splunk --host=<host> --username=<username> --password=<password> --owner=<admin> --savedSearch=<saved-search> | log" --deploy

Module options include:

    Option Name  Description                                                 Default    Type
    -----------  ----------------------------------------------------------  ---------  ---------------------------------
    host         the host name or IP address of the Splunk server            localhost  java.lang.String
    owner        the owner of the Splunk namespace                           owner      java.lang.String
    password     the password associated with the username                   password   java.lang.String
    port         the TCP port number of the Splunk server                    8089       int
    savedSearch  the name of the saved search in Splunk                      <none>     java.lang.String
    username     the login name that has rights to receive data from Splunk  admin      java.lang.String

Dependencies:

* [spring-integration-splunk](https://github.com/markmo/spring-integration-splunk)
* [Guava](https://github.com/google/guava) V19.0
* [jackson-databind](https://github.com/FasterXML/jackson-databind) V2.7.0