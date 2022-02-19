# QA
Here I will deposit subjects and codes referring to tests of different languages, types of devices and frameworks

## Setup Junit5 dependencies


In this project I will use as IDE or IntelliJ 

### Install Junit5

#### Step 1
https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter
and copy maven depedency

#### Step 2

in the src folder delete everything below java, do the same for the test folder we will not need these classes.

### Step 3

In prom.xml
remove the title. 

> <version>1.0-SNAPSHOT</version>
... (leave blank)
> <properties>


### Step 4

in tag depedencies add dependency copy in maven like this:

!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter --
      ><dependency>
       > <groupId>org.junit.jupiter</groupId>
       > ><artifactId>junit-jupiter</artifactId>
       > <version>5.7.0</version>
       > <scope>test</scope>
     > </dependency>
     
### Step 5 

Go to view -> Tool windowns -> maven see maven select. in right bar select lifecycle -> select clean and install in same time click on blue circle an run
