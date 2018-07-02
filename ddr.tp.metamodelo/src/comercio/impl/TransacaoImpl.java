/**
 */
package comercio.impl;

import comercio.Cliente;
import comercio.ComercioPackage;
import comercio.FormaPagamento;
import comercio.Item;
import comercio.Transacao;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comercio.impl.TransacaoImpl#getCliente <em>Cliente</em>}</li>
 *   <li>{@link comercio.impl.TransacaoImpl#getItem <em>Item</em>}</li>
 *   <li>{@link comercio.impl.TransacaoImpl#getFormasPagamento <em>Formas Pagamento</em>}</li>
 *   <li>{@link comercio.impl.TransacaoImpl#isValorado <em>Valorado</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransacaoImpl extends CaracteristicaImpl implements Transacao {
	/**
	 * The cached value of the '{@link #getCliente() <em>Cliente</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliente()
	 * @generated
	 * @ordered
	 */
	protected Cliente cliente;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected Item item;

	/**
	 * The cached value of the '{@link #getFormasPagamento() <em>Formas Pagamento</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormasPagamento()
	 * @generated
	 * @ordered
	 */
	protected EList<FormaPagamento> formasPagamento;

	/**
	 * The default value of the '{@link #isValorado() <em>Valorado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValorado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALORADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValorado() <em>Valorado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValorado()
	 * @generated
	 * @ordered
	 */
	protected boolean valorado = VALORADO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransacaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComercioPackage.Literals.TRANSACAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCliente(Cliente newCliente, NotificationChain msgs) {
		Cliente oldCliente = cliente;
		cliente = newCliente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComercioPackage.TRANSACAO__CLIENTE, oldCliente, newCliente);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCliente(Cliente newCliente) {
		if (newCliente != cliente) {
			NotificationChain msgs = null;
			if (cliente != null)
				msgs = ((InternalEObject)cliente).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComercioPackage.TRANSACAO__CLIENTE, null, msgs);
			if (newCliente != null)
				msgs = ((InternalEObject)newCliente).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComercioPackage.TRANSACAO__CLIENTE, null, msgs);
			msgs = basicSetCliente(newCliente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComercioPackage.TRANSACAO__CLIENTE, newCliente, newCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(Item newItem, NotificationChain msgs) {
		Item oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComercioPackage.TRANSACAO__ITEM, oldItem, newItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(Item newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComercioPackage.TRANSACAO__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComercioPackage.TRANSACAO__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComercioPackage.TRANSACAO__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormaPagamento> getFormasPagamento() {
		if (formasPagamento == null) {
			formasPagamento = new EObjectContainmentEList<FormaPagamento>(FormaPagamento.class, this, ComercioPackage.TRANSACAO__FORMAS_PAGAMENTO);
		}
		return formasPagamento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValorado() {
		return valorado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorado(boolean newValorado) {
		boolean oldValorado = valorado;
		valorado = newValorado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComercioPackage.TRANSACAO__VALORADO, oldValorado, valorado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComercioPackage.TRANSACAO__CLIENTE:
				return basicSetCliente(null, msgs);
			case ComercioPackage.TRANSACAO__ITEM:
				return basicSetItem(null, msgs);
			case ComercioPackage.TRANSACAO__FORMAS_PAGAMENTO:
				return ((InternalEList<?>)getFormasPagamento()).basicRemove(otherEnd, msgs);
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
			case ComercioPackage.TRANSACAO__CLIENTE:
				return getCliente();
			case ComercioPackage.TRANSACAO__ITEM:
				return getItem();
			case ComercioPackage.TRANSACAO__FORMAS_PAGAMENTO:
				return getFormasPagamento();
			case ComercioPackage.TRANSACAO__VALORADO:
				return isValorado();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComercioPackage.TRANSACAO__CLIENTE:
				setCliente((Cliente)newValue);
				return;
			case ComercioPackage.TRANSACAO__ITEM:
				setItem((Item)newValue);
				return;
			case ComercioPackage.TRANSACAO__FORMAS_PAGAMENTO:
				getFormasPagamento().clear();
				getFormasPagamento().addAll((Collection<? extends FormaPagamento>)newValue);
				return;
			case ComercioPackage.TRANSACAO__VALORADO:
				setValorado((Boolean)newValue);
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
			case ComercioPackage.TRANSACAO__CLIENTE:
				setCliente((Cliente)null);
				return;
			case ComercioPackage.TRANSACAO__ITEM:
				setItem((Item)null);
				return;
			case ComercioPackage.TRANSACAO__FORMAS_PAGAMENTO:
				getFormasPagamento().clear();
				return;
			case ComercioPackage.TRANSACAO__VALORADO:
				setValorado(VALORADO_EDEFAULT);
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
			case ComercioPackage.TRANSACAO__CLIENTE:
				return cliente != null;
			case ComercioPackage.TRANSACAO__ITEM:
				return item != null;
			case ComercioPackage.TRANSACAO__FORMAS_PAGAMENTO:
				return formasPagamento != null && !formasPagamento.isEmpty();
			case ComercioPackage.TRANSACAO__VALORADO:
				return valorado != VALORADO_EDEFAULT;
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
		result.append(" (valorado: ");
		result.append(valorado);
		result.append(')');
		return result.toString();
	}

} //TransacaoImpl
