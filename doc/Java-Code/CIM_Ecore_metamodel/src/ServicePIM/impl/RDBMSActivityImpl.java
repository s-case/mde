/**
 */
package ServicePIM.impl;

import ServicePIM.RDBMSActivity;
import ServicePIM.RDBMSTable;
import ServicePIM.RDBMSVerb;
import ServicePIM.RESTServicePIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDBMS Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.RDBMSActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.RDBMSActivityImpl#getRdbmsVerb <em>Rdbms Verb</em>}</li>
 *   <li>{@link ServicePIM.impl.RDBMSActivityImpl#getAltersRDBMSTable <em>Alters RDBMS Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDBMSActivityImpl extends MinimalEObjectImpl.Container implements RDBMSActivity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRdbmsVerb() <em>Rdbms Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsVerb()
	 * @generated
	 * @ordered
	 */
	protected static final RDBMSVerb RDBMS_VERB_EDEFAULT = RDBMSVerb.INSERT;

	/**
	 * The cached value of the '{@link #getRdbmsVerb() <em>Rdbms Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdbmsVerb()
	 * @generated
	 * @ordered
	 */
	protected RDBMSVerb rdbmsVerb = RDBMS_VERB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAltersRDBMSTable() <em>Alters RDBMS Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltersRDBMSTable()
	 * @generated
	 * @ordered
	 */
	protected RDBMSTable altersRDBMSTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBMSActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.RDBMS_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RDBMS_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSVerb getRdbmsVerb() {
		return rdbmsVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdbmsVerb(RDBMSVerb newRdbmsVerb) {
		RDBMSVerb oldRdbmsVerb = rdbmsVerb;
		rdbmsVerb = newRdbmsVerb == null ? RDBMS_VERB_EDEFAULT : newRdbmsVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RDBMS_ACTIVITY__RDBMS_VERB, oldRdbmsVerb, rdbmsVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSTable getAltersRDBMSTable() {
		if (altersRDBMSTable != null && altersRDBMSTable.eIsProxy()) {
			InternalEObject oldAltersRDBMSTable = (InternalEObject)altersRDBMSTable;
			altersRDBMSTable = (RDBMSTable)eResolveProxy(oldAltersRDBMSTable);
			if (altersRDBMSTable != oldAltersRDBMSTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.RDBMS_ACTIVITY__ALTERS_RDBMS_TABLE, oldAltersRDBMSTable, altersRDBMSTable));
			}
		}
		return altersRDBMSTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSTable basicGetAltersRDBMSTable() {
		return altersRDBMSTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltersRDBMSTable(RDBMSTable newAltersRDBMSTable) {
		RDBMSTable oldAltersRDBMSTable = altersRDBMSTable;
		altersRDBMSTable = newAltersRDBMSTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RDBMS_ACTIVITY__ALTERS_RDBMS_TABLE, oldAltersRDBMSTable, altersRDBMSTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.RDBMS_ACTIVITY__NAME:
				return getName();
			case RESTServicePIMPackage.RDBMS_ACTIVITY__RDBMS_VERB:
				return getRdbmsVerb();
			case RESTServicePIMPackage.RDBMS_ACTIVITY__ALTERS_RDBMS_TABLE:
				if (resolve) return getAltersRDBMSTable();
				return basicGetAltersRDBMSTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RESTServicePIMPackage.RDBMS_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.RDBMS_ACTIVITY__RDBMS_VERB:
				setRdbmsVerb((RDBMSVerb)newValue);
				return;
			case RESTServicePIMPackage.RDBMS_ACTIVITY__ALTERS_RDBMS_TABLE:
				setAltersRDBMSTable((RDBMSTable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RESTServicePIMPackage.RDBMS_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.RDBMS_ACTIVITY__RDBMS_VERB:
				setRdbmsVerb(RDBMS_VERB_EDEFAULT);
				return;
			case RESTServicePIMPackage.RDBMS_ACTIVITY__ALTERS_RDBMS_TABLE:
				setAltersRDBMSTable((RDBMSTable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RESTServicePIMPackage.RDBMS_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.RDBMS_ACTIVITY__RDBMS_VERB:
				return rdbmsVerb != RDBMS_VERB_EDEFAULT;
			case RESTServicePIMPackage.RDBMS_ACTIVITY__ALTERS_RDBMS_TABLE:
				return altersRDBMSTable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", rdbmsVerb: ");
		result.append(rdbmsVerb);
		result.append(')');
		return result.toString();
	}

} //RDBMSActivityImpl
