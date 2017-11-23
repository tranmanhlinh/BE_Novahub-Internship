package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    Employee employee = new Employee(12345, "Linh", "Tran", 1000);
    @Test
    public void getId(){
        assertEquals(12345, employee.getId());
    }

    @Test
    public void getFirstName(){
        assertTrue("Linh".equals(employee.getFirstName()));
    }

    @Test
    public void getLastName(){
        assertTrue("Tran".equals(employee.getLastName()));
    }

    @Test
    public void getName(){
        assertTrue("Linh Tran".equals(employee.getName()));
    }

    @Test
    public void getSalary(){
        assertEquals(1000, employee.getSalary());
        employee.setSalary(2000);
        assertEquals(2000, employee.getSalary());
    }

    @Test
    public void getAnualSalary(){
        assertEquals(12000, employee.getAnualSalary());
    }

    @Test
    public void testRaiseSalary(){
        employee.setSalary(1200);
        employee.raiseSalary(10);
        assertEquals(1320, employee.getSalary());
    }

    @Test
    public void testToString(){
        assertTrue("Employee [id = 12345, name = Linh Tran, salary = 1000]".equals(employee.toString()));
    }

}