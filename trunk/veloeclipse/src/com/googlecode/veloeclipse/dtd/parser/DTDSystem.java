package com.googlecode.veloeclipse.dtd.parser;

import java.io.PrintWriter;

/**
 * Represents an external System ID in an entity declaration
 * 
 * @author Mark Wutka
 * @version $Revision: 9 $ $Date: 2007-03-14 15:04:50 +0100 (Wed, 14 Mar 2007) $ by $Author: akmal88 $
 */
public class DTDSystem extends DTDExternalID
{

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 3258129141864804405L;

    public DTDSystem()
    {
    }

    /** Writes out a declaration for this SYSTEM ID */
    @Override
    public void write(PrintWriter out)
    {
        if (system != null)
        {
            out.print("SYSTEM \"");
            out.print(system);
            out.print("\"");
        }
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
        if (!(ob instanceof DTDSystem)) { return false; }
        return super.equals(ob);
    }
}
