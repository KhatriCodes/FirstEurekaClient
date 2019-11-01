# FirstEurekaClient

Here we are calling **SecondEurekaClient** internally with name instead of host name and port number like below:
http://SecondEurekaClient/secondClient

**To Implement Eureka Client We need Below Steps:**

* Need to add Eureka Discovery dependency
* In main class we have to @EnableEurekaClient annotation.
* In YAML file we have to keep Application name, server port, registry with eureka as true, eureka server URL in service URL
