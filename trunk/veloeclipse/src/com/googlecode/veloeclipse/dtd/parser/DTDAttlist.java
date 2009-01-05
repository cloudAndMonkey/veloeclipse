package com.googlecode.veloeclipse.dtd.parser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents an ATTLIST declaration in the DTD. Although attributes are
 * associated with elements, the ATTLIST is here to allow the DTD object to
 * write out the DTD in roughly the original form. Because the ATTLIST may
 * appear somewhere other than immediately after the ELEMENT, this object is
 * used to keep track of where it is.
 * 
 * @author Mark Wutka
 * @version $Revision: 9 $ $Date: 2007-03-14 15:04:50 +0100 (Wed, 14 Mar 2007) $ by $Author: akmal88 $
 */
public class DTDAttlist implements DTDOutput
{

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 3616724963625873976L;
    /** The name of the element */
    public String    name;
    /** The attlist's attributes */
    public ArrayList attributes;

    public DTDAttlist()
    {
        attributes = new ArrayList();
    }

    public DTDAttlist(String aName)
    {
        name = aName;
        attributes = new ArrayList();
    }

    /** Writes out an ATTLIST declaration */
    public void write(PrintWriter out) throws IOException
    {
        out.print("<!ATTLIST ");
        out.println(name);
        Iterator itr = attributes.iterator();
        while (itr.hasNext())
        {
            out.print("           ");
            DTDAttribute attr = (DTDAttribute) itr.next();
            attr.write(out);
            if (itr.hasNext())
            {
                out.println();
            } else
            {
                out.println(">");
            }
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
        if (!(ob instanceof DTDAttlist)) { return false; }
        DTDAttlist other = (DTDAttlist) ob;
        if ((name == null) && (other.name != null)) { return false; }
        if ((name != null) && !name.equals(other.name)) { return false; }
        return attributes.equals(other.attributes);
    }

    /** Returns the entity name of this attlist */
    public String getName()
    {
        return name;
    }

    /** Sets the entity name of this attlist */
    public void setName(String aName)
    {
        name = aName;
    }

    /** Returns the attributes in this list */
    public DTDAttribute[] getAttribute()
    {
        DTDAttribute[] attrs = new DTDAttribute[attributes.size()];
        attributes.toArray(attrs);
        return attrs;
    }

    /** Sets the list of attributes */
    public void setAttribute(DTDAttribute[] attrs)
    {
        attributes = new ArrayList(attrs.length);
        for (DTDAttribute element : attrs) {
            attributes.add(element);
        }
    }

    /** Returns a specific attribute from the list */
    public DTDAttribute getAttribute(int i)
    {
        return (DTDAttribute) attributes.get(i);
    }

    /** Sets a specific attribute in the list */
    public void setAttribute(DTDAttribute attr, int i)
    {
        attributes.set(i, attr);
    }
}
