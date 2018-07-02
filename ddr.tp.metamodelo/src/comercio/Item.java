/**
 */
package comercio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comercio.Item#getProduto <em>Produto</em>}</li>
 * </ul>
 *
 * @see comercio.ComercioPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends Caracteristica {
	/**
	 * Returns the value of the '<em><b>Produto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produto</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produto</em>' containment reference.
	 * @see #setProduto(Produto)
	 * @see comercio.ComercioPackage#getItem_Produto()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Produto getProduto();

	/**
	 * Sets the value of the '{@link comercio.Item#getProduto <em>Produto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produto</em>' containment reference.
	 * @see #getProduto()
	 * @generated
	 */
	void setProduto(Produto value);

} // Item
