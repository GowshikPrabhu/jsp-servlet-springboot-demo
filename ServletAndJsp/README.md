## Database connectivity
* In this we use **DataSource** class to setup connection
* Add external jar sql-connector as usual
* Add jdbc setup config in ***web.xml*** file
```xml
<resource-ref>
    <description>DB Connection</description>
    <res-ref-name>jdbc/demodb</res-ref-name>
    <res-type>javax.sql.DataSource</res-type>
    <res-auth>Container</res-auth>
</resource-ref>
```
* Replace `jdbc/demodb` with your database name
* Open the **Servers** folder in you Project Explorer
* Under tomcat folder open the file **context.xml**
* Put the following code inside `<Context>` tag
```xml
<Resource 
    name="jdbc/demodb" auth="Container" type="javax.sql.DataSource"
    maxTotal="100" maxIdle="30" maxWaitMillis="10000"
    username="yourdbusername" password="yourdbpassword" driverClassName="com.mysql.cj.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/demodb" 
/>
```
* Replace `demodb` with your database name
* Now we can create a DataSource object in `init` method of a servlet
* We can use the DataSource object to get connection and other operations
