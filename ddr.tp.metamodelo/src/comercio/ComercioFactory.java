/**
 */
package comercio;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see comercio.ComercioPackage
 * @generated
 */
public interface ComercioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComercioFactory eINSTANCE = comercio.impl.ComercioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aplicativo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aplicativo</em>'.
	 * @generated
	 */
	Aplicativo createAplicativo();

	/**
	 * Returns a new object of class '<em>Aluguel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aluguel</em>'.
	 * @generated
	 */
	Aluguel createAluguel();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliente</em>'.
	 * @generated
	 */
	Cliente createCliente();

	/**
	 * Returns a new object of class '<em>Forma Pagamento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forma Pagamento</em>'.
	 * @generated
	 */
	FormaPagamento createFormaPagamento();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Produto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Produto</em>'.
	 * @generated
	 */
	Produto createProduto();

	/**
	 * Returns a new object of class '<em>Venda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Venda</em>'.
	 * @generated
	 */
	Venda createVenda();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComercioPackage getComercioPackage();

} //ComercioFactory
