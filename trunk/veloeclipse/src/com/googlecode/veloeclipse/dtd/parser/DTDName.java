package com.googlecode.veloeclipse.dtd.parser;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Represents a named item in the DTD
 * 
 * @author Mark Wutka
 * @version $Revision: 9 $ $Date: 2007-03-14 15:04:50 +0100 (Wed, 14 Mar 2007) $ by $Author: akmal88 $
 */
public class DTDName extends DTDItem
{

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 3257844398334425139L;
    public String value;

    public DTDName()
    {
    }

    public DTDName(String aValue)
    {
        value = aValue;
    }

    /** Writes out the value of this name */
    @Override
    public void write(PrintWriter out) throws IOException
    {
        out.print(value);
        cardinal.write(out);
    }

    /**
     * DOCUMENT ME!
     * 
     * @param ob
     *            DOCUMENT ME!
     * 
     * @return DOCUMENT ME!
     */
    @Override
    public boolean equals(Object ob)
    {
        if (ob == this) { return true; }
        if (!(ob instanceof DTDName)) { return false; }
        if (!super.equals(ob)) { return false; }
        DTDName other = (DTDName) ob;
        if (value == null)
        {
            if (other.value != null) { return false; }
        } else
        {
            if (!value.equals(other.value)) { return false; }
        }
        return true;
    }

    /** Sets the name value */
    public void setValue(String aValue)
    {
        value = aValue;
    }

    /** Retrieves the name value */
    public String getValue()
    {
        return value;
    }
}
