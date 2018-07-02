/**
 */
package comercio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aplicativo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comercio.Aplicativo#getTransacao <em>Transacao</em>}</li>
 *   <li>{@link comercio.Aplicativo#getNome <em>Nome</em>}</li>
 * </ul>
 *
 * @see comercio.ComercioPackage#getAplicativo()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RestricaoAluguel'"
 * @generated
 */
public interface Aplicativo extends EObject {
	/**
	 * Returns the value of the '<em><b>Transacao</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transacao</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transacao</em>' containment reference.
	 * @see #setTransacao(Transacao)
	 * @see comercio.ComercioPackage#getAplicativo_Transacao()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Transacao getTransacao();

	/**
	 * Sets the value of the '{@link comercio.Aplicativo#getTransacao <em>Transacao</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transacao</em>' containment reference.
	 * @see #getTransacao()
	 * @generated
	 */
	void setTransacao(Transacao value);

	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see comercio.ComercioPackage#getAplicativo_Nome()
	 * @model required="true"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link comercio.Aplicativo#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

} // Aplicativo
