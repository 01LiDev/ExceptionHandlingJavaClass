/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jldevelops.exceptionhandling;

/**
 *
 * @author Johnson
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            throw new ExceptionC("ExceptionC thrown");
        } catch (ExceptionA AC) {
            System.out.println("Caught using ExceptionA: " + AC.getMessage());
        }

        try {
            throw new ExceptionB("ExceptionB thrown");
        } catch (ExceptionA AB) {
            System.out.println("Caught using ExceptionA: " + AB.getMessage());
        }
    }
}
