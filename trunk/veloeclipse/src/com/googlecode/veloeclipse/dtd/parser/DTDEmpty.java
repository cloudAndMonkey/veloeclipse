package com.googlecode.veloeclipse.dtd.parser;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Represents the EMPTY keyword in an Element's content spec
 * 
 * @author Mark Wutka
 * @version $Revision: 9 $ $Date: 2007-03-14 15:04:50 +0100 (Wed, 14 Mar 2007) $ by $Author: akmal88 $
 */
public class DTDEmpty extends DTDItem
{

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 3257570602842927925L;

    public DTDEmpty()
    {
    }

    /** Writes out the keyword "EMPTY" */
    @Override
    public void write(PrintWriter out) throws IOException
    {
        out.print("EMPTY");
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
        if (!(ob instanceof DTDEmpty)) { return false; }
        return super.equals(ob);
    }
}
