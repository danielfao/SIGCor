package backend.models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.List;

public class Relatorio {
	public void gerarVendasPorFuncionario(Usuario usuario, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("vendas" + usuario.getNome().replaceAll(" ", "") + ".txt");
		BufferedWriter buffer = new BufferedWriter (arquivo);
		
		double totalFuncionario = 0;
		boolean temVenda = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		
		buffer.write("==============  Relatorio de vendas do(a) funcionario(a): " + usuario.getNome() +
				" =============\n");
		for (int i=0; i< vendas.size(); i++){
			if(usuario.getCpf().equals(vendas.get(i).getUsuario().getCpf())){
				double valorTotal = vendas.get(i).getValorLiquido();
				temVenda = true;
				
				if (vendas.get(i).getSeguro().getPessoa()!= null){
					valorTotal = (valorTotal*1.0738);
					buffer.write("\nSeguro do cliente: " + vendas.get(i).getSeguro().getPessoa().getNome() + "\nValor Total: "
							+ valorFormat.format(valorTotal) + "\n");
				}
				else{
					valorTotal = (valorTotal*1.0738);
					buffer.write("\nSeguro do cliente: " + vendas.get(i).getSeguro().getEmpresa().getRazaoSocial() + "\nValor Total: "
							+ valorFormat.format(valorTotal) + "\n");
				}
				totalFuncionario = totalFuncionario + valorTotal;
			}
		}
		
		if(temVenda == false){
			buffer.write("O usuario " + usuario.getNome() + " nao tem vendas.\n");
		} else {
			buffer.write ("\n============== Somatoria das vendas =============");
			buffer.write ("\nValor total: R$ " + valorFormat.format(totalFuncionario));
		}
		
		buffer.flush();
		arquivo.close();
	}
	
	public void gerarVendasTodosFuncionarios(List<Usuario> usuarios, List<Venda> vendas) throws IOException{
		Writer arquivo = new FileWriter("vendasTotais.txt");
		BufferedWriter buffer = new BufferedWriter(arquivo);
		
		double todosFuncionarios = 0;
		boolean temVenda = false;
		DecimalFormat valorFormat = new DecimalFormat("#.00");
		
		buffer.write("==============  Relatorio total de vendas =============\n");
		
		for (int i=0; i<usuarios.size(); i++) {
			double valorTotal = 0;
			temVenda = false;
			
			buffer.write("\n============== Funcionario(a): " + usuarios.get(i).getNome() + " =============\n");
			
			for (int j=0; j<vendas.size(); j++) {
				if (usuarios.get(i).getCpf().equals(vendas.get(j).getUsuario().getCpf())){
					temVenda = true;
					double valorVenda = vendas.get(j).getValorLiquido();
					valorVenda = (valorVenda*1.0738);
					valorTotal = valorTotal + valorVenda;
				}	
			}	
		
			todosFuncionarios += valorTotal;
			
			if(temVenda == false){
				buffer.write("O usuario " + usuarios.get(i).getNome() + " nao tem vendas. \n");
			} else {
				buffer.write("Valor total das vendas: R$ " + valorFormat.format(valorTotal) + "\n");
			}
		}
		buffer.write ("\n============== Somatoria das vendas =============");
		buffer.write ("\nValor total: R$ " + valorFormat.format(todosFuncionarios));
		
		buffer.flush();
		arquivo.close();
	}
	
	public void gerarPorClientes() throws IOException{
		Writer arquivo = new FileWriter("cliente.txt");
		BufferedWriter buffer = new BufferedWriter(arquivo);
		
		
		
		buffer.flush();
		arquivo.close();
	}
}
