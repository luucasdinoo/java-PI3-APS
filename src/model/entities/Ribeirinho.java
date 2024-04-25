package model.entities;

public class Ribeirinho extends Usuario{
    public Ribeirinho(String nome, String email, String cpfOuCnpj, String senha, String contato, EnderecoUsuario endereco, EnumUsuarioTipo tipo) {
        super(nome, email, cpfOuCnpj, senha, contato, endereco, tipo);
    }
}
