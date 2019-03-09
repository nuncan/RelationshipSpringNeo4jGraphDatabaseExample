package me.nuncan.hiringmodel.datasources;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Setter
@Accessors
@RequiredArgsConstructor
@Table(value = "Roles")
class Roles
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(value = "Role_ID", keyColumn = "Role_ID")
    int Id;

    @Column(value = "Role_Name")
    String Name;

}