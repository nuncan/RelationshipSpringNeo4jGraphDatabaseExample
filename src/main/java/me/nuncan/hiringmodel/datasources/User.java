package me.nuncan.hiringmodel.datasources;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Setter
@Accessors
@Table(name = "Users")
@ApiModel(value = "Base User Entity", description = "Entity That Represents A User's Auth and Access", reference = "User.class")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_ID", nullable = false, unique = true)
    private int Id;

    @Column(name = "User_Username", nullable = false, unique = true)
    private String Username;

    @Column(name = "User_Email", nullable = false, unique = true)
    private String Email;

    @Column(name = "User_Password", nullable = false)
    private String Password;

    @Column(name = "User_Creator_IP", nullable = false)
    private String CreatorIP;

    @Column(name = "User_Enabled", nullable = false)
    private boolean Enabled;

    @Column(name = "User_accountNonExpired", nullable = false)
    private boolean accountNonExpired;

    @Column(name = "User_credentialsNonExpired", nullable = false)
    private boolean credentialsNonExpired;

    @Column(name = "User_accountNonLocked", nullable = false)
    private boolean accountNonLocked;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Roles> User_Roles = new HashSet<Roles>();

}