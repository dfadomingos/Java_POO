//regras de negocio da aplicação

package br.edu.fatecfranca.ExemploBD;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    //injeção de dependencia
    //usar um objeto para chamar um metodo sem precisar instancia-lo
    @Autowired
    private ProdutoRepository produtoRepository;

    // metodo que consulta todos os produtos
    public List<Produto> listaTodos(){
        // select * from tb_produto
        return produtoRepository.findAll();
    }

    //metodo que consulta um produto em particular
    public Optional<Produto> listaPorId(Long id){
        //se o findById encontrar um produto, retorna ele
        //se o findById não encontrar, retorna null
        //select * from tb_produto where tb_produto.id = id
        return produtoRepository.findById(id);
    }

    //metodo para inserir um produto na tabela tb_produto
    public Produto insere(Produto produto){
        return produtoRepository.save(produto);  //insert into tb_produto values(..)
    }

    //metodo para remover um produto da tabela tb.produto
    public boolean remove(Long id){
        //delete from tb_produto where tb_produto.id=id
        if (produtoRepository.existsById(id)) {  //verifica se o produto existe
            produtoRepository.deleteById(id);
            return true;
        }
        return false; //não encontrou
    }

    //metodo para fazer atualização
    public Produto atualizar(Long id, Produto novoProduto){
       //novoProduto nao tem id
       if(produtoRepository.existsById(id)){  //verifica se o produto exista
           novoProduto.setId(id); //atualizo novoProduto com o id
           return produtoRepository.save(novoProduto); //atualiza e retorna produto atual
       }
       return null; //caso o produto não exista
    }
}
