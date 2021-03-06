/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Marin Orlic - based on BooleanFieldEditor to add more than one listener
 *******************************************************************************/
package eu.scasefp7.eclipse.mde.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * A field editor for a boolean type preference.
 */
public class CheckboxFieldEditor extends BooleanFieldEditor {

    /**
     * Style constant (value <code>0</code>) indicating the default layout where
     * the field editor's check box appears to the left of the label.
     */
    public static final int DEFAULT = 0;

    /**
     * Style constant (value <code>1</code>) indicating a layout where the field
     * editor's label appears on the left with a check box on the right.
     */
    public static final int SEPARATE_LABEL = 1;

    /**
     * Style bits. Either <code>DEFAULT</code> or <code>SEPARATE_LABEL</code>.
     */
    private int style;

    /**
     * The previously selected, or "before", value.
     */
    private boolean wasSelected;

    /**
     * The checkbox control, or <code>null</code> if none.
     */
    private Button checkBox = null;

    /**
     * The state listener.
     */
    private IPropertyChangeListener extraChangeListener = null;
    
    /**
     * Creates a new boolean field editor
     */
    protected CheckboxFieldEditor() {
    }

    /**
     * Creates a boolean field editor in the given style.
     * 
     * @param name
     *            the name of the preference this field editor works on
     * @param labelText
     *            the label text of the field editor
     * @param style
     *            the style, either <code>DEFAULT</code> or
     *            <code>SEPARATE_LABEL</code>
     * @param parent
     *            the parent of the field editor's control
     * @see #DEFAULT
     * @see #SEPARATE_LABEL
     */
    public CheckboxFieldEditor(String name, String labelText, int style, Composite parent) {
        init(name, labelText);
        this.style = style;
        createControl(parent);
    }

