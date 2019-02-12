package bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Employee_All_Details")
public class EmpBean {
@Id
@GeneratedValue
int eid;
String name;
double salary;
@Embedded
AddressBean address;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public AddressBean getAddress() {
	return address;
}
public void setAddress(AddressBean address) {
	this.address = address;
}
}
