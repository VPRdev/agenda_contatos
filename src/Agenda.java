import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda(){
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public void listarContatos(){
        if (contatos.isEmpty()){
            System.out.println("Agenda vazia!");
        } else {
            for (Contato contato : contatos){
                contato.exibirContato();
                System.out.println("-------------------------");
            }
        }
    }

    public Contato buscarContato(String nome){
        for (Contato contato : contatos){
            if (contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return null;
    }

    public boolean removerContato(String nome){
        Contato contato = buscarContato(nome);
        if (contato != null){
            return true;
        }
        return false;
    }
}