    /**
     * Creates a boolean field editor in the default style.
     * 
     * @param name
     *            the name of the preference this field editor works on
     * @param label
     *            the label text of the field editor
     * @param parent
     *            the parent of the field editor's control
     */
    public CheckboxFieldEditor(String name, String label, Composite parent) {
        this(name, label, DEFAULT, parent);
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor.
     */
    @Override
    protected void adjustForNumColumns(int numColumns) {
        if (style == SEPARATE_LABEL) {
            numColumns--;
        }
        ((GridData) checkBox.getLayoutData()).horizontalSpan = numColumns;
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor.
     */
    @Override
    protected void doFillIntoGrid(Composite parent, int numColumns) {
        String text = getLabelText();
        switch (style) {
        case SEPARATE_LABEL:
            getLabelControl(parent);
            numColumns--;
            text = null;
            //$FALL-THROUGH$
        default:
            checkBox = getChangeControl(parent);
            GridData gd = new GridData();
            gd.horizontalSpan = numColumns;
            checkBox.setLayoutData(gd);
            if (text != null) {
                checkBox.setText(text);
            }
        }
    }

    /**
     * Returns the control responsible for displaying this field editor's label.
     * This method can be used to set a tooltip for a
     * <code>BooleanFieldEditor</code>. Note that the normal pattern of
     * <code>getLabelControl(parent).setToolTipText(tooltipText)</code> does not
     * work for boolean field editors, as it can lead to duplicate text (see bug
     * 259952).
     * 
     * @param parent
     *            the parent composite
     * @return the control responsible for displaying the label
     * 
     * @since 3.5
     */
    public Control getDescriptionControl(Composite parent) {
        if (style == SEPARATE_LABEL) {
            return getLabelControl(parent);
        }
        return getChangeControl(parent);
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor. Loads the value from the
     * preference store and sets it to the check box.
     */
    @Override
    protected void doLoad() {
        if (checkBox != null) {
            boolean value = getPreferenceStore().getBoolean(getPreferenceName());
            checkBox.setSelection(value);
            wasSelected = value;
            
            // Notify initially
            fireExtraValueChanged(VALUE, wasSelected, value);
        }
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor. Loads the default value
     * from the preference store and sets it to the check box.
     */
    @Override
    protected void doLoadDefault() {
        if (checkBox != null) {
            boolean value = getPreferenceStore().getDefaultBoolean(getPreferenceName());
            checkBox.setSelection(value);
            wasSelected = value;

            // Notify initially
            fireExtraValueChanged(VALUE, wasSelected, value);
        }
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor.
     */
    @Override
    protected void doStore() {
        getPreferenceStore().setValue(getPreferenceName(), checkBox.getSelection());
    }

    /**
     * Returns this field editor's current value.
     * 
     * @return the value
     */
    public boolean getBooleanValue() {
        return checkBox.getSelection();
    }

    /**
     * Returns the change button for this field editor.
     * 
     * @param parent
     *            The Composite to create the receiver in.
     * 
     * @return the change button
     */
    protected Button getChangeControl(Composite parent) {
        if (checkBox == null) {
            checkBox = new Button(parent, SWT.CHECK | SWT.LEFT);
            checkBox.setFont(parent.getFont());
            checkBox.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    boolean isSelected = checkBox.getSelection();
                    valueChanged(wasSelected, isSelected);
                    wasSelected = isSelected;
                }
            });
            checkBox.addDisposeListener(new DisposeListener() {
                @Override
                public void widgetDisposed(DisposeEvent event) {
                    checkBox = null;
                }
            });
        } else {
            checkParent(checkBox, parent);
        }
        return checkBox;
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor.
     */
    @Override
    public int getNumberOfControls() {
        switch (style) {
        case SEPARATE_LABEL:
            return 2;
        default:
            return 1;
        }
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor.
     */
    @Override
    public void setFocus() {
        if (checkBox != null) {
            checkBox.setFocus();
        }
    }

    /*
     * (non-Javadoc) Method declared on FieldEditor.
     */
    @Override
    public void setLabelText(String text) {
        super.setLabelText(text);
        Label label = getLabelControl();
        if (label == null && checkBox != null) {
            checkBox.setText(text);
        }
    }

    /**
     * Sets or removes the extra property change listener for this field editor.
     * <p>
     * Note that field editors can support only a single listener.
     * </p>
     *
     * @param listener a property change listener, or <code>null</code>
     *  to remove
     */
    public void setExtraPropertyChangeListener(IPropertyChangeListener listener) {
        extraChangeListener = listener;
    }    
    
    /**
     * Informs this field editor's listener, if it has one, about a change to
     * the value (<code>VALUE</code> property) provided that the old and new
     * values are different.
     * 
     * @param oldValue
     *            the old value
     * @param newValue
     *            the new value
     */
    protected void valueChanged(boolean oldValue, boolean newValue) {
        setPresentsDefaultValue(false);
        if (oldValue != newValue) {
            fireStateChanged(VALUE, oldValue, newValue);
        }
    }

    /**
     * Informs this field editor's listener, if it has one, about a change to
     * one of this field editor's boolean-valued properties. Does nothing
     * if the old and new values are the same.
     *
     * @param property the field editor property name, 
     *   such as <code>VALUE</code> or <code>IS_VALID</code>
     * @param oldValue the old value
     * @param newValue the new value
     */
    protected void fireStateChanged(String property, boolean oldValue,
            boolean newValue) {
        if (oldValue == newValue) {
            return;
        }
        
        fireExtraValueChanged(property, oldValue, newValue);
        fireValueChanged(property, oldValue ? Boolean.TRUE : Boolean.FALSE, newValue ? Boolean.TRUE : Boolean.FALSE);
    }
    
    protected void fireExtraValueChanged(String property, boolean oldValue, boolean newValue) {
        if (extraChangeListener != null) {
            extraChangeListener.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
        }
    }
    
    /*
     * @see FieldEditor.setEnabled
     */
    @Override
    public void setEnabled(boolean enabled, Composite parent) {
        // Only call super if there is a label already
        if (style == SEPARATE_LABEL) {
            super.setEnabled(enabled, parent);
        }
        getChangeControl(parent).setEnabled(enabled);
        
        fireExtraValueChanged(VALUE, wasSelected, wasSelected);
    }

}
