/**
 */
package comercio.impl;

import comercio.ComercioPackage;
import comercio.Item;
import comercio.Produto;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comercio.impl.ItemImpl#getProduto <em>Produto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends CaracteristicaImpl implements Item {
	/**
	 * The cached value of the '{@link #getProduto() <em>Produto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduto()
	 * @generated
	 * @ordered
	 */
	protected Produto produto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComercioPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduto(Produto newProduto, NotificationChain msgs) {
		Produto oldProduto = produto;
		produto = newProduto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComercioPackage.ITEM__PRODUTO, oldProduto, newProduto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduto(Produto newProduto) {
		if (newProduto != produto) {
			NotificationChain msgs = null;
			if (produto != null)
				msgs = ((InternalEObject)produto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComercioPackage.ITEM__PRODUTO, null, msgs);
			if (newProduto != null)
				msgs = ((InternalEObject)newProduto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComercioPackage.ITEM__PRODUTO, null, msgs);
			msgs = basicSetProduto(newProduto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComercioPackage.ITEM__PRODUTO, newProduto, newProduto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComercioPackage.ITEM__PRODUTO:
				return basicSetProduto(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComercioPackage.ITEM__PRODUTO:
				return getProduto();
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
			case ComercioPackage.ITEM__PRODUTO:
				setProduto((Produto)newValue);
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
			case ComercioPackage.ITEM__PRODUTO:
				setProduto((Produto)null);
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
			case ComercioPackage.ITEM__PRODUTO:
				return produto != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemImpl
