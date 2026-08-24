
public class TesteFuncionarios {

	public static void main(String[] args) {
     
		Funcionario f1 = new Funcionario("Ana Castro", "F001", 2500, "01/03/2020");
        FuncionarioCLT f2 = new FuncionarioCLT("Bruno Rocha", "C001", 3000, "10/06/2022", 220, 400);
        Gerente g1 = new Gerente("Carlos Machado", "G001", 8000, "15/01/2015", 300, 500, 12, 0.20);
        Estagiario e1 = new Estagiario("Diego Almeida", "E001", 0, "05/08/2025", 1500, 20);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(g1);
        System.out.println(e1);
    }
}
