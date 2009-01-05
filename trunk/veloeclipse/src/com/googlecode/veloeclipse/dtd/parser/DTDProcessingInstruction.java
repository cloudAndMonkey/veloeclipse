package com.googlecode.veloeclipse.dtd.parser;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Represents a processing instruction in the DTD
 * 
 * @author Mark Wutka
 * @version $Revision: 9 $ $Date: 2007-03-14 15:04:50 +0100 (Wed, 14 Mar 2007) $ by $Author: akmal88 $
 */
public class DTDProcessingInstruction implements DTDOutput
{

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 3761405296366399798L;
    /** The processing instruction text */
    public String text;

    public DTDProcessingInstruction()
    {
    }

    public DTDProcessingInstruction(String theText)
    {
        text = theText;
    }

    /**
     * DOCUMENT ME!
     * 
     * @return DOCUMENT ME!
     */
    @Override
    public String toString()
    {
        return text;
    }

    /**
     * DOCUMENT ME!
     * 
     * @param out
     *            DOCUMENT ME!
     * 
     * @throws IOException
     *             DOCUMENT ME!
     */
    public void write(PrintWriter out) throws IOException
    {
        out.print("<?");
        out.print(text);
        out.println("?>");
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
        if (!(ob instanceof DTDProcessingInstruction)) { return false; }
        DTDProcessingInstruction other = (DTDProcessingInstruction) ob;
        if (text == null)
        {
            if (other.text != null) { return false; }
        } else
        {
            if (!text.equals(other.text)) { return false; }
        }
        return true;
    }

    /** Sets the instruction text */
    public void setText(String theText)
    {
        text = theText;
    }

    /** Retrieves the instruction text */
    public String getText()
    {
        return text;
    }
}
