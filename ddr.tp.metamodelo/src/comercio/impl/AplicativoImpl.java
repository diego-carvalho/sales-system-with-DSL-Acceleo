/**
 */
package comercio.impl;

import comercio.Aplicativo;
import comercio.ComercioPackage;
import comercio.Transacao;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aplicativo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comercio.impl.AplicativoImpl#getTransacao <em>Transacao</em>}</li>
 *   <li>{@link comercio.impl.AplicativoImpl#getNome <em>Nome</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AplicativoImpl extends MinimalEObjectImpl.Container implements Aplicativo {
	/**
	 * The cached value of the '{@link #getTransacao() <em>Transacao</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransacao()
	 * @generated
	 * @ordered
	 */
	protected Transacao transacao;

	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AplicativoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComercioPackage.Literals.APLICATIVO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transacao getTransacao() {
		return transacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransacao(Transacao newTransacao, NotificationChain msgs) {
		Transacao oldTransacao = transacao;
		transacao = newTransacao;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComercioPackage.APLICATIVO__TRANSACAO, oldTransacao, newTransacao);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransacao(Transacao newTransacao) {
		if (newTransacao != transacao) {
			NotificationChain msgs = null;
			if (transacao != null)
				msgs = ((InternalEObject)transacao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComercioPackage.APLICATIVO__TRANSACAO, null, msgs);
			if (newTransacao != null)
				msgs = ((InternalEObject)newTransacao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComercioPackage.APLICATIVO__TRANSACAO, null, msgs);
			msgs = basicSetTransacao(newTransacao, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComercioPackage.APLICATIVO__TRANSACAO, newTransacao, newTransacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComercioPackage.APLICATIVO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComercioPackage.APLICATIVO__TRANSACAO:
				return basicSetTransacao(null, msgs);
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
			case ComercioPackage.APLICATIVO__TRANSACAO:
				return getTransacao();
			case ComercioPackage.APLICATIVO__NOME:
				return getNome();
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
			case ComercioPackage.APLICATIVO__TRANSACAO:
				setTransacao((Transacao)newValue);
				return;
			case ComercioPackage.APLICATIVO__NOME:
				setNome((String)newValue);
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
			case ComercioPackage.APLICATIVO__TRANSACAO:
				setTransacao((Transacao)null);
				return;
			case ComercioPackage.APLICATIVO__NOME:
				setNome(NOME_EDEFAULT);
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
			case ComercioPackage.APLICATIVO__TRANSACAO:
				return transacao != null;
			case ComercioPackage.APLICATIVO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
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
		result.append(" (nome: ");
		result.append(nome);
		result.append(')');
		return result.toString();
	}

} //AplicativoImpl
