/*
 * GeniusReferralsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.geniusreferrals.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BonusesForm 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5037072462074371444L;
    private Bonuses bonus;
    /** GETTER
     * The bonuses' wrapper
     */
    @JsonGetter("bonus")
    public Bonuses getBonus ( ) { 
        return this.bonus;
    }
    
    /** SETTER
     * The bonuses' wrapper
     */
    @JsonSetter("bonus")
    public void setBonus (Bonuses value) { 
        this.bonus = value;
    }
 
}
 