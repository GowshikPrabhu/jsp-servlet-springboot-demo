## Step 1
Create a Dynamic Web Project

## Step 2
Create **register.html** file inside ***src/main/webapp***
> Right click on webapp directory then select New -> html file

## Step 3
Write the html code. [Code](https://github.com/GowshikPrabhu/jsp-servlet-springboot-demo/blob/main/DemoProject/src/main/webapp/register.html).
Make changes in the code if any

## Step 4
Create a servlet file **Register.java** inside ***src/main/java***
> Right click and select New -> Servlet

## Step 5
Write the servlet code. [Code](https://github.com/GowshikPrabhu/jsp-servlet-springboot-demo/blob/main/DemoProject/src/main/java/Register.java).
Make changes in the code if any

## Step 6
Set and map the servlet in **web.xml** file inside ***src/main/webapp/WEB-INF***
Example
```xml
<servlet>
    <servlet-name>Register</servlet-name>
    <servlet-class>Register</servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>Register</servlet-name>
    <url-pattern>/servlet/Register</url-pattern>
</servlet-mapping>
 ```
 Put the above code inside `<web-app>  </web-app>` tags

## General Setup for JDBC Connectivity
* Download and extract sql-connector JDBC driver to some foler
* Right click on the project select *Build Path -> Configure* Build Path
* In the *Libraries* tab, click on *Add External JARs* option and select the sql-connector jar file
* Apply and close
