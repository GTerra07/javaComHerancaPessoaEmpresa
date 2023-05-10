public class Gerente extends Empregado {
    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + getMatricula() + ", Nome da Gerência: " + nomeGerencia + ", Valor do INSS: " + valorInss();
    }
}
