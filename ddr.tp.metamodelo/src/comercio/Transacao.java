/**
 */
package comercio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comercio.Transacao#getCliente <em>Cliente</em>}</li>
 *   <li>{@link comercio.Transacao#getItem <em>Item</em>}</li>
 *   <li>{@link comercio.Transacao#getFormasPagamento <em>Formas Pagamento</em>}</li>
 *   <li>{@link comercio.Transacao#isValorado <em>Valorado</em>}</li>
 * </ul>
 *
 * @see comercio.ComercioPackage#getTransacao()
 * @model abstract="true"
 * @generated
 */
public interface Transacao extends Caracteristica {
	/**
	 * Returns the value of the '<em><b>Cliente</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cliente</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliente</em>' containment reference.
	 * @see #setCliente(Cliente)
	 * @see comercio.ComercioPackage#getTransacao_Cliente()
	 * @model containment="true"
	 * @generated
	 */
	Cliente getCliente();

	/**
	 * Sets the value of the '{@link comercio.Transacao#getCliente <em>Cliente</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cliente</em>' containment reference.
	 * @see #getCliente()
	 * @generated
	 */
	void setCliente(Cliente value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(Item)
	 * @see comercio.ComercioPackage#getTransacao_Item()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Item getItem();

	/**
	 * Sets the value of the '{@link comercio.Transacao#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Item value);

	/**
	 * Returns the value of the '<em><b>Formas Pagamento</b></em>' containment reference list.
	 * The list contents are of type {@link comercio.FormaPagamento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formas Pagamento</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formas Pagamento</em>' containment reference list.
	 * @see comercio.ComercioPackage#getTransacao_FormasPagamento()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FormaPagamento> getFormasPagamento();

	/**
	 * Returns the value of the '<em><b>Valorado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valorado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valorado</em>' attribute.
	 * @see #setValorado(boolean)
	 * @see comercio.ComercioPackage#getTransacao_Valorado()
	 * @model required="true"
	 * @generated
	 */
	boolean isValorado();

	/**
	 * Sets the value of the '{@link comercio.Transacao#isValorado <em>Valorado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valorado</em>' attribute.
	 * @see #isValorado()
	 * @generated
	 */
	void setValorado(boolean value);

} // Transacao
