package edu.pdx.advocate.model;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class StuInfo implements SQLData {

	private String firstName;
	private String lastName;
	private String gender;
	private String birthdate;
	private String email;
	private String username;
	private String phone;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String dorm;
	private String room;
	private String fullname;
	private String ethnicity;
	private String veteranStatus;
	private String sqlType;

	public String getSQLTypeName() throws SQLException {
		return this.sqlType;
	}

	public void readSQL(SQLInput stream, String typeName) throws SQLException {
		this.sqlType = typeName;
		this.firstName = stream.readString();
		this.lastName = stream.readString();
		this.gender = stream.readString();
		this.birthdate = stream.readString();
		this.email = stream.readString();
		this.username = stream.readString();
		this.phone = stream.readString();
		this.street = stream.readString();
		this.city = stream.readString();
		this.state = stream.readString();
		this.zip = stream.readString();
		this.dorm = stream.readString();
		this.room = stream.readString();
		this.fullname = stream.readString();
		this.ethnicity = stream.readString();
		this.veteranStatus = stream.readString();

	}

	public void writeSQL(SQLOutput stream) throws SQLException {
		stream.writeString(this.firstName);
		stream.writeString(this.lastName);
		stream.writeString(this.gender);
		stream.writeString(this.birthdate);
		stream.writeString(this.email);
		stream.writeString(this.username);
		stream.writeString(this.phone);
		stream.writeString(this.street);
		stream.writeString(this.city);
		stream.writeString(this.state);
		stream.writeString(this.zip);
		stream.writeString(this.dorm);
		stream.writeString(this.room);
		stream.writeString(this.fullname);
		stream.writeString(this.ethnicity);
		stream.writeString(this.veteranStatus);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getDorm() {
		return dorm;
	}

	public void setDorm(String dorm) {
		this.dorm = dorm;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getVeteranStatus() {
		return veteranStatus;
	}

	public void setVeteranStatus(String veteranStatus) {
		this.veteranStatus = veteranStatus;
	}

	public String getSqlType() {
		return sqlType;
	}

	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;
	}

}
