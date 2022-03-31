package com.springCore.javaConfigWithoutXml;

import com.springCore.ref.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StaffConfig {

    @Bean
    public Attendance  getAttendance() {
        return new Attendance();
    }

    //bean name by default is methode  name getStaff
    //but we can declare multiple name of bean like
    @Bean(name = {"con","temp","staff"})
    public Staff getStaff() {
        //creating an object
        Staff staff = new Staff(getAttendance());
        return staff;
    }

}
