package com.googlecode.veloeclipse.editor;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.SubStatusLineManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.ide.IDEActionFactory;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.eclipse.ui.texteditor.BasicTextEditorActionContributor;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;

/**
 * Contributes Velocity actions to the desktop's edit menu and registers the
 * according global action handlers.
 */
public class VelocityEditorActionContributor extends MultiPageEditorActionBarContributor
{
    private IEditorPart		      activeEditorPart;
    private BasicTextEditorActionContributor sourceContributor;

    /**
     * Creates a multi-page contributor.
     */
    public VelocityEditorActionContributor() {
	super();
    }

  
    /**
     * Returns the action registed with the given text editor.
     * 
     * @return IAction or null if editor is null.
     */
    protected IAction getAction(ITextEditor editor, String actionID)
    {
	return ((editor == null) ? null : editor.getAction(actionID));
    }

    public void setActivePage(IEditorPart part)
    {
	if (activeEditorPart == part)
	    return;
	activeEditorPart = part;
	IActionBars actionBars = getActionBars();
	if (part instanceof ITextEditor) {
	    if (sourceContributor == null) { // lazily...
		sourceContributor = new BasicTextEditorActionContributor();
		sourceContributor.init(actionBars, getPage());
    sourceContributor.contributeToStatusLine(actionBars.getStatusLineManager());
	    }
	    sourceContributor.setActiveEditor(part);
	}
	actionBars.updateActionBars();
	
    }
}
