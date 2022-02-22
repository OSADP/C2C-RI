/*
 *  soapUI, copyright (C) 2004-2010 eviware.com 
 *
 *  soapUI is free software; you can redistribute it and/or modify it under the 
 *  terms of version 2.1 of the GNU Lesser General Public License as published by 
 *  the Free Software Foundation.
 *
 *  soapUI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details at gnu.org.
 */

package org.fhwa.c2cri.plugin.c2cri.ntcip2306.support;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.apache.xmlbeans.XmlException;


public class StringList extends ArrayList<String>
{
	public StringList()
	{
		super();
	}

	public StringList( int initialCapacity )
	{
		super( initialCapacity );
	}

	public StringList( String[] strings )
	{
		super( Arrays.asList( strings ) );
	}

	public StringList( Object[] objects )
	{
		super();

		for( Object object : objects )
			add( object == null ? null : object.toString() );
	}

	public StringList( Collection<?> objects )
	{
		super();

		for( Object object : objects )
			add( object == null ? null : object.toString() );
	}

	public void addAll( String[] strings )
	{
		addAll( Arrays.asList( strings ) );
	}

	public String[] toStringArray()
	{
		return toArray( new String[size()] );
	}
/**
	public static StringList fromXml( String value ) throws XmlException
	{
		return StringUtils.isNullOrEmpty( value ) || value.equals( "<xml-fragment/>" ) ? new StringList()
				: new StringList( StringListConfig.Factory.parse( value ).getEntryList() );
	}

	public String toXml()
	{
		StringListConfig config = StringListConfig.Factory.newInstance();
		config.setEntryArray( toStringArray() );
		return config.xmlText();
	}
 */
}
