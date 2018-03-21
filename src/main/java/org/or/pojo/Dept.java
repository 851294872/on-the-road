package org.or.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dept {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer did;
private String dname;
private String derr;
public Integer getDid() {
	return did;
}
public void setDid(Integer did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getDerr() {
	return derr;
}
public void setDerr(String derr) {
	this.derr = derr;
}
@Override
public String toString() {
	return "Dept [did=" + did + ", dname=" + dname + ", derr=" + derr + "]";
} 
	

	
}
