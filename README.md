# Running the project example
---------------------------------------------------------------------

## Running the orders service with Maven/Jetty.

    cd rs-orders/rs-orders-service
    mvn jetty:run


## Running the orders client application

- Configure `rs-orders/rs-orders-client/src/main/resources/ConfigurationParameters.properties`
  for specifying the client project service implementation (XML or JSON) and the port number 
  of the web server in the endpoint address (7070 for Jetty)
  
- Change to `rs-orders-client` folder

    cd rs-orders/rs-orders-client


- AddCustomer

    mvn exec:java -Dexec.mainClass="es.udc.rs.orders.client.ui.OrderServiceClient" -Dexec.args="-addCustomer 'New Customer'"

- FindCustomer

    mvn exec:java -Dexec.mainClass="es.udc.rs.orders.client.ui.OrderServiceClient" -Dexec.args="-findCustomer 1"

