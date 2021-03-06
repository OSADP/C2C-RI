/*
    Jameleon - An automation testing tool..
    Copyright (C) 2005 Christian W. Hargraves (engrean@hotmail.com)
    
    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
*/
package net.sf.jameleon.event;

import java.util.EventListener;

public interface FunctionListener extends EventListener{

    /**
     * Gets called before the execution of a function tag
     * @param event - a FunctionEvent Object
     */
    public void beginFunction(FunctionEvent event, int rowNum);

    /**
     * Gets called after the execution of a function tag
     * @param event - a FunctionEvent Object
     */
    public void endFunction(FunctionEvent event, int rowNum);

}
