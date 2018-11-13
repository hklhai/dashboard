package com.hxqh.dashboard.model;


import javax.persistence.*;

/**
 * @author Lin
 */
@Entity
@Table(name = "tb_database")
public class Database {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dbid;
    private String ip;
    private String port;
    private String database;
    private String user;
    private String password;
    private String drivername;
    private Integer valid;
    private String datasourcename;

    public Database() {
    }

    public String getDatasourcename() {
        return datasourcename;
    }

    public void setDatasourcename(String datasourcename) {
        this.datasourcename = datasourcename;
    }

    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}
