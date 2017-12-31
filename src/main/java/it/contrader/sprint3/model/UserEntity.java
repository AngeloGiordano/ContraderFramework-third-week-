package it.contrader.sprint3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="users")
public class UserEntity implements Serializable {

    @Id
    private String username;
    @Column
    private String password ;
    @Column
    private  String role ;

    public UserEntity(){}

    public UserEntity( String username, String password,String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    @Override
    public String toString() {
        return "User: " + "\n username: " + username + "\n password: " + password + "\n  role: " + role;
    }


}
