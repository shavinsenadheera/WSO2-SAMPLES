# WSO2-SAMPLES

You can build this JAR project and build JAR to the <APIM_HOME>/repository/components/lib.

#Handler

Put the handler into the 'api_velocity.xml' file resides in the '<APIM_HOME>/repository/api_templates/'.

<handlers xmlns="http://ws.apache.org/ns/synapse">
  <handler class="org.shavindu.handlers.MyHandler" />
  ...

#Mediator

<?xml version="1.0" encoding="UTF-8"?>
<sequence xmlns="http://ws.apache.org/ns/synapse" name="SamplePolicy">
    <class name="org.wso2.sample.synapse.handler.MyMediation"/>
</sequence>
