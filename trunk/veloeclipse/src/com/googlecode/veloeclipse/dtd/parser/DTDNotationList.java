package com.googlecode.veloeclipse.dtd.parser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a notation declaration for an attribute
 * 
 * @author Mark Wutka
 * @version $Revision: 9 $ $Date: 2007-03-14 15:04:50 +0100 (Wed, 14 Mar 2007) $ by $Author: akmal88 $
 */
public class DTDNotationList implements DTDOutput
{

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 3257563988576384053L;
    protected ArrayList items;

    /** Creates a new notation */
    public DTDNotationList()
    {
        items = new ArrayList();
    }

    /** Adds a item to the list of notation values */
    public void add(String item)
    {
        items.add(item);
    }

    /** Removes an item from the list of notation values */
    public void remove(String item)
    {
        items.remove(item);
    }

    /** Returns the list of notation values as an array */
    public String[] getItems()
    {
        String[] retval = new String[items.size()];
        items.toArray(retval);
        return retval;
    }

    /** Returns the list of notation values as a ArrayList */
    public ArrayList getItemsVec()
    {
        return items;
    }

    /** Writes a declaration for this notation */
    public void write(PrintWriter out) throws IOException
    {
        out.print("NOTATION ( ");
        Iterator e = getItemsVec().iterator();
        boolean isFirst = true;
        while (e.hasNext())
        {
            if (!isFirst)
            {
                out.print(" | ");
            }
            isFirst = false;
            out.print(e.next());
        }
        out.print(")");
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
        if (!(ob instanceof DTDNotationList)) { return false; }
        DTDNotationList other = (DTDNotationList) ob;
        return items.equals(other.items);
    }

    /** Returns the items in the notation list */
    public String[] getItem()
    {
        return getItems();
    }

    /** Sets the items in the notation list */
    public void setItem(String[] newItems)
    {
        items = new ArrayList(newItems.length);
        for (String element : newItems) {
            items.add(element);
        }
    }

    /** Stores an item in the notation list */
    public void setItem(String item, int i)
    {
        items.set(i, item);
    }

    /** Retrieves an item from the notation list */
    public String getItem(int i)
    {
        return (String) items.get(i);
    }
}
