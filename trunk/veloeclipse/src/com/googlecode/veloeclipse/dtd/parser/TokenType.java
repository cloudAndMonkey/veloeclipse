package com.googlecode.veloeclipse.dtd.parser;

/**
 * Enumerated value representing the type of a token
 * 
 * @author Mark Wutka
 * @version $Revision: 9 $ $Date: 2007-03-14 15:04:50 +0100 (Wed, 14 Mar 2007) $ by $Author: akmal88 $
 */
class TokenType
{

    public int    value;
    public String name;

    public TokenType(int aValue, String aName)
    {
        value = aValue;
        name = aName;
    }

    /**
     * DOCUMENT ME!
     * 
     * @param o
     *            DOCUMENT ME!
     * 
     * @return DOCUMENT ME!
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o) { return true; }
        if (!(o instanceof TokenType)) { return false; }
        TokenType other = (TokenType) o;
        if (other.value == value) { return true; }
        return false;
    }

    /**
     * DOCUMENT ME!
     * 
     * @return DOCUMENT ME!
     */
    @Override
    public int hashCode()
    {
        return name.hashCode();
    }
}
