/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fhwa.c2cri.tmdd.emulation.exceptions;

import org.fhwa.c2cri.centermodel.emulation.exceptions.EntityEmulationException;

/**
 * This is the highest level Entity Emulation Exception class.
 * 
 * @author TransCore ITS, LLC
 * Created: Jan 31, 2016
 */
public class NoMatchingDataException extends EntityEmulationException {
    public NoMatchingDataException(String message){
        super(message);
    }
    
    public NoMatchingDataException(Throwable throwable){
        super(throwable);
    }
    
}