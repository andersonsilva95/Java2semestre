package model;

public class PJuridicaa {
	private String RazaoSocial;
	private double Cnpj;
	private double InscricaoEstadual;
	private String Endereco;
	private String Cidade;
	private long Telefone;
	
	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public double getCnpj() {
		return Cnpj;
	}

	public void setCnpj(double cnpj) {
		Cnpj = cnpj;
	}

	public double getInscricaoEstadual() {
		return InscricaoEstadual;
	}

	public void setInscricaoEstadual(double inscricaoEstadual) {
		InscricaoEstadual = inscricaoEstadual;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public long getTelefone() {
		return Telefone;
	}

	public void setTelefone(long telefone) {
		this.Telefone = telefone;
	}

}