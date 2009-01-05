package com.googlecode.veloeclipse.dtd.parser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

/**
 * Represents a mixed Element content (PCDATA + choice/sequence). Mixed Element
 * can contain #PCDATA, or it can contain #PCDATA followed by a list of
 * pipe-separated names.
 * 
 * @author Mark Wutka
 * @version $Revision: 9 $ $Date: 2007-03-14 15:04:50 +0100 (Wed, 14 Mar 2007) $ by $Author: akmal88 $
 */
public class DTDMixed extends DTDContainer
{

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 3617016342797169973L;

    public DTDMixed()
    {
    }

    /** Writes out a declaration for mixed content */
    @Override
    public void write(PrintWriter out) throws IOException
    {
        out.print("(");
        Iterator e = getItemsVec().iterator();
        boolean isFirst = true;
        while (e.hasNext())
        {
            if (!isFirst)
            {
                out.print(" | ");
            }
            isFirst = false;
            DTDItem item = (DTDItem) e.next();
            item.write(out);
        }
        out.print(")");
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
        if (!(ob instanceof DTDMixed)) { return false; }
        return super.equals(ob);
    }
}
