package edu.pdx.advocate.model;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class Course implements SQLData {
	private String crn;
	private String course;
	private String title;
	private String beginTime;
	private String endTime;
	private String location;
	private String days;
	private String startdate;
	private String enddate;
	private String sqlType;

	public String getSQLTypeName() throws SQLException {
		return this.sqlType;
	}

	public void readSQL(SQLInput stream, String typeName) throws SQLException {
		this.sqlType = typeName;
		this.crn = stream.readString();
		this.course = stream.readString();
		this.title = stream.readString();
		this.beginTime = stream.readString();
		this.endTime = stream.readString();
		this.location = stream.readString();
		this.days = stream.readString();
		this.startdate = stream.readString();
		this.enddate = stream.readString();
	}

	public void writeSQL(SQLOutput stream) throws SQLException {
		stream.writeString(this.crn);
		stream.writeString(this.course);
		stream.writeString(this.title);
		stream.writeString(this.beginTime);
		stream.writeString(this.endTime);
		stream.writeString(this.location);
		stream.writeString(this.days);
		stream.writeString(this.startdate);
		stream.writeString(this.enddate);
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getSqlType() {
		return sqlType;
	}

	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;
	}

}
