# springcloud_eureka
eureka is created by Netflix that is a good mircoserivce .

- start Eureka as below steps :
1. create Eureka service ( ref to service project)
2. create Eureka client and connect to defaultZone ( ref to user and order project )
3. add ribbon for load banlance and lazy loading for instance (ref to user project )
   

- There are some points which we need to know :
1. need to import ribbon in pom.xml after springboot version 3.0.0 because of removed ribbon 
2.can set some rule by bean or set in config file ( ref to user project)


- TBC:
1. gateway (try to add gateway and weight if feel free)


