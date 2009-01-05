package com.googlecode.veloeclipse.dtd.parser;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Represents an external ID in an entity declaration
 * 
 * @author Mark Wutka
 * @version $Revision: 9 $ $Date: 2007-03-14 15:04:50 +0100 (Wed, 14 Mar 2007) $ by $Author: akmal88 $
 */
public abstract class DTDExternalID implements DTDOutput
{

    public String system;

    public DTDExternalID()
    {
    }

    /** Writes out a declaration for this external ID */
    public abstract void write(PrintWriter out) throws IOException;

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
        if (!(ob instanceof DTDExternalID)) { return false; }
        DTDExternalID other = (DTDExternalID) ob;
        if (system == null)
        {
            if (other.system != null) { return false; }
        } else
        {
            if (!system.equals(other.system)) { return false; }
        }
        return true;
    }

    /** Sets the system ID */
    public void setSystem(String aSystem)
    {
        system = aSystem;
    }

    /** Retrieves the system ID */
    public String getSystem()
    {
        return system;
    }
}
