package com.myproject.ticket;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


public class Status {
    private double version;
    private Date timeStampUtc;
    private int code;

    public Status(int code, String details, String message, Date timeStampUtc, double version) {
        this.code = code;
        this.details = details;
        this.message = message;
        this.timeStampUtc = timeStampUtc;
        this.version = version;
    }

    public Status(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public Date getTimeStampUtc() {
        return timeStampUtc;
    }

    public void setTimeStampUtc(Date timeStampUtc) {
        this.timeStampUtc = timeStampUtc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @XmlElement(name = "Message")

    private String message;
    @XmlElement(name = "Details")
    private String details;
}
