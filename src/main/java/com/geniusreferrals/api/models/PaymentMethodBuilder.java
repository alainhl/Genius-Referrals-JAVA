/*
 * GeniusReferralsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.geniusreferrals.api.models;

import java.io.InputStream;

public class PaymentMethodBuilder {
    //the instance to build
    private PaymentMethod paymentMethod;

    /**
     * Default constructor to initialize the instance
     */
    public PaymentMethodBuilder() {
        paymentMethod = new PaymentMethod();
    }

    /**
     * The username
     */
    public PaymentMethodBuilder username(String username) {
        paymentMethod.setUsername(username);
        return this;
    }

    /**
     * The description
     */
    public PaymentMethodBuilder description(String description) {
        paymentMethod.setDescription(description);
        return this;
    }

    /**
     * Is the payment method active? (true, false)
     */
    public PaymentMethodBuilder isActive(InputStream isActive) {
        paymentMethod.setIsActive(isActive);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PaymentMethod build() {
        return paymentMethod;
    }
}