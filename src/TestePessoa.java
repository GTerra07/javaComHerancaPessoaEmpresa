public class TestePessoa {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");
        cliente1.setIdade(35);
        cliente1.setSexo("M");
        cliente1.setValorDivida(1500);
        cliente1.setAnoNascim(1988);

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Maria");
        gerente1.setIdade(45);
        gerente1.setSexo("F");
        gerente1.setMatricula("12345");
        gerente1.setSalario(8000);
        gerente1.setNomeGerencia("Vendas");

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Carlos");
        vendedor1.setIdade(28);
        vendedor1.setSexo("M");
        vendedor1.setSalario(2500);
        vendedor1.setValorVendas(10000);
        vendedor1.setQntVendas(50);

        System.out.println(cliente1.toString());
        System.out.println(gerente1.toString());
        System.out.println(vendedor1.toString());
    }
}
