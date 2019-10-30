# This modulue as a 'Spring Boot App'
---

### To test the endpoint when it's running:
> `http://localhost:8088/user/1`

### To build and create the executable jar file, on the root of the parent project run:
> `% mvn clean package`

### To run this module as an application just the way it was running on the development phase:
The below command will load and run the jar file, create a log file, create a file to list errors, and show on the console the PID (process identification number)
> `% nohup java -jar rest-module/target/rest-module-app.jar > nohup-run.log 2> nohup.err < /dev/null &`

--- 

## To stop running the app just kill the PID:
> `% kill <PID number>`

Note:
>The **nohup** is a POSIX command to ignore the HUP (hangup) signal. 
The HUP signal is, by convention, the way a terminal warns dependent processes of logout. 
Output that would normally go to the terminal goes to a file called nohup.out if it has not already been redirected.
