/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2_web.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @author Fabio Ortiz
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "supplements")
public class Supplements {
@Id
private String reference;
private String brand;
private String category;
private String objetivo;
private String description;
private boolean availability = true;
private double price;
private int quantity;
private String photography;
}