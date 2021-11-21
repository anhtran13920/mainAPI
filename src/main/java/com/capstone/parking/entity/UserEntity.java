package com.capstone.parking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "`user`", schema = "exff")
public class UserEntity {
    private int id;
    private String phoneNumber;
    private String password;
    private String fullName;
    private String avatar;
    private String address;
    private String status;
    private RoleEntity roleByRoleId;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "phone_number", updatable = false)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "password")
    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(password, that.password) &&
                Objects.equals(fullName, that.fullName) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber, password, fullName, avatar, status);
    }

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    public RoleEntity getRoleByRoleId() {
        return roleByRoleId;
    }

    public void setRoleByRoleId(RoleEntity roleByRoleId) {
        this.roleByRoleId = roleByRoleId;
    }
}
