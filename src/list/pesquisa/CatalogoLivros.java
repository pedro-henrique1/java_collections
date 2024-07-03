package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listLivro;


    public CatalogoLivros() {
        this.listLivro = new ArrayList<>();
    }


    public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
        listLivro.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!listLivro.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisaPorIntervalo(int anoInicio, int anoFinal) {
        List<Livro> livroPorIntervalo = new ArrayList<>();
        if (!listLivro.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getAnoDePublicacao() >= anoInicio && l.getAnoDePublicacao() <= anoFinal) {
                    livroPorIntervalo.add(l);
                }
            }
        }
        return livroPorIntervalo;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listLivro.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();


        catalogoLivros.adicionarLivro("livro1", "autor1", 2020);
        catalogoLivros.adicionarLivro("livro2", "autor2", 2024);
        catalogoLivros.adicionarLivro("livro3", "autor3", 2025);
        catalogoLivros.adicionarLivro("livro4", "autor4", 2026);
        catalogoLivros.adicionarLivro("livro5", "autor5", 2028);
        catalogoLivros.adicionarLivro("livro6", "autor6", 2029);


        System.out.println(catalogoLivros.pesquisaPorTitulo("autor1"));
        System.out.println(catalogoLivros.pesquisaPorIntervalo(2020,2025));
    }
}
