package com.pablo.agenda.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private Long idPerson;
    @Column(name="Name")
    private String namePerson;
    @Column(name="Lastname")
    private String lastNamePerson;
    @Column(name="Phones")
    private Integer phone;
    @Column(name="Email")
    private String email;
    @Column(name="Address")
    private String address;
    @Column(name="Nº")
    private Integer addressNumber;
    @Column(name="Appointments")
    private String appointments;
    
    @OneToMany(mappedBy = "person")
    private List<Citas> cita;
    
    @OneToMany(mappedBy = "person")
    private List<Phone> phones;
    
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	public Long getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}
	public String getNamePerson() {
		return namePerson;
	}
	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}
	public String getLastNamePerson() {
		return lastNamePerson;
	}
	public void setLastNamePerson(String lastNamePerson) {
		this.lastNamePerson = lastNamePerson;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(Integer addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getAppointments() {
		return appointments;
	}
	public void setAppointments(String appointments) {
		this.appointments = appointments;
	}
	public List<Citas> getCita() {
		return cita;
	}
	public void setCita(List<Citas> cita) {
		this.cita = cita;
	}

}
