package com.googlecode.veloeclipse.dtd.parser;

/**
 * Token returned by the lexical scanner
 * 
 * @author Mark Wutka
 * @version $Revision: 6 $ $Date: 2005-10-26 08:14:08 +0200 (Wed, 26 Oct 2005) $ by $Author: akmal88 $
 */
class Token
{

    public TokenType type;
    public String    value;

    public Token(TokenType aType)
    {
        type = aType;
        value = null;
    }

    public Token(TokenType aType, String aValue)
    {
        type = aType;
        value = aValue;
    }
}
