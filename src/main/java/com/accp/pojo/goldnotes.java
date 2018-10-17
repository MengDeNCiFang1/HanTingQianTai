package com.accp.pojo;

import java.util.Date;

public class goldnotes {
    private Integer recordid;

    private Date recorddate;

    private String recorddes;

    private Float recordinandout;

    private Integer recordtype;

    private Integer auditstatus;

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    public String getRecorddes() {
        return recorddes;
    }

    public void setRecorddes(String recorddes) {
        this.recorddes = recorddes == null ? null : recorddes.trim();
    }

    public Float getRecordinandout() {
        return recordinandout;
    }

    public void setRecordinandout(Float recordinandout) {
        this.recordinandout = recordinandout;
    }

    public Integer getRecordtype() {
        return recordtype;
    }

    public void setRecordtype(Integer recordtype) {
        this.recordtype = recordtype;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}