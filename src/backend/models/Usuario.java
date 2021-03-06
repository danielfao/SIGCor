package backend.models;

/** Class Usuario related to create an user extended from Pessoa.
 * 
<<<<<<< HEAD
 * @author Daniel Oliveira / Maisa Rissi
=======
 * @author Daniel Oliveira/ Maisa Rissi/ Airton Romao Jr
>>>>>>> develop
 *
 */
public class Usuario extends Pessoa{
	private int id;
<<<<<<< HEAD
	private String login;
	private String senha;
=======
	private String login = "";
	private String senha = "";
>>>>>>> develop
	
	/** Constructor method without complemento attribute.
	 * 
	 * @param nome
	 * @param cpf
	 * @param dataNascimento
	 * @param telefone
	 * @param rua
	 * @param numero
	 * @param bairro
	 * @param cep
	 * @param cidade
	 * @param estado
	 * @param login
	 * @param senha
	 */
	public Usuario(String nome, String cpf, String dataNascimento, String telefone, String rua, int numero, String bairro, String cep, String cidade, String estado, String login, String senha) {
		super(nome, cpf, dataNascimento, telefone, rua, numero, bairro, cep, cidade, estado);
		this.login = login;
		this.senha = senha;
		cadastrarUsuario();
	}
	
	/** Constructor method with complemento attribute.
	 * 
	 * @param nome
	 * @param cpf
	 * @param dataNascimento
	 * @param telefone
	 * @param rua
	 * @param numero
	 * @param complemento
	 * @param bairro
	 * @param cep
	 * @param cidade
	 * @param estado
	 * @param login
	 * @param senha
	 */
	public Usuario(String nome, String cpf, String dataNascimento, String telefone, String rua, int numero, String complemento, String bairro, String cep, String cidade, String estado, String login, String senha) {
		super(nome, cpf, dataNascimento, telefone, rua, numero, complemento, bairro, cep, cidade, estado);
		this.login = login;
		this.senha = senha;
		cadastrarUsuario();
	}
	
<<<<<<< HEAD
=======
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

>>>>>>> develop
	/** Setter method related to instance of the attribute
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
	/** Setter method related to instance of the attribute
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/** Getter method related to instance of the attribute
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
<<<<<<< HEAD
=======
	
	public void setId(int id){
		this.id = id;
	}
>>>>>>> develop

	/** Getter method related to instance of the attribute
	 * 
	 * @return login
	 */
	public String getLogin() {
		return login;
	}

	/** Getter method related to instance of the attribute
	 * 
	 * @return senha
	 */
	public String getSenha() {
		return senha;
	}
	
	/** Method that overrides the output of this class depending if it's using the constructor with complemento or without.
	 * 
	 * @return String all attributes in a easy way to read using the console/terminal
	 */
<<<<<<< HEAD
	@Override
=======
	/*@Override
>>>>>>> develop
	public String toString(){
		String compl = getComplemento();
		if (compl == null){
			return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nData de Nascimento: " + getDataNascimento() + "\nTelefone: " +
				getTelefone() + "\nEndereco: " + getRua() + ", " + getNumero() + "\nBairro: " + getBairro() + "\nCEP: " + 
				getCep() + "\nCidade: " + getCidade() + "\nEstado: " + getEstado() + "\nLogin: " + getLogin() + "\n";
		}
		
		return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nData de Nascimento: " + getDataNascimento() + "\nTelefone: " +
		getTelefone() + "\nEndereco: " + getRua() + ", " + getNumero() + "\nComplemento: " + compl + "\nBairro: " + getBairro() + 
		"\nCEP: " + getCep() + "\nCidade: " + getCidade() + "\nEstado: " + getEstado() + "\nLogin: " + getLogin() + "\n";		
<<<<<<< HEAD
	}
=======
	}*/
>>>>>>> develop
	
	/** Method responsible to register a user.
	 * 	Print if an user was register with success or not.
	 * 
	 */
	public void cadastrarUsuario(){
		System.out.println("Usuario cadastrado com sucesso!\n");
	}
}
