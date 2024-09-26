package com.senacead.productsreview.controller;

import com.senacead.productsreview.model.Produto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProdutoController {
    
    private List<Produto> listaProdutos = new ArrayList();
    
    //metodo para cadastrar um novo produto
    @GetMapping("/cadastrar-produto")
    public String cadastrarProduto(Model model){
        model.addAttribute("produto",new Produto());
        return "cadastrar-produto";
    }
    
    //metodo para adicionar um novo produto na lista de produtos
    @PostMapping("/cadastrar-produto")
    public String adicionarProduto(@ModelAttribute Produto produto, Model model){
        produto.setId(listaProdutos.size()+1);
        listaProdutos.add(produto);
        model.addAttribute("produto", new Produto());
        model.addAttribute("mensaggem", "Produto cadastrado com sucesso");
        return "cadastrar-produto"; 
    }
    
    //metodo para listar os produtos cadastrados no sistema
    @GetMapping("/lista-produtos")
    public String listarProdutos(Model model){
        model.addAttribute("listaProdutos", listaProdutos);
        return "lista-produtos";
    }
    
    //metodo para mostrar os detalhes de cada produto
    @PostMapping("/detalhe-produto")
    public String detalharProduto(Model model, @RequestParam("produto") String id){
        Integer idProduto = Integer.valueOf(id);
        Produto produtoEncontrado = getProdutoId(idProduto);
        
        if(produtoEncontrado != null){
            model.addAttribute("produto", new Produto());
        } else {
            model.addAttribute("mensagem", "Produto não encontrado");
        }
        
        return "detalhe-produto";  
    }
    
    //metodo para obter um produto pelo id
    public Produto getProdutoId(Integer id){
        for(Produto produto : listaProdutos){
            if(produto.getId().intValue() == id){
                return produto;
            }
        }
        return null;
    } 
}
