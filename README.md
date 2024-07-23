# WSO2-SAMPLES

This repository provides samples for working with WSO2 API Manager (APIM). The samples include custom handlers and mediators that can be integrated into your APIM deployment.

## Getting Started

### Building the Project

To build this project and generate the JAR file, follow these steps:

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Run the build command (e.g., `mvn clean install` if using Maven).

The resulting JAR file should be placed in the following location: <APIM_HOME>/repository/components/lib

## Custom Handler

To integrate a custom handler into your APIM instance, add the handler configuration to the `api_velocity.xml` file located at <APIM_HOME>/repository/api_templates/


Here is an example of how to add the handler configuration:

```xml
<handlers xmlns="http://ws.apache.org/ns/synapse">
    <handler class="org.shavindu.handlers.MyHandler" />
    ...
</handlers>
```


## Custom Mediator

You can simply define the sequence in an XML file to use a custom mediator in your mediation sequences. Below is an example of a custom mediator sequence definition:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<sequence xmlns="http://ws.apache.org/ns/synapse" name="SamplePolicy">
    <class name="org.shavindu.mediators.MyMediator"/>
</sequence>
```
