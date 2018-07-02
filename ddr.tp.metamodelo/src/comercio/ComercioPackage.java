/**
 */
package comercio;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see comercio.ComercioFactory
 * @model kind="package"
 * @generated
 */
public interface ComercioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comercio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://comercio";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "comercio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComercioPackage eINSTANCE = comercio.impl.ComercioPackageImpl.init();

	/**
	 * The meta object id for the '{@link comercio.impl.AplicativoImpl <em>Aplicativo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.impl.AplicativoImpl
	 * @see comercio.impl.ComercioPackageImpl#getAplicativo()
	 * @generated
	 */
	int APLICATIVO = 0;

	/**
	 * The feature id for the '<em><b>Transacao</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATIVO__TRANSACAO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATIVO__NOME = 1;

	/**
	 * The number of structural features of the '<em>Aplicativo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATIVO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Aplicativo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATIVO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comercio.impl.CaracteristicaImpl <em>Caracteristica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.impl.CaracteristicaImpl
	 * @see comercio.impl.ComercioPackageImpl#getCaracteristica()
	 * @generated
	 */
	int CARACTERISTICA = 3;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA__NOME = 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA__ATRIBUTOS = 1;

	/**
	 * The number of structural features of the '<em>Caracteristica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Caracteristica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comercio.impl.TransacaoImpl <em>Transacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.impl.TransacaoImpl
	 * @see comercio.impl.ComercioPackageImpl#getTransacao()
	 * @generated
	 */
	int TRANSACAO = 8;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO__NOME = CARACTERISTICA__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO__ATRIBUTOS = CARACTERISTICA__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO__CLIENTE = CARACTERISTICA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO__ITEM = CARACTERISTICA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formas Pagamento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO__FORMAS_PAGAMENTO = CARACTERISTICA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valorado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO__VALORADO = CARACTERISTICA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO_FEATURE_COUNT = CARACTERISTICA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO_OPERATION_COUNT = CARACTERISTICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comercio.impl.AluguelImpl <em>Aluguel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.impl.AluguelImpl
	 * @see comercio.impl.ComercioPackageImpl#getAluguel()
	 * @generated
	 */
	int ALUGUEL = 1;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUGUEL__NOME = TRANSACAO__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUGUEL__ATRIBUTOS = TRANSACAO__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUGUEL__CLIENTE = TRANSACAO__CLIENTE;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUGUEL__ITEM = TRANSACAO__ITEM;

	/**
	 * The feature id for the '<em><b>Formas Pagamento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUGUEL__FORMAS_PAGAMENTO = TRANSACAO__FORMAS_PAGAMENTO;

	/**
	 * The feature id for the '<em><b>Valorado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUGUEL__VALORADO = TRANSACAO__VALORADO;

	/**
	 * The number of structural features of the '<em>Aluguel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUGUEL_FEATURE_COUNT = TRANSACAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aluguel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUGUEL_OPERATION_COUNT = TRANSACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comercio.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.impl.AtributoImpl
	 * @see comercio.impl.ComercioPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 2;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO = 1;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comercio.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.impl.ClienteImpl
	 * @see comercio.impl.ComercioPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 4;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOME = CARACTERISTICA__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ATRIBUTOS = CARACTERISTICA__ATRIBUTOS;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = CARACTERISTICA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_OPERATION_COUNT = CARACTERISTICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comercio.impl.FormaPagamentoImpl <em>Forma Pagamento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.impl.FormaPagamentoImpl
	 * @see comercio.impl.ComercioPackageImpl#getFormaPagamento()
	 * @generated
	 */
	int FORMA_PAGAMENTO = 5;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMA_PAGAMENTO__NOME = 0;

	/**
	 * The number of structural features of the '<em>Forma Pagamento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMA_PAGAMENTO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Forma Pagamento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMA_PAGAMENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comercio.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.impl.ItemImpl
	 * @see comercio.impl.ComercioPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 6;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NOME = CARACTERISTICA__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ATRIBUTOS = CARACTERISTICA__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Produto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRODUTO = CARACTERISTICA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = CARACTERISTICA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = CARACTERISTICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comercio.impl.ProdutoImpl <em>Produto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.impl.ProdutoImpl
	 * @see comercio.impl.ComercioPackageImpl#getProduto()
	 * @generated
	 */
	int PRODUTO = 7;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO__NOME = CARACTERISTICA__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO__ATRIBUTOS = CARACTERISTICA__ATRIBUTOS;

	/**
	 * The number of structural features of the '<em>Produto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO_FEATURE_COUNT = CARACTERISTICA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Produto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO_OPERATION_COUNT = CARACTERISTICA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comercio.impl.VendaImpl <em>Venda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.impl.VendaImpl
	 * @see comercio.impl.ComercioPackageImpl#getVenda()
	 * @generated
	 */
	int VENDA = 9;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDA__NOME = TRANSACAO__NOME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDA__ATRIBUTOS = TRANSACAO__ATRIBUTOS;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDA__CLIENTE = TRANSACAO__CLIENTE;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDA__ITEM = TRANSACAO__ITEM;

	/**
	 * The feature id for the '<em><b>Formas Pagamento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDA__FORMAS_PAGAMENTO = TRANSACAO__FORMAS_PAGAMENTO;

	/**
	 * The feature id for the '<em><b>Valorado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDA__VALORADO = TRANSACAO__VALORADO;

	/**
	 * The number of structural features of the '<em>Venda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDA_FEATURE_COUNT = TRANSACAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Venda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDA_OPERATION_COUNT = TRANSACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comercio.Tipo <em>Tipo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comercio.Tipo
	 * @see comercio.impl.ComercioPackageImpl#getTipo()
	 * @generated
	 */
	int TIPO = 10;


	/**
	 * Returns the meta object for class '{@link comercio.Aplicativo <em>Aplicativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aplicativo</em>'.
	 * @see comercio.Aplicativo
	 * @generated
	 */
	EClass getAplicativo();

	/**
	 * Returns the meta object for the containment reference '{@link comercio.Aplicativo#getTransacao <em>Transacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transacao</em>'.
	 * @see comercio.Aplicativo#getTransacao()
	 * @see #getAplicativo()
	 * @generated
	 */
	EReference getAplicativo_Transacao();

	/**
	 * Returns the meta object for the attribute '{@link comercio.Aplicativo#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see comercio.Aplicativo#getNome()
	 * @see #getAplicativo()
	 * @generated
	 */
	EAttribute getAplicativo_Nome();

	/**
	 * Returns the meta object for class '{@link comercio.Aluguel <em>Aluguel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluguel</em>'.
	 * @see comercio.Aluguel
	 * @generated
	 */
	EClass getAluguel();

	/**
	 * Returns the meta object for class '{@link comercio.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see comercio.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link comercio.Atributo#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see comercio.Atributo#getNome()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nome();

	/**
	 * Returns the meta object for the attribute '{@link comercio.Atributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see comercio.Atributo#getTipo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Tipo();

	/**
	 * Returns the meta object for class '{@link comercio.Caracteristica <em>Caracteristica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caracteristica</em>'.
	 * @see comercio.Caracteristica
	 * @generated
	 */
	EClass getCaracteristica();

	/**
	 * Returns the meta object for the attribute '{@link comercio.Caracteristica#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see comercio.Caracteristica#getNome()
	 * @see #getCaracteristica()
	 * @generated
	 */
	EAttribute getCaracteristica_Nome();

	/**
	 * Returns the meta object for the containment reference list '{@link comercio.Caracteristica#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see comercio.Caracteristica#getAtributos()
	 * @see #getCaracteristica()
	 * @generated
	 */
	EReference getCaracteristica_Atributos();

	/**
	 * Returns the meta object for class '{@link comercio.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see comercio.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for class '{@link comercio.FormaPagamento <em>Forma Pagamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forma Pagamento</em>'.
	 * @see comercio.FormaPagamento
	 * @generated
	 */
	EClass getFormaPagamento();

	/**
	 * Returns the meta object for the attribute '{@link comercio.FormaPagamento#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see comercio.FormaPagamento#getNome()
	 * @see #getFormaPagamento()
	 * @generated
	 */
	EAttribute getFormaPagamento_Nome();

	/**
	 * Returns the meta object for class '{@link comercio.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see comercio.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the containment reference '{@link comercio.Item#getProduto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Produto</em>'.
	 * @see comercio.Item#getProduto()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Produto();

	/**
	 * Returns the meta object for class '{@link comercio.Produto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produto</em>'.
	 * @see comercio.Produto
	 * @generated
	 */
	EClass getProduto();

	/**
	 * Returns the meta object for class '{@link comercio.Transacao <em>Transacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transacao</em>'.
	 * @see comercio.Transacao
	 * @generated
	 */
	EClass getTransacao();

	/**
	 * Returns the meta object for the containment reference '{@link comercio.Transacao#getCliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cliente</em>'.
	 * @see comercio.Transacao#getCliente()
	 * @see #getTransacao()
	 * @generated
	 */
	EReference getTransacao_Cliente();

	/**
	 * Returns the meta object for the containment reference '{@link comercio.Transacao#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see comercio.Transacao#getItem()
	 * @see #getTransacao()
	 * @generated
	 */
	EReference getTransacao_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link comercio.Transacao#getFormasPagamento <em>Formas Pagamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formas Pagamento</em>'.
	 * @see comercio.Transacao#getFormasPagamento()
	 * @see #getTransacao()
	 * @generated
	 */
	EReference getTransacao_FormasPagamento();

	/**
	 * Returns the meta object for the attribute '{@link comercio.Transacao#isValorado <em>Valorado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valorado</em>'.
	 * @see comercio.Transacao#isValorado()
	 * @see #getTransacao()
	 * @generated
	 */
	EAttribute getTransacao_Valorado();

	/**
	 * Returns the meta object for class '{@link comercio.Venda <em>Venda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Venda</em>'.
	 * @see comercio.Venda
	 * @generated
	 */
	EClass getVenda();

	/**
	 * Returns the meta object for enum '{@link comercio.Tipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo</em>'.
	 * @see comercio.Tipo
	 * @generated
	 */
	EEnum getTipo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComercioFactory getComercioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link comercio.impl.AplicativoImpl <em>Aplicativo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.impl.AplicativoImpl
		 * @see comercio.impl.ComercioPackageImpl#getAplicativo()
		 * @generated
		 */
		EClass APLICATIVO = eINSTANCE.getAplicativo();

		/**
		 * The meta object literal for the '<em><b>Transacao</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICATIVO__TRANSACAO = eINSTANCE.getAplicativo_Transacao();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICATIVO__NOME = eINSTANCE.getAplicativo_Nome();

		/**
		 * The meta object literal for the '{@link comercio.impl.AluguelImpl <em>Aluguel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.impl.AluguelImpl
		 * @see comercio.impl.ComercioPackageImpl#getAluguel()
		 * @generated
		 */
		EClass ALUGUEL = eINSTANCE.getAluguel();

		/**
		 * The meta object literal for the '{@link comercio.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.impl.AtributoImpl
		 * @see comercio.impl.ComercioPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOME = eINSTANCE.getAtributo_Nome();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

		/**
		 * The meta object literal for the '{@link comercio.impl.CaracteristicaImpl <em>Caracteristica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.impl.CaracteristicaImpl
		 * @see comercio.impl.ComercioPackageImpl#getCaracteristica()
		 * @generated
		 */
		EClass CARACTERISTICA = eINSTANCE.getCaracteristica();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARACTERISTICA__NOME = eINSTANCE.getCaracteristica_Nome();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARACTERISTICA__ATRIBUTOS = eINSTANCE.getCaracteristica_Atributos();

		/**
		 * The meta object literal for the '{@link comercio.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.impl.ClienteImpl
		 * @see comercio.impl.ComercioPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '{@link comercio.impl.FormaPagamentoImpl <em>Forma Pagamento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.impl.FormaPagamentoImpl
		 * @see comercio.impl.ComercioPackageImpl#getFormaPagamento()
		 * @generated
		 */
		EClass FORMA_PAGAMENTO = eINSTANCE.getFormaPagamento();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMA_PAGAMENTO__NOME = eINSTANCE.getFormaPagamento_Nome();

		/**
		 * The meta object literal for the '{@link comercio.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.impl.ItemImpl
		 * @see comercio.impl.ComercioPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Produto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__PRODUTO = eINSTANCE.getItem_Produto();

		/**
		 * The meta object literal for the '{@link comercio.impl.ProdutoImpl <em>Produto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.impl.ProdutoImpl
		 * @see comercio.impl.ComercioPackageImpl#getProduto()
		 * @generated
		 */
		EClass PRODUTO = eINSTANCE.getProduto();

		/**
		 * The meta object literal for the '{@link comercio.impl.TransacaoImpl <em>Transacao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.impl.TransacaoImpl
		 * @see comercio.impl.ComercioPackageImpl#getTransacao()
		 * @generated
		 */
		EClass TRANSACAO = eINSTANCE.getTransacao();

		/**
		 * The meta object literal for the '<em><b>Cliente</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACAO__CLIENTE = eINSTANCE.getTransacao_Cliente();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACAO__ITEM = eINSTANCE.getTransacao_Item();

		/**
		 * The meta object literal for the '<em><b>Formas Pagamento</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACAO__FORMAS_PAGAMENTO = eINSTANCE.getTransacao_FormasPagamento();

		/**
		 * The meta object literal for the '<em><b>Valorado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACAO__VALORADO = eINSTANCE.getTransacao_Valorado();

		/**
		 * The meta object literal for the '{@link comercio.impl.VendaImpl <em>Venda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.impl.VendaImpl
		 * @see comercio.impl.ComercioPackageImpl#getVenda()
		 * @generated
		 */
		EClass VENDA = eINSTANCE.getVenda();

		/**
		 * The meta object literal for the '{@link comercio.Tipo <em>Tipo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comercio.Tipo
		 * @see comercio.impl.ComercioPackageImpl#getTipo()
		 * @generated
		 */
		EEnum TIPO = eINSTANCE.getTipo();

	}

} //ComercioPackage
