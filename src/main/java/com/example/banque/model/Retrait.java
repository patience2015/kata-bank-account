package com.example.banque.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

import lombok.Data;
@Entity
@Data
@DiscriminatorColumn(name="R")
public class Retrait extends Operation implements Serializable {

}
